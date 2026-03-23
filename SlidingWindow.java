public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr={1,2,-1,3,4,5,-2};
        int k=3;

        int WindowSum=0;

        //For Window Sum
        for(int i=0; i<k; i++){
            WindowSum += arr[i];
        }

        int maxSum=WindowSum;
        
        //For Sliding Window
        for(int i=k; i < arr.length; i++){
            WindowSum= WindowSum + arr[i];
            WindowSum= WindowSum - arr[i-k];
            if (WindowSum>maxSum) {
                maxSum=WindowSum;
            }
        }
        System.out.print("Max Sum:" +maxSum);
    }
}
