import java.util.*;

public class NumberUtility {
    
    public static String Age(int age){
        return (age>18)? "Eligible":"Not Eligible";
    }

    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    

    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]){
    while(true){
    System.out.println("Press For:");
    Scanner sc = new Scanner(System.in);
    System.out.println("1.Voter Eligibility");
    System.out.println("2.Prime Number Check");
    System.out.println("3.Factorial");
    System.out.println("Enter Your Choice:");

  
    int choice=sc.nextInt();

    if(choice==1){
        System.out.print("Enter your age: \n");
        int age=sc.nextInt();
        System.out.println("Voting Status: " + Age(age));
    }
    else if(choice==2){
        System.out.print("Enter your number: \n");
        int n=sc.nextInt();
        if (checkPrime(n)) {
        System.out.println(n + " is Prime");
        } else {
        System.out.println(n + " is Not Prime");
        }
    }
    else if (choice==3) {
        System.out.print("Enter your number: ");
        int n= sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
    else{
        System.out.println("Invalid Input");
    }
    System.out.println("");
    }
    }
}
