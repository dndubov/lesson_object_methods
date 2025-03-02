public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Книга: " + title + ", Автор: " + author + ", Год издания: " + publicationYear;
    }

    public boolean equals(Object o) {
        if (o instanceof Book) {
            Book book = (Book) o;
            return title.equals(book.title) && author.equals(book.author) && publicationYear == book.publicationYear;
        }
        return false;
    }

    public int hashCode() {
        return title.hashCode() + author.hashCode() + publicationYear;
    }
}
