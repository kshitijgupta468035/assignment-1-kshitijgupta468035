package person;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber;

    List<Long> list = new ArrayList<>();

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
