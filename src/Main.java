public class Main {
    public static void main(String[] args) {
        // Создание авторов
        Author author1 = new Author("Джордж", "Оруэлл");
        Author author2 = new Author("Фёдор", "Достоевский");

        // Создание книг
        Book book1 = new Book("1984", author1, 1949);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        // Вывод информации о книгах
        System.out.println(book1);
        System.out.println(book2);

        // Изменение года публикации одной из книг
        book1.setPublicationYear(1950);
        System.out.println("После изменения года издания:");
        System.out.println(book1);

        // Проверка методов equals и hashCode
        Book book3 = new Book("1984", author1, 1950);
        System.out.println("book1.equals(book3): " + book1.equals(book3));
    }
}
