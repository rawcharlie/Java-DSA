public class CountEventNumber {
     public static void main (String[] args ){
    int [] arr= {3,2,5,0,9,4,6}; //initialze array
    int count =0;
    for(int i=0; i<arr.length; i++)
        {
            if(arr[i] % 2 == 0)
                {
                    System.out.print(arr[i] + " ");
                   count++;
                } 
    }
    System.out.println("\nEven Number:"+count);
}
}
