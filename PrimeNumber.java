import java.util.*;
import java.util.Scanner;

public class PrimeNumber {
    public static int PrimeNumber(int num){
        if (num <= 1) {
            return 200;
        }
        int flag=0;

        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                flag=200;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();

        int result=PrimeNumber(num);

        if(result==0){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
    
}
