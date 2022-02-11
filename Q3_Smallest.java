package Function;

public class Q3_Smallest {
    public static int getsmallest(int a, int b, int c){
        int smallest= a;
        if(b<smallest){
            smallest=b;
        }
        else if(c<smallest){
            smallest=c;
        }
        return smallest;
    }
    public static void main(String[] args) {
        int a=23;
        int b=33;
        int c=12;
        int smallest= getsmallest(a,b,c);
        System.out.println("the smallest number is "+ smallest);
    }
    
}
