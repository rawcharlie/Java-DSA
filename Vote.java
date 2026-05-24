import java.util.Scanner;

public class Vote {
    public static String eligible(int age){
       return (age>18)? "Eligible":"Not Eligible";
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();

        String result=eligible(age);
        System.out.print("Vote:"+result);
    }
}
