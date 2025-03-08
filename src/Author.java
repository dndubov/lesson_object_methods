public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Object o) {
        if (o instanceof Author) {
            Author author = (Author) o;
            return firstName.equals(author.firstName) && lastName.equals(author.lastName);
        }
        return false;
    }

    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }
}