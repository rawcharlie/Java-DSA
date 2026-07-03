import java.util.*;

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
    int length;

    public LinkedListOperations()
    {
        System.out.println("Object of LinkedList Created it will control everything");
        length=0;
        head=null;
    }

    public void insertAtBeginning(int data)
    {
        Node newNode = new Node(data); //dynamic memory allocation
        newNode.next=head; //if an element added to the linked list it attach new next = head
        head=newNode; // now new node become the first element 
        length++; // leangth inc..
        System.out.println("Node Inserted at beginning with data = "+data+" & length="+length);
    }

    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data); //new node created with data and next pointer null
        Node temp=head; //temporary pointer
        while(temp.next!=null) //walk pointer to last node of LL
        {
            temp=temp.next;
        }
        temp.next=newNode; //link last node to new node
        length++;
        System.out.println("Node Inserted at end with data = "+data+" & length="+length);
    }

    public void insertAtPosition(int data, int pos)
    {
        Node newNode = new Node(data); //new node created with data and next pointer null
        Node temp=head; //temporary pointer
        for(int i=1;i<=pos-2;i++) //walk pointer to position-1 node of LL
        {
            temp=temp.next;
        }
        newNode.next=temp.next; //link new node to next node of position-1 node
        temp.next=newNode; //link position-1 node to new node
        length++;
        System.out.println("Node Inserted at position "+pos+" with data = "+data+" & length="+length);
    }

    public void insertion(int data, int pos)
    {
        // if LL is empty and user wants to insert at any position,
        // we will insert at position 1

        //for empty LL, head-null, length=0

       if (head==null) //length==0
       {
        Node newNode = new Node(data); //new node created with data and next pointer null
        head=newNode; //move head to point to new node
        length=1; //length of LL is now 1
        System.out.println("Node Inserted at position 1 with data = "+data+" & length="+length);
        display();
        return;
       }

       if(pos<=1)
       {
        insertAtBeginning(data);
       }

       else if (pos>length)
       {
        insertAtEnd(data);
       }

       else
       {
        insertAtPosition(data, pos);
       }


       display();

    }
    
    public void display()
    {
        if(head==null)
        {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp=head; //head is pointing to first node, temp will also point to first node
        System.out.println("Linked List Elements are:");
        while(temp!=null)  //temp is not pointing to last node
        {
            System.out.print(temp.data+" ");
            temp=temp.next; //move temp to next node
        }
        System.out.println();
    }
}

public class SLL
{
    public static void main(String[] args) {

        LinkedListOperations op = new LinkedListOperations();

        int choice=0;
        int data=0;
        int pos=0;
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Welcome to Singly Linked List Operations");
            System.out.println("1. Insert");
            System.out.println("2. Deletion");
            System.out.println("3. Display");
            System.out.println("4. Search");
            System.out.println("5. Miscellaneous");
            System.out.println("6. Exit");
            System.err.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice==1)
            {
                System.out.println("Insert Operation");
                System.out.println("Enter the data to be inserted:");
                data = sc.nextInt();
                System.out.println("Enter the position to insert the data:");
                pos = sc.nextInt();
                op.insertion(data, pos);
            }
            else if (choice==2)
            {
                System.out.println("Deletion Operation");
                System.out.println("Enter the position of the node to be deleted:");
                pos = sc.nextInt();
               // op.deletion(pos);
            }
            else if (choice==3)
            {
                System.out.println("Display Operation");
                op.display();
            }
            else if (choice==4)
            {
                System.out.println("Search Operation");
                System.out.println("Enter the data to be searched:");
                data = sc.nextInt();
               // op.search(data);
            }
            else if (choice==5)
            {
                System.out.println("Miscellaneous Operation");
            }
            else if (choice==6)
            {
                System.out.println("Exiting the program");
                break;
            }
            else
            {
                System.out.println("Invalid Choice, Please try again");
            }
        }
        
    }
}
