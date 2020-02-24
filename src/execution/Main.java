package execution;

import definition.SingleLinkedList;
import person.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        SingleLinkedList<Person> list = new SingleLinkedList<Person>();
        boolean b = true;
        do {
            System.out.println("Welcome to Kshitij Gupta's Contact List Application\n" +
                    "Press 1 to add a new contact in list\n" +
                    "Press 2 to view all contacts of the list\n" +
                    "Press 3 to search for a contact from the list\n" +
                    "Press 4 to delete a contact of the list\n" +
                    "Press 5 to exit program completely");
        } while (b);
    }
}
