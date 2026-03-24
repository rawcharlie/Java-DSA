import java.util.HashSet;

public class LongestSubStringWithoutRepetingCharacter {
    public static void main(String[] args) {
        String s="abbcdeafe";

        
        HashSet<Character> set= new HashSet<>();

        int left=0;
        int maxlen=0;

        for(int right=0; right<s.length(); right++){
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen=Math.max(maxlen, right-left+1);
        }
        System.out.print("Max Length:"+maxlen);

    }
    
}
