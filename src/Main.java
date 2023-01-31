public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book("Tolstoi", "War and Peace", 1868);
        Book neznaika = new Book("Носов", "Незнайка на луне", 1964);
        System.out.println("Автор - " + warAndPeace.authorName);
        System.out.println("Название - " + warAndPeace.bookName);
        System.out.println("Год - " + warAndPeace.publishingYear);

        System.out.println("Автор - " + neznaika.authorName);
        System.out.println("Название - " + neznaika.bookName);
        System.out.println("Год - " + neznaika.publishingYear);

        Autor tolstoi = new Autor();

        tolstoi.firstName = "Лев";
        System.out.println(" Имя автора - "+ tolstoi.firstName);

        tolstoi.secondName = "Толстой";
        System.out.println(" Фамилия автора - "+ tolstoi.secondName);

        tolstoi.birhday = 1828;
        System.out.println(" Год рождения автора - "+ tolstoi.birhday);


    }
}