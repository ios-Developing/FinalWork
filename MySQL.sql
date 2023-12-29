DROP DATABASE IF EXISTS HumanFriends;
CREATE DATABASE HumanFriends;
USE HumanFriends;

-- Создать таблицы, соответствующие иерархии из вашей диаграммы классов.

CREATE TABLE cat (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
    commands TEXT,
    date_of_birth DATE
);

CREATE TABLE dog (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
    commands TEXT,
    date_of_birth DATE
);

CREATE TABLE hamster (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
    commands TEXT,
    date_of_birth DATE
);

CREATE TABLE horse (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
    commands TEXT,
    date_of_birth DATE
);

CREATE TABLE camel (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
    commands TEXT,
    date_of_birth DATE
);

CREATE TABLE donkey (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
    commands TEXT,
    date_of_birth DATE
);

-- Заполнить таблицы данными о животных, их командах и датами рождения.

INSERT INTO cat (animal_name,commands, date_of_birth) VALUES 
	('Whiskers', 'Sit, Pounce', '2019-05-15'),
	('Smudge', 'Sit, Pounce, Scratch', '2020-02-20'),
    ('Oliver', 'Meow, Scratch, Jump', '2020-06-30');
   
INSERT INTO dog (animal_name,commands, date_of_birth) VALUES 
	('Fido', 'Stay, Fetch', '2020-01-01'),
	('Buddy', 'Sit, Paw, Bark', '2018-12-10'),
    ('Bella', 'Sit, Stay, Roll', '2019-11-11');
    
INSERT INTO hamster (animal_name,commands, date_of_birth) VALUES 
	('Hammy', 'Roll, Hide', '2021-03-10'),
	('Peanut', 'Roll, Spin', '2021-08-01');
    
INSERT INTO horse (animal_name,commands, date_of_birth) VALUES 
	('Thunder', 'Trot, Canter, Gallop', '2022-07-21'),
	('Storm', 'Trot, Canter', '2021-05-05'),
    ('Blaze', 'Trot, Jump, Gallop', '2016-02-29');
    
INSERT INTO camel (animal_name,commands, date_of_birth) VALUES 
	('Sandy', 'Walk, Carry Load', '2016-11-03'),
	('Dune', 'Walk, Sit', '2018-12-12'),
    ('Sahara', 'Walk, Run', '2015-08-14');
    
INSERT INTO donkey (animal_name,commands, date_of_birth) VALUES 
	('Eeyore', 'Walk, Carry Load, Bray', '2021-09-18'),
	('Burro', 'Walk, Bray, Kick', '2019-01-23');
    
-- Удалить записи о верблюдах 

TRUNCATE camel;

-- объединить таблицы лошадей и ослов

CREATE TABLE PackAnimals (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
    commands TEXT,
    date_of_birth DATE
);

-- Создать новую таблицу для животных в возрасте от 1 до 3 лет и 

INSERT INTO PackAnimals (animal_name, commands, date_of_birth)
SELECT animal_name, commands, date_of_birth
FROM horse WHERE TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) IN (1, 2, 3)
UNION
SELECT animal_name, commands, date_of_birth
FROM donkey WHERE TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) IN (1, 2, 3);

-- вычислить возраст животных с точностью до месяца функция age_animal 

DELIMITER $$
CREATE FUNCTION age_animal (date_b DATE)
RETURNS TEXT
DETERMINISTIC
BEGIN
    DECLARE res TEXT DEFAULT '';
	SET res = CONCAT(
            TIMESTAMPDIFF(YEAR, date_b, CURDATE()),
            ' years ',
            TIMESTAMPDIFF(MONTH, date_b, CURDATE()) % 12,
            ' month'
        );
	RETURN res;
END $$
DELIMITER ;

-- Отобразить возраст животных с точностью до месяца функция age_animal 

SELECT animal_name, commands, date_of_birth, age_animal(date_of_birth)
FROM PackAnimals;

-- Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам.

CREATE TABLE animals (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
    commands TEXT,
    date_of_birth DATE,
    animal_type CHAR(20) NOT NULL
);

/* Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам
Все кроме donkey т.к. эта таблица ранее была очищена */

INSERT INTO animals (animal_name, commands, date_of_birth, animal_type)
SELECT animal_name, commands, date_of_birth, 'cat'
FROM cat
UNION
SELECT animal_name, commands, date_of_birth, 'dog'
FROM dog
UNION
SELECT animal_name, commands, date_of_birth, 'hamster'
FROM hamster
UNION
SELECT animal_name, commands, date_of_birth, 'horse'
FROM horse
UNION
SELECT animal_name, commands, date_of_birth, 'camel'
FROM camel
UNION
SELECT animal_name, commands, date_of_birth, 'PackAnimals'
FROM PackAnimals;