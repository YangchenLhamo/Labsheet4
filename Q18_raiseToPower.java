package Function;
import java.util.Scanner;
public class Q18_raiseToPower {
    public static int findPower(int m, int n){
        return (int) Math.pow(m,n);
    }
    public static int findPower(int m){
        return (int) Math.pow(m,2);
    }
     public static void main(String [] args){
         Scanner aa= new Scanner(System.in);
         System.out.println("Enter the value of m:");
         int m= aa.nextInt();
         System.out.println("Enter the value of n:");
         int n=aa.nextInt();
         System.out.println("The result is: "+findPower(m,n));
         System.out.println("The result is: "+findPower(m));
         aa.close();
     }
    
}
