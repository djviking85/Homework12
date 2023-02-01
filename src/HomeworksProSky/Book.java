package HomeworksProSky;

public class Book {
        private String authorName;
        private String bookName;
        private int publishingYear;

    public Book(String authorName, String bookName, int publishingYear) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getAuthorName() {
        return authorName;
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
    public String toString() {
        return " (toString)) Имя автора - " + this.authorName + " , Название книги - " + this.bookName + " , Год издания книги - " + this.publishingYear;
    }
}

