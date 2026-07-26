import java.util.Scanner;
import java.util.*;
class Node
{
    int data;
    Node next;
    Node prev;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;

        System.out.println("New Node Created with data = "+data+" & next pointer/pointers NULL");
    }
}

class LinkedListOperations1
{
    Node head;
    int length;
    Node prev;
    Node temp;

    public void insertion(int data) {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
        }else{
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        length++;
        System.out.println("Node Inserted: " + data + " & Current Length: " + length);
        display();
    }
    public void deletion()
    {
        if(prev != null)
        {
           prev = head; 
        }
        length--;
    }
    public void display()
    {
        if (head == null) 
        {
            System.out.println("Empty Linked List");
        }

        Node temp=head; 
        System.out.println("Your Linked List are:");
        while(temp!=null)  
        {
            System.out.print(temp.data+" ");
            temp=temp.next; 
        }
        System.out.println();
    }
}




public class DLL {

    public static void main(String args[])
    {
        LinkedListOperations1 ob = new LinkedListOperations1();
    
        int data = 0;

        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("1. Insert Data.");
            System.out.println("2. Delete Data");
            System.out.println("3. Middle of the linked list");
            System.out.println("4. Displayy");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            if(choice == 1)
            {
                System.out.println("Insert Your Data");
                System.out.println("Enter Your Data");
                data = sc.nextInt();
                ob.insertion(data);
            }
            else if (choice == 2) 
            {
                System.out.println("Delete Your Data");
                ob.deletion();
            
            }
            else if (choice == 3) 
            {
                System.out.println("Middle Element Of DLL");
            }
            else if (choice == 4) 
            {
                ob.display();
            }
            else if (choice == 5) 
            {
                System.out.println("Exiting From Program");
                break;
            }

        }
    }

}
