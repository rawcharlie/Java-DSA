public class ValidAnagram {
    public static void main(String[] args) {
        String s="abc";
        String t="bga";

        if(s.length() != t.length()){
            System.out.print("Not an anagram");
        }

       else{
         int[] count = new int[26];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int c : count){
            if(c!=0){
                System.out.print("Not an anagram");
                return;
            }
        }

        System.out.print("An anagram");
       }
    }
}
