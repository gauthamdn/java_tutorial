package ds.singlylinkedlist;

public class SingleLinkedlist {

    private Node first;

    public SingleLinkedlist() {
//        this.first = first;
    }

    public boolean isEmpty(){
        return(first == null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;

        first = newNode;
    }

    public void insertLast(int data){
        Node current = first;
        while(current.next!=null){
            current = current.next;
        }

        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;


    }

    public Node deleteNode(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List first to last ");
        Node current = first;
        while(current!=null){
            current.displayNode();
            current = current.next;
        }
        System.out.println("Done");

    }
}
