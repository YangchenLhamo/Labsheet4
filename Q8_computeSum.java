package Function;

public class Q8_computeSum {
    public static int computesum(int num1){
        int sum=0;
        while (num1>0){
        int  num=num1%10;
        sum=sum+num;
        num1=num1/10;
        }
        return sum;
        

    }
    public static void main(String[] args) {
        int num1=123;
        int sum=computesum(num1);   
        System.out.println(sum);
      
    }
    
}