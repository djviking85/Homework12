package HomeworksProSky;

import HomeworksProSky.Autor;
import HomeworksProSky.Book;

public class Main {
    public static void main(String[] args) {

        Book warAndPeace = new Book("Tolstoi", "War and Peace", 1868);
        Book neznaika = new Book("Носов", "Незнайка на луне", 1964);
        // книга для сравнения
        Book neznaika2  = new Book("Носов", "Незнайка на луне", 1964);
        // иквелс без сеттера, поэтому тру
        System.out.println("cheks " + neznaika.equals(neznaika2));

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
        // toString книги
        System.out.println(warAndPeace);
        System.out.println(neznaika);
        // equals после сеттера = поэтому у нас фолс
        System.out.println("cheks " + neznaika.equals(neznaika2));
        // хеш на книжку
        System.out.println("хеш " + neznaika.hashCode());





        Autor tolstoi = new Autor("Лев", "Толстой", 1828);
        Autor nosov = new Autor("Николай", "Носов", 1908);
        Autor nosov2 = new Autor("Николай", "Носов", 1908);


        System.out.println(" Имя автора - "+ tolstoi.getFirstName());
        System.out.println(" Фамилия автора - "+ tolstoi.getSecondName());
        System.out.println(" Год рождения автора - "+ tolstoi.getBirhday());

        System.out.println(" -Имя автора - "+ nosov.getFirstName());
        System.out.println(" -Фамилия автора - "+ nosov.getSecondName());
        System.out.println(" -Год рождения автора - "+ nosov.getBirhday());
        // toString автора
        System.out.println(tolstoi);
        System.out.println(nosov);
        System.out.println( "чекс по эквилсу " + tolstoi.equals(nosov));
        System.out.println( "чекс по эквилсу " + nosov2.equals(nosov));

// test hw оно все работает, просто не юзаем за не нужности сейчас.
//        Person sarah = new Person("Сара", 30);
//
 //       System.out.println(" Персонаж " + sarah.getName() + " с возрастом " + sarah.getAge());
 //      Person.testAge();
  //      sarah.increaseAge(3);
 //       System.out.println(sarah);
//
//        Person david = new Person("Давид", 23);
 //       System.out.println(" Персонаж " + david.getName() + " с возрастом " + david.getAge());
//        Person.testAge();
//        System.out.println(david);

      //  if (sarah.adult()) {
      //      System.out.println(" go to the bar");
     //   } else {
      //      System.out.println( " go to the school");
      //  }


    }
}