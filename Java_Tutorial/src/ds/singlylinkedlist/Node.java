package ds.singlylinkedlist;

import java.sql.SQLOutput;

public class Node {

    public int data;
    public Node next = null;

    public void displayNode(){
        System.out.println("{ "+ data+" }");
    }
}
