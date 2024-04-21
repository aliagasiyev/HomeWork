package JavaCollections.LinkedList;

import java.util.Objects;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;

    }


    public void insertLast(int value) {
        if (tail == null) {
            System.out.println();
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }


    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = new Node(value, temp.next);
        size++;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
        return value;

    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int value = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return value;
    }
    public int getSize(){
        return size;
    }

    public void update(int index, int value) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index is out of bounds.");

        Node node = get(index);
        node.value = value;
    }
    public void deleteForObject(Object value) {
        if (head == null)
            return;

        Node current = head;
        while (current.next != null) {{
                current.next = current.next.next;
                size--;
                return;
            }
        }
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedList that = (LinkedList) o;
        return size == that.size && Objects.equals(head, that.head) && Objects.equals(tail, that.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, tail, size);
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
