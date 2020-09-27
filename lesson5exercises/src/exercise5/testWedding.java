package exercise5;

import java.time.LocalDate;

public class testWedding {
    public static void main(String[] args) {
    person man = new person("Stephen","Santos", LocalDate.of(2001,1,21));
    person woman = new person("Shaira","Gatchallian", LocalDate.of(2002,4,21));
    Couple couple = new Couple(man, woman);
    Wedding wedding = new Wedding(LocalDate.of(2021,5,16),couple,"Galacy");

    System.out.println(wedding);

    }
}
