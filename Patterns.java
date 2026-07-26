import java.util.*;
import java.util.Scanner;

class Patterns{

    public static void pattern1_s1(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void pattern1_s2(int n, char ch){
        for(int i=0; i<=n; i++){
            char ch2 = ch;
            for(int j=1; j<=n; j++){
                System.out.print(ch2 + " ");
                ch2++;
            }
            System.out.println("");
        }
    }
    public static void pattern2_s1(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void pattern2_s2(int n){
        for (int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void pattern2_s3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);

            }
            System.out.println("");
        }
    }
    public static void pattern2_s4(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2_s5(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern2_s6(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void pattern2_s7(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void triangleUpper(int n)
    {
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=i*2-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void triangleLower(int n)
    {
        for (int i=n;i>=1;i--)
        {
           


            for (int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=i*2-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void M(int n)
    {
        for (int i=1;i<=n;i++)
        {
            //pattern
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }


            //space
            for (int k=1;k<=2*n-2*i;k++)
            {
                System.out.print("  ");
            }


            //pattern
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public void invertedM(int n)
    {
        for (int i=n;i>=1;i--)
        {
            //pattern
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }


            //space
            for (int k=1;k<=2*n-2*i;k++)
            {
                System.out.print("  ");
            }


            //pattern
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}


class Main{
    public static void main(String args[]) {
        int n = 5;
        char ch = 'A'; 
        Patterns p = new Patterns(); //memory
       p.M(n);

        // while (true) {
            
        // }
    }
}
