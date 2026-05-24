import java.util.*;
public class Radius {

    public static double circumferance(double n){
        return 2 * Math.PI * n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();

        double result=circumferance(n);
        System.out.print("Circumferance:"+result);
    }
    
}
