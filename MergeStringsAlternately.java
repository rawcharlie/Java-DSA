public class MergeStringsAlternately {

    public static void main(String[] arg){
        String w1="abc";
        String w2="pqr";
        int i=0;
        int j=0;
        String s="";

        while (i<w1.length() && j<w2.length()) {
            s += w1.charAt(i);
            s +=w2.charAt(j);
            i++;
            j++;
        }

        while (i<w1.length()) {
            s += w1.charAt(i);
            i++;
        }
        while (j<w2.length()) {
            s +=w2.charAt(j);
            j++;
        }

        System.out.print("String is:"+s);
    }
}