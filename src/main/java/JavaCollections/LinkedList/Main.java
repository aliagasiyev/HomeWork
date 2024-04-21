package JavaCollections.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.insertFirst(10);
        myLinkedList.insertFirst(11);
        myLinkedList.insertLast(12);
        myLinkedList.insertFirst(13);

        myLinkedList.insertLast(9);
        myLinkedList.insertLast(6);
        myLinkedList.display();

        System.out.println(myLinkedList.getSize());

        myLinkedList.delete(3);
        myLinkedList.display();

        myLinkedList.update(2,45);
        myLinkedList.display();

        myLinkedList.insert(99,4);
        myLinkedList.display();
        myLinkedList.deleteForObject(5);

    }
}
