import java.util.*;


class arrayQuestions
{
    private int arr[]; // its a reference not actual array
    private int n; // size of array


    public arrayQuestions(int n) {
        this.n = n;
        arr = new int[n]; // we have created an array of size n
       
    }


    public void input() //setter method to input the elements of the array
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
    }


    public void arrayDisplay()
    {
        System.out.println("The elements of the array are: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }  
        System.out.println();
    }




    public void arrayRotationRightW() //it wont produce the correct output as we are not storing the last element in a variable and then putting it in the first index
    {
       
        for (int i=0;i<n-1;i++)
        {
            arr[i+1] = arr[i];
            arrayDisplay();
        }


    }


    public void arrayRotationRight() //it will produce the correct output as we are storing the last element in a variable and then putting it in the first index
    {
        int last = arr[n-1];
        for (int i=n-1;i>0;i--)
        {
            arr[i] = arr[i-1];
            //arrayDisplay();
        }
        arr[0] = last;
        arrayDisplay();


    }


    public void arrayRotationLeft() //it will produce the correct output as we are storing the first element in a variable and then putting it in the last index
    {
        int first = arr[0];
        for (int i=0;i<n-1;i++)
        {
            arr[i] = arr[i+1];
            //arrayDisplay();
        }
        arr[n-1] = first;
    }


    public void rotationMenu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rotations: ");
        int rotations = sc.nextInt();
        System.out.println("Enter the direction of rotation (1 for left, 2 for right): ");
        int direction = sc.nextInt();


        int k = rotations;
        rotations = rotations % n; // to avoid unnecessary rotations
        if (direction == 1)
        {
            for (int i=0;i<rotations;i++)
            {
                arrayRotationLeft();
            }
            arrayDisplay();
        }
        else if (direction == 2)
        {
            for (int i=0;i<rotations;i++)
            {
                arrayRotationRight();
            }
            arrayDisplay();
        }
        else
        {
            System.out.println("Invalid direction");
        }
    }


    int maxElement()
    {
        int max = arr[0];
        for (int i=1;i<n;i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }


    int maxElementIndex()
    {
        int max = arr[0];
        int index = 0;
        for (int i=1;i<n;i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }


    public int getElement(int index) //getter method to get the element at a particular index
    {
        if (index < 0 || index >= n)
        {
            System.out.println("Invalid index");
            return -1;
        }
        return arr[index];
    }


    public int minElement()
    {
        int min = arr[0];
        for (int i=1;i<n;i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }


    public int minElementIndex()
    {
        int min = arr[0];
        int index = 0;
        for (int i=1;i<n;i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }


    public void minMaxMenu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to find the maximum element and its index, 2 to find the minimum element and its index: ");
        int choice = sc.nextInt();
        if (choice == 1)
        {
            int max = maxElement();
            int index = maxElementIndex();
            System.out.println("The maximum element is: "+max);
            System.out.println("The index of the maximum element is: "+index);
        }
        else if (choice == 2)
        {
            int min = minElement();
            int index = minElementIndex();
            System.out.println("The minimum element is: "+min);
            System.out.println("The index of the minimum element is: "+index);
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}




public class p1AR1 {
    public static void main(String args[]) {
       
        Scanner sc=new Scanner(System.in);
        arrayQuestions obj = new arrayQuestions(5);
        obj.input();
        
        while (true) {
            System.out.println("Enter 1 for rotation, 2 for min/max: ");
            int choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    obj.rotationMenu();
                    break;
                case 2:
                    obj.minMaxMenu();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
