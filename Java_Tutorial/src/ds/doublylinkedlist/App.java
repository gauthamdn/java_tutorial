package ds.doublylinkedlist;

import ds.singlylinkedlist.CircularLinkedList;

public class App {

    public static void main(String[] args){

        DoublyLinkedList dl  = new DoublyLinkedList();
        dl.insertFirst(10);
        dl.insertFirst(20);
        dl.insertFirst(30);
        dl.displayList();
        dl.insertLast(40);
        dl.insertLast(50);
        dl.displayList();

        dl.deleteKey(20);

        dl.displayList();

        dl.deleteLast();
        dl.displayList();


    }
}
