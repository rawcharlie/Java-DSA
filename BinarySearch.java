import java.util.*;
import java.util.Arrays;
public class BinarySearch {
    public static void main (String[] args){
        int[] arr={3,5,6,8,9,10};

        int result=BinarySearch(arr,10); //function call

        if (result != -1){
            System.out.println("Found at index:"+result);
        }else{
            System.out.println("Not found");
        }
    }

    public static int BinarySearch(int[] arr, int target){
        int left=0;
        int right=arr.length-1;//form this we access the index not the value at the index

        while (left<=right) {
            int mid=left+(right-left)/2; //it take index value not the value at that index

            if (arr[mid]==target) { //now it checking the value present at that index
                return mid;
            }

            if (arr[mid]<target) {
                left = mid+1; //binary search only work in sorted array soo we have to move forward 
            }else{
                right = mid-1; //same for left 
            }
        }
        return -1;
    }
    
}
