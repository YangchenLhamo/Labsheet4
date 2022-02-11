package Function;

public class Q4_avgFloat {
    public static float average(float l, float m, float n){
        float avg=(l+m+n)/3;    //value is captured
        return avg;
    }
    public static void main(String[] args) {
        float l=4;
        float m=3;
        float n=2;
        float avg= average(l,m,n);
        System.out.println("the average is:"+avg);
    }
    
}
