public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book("Tolstoi", "War and Peace", 1868);

        warAndPeace.authorName = "Л. Н.Толстой";
        System.out.println("Автор - " + warAndPeace.authorName);

        warAndPeace.bookName = "Война и Мир";
        System.out.println("Название - " + warAndPeace.bookName);

        warAndPeace.publishingYear = 1867;
        System.out.println("Год - " + warAndPeace.publishingYear);

        Autor tolstoi = new Autor();

        tolstoi.firstName = "Лев";
        System.out.println(" Имя автора - "+ tolstoi.firstName);

        tolstoi.secondName = "Толстой";
        System.out.println(" Фамилия автора - "+ tolstoi.secondName);

        tolstoi.birhday = 1828;
        System.out.println(" Год рождения автора - "+ tolstoi.birhday);


    }
}