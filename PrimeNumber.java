import java.util.*;
import java.util.Scanner;

public class PrimeNumber {
    public static boolean PrimeNumber(int num){
        if (num <= 1) {
            return false;
        }

        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();

        boolean result=PrimeNumber(num);

        if(result==true){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
    
}
