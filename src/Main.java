public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book();

        warAndPeace.authorName = "Л. Н.Толстой";
        System.out.println("Автор - " + warAndPeace.authorName);

        warAndPeace.bookName = "Война и Мир";
        System.out.println("Название - " + warAndPeace.bookName);

        warAndPeace.publishingYear = 1867;
        System.out.println("Год - " + warAndPeace.publishingYear);
    }
}