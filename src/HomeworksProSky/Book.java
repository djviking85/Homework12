package HomeworksProSky;

import java.util.Objects;

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

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && authorName.equals(book.authorName) && bookName.equals(book.bookName);
    }
// hashCode
    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookName, publishingYear);
    }
}

