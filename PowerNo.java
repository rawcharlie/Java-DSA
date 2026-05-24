import java.util.*;

public class PowerNo {
    public static double powerNo(double x, double n){
        return Math.pow(x, n);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double n=sc.nextDouble();

        double result=powerNo(x,n);
        System.out.print("Power:"+result);
    }
    
}
