import java.util.*;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[]  args){
        int[] arr={2,1,4,5,8,7,8};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int LastIndex = arr.length-1;
        System.out.println(LastIndex);

        int largestValue = arr[LastIndex]; 

        for(int i = arr.length-2 ; i >= 0; i--){
            if(arr[i] != largestValue){
                int SecondLargest = arr[i];
                System.err.println(SecondLargest);
                break;
            }
        }
    }
}
