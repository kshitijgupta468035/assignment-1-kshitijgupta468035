package person;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber;

    List<Long> list = new ArrayList<>();

    public Person() {
    }

    public Person(String firstName, String lastName, String email, long phoneNumber, List<Long> list) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.list = list;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
