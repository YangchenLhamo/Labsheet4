package Function;
import java.util.Scanner;
public class Q16_checkPalindrome {
    static int checkPlaindrome(int nn){
        int temp=nn, rem=0, sum=0;
        while(temp!=0){
            rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }
        if(nn==sum){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        return nn;
    }
    public static void main(String[] args) {
      Scanner pp=new Scanner(System.in);
      System.out.println("Enter a number:");
      int num=pp.nextInt();
      pp.close();
      checkPlaindrome(num);  
    }
    
}
