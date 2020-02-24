package person;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber;

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
