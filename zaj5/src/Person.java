public class Person {
    private String firstName;
    protected String lastName;

    public Person() {
        this.firstName="default";
        this.lastName="default";
    }

    //public String getFirstName() {
    //    return firstname;
    //}

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person{
    //public String name=lastName;


    public String displaydata() {
        return getLastName();
    }

}
