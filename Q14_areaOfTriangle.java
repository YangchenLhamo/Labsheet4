package Function;
import java.util.Scanner;
public class Q14_areaOfTriangle {
    static void calcualteArea(int a,int b, int c){
        int s=(a+b+c)/2;
        int area= (s*(s-a)*(s-b)*(s-c))^1/2;
        System.out.println("The area of triangle is: "+area);
    }
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        System.out.println("Enter the first side:");
        int a =aa.nextInt();
        System.out.println("Enter the second side:");
        int b=aa.nextInt();
        System.out.println("Enter the third side:");
        int c=aa.nextInt();
        aa.close();
        calcualteArea(a, b, c);
    }
    
}
