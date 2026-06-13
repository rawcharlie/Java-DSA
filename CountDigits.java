import java.util.*;

public class CountDigits {
  public static int count_digits(int num){
  int count=0;
  while(num>0){
    count++;
    num=num/10;
  }
  return count;
  }
    public static void main(String[] args) {
      int num=1732;
      int result=count_digits(num);
      System.out.println(result);
    }
}