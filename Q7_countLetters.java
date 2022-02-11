package Function;

public class Q7_countLetters {
    public static void countletter(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' ');
                count++;
        }
        System.out.println("THe total number of word is "+count+1);
    }
    public static void main(String[] args) {
        String s="Alchimsit was writtern by Poulo Choelo";
        countletter(s);
    }
    
}
