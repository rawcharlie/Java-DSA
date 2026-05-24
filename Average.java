import java.util.*;

public class Average {

    public static int Avg(int a, int b, int c){
        int Avg= (a+b+c)/3;
        return Avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = Avg(a,b,c);
        System.out.print("Sum of 3 No. is:"+result);
    }
}
