import java.util.*;

public class ArrayIsSorted{

    public static boolean isSorted(int arr[]){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,5,6};

        boolean isSort = isSorted(arr);

        System.out.println(isSort);

    }
}