package ds.singlylinkedlist;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public CircularLinkedList(){
        first = null;
        last = null;
    }


    private boolean isEmpty() {
        return(first == null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first; // new node is the old first
        first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()) {
            first = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }

    }


    public int deleteNode(){
        int temp = first.data;

        if(first.next == null){
            last = null;
        }
        first = first.next;

        return temp;

    }

    public void displayList(){
        Node current = first;


        System.out.println("printing from first to last");
        while(current!=null){
            current.displayNode();
            current = current.next;
        }

        System.out.println("printing done");

    }


}
