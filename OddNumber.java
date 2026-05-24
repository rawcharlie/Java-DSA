import java.util.*;

public class OddNumber {

    public static int oddNumber(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int result = oddNumber(n);
        System.out.println("Sum:"+result);
    }
}
