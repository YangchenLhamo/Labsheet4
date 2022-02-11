package Function;
import java.util.Scanner;
public class Q17_performOperations {
    public static int performOperation(int a, int b, char i){
        int res=0;
        switch(i){
            case '+': res=a+b;
                        System.out.println("sum= "+res);
                        break;
            case '-': res=a-b;
                        System.out.println("Subtraction= "+res);
                        break;
            case '*':res= a*b;
                        System.out.println("multiplication= "+res);
                        break;
            case '/':res= a/b;
                        System.out.println("division= "+res);
                        break;
            default:
                        System.out.println("invalid choice");
                        break;
        }
        return(res);    
    }
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=ss.nextInt();
        System.out.println("Enter second number:");
        int b=ss.nextInt();
        System.out.println("chose any operation:");
        char i=ss.next().charAt(0);
        performOperation(a,b,i);
        ss.close();
        
        
    }   
}
