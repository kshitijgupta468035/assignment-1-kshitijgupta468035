package definition;

import adt.SingleADT;

public class SingleLinkedList<E> implements SingleADT<E> {

    private int size = 0;
    private Node<E> head = null;

    public int getSize() {
        return size;
    }

    public Node<E> getNode(int index) throws IndexOutOfBoundsException {
        Node<E> response = head;
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else {
            for (int i = 0; i < index && head != null; i++) {
                response = response.next;
            }
        }
        return response;
    }

    @Override
    public void add(E item) {

    }

    @Override
    public void remove() {

    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public void print() {

    }

    private static class Node<E> implements Comparable<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        @Override
        public int compareTo(E o) {
            return 0;
        }
    }
}

