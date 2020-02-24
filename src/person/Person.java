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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Long> getList() {
        return list;
    }

    private StringBuilder addString() {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (long i : list) {
            sb.append(i);
            k++;
            sb.append((k <= list.size() - 1 ? "," : ""));
            sb.append(" ");
        }
        return sb;
    }

    @Override
    public String toString() {
        return "-------- * -------- * -------- * --------\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                (list.size() == 1 ? "Contact Number: " : "Contact Number(s):") + addString() + "\n" +
                "Email Address: " + email + "\n" +
                "-------- * -------- * -------- * --------";
    }



    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
