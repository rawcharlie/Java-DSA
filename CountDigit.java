import java.util.*;
import java.util.Scanner;

class DigitCount{
    public int digitCount(int n){
      if (n==0){
        return 1;
      } 
      int count = 0;
      while (n>0){
        count++;
        n=n/10;
      }
        return count;
    } 
}
public class CountDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int n = sc.nextInt();
        DigitCount d = new DigitCount(); //Memory Allocate
        d.digitCount(n);
        System.out.println(d.digitCount(n));
    }
}