package Function;

public class Q2_returnSum {
    public static int getnumber(int i, int j){
        int sum=i+j;
        return sum ;
    }
    public static void main(String[] args) {
        int i=4;
        int j=3;
        int sum=getnumber(i,j);
        System.out.println(sum);
    }
    
}