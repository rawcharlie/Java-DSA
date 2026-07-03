class Node
{   
    public int data;
    Node next;
    
    public Node(int data)
    {
        this.data=data;
        this.next=null;
        
        System.out.println("New Node Created with data = "+data+" & next pointer/pointers NULL");
    }

}

class LinkedListOperations
{
    Node head;

    public LinkedListOperations()
    {
        System.out.println("Object of LinkedList Created it will control everything");
    }
    public void addAtStart(int data)
    {
        Node newNode = new Node(data);
    }
}

public class LL
{
    public static void main(String[] args) {

        LinkedListOperations op = new LinkedListOperations();
        
    }
}
