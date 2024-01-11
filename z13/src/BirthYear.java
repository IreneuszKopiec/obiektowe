import java.util.Comparator;

public class BirthYear implements Comparator<Person> {



    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.birthYear, o2.birthYear);
    }
}
