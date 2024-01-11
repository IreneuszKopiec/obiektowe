import java.util.Comparator;

public class Person {
    public String firstName;
    public String lastName;
    public int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.lastName=lastName;
        this.firstName=firstName;
        this.birthYear=birthYear;

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}

