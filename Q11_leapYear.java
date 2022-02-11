package Function;
import java.util.Scanner;
public class Q11_leapYear {
    static int checkLeapYear(int year){
        if(year%4==0 && year%100!=0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        return year;
    }
    public static void main(String[] args) {
        Scanner yy=new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=yy.nextInt();
        yy.close();
        checkLeapYear(year);
    }
    
}
