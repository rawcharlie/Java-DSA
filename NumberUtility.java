import java.util.*;

public class NumberUtility {
    
    public static String Age(int age){
        return (age>18)? "Eligible":"Not Eligible";
    }

    public static String checkPrime(int n){
        if (n <= 1) return "Not Prime"; // 0 and 1 are not prime
        if (n <= 3) return "Prime";  // 2 and 3 are prime
        if (n % 2 == 0 || n % 3 == 0) return "Not Prime";
        
        for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0)
            return "Not Prime";
        }
        return "Prime";
    }
    

    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Press For: ");
    System.out.println("1.Voter Eligibility");
    System.out.println("2.Prime Number Check");
    System.out.println("3.Factorial");
  
    int choice=sc.nextInt();

    if(choice==1){
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        Age(age);
    }

    if(choice==2){
        System.out.print("Enter your number: ");
        int n=sc.nextInt();
        checkPrime(n);
        System.out.println((checkPrime(n)));
    }

    if (choice==3) {
        System.out.print("Enter your number: ");
        int n= sc.nextInt();
        factorial(n);
        System.out.println(factorial(n));
    }
}
}
