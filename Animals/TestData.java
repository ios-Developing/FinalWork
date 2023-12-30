import Model.*;
import java.time.LocalDate;

public class TestData {
    static Family dataLoad() {
        Animal animal1 = new Animal("Maria", Gender.Female, LocalDate.of(1975, 6, 27), null, null);
        Animal animal2 = new Animal("Ivan", Gender.Male, LocalDate.of(1970, 12, 10), null, null);
        Animal animal3 = new Animal("Stepan", Gender.Male, LocalDate.of(1996, 10, 3), null, null);
        Animal animal4 = new Animal("Katya", Gender.Female, LocalDate.of(1998, 12, 30), null, null);
        Animal animal5 = new Animal("Lena", Gender.Female, LocalDate.of(1998, 3, 12), null, null);
        Animal animal6 = new Animal("Galina", Gender.Female, LocalDate.of(1996, 9, 17), null, null);
        Animal animal7 = new Animal("Dasha", Gender.Female, LocalDate.of(2020, 07, 24), null, null);


        return null;  //
    }
}

