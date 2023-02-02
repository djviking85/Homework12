package HomeworksProSky;

public class Book {
        private String bookName;
        private Autor autor;
        private int publishingYear;



    public Book(String bookName, Autor autor, int publishingYear) {
        this.autor = autor;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }
    public Autor getAutor() {
        return autor;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}

