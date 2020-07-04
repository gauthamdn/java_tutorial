package ds.doublylinkedlist;

public class DoublyLinkedList {

    Node first;
    Node last;

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode; // last will refer to the new node
        }else{
            first.previous= newNode;
        }
        newNode.next = first; // newnode next will point to the old first
        first = newNode;



    }



    public void insertLast(int data){

        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            first = newNode;
        }else{
            last.next = newNode; // assigning old last to new node
            newNode.previous = last;
        }

        last = newNode;

    }

    public Node deleteFirst(){
    Node temp = first;
    if(isEmpty()){
        return null;
    }
    else if(first.next == null){
        last = null;
    }
    else{
        first.next.previous = null;
    }
    return temp;
    }

    public Node deleteLast(){
        Node temp = last;
        if(isEmpty()){
            return null;
        }
        else if(last == null){
            first = null;
        }
        else{
            last.previous.next = null;
            last = last.previous;
        }
        return temp;

    }


    public boolean insertAfter(int key, int data){

        Node current = first;

        while(current.data !=key){
            current = current.next;
            if(current == null){
                return false;
            }
        }
        Node newNode = new Node();
        newNode.data = data;

        if(current == last){
            current.next = null;
            last = newNode;
        }
        else{

            newNode.next = current.next;
            current.next.previous  = newNode;

        }
        current.next = newNode;
        newNode.previous = current;

        return true;

    }

    public Node deleteKey(int key){

        Node current = first;
        while(current.data != key){
            current = current.next;
            if(current == null){
                return null;
            }

        }

        if(current == first ){
            first = current.next;
        }
        else {
            current.previous.next = current.next;
        }

        if(current == last){
            last = current.previous;
        }else{
            current.next.previous = current.previous;
        }
        return  current;

    }


    public void displayList(){

        Node current = first;
        System.out.println("Printing ddl");
        while(current!=null){
            current.displayNode();
            current = current.next;
        }
        System.out.println("printing done");
    }


}
