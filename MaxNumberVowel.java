public class MaxNumberVowel {

    public static void main (String[] args){
        String str= "abcdiiedf";
        int k=3;

        int count =0;
        //First Window
        for(int i=0; i<k; i++){
            if (isVowel(str.charAt(i))) {
                count++;
            }
        }

        int max=0;
        //Slide Window
        for(int i=k; i<str.length(); i++){
            if(isVowel(str.charAt(i))){
                count++;
            }

            if(isVowel(str.charAt(i-k))){
                count--;
            }

            if (count>max) {
              max=count;  
            }
        }

        System.out.print("Max Vowel:"+max);
    }
     //Correct helper method
    public static boolean isVowel(char str) {
        return str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u';
    }
}