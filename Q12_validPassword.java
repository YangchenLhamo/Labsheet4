package Function;
import java.util.Scanner;
public class Q12_validPassword {
    static void checkPassValidation(String pass, String input_pass){
        int len=pass.length();
        if(input_pass.length()==len){
            System.out.println("PASSWORD MATCHED");
        }else{
            System.out.println("Your password must have atleast ten character.");
        }
        // int countNum=0, countChar=0; 
        // if(countNum>=2 && countChar>=2){
            
        // }
    }
    public static void main(String[] args) {
        String Password="yang123456";
        Scanner pp= new Scanner(System.in);
        System.out.println("Enter your password:");
        String input_pass=pp.next();
        pp.close();
        checkPassValidation(Password, input_pass);
    }
    
}
