public class ReveerveArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5}; // index= 0,1,2,3,4

        int left = 0; //Left pointer take index value 0 which mean the value of left is 1
        int right = arr.length - 1; //Right pointer take index value which means 5-1=4, current value of right is 5

        while (right>left) {
            int temp = arr[left]; // temp = 1, arr = {1,2,3,4,5}
            arr[left] = arr[right]; //left = 5, arr = {5,2,3,4,5}
            arr[right] = temp; //right = 1, arr = {5,2,3,4,1}
            
            left++; //left = 2 
            right--; // right = 4
        }

        //Print the reverse array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"");
        }
    }
}