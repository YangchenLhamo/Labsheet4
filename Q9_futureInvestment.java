package Function;
import java.util.Scanner;
public class Q9_futureInvestment {
    static void calculateInvestment(int p, int r, int n){
        double future_amount=0;
        for(int i=0; i<n; i++){
            if(n<=5){
                future_amount=p*Math.pow(1+r,n*12);
                System.out.println("In "+n+" th year "+future_amount); 
            }
        }       
    }
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        System.out.println("Enter the investment amount:");
        int p=aa.nextInt();
        System.out.println("Enter the rate:");
        int r=aa.nextInt();
        System.out.println("Enter the number of year:");
        int n=aa.nextInt();
        aa.close();
        calculateInvestment(p,r,n);
        
    }
    
}
