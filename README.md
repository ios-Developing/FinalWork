Итоговая контрольная работа

 Информация о проекте
 Необходимо организовать систему учета для питомника в котором живут домашние и Pack animals. 

Как сдавать проект 

Для сдачи проекта необходимо создать отдельный общедоступный репозиторий(Github, gitlub, или Bitbucket). Разработку вести в этом репозитории, использовать пул реквесты на изменения. Программа должна запускаться и работать, ошибок при выполнении программы быть не должно. Программа, может использоваться в различных системах, поэтому необходимо разработать класс в виде конструктора 

Задание 

Операционные системы и виртуализация (Linux)

1. Использование команды cat в Linux
   - Создать два текстовых файла: "Pets"(Домашние животные) и "Pack animals"(вьючные животные), используя команду `cat` в терминале Linux. В первом файле перечислить собак, кошек и хомяков. Во втором — лошадей, верблюдов и ослов.
   - Объединить содержимое этих двух файлов в один и просмотреть его содержимое.
   - Переименовать получившийся файл в "Human Friends"(.
Пример конечного вывода после команды “ls” :
Desktop Documents Downloads  HumanFriends.txt  Music  PackAnimals.txt  Pets.txt  Pictures  Videos

############################# НАЧАЛО РЕШЕНИЯ #####################################

![image](https://github.com/ios-Developing/FinalWork/assets/83113180/027df0fb-1f55-4917-a610-48d3521358fe)

############################# КОНЕЦ РЕШЕНИЯ #####################################

2. Работа с директориями в Linux
   - Создать новую директорию и переместить туда файл "Human Friends".
  
############################# НАЧАЛО РЕШЕНИЯ #####################################

  
![2](https://github.com/ios-Developing/FinalWork/assets/83113180/f446d289-71e0-4c00-b51e-2ce76ca978f0)

############################# КОНЕЦ РЕШЕНИЯ #####################################

3. Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную машину ”
   - Подключить дополнительный репозиторий MySQL и установить один из пакетов из этого репозитория.
  
############################# НАЧАЛО РЕШЕНИЯ #####################################

Скачиваем конфигуратор mysql:

admin@geekbrains:~$ sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.24-1_all.deb
[sudo] password for admin: 
--2023-12-29 12:53:06--  https://dev.mysql.com/get/mysql-apt-config_0.8.24-1_all.deb
Resolving dev.mysql.com (dev.mysql.com)... 23.52.29.249, 2a02:26f0:d200:48c::2e31, 2a02:26f0:d200:493::2e31
Connecting to dev.mysql.com (dev.mysql.com)|23.52.29.249|:443... connected.
HTTP request sent, awaiting response... 302 Moved Temporarily
Location: https://repo.mysql.com//mysql-apt-config_0.8.24-1_all.deb [following]
--2023-12-29 12:53:06--  https://repo.mysql.com//mysql-apt-config_0.8.24-1_all.deb
Resolving repo.mysql.com (repo.mysql.com)... 23.210.253.161, 2a02:26f0:480:787::1d68, 2a02:26f0:480:78d::1d68
Connecting to repo.mysql.com (repo.mysql.com)|23.210.253.161|:443... connected.
HTTP request sent, awaiting response... 200 OK


Переходим устанавливаем компоненты mysql с помощью конфигуратора:

admin@geekbrains:~$ sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb 
Selecting previously unselected package mysql-apt-config.
(Reading database ... 64873 files and directories currently installed.)
Preparing to unpack mysql-apt-config_0.8.24-1_all.deb ...
Unpacking mysql-apt-config (0.8.24-1) ...
Setting up mysql-apt-config (0.8.24-1) ...

Установка MySQL с помощью следующей команды:

admin@geekbrains:$ sudo apt-get update  
admin@geekbrains:$ sudo apt-get install mysql-server  
Reading package lists... Done  
Building dependency tree... Done  
Reading state information... Done  

Проверяем результат установки:  
admin@geekbrains:~$ systemctl status mysql  
● mysql.service - MySQL Community Server  
     Loaded: loaded (/lib/systemd/system/mysql.service; enabled; vendor preset: enabled)  
     Active: active (running) since Fri 2023-12-29 12:56:58 MSK; 7min ago  
    Process: 2665 ExecStartPre=/usr/share/mysql/mysql-systemd-start pre (code=exited, status=0/SUCCESS)  
   Main PID: 2695 (mysqld)  
     Status: "Server is operational"  
      Tasks: 37 (limit: 1117)  
     Memory: 355.4M  
        CPU: 4.684s  
     CGroup: /system.slice/mysql.service  
     &nbsp; &nbsp; &nbsp; &nbsp; └─2695 /usr/sbin/mysqld  

############################# КОНЕЦ РЕШЕНИЯ #####################################

5. Управление deb-пакетами
   - Установить и затем удалить deb-пакет, используя команду `dpkg`.

############################# НАЧАЛО РЕШЕНИЯ #####################################

- Установить
admin@geekbrains:~$ sudo apt install nmap  
Reading package lists... Done  
Building dependency tree... Done  
Reading state information... Done  
The following additional packages will be installed:  
  libblas3 liblinear4 liblua5.3-0 lua-lpeg nmap-common

![3](https://github.com/ios-Developing/FinalWork/assets/83113180/8300b545-7cee-479a-8517-8d6b21364eec)

- Удалить

admin@geekbrains:~$ sudo apt remove nmap  
Reading package lists... Done  
Building dependency tree... Done  
Reading state information... Done  
The following packages were automatically installed and are no longer required:  
  libblas3 liblinear4 liblua5.3-0 lua-lpeg nmap-common  
Use 'sudo apt autoremove' to remove them.  
The following packages will be REMOVED:  
  nmap  
0 upgraded, 0 newly installed, 1 to remove and 118 not upgraded.  
After this operation, 4341 kB disk space will be freed.  
Do you want to continue? [Y/n] y  
(Reading database ... 67997 files and directories currently installed.)  
Removing nmap (7.91+dfsg1+really7.80+dfsg1-2ubuntu0.1) ...  
Processing triggers for man-db (2.10.2-1) ...  

![4](https://github.com/ios-Developing/FinalWork/assets/83113180/001165cc-2a1f-4dc5-9031-4607c9e35681)


############################# КОНЕЦ РЕШЕНИЯ #####################################
   

6. История команд в терминале Ubuntu
   - Сохранить и выложить историю ваших терминальных команд в Ubuntu.
В формате: Файла с ФИО, датой сдачи, номером группы(или потока)  
Добавлен файл history.txt

############################# НАЧАЛО РЕШЕНИЯ #####################################

![5](https://github.com/ios-Developing/FinalWork/assets/83113180/a5c44f9c-e0b8-4711-99aa-ed4981ecf540)

############################# КОНЕЦ РЕШЕНИЯ #####################################


Объектно-ориентированное программирование 

6. Диаграмма классов
   - Создать диаграмму классов с родительским классом "Животные", и двумя подклассами: "Pets" и "Pack animals".
В составы классов которых в случае Pets войдут классы: собаки, кошки, хомяки, а в класс Pack animals войдут: Лошади, верблюды и ослы).
Каждый тип животных будет характеризоваться (например, имена, даты рождения, выполняемые команды и т.д)
Диаграмму можно нарисовать в любом редакторе, такими как Lucidchart, Draw.io, Microsoft Visio и других.

############################# НАЧАЛО РЕШЕНИЯ #####################################

![6](https://github.com/ios-Developing/FinalWork/assets/83113180/50b4dde2-6967-4fa1-ab59-bf1b49926e81)

############################# КОНЕЦ РЕШЕНИЯ #####################################

7. Работа с MySQL (Задача выполняется в случае успешного выполнения задачи “Работа с MySQL в Linux. “Установить MySQL на вашу машину”

7.1. После создания диаграммы классов в 6 пункте, в 7 пункте база данных "Human Friends" должна быть структурирована в соответствии с этой диаграммой. Например, можно создать таблицы, которые будут соответствовать классам "Pets" и "Pack animals", и в этих таблицах будут поля, которые характеризуют каждый тип животных (например, имена, даты рождения, выполняемые команды и т.д.). 
7.2   - В ранее подключенном MySQL создать базу данных с названием "Human Friends".
   - Создать таблицы, соответствующие иерархии из вашей диаграммы классов.
   - Заполнить таблицы данными о животных, их командах и датами рождения.
   - Удалить записи о верблюдах и объединить таблицы лошадей и ослов.
   - Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст с точностью до месяца.
   - Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам.

Пример заполненной таблицы для теста:<br>
Лист "Pets"<br>
ID	Name	Type	BirthDate	Commands<br>
1	Fido	Dog	2020-01-01	Sit, Stay, Fetch<br>
2	Whiskers	Cat	2019-05-15	Sit, Pounce<br>
3	Hammy	Hamster	2021-03-10	Roll, Hide<br>
4	Buddy	Dog	2018-12-10	Sit, Paw, Bark<br>
5	Smudge	Cat	2020-02-20	Sit, Pounce, Scratch<br>
6	Peanut	Hamster	2021-08-01	Roll, Spin<br>
7	Bella	Dog	2019-11-11	Sit, Stay, Roll<br>
8	Oliver	Cat	2020-06-30	Meow, Scratch, Jump<br>

 Лист "PackAnimals"<br>
ID	Name	Type	BirthDate	Commands<br>
1	Thunder	Horse	2015-07-21	Trot, Canter, Gallop<br>
2	Sandy	Camel	2016-11-03	Walk, Carry Load<br>
3	Eeyore	Donkey	2017-09-18	Walk, Carry Load, Bray<br>
4	Storm	Horse	2014-05-05	Trot, Canter<br>
5	Dune	Camel	2018-12-12	Walk, Sit<br>
6	Burro	Donkey	2019-01-23	Walk, Bray, Kick<br>
7	Blaze	Horse	2016-02-29	Trot, Jump, Gallop<br>
8	Sahara	Camel	2015-08-14	Walk, Run<br>




8. ООП и Java
   - Создать иерархию классов в Java, который будет повторять диаграмму классов созданную в задаче 6(Диаграмма классов) .

9. Программа-реестр домашних животных
    - Написать программу на Java, которая будет имитировать реестр домашних животных. 
Должен быть реализован следующий функционал:
    
    9.1. Добавление нового животного
        - Реализовать функциональность для добавления новых животных в реестр.       
 Животное должно определяться в правильный класс (например, "собака", "кошка", "хомяк" и т.д.)
        
 
   9.2. Список команд животного
        - Вывести список команд, которые может выполнять добавленное животное (например, "сидеть", "лежать").
        
    9.3. Обучение новым командам
        - Добавить возможность обучать животных новым командам.
  9.4 Вывести список животных по дате рождения

9.5. Навигация по меню
        - Реализовать консольный пользовательский интерфейс с меню для навигации между вышеуказанными функциями.
        
10. Счетчик животных
Создать механизм, который позволяет вывести на экран общее количество созданных животных любого типа (Как домашних, так и вьючных), то есть при создании каждого нового животного счетчик увеличивается на “1”. 
![image](https://github.com/ios-Developing/FinalWork/assets/83113180/abf1b838-b4a4-4d1a-b623-00ee2f3ef7c5)
