import java.util.*;
public class Grater {

    public static int graterNo(int a, int b){
        if (a>b) {
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        int result=graterNo(a, b);
        System.out.print("Gtr No.:"+ result); 

    }
}
