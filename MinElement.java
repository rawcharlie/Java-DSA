public class MinElement {
    public static void main (String[] args ){
    int [] arr= {-5,-2,-10,-1}; //initialze array

    int min = arr[0]; //here i=3 

    for(int i=1; i<arr.length; i++)
        {
            if(arr[i] < min)
                {
                    min=arr[i];
                } 
    }
    System.out.println("Minimum Element:"+min);
}
}
