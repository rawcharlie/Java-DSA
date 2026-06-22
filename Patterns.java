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
}


class Main{
    public static void main(String args[]) {
        int n = 5;
        char ch = 'A'; 
        Patterns p = new Patterns(); //memory
        p.pattern2_s3(n);
    }
}
