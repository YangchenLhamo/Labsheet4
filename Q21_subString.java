package Function;

public class Q21_subString {
    public static void main(String[] args) {
        String S1="chenYang";
        String S2="Yang";
        System.out.println(checkSubstring(S1,S2));
    }
    public static String checkSubstring(String S1, String S2){
        String major=(S1.length()>S2.length())?S1:S2;
        String minor=(S1.length()>S2.length())?S2:S1;
        System.out.println(major.indexOf(minor));
        if (major.contains(minor)){
            return "Substring is present in the string ";
        }
        else{
            return "Substring is not present on the string";
        }
    }
    
}
