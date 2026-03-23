public class LinearSearch {
         public static void main (String[] args ){
    int [] arr= {3,2,5,0,9,4,6}; //initialze array
    int target =0;
    int index =-1;

    for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                   index = i;
                   break; //stop at first match
                } 
    }
    if (index !=-1) {
        System.out.println("found at index:"+index);
    }
    else{
        System.out.println("Not found");
    }
}
}

