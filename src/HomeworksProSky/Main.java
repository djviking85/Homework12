package HomeworksProSky;

import HomeworksProSky.Autor;
import HomeworksProSky.Book;

public class Main {
    public static void main(String[] args) {

        Book warAndPeace = new Book("Tolstoi", "War and Peace", 1868);
        Book neznaika = new Book("Носов", "Незнайка на луне", 1964);

        System.out.println("Автор - " + warAndPeace.getAuthorName());
        System.out.println("Название - " + warAndPeace.getBookName());

        // getter
        System.out.println("Год - " + warAndPeace.getPublishingYear());

        // setter
        warAndPeace.setPublishingYear(1800);
        System.out.println( "set Year2 "+ warAndPeace.getPublishingYear());

        System.out.println("-Автор - " + neznaika.getAuthorName());
        System.out.println("-Название - " + neznaika.getBookName());
        System.out.println("-Год - " + neznaika.getPublishingYear());

        // getter
        System.out.println("-Год - " + neznaika.getPublishingYear());

        // setter
        neznaika.setPublishingYear(1800);
        System.out.println( "-set Year2 "+ neznaika.getPublishingYear());

        Autor tolstoi = new Autor("Лев", "Толстой", 1828);
        Autor nosov = new Autor("Николай", "Носов", 1908);


        System.out.println(" Имя автора - "+ tolstoi.getFirstName());
        System.out.println(" Фамилия автора - "+ tolstoi.getSecondName());
        System.out.println(" Год рождения автора - "+ tolstoi.getBirhday());

        System.out.println(" -Имя автора - "+ nosov.getFirstName());
        System.out.println(" -Фамилия автора - "+ nosov.getSecondName());
        System.out.println(" -Год рождения автора - "+ nosov.getBirhday());
// test hw
        Person sarah = new Person("Sara", 30);
        System.out.println(" Персонаж " + sarah.getName() + " с возрастом " + sarah.getAge());



    }
}