package HomeworksProSky;

import HomeworksProSky.Autor;
import HomeworksProSky.Book;

public class Main {
    public static void main(String[] args) {
        Autor tolstoi = new Autor("Лев", "Толстой");
        Book warAndPeace = new Book( "War and Peace", tolstoi, 1868);

        System.out.println("Книга - " + warAndPeace.getBookName()
                + ", год издания - " + warAndPeace.getPublishingYear()
                + ", Имя автора - " + warAndPeace.getAutor().getFirstName()
                + ", Фамилия автора - " + tolstoi.getSecondName());


        Autor autor = new Autor("Николай", "Носов");
        Book book = new Book("Незнайка на луне", autor, 1960);

        System.out.printf("Книга %s, от Автора %s %s, выпущена %d%n",
                book.getBookName(), book.getAutor().getFirstName(),
                book.getAutor().getSecondName(),book.getPublishingYear());

    }
}