public class LargestElement {
    public static void main (String[] args ){
    int [] arr= {3,2,5,0,9}; //initialze array

    int max = arr[0]; //it look for index 0

    for(int i=1; i<arr.length; i++) //so we can start the loop form 1 instead of 0
        {
            if(arr[i] > max)
                {
                    max=arr[i];
                } 
    }
    System.out.println("Maximum Element:"+max);
}
}
