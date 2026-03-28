public class FirstOccurrence {

    public static void main (String[] args){
        String s1="Hello";
        String s2="ll";
        int n= s1.length();
        int m=s2.length();
        int result = -1;
        for(int i=0; i<= n-m; i++){
            int j=0;
            while(j<m && s1.charAt(i+j) == s2.charAt(j)){
                j++;
            }
            if (j==m){
                result=i;
                break;
            }
        }
        System.out.print(result);
    }
}