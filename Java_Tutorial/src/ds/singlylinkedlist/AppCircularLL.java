package ds.singlylinkedlist;

public class AppCircularLL {

    public static void main(String[] args){

        CircularLinkedList cl = new CircularLinkedList();
        cl.insertFirst(10);
        cl.insertFirst(20);
        cl.insertFirst(30);
        cl.displayList();
        cl.insertLast(40);
        cl.insertLast(50);
        cl.displayList();

        cl.deleteNode();
        cl.deleteNode();
        cl.displayList();


    }

}
