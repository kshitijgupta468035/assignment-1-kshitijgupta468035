package adt;

public interface SingleADT<E> {
    /* This method will add the item in the list. */

    void add(E item);

    /* This method will remove an item from the linked list. */

    void remove();

    // This method will search the item in the list

    int search(E item);

    // This method will sort the list based on there node acc. to ascending
    //order

    void sort();

    // This method will print all the item in the list.

    void print();
}
