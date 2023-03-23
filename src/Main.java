public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", " Толстой");
        Author author2 = new Author("Борис", "Акунин");

        Book book1 = new Book("Война и мир", author1, 1863);
        Book book2 = new Book("Азазель", author2, 1998);

        System.out.println(book1);
        System.out.println(book2);
    }
}