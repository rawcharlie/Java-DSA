import java.util.*;
import java.util.Arrays;

public class LinearSearch {
    public static int LinearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                   return i;//stop at first match
            } 
        }
        return -1;
    }
         public static void main (String[] args ){
    int [] arr= {3,2,5,0,9,4,6}; //initialze array

    int result=LinearSearch(arr,11);
    
    if (result !=-1) {
        System.out.println("found at index:"+result);
    }
    else{
        System.out.println("Not found");
    }
}
}

