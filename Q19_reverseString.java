package Function;
import java.util.Scanner;
public class Q19_reverseString {
    public static void getReverse(String word){
        String Final=" ";
        for(int i=word.length()-1; i>=0; i--){
            Final+=word.charAt(i);
        }
        System.out.println(Final);
        
    }
    public static void main(String [] args){
        Scanner aa= new Scanner(System.in);
        System.out.println("Enter a word:");
        String word= aa.nextLine();
        aa.close();
        getReverse(word);


    }
}
