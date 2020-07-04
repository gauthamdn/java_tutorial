package ds.singlylinkedlist;

public class App {

    public static void main(String[] args){

        SingleLinkedlist myList = new SingleLinkedlist();
        myList.insertFirst(10);
        myList.insertFirst(20);
        myList.insertFirst(30);
        myList.insertFirst(40);


        myList.displayList();

        myList.deleteNode();
        myList.displayList();

        myList.insertLast(999);
        myList.insertLast(99);
        myList.displayList();

    }
}
