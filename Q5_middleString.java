package Function;

public class Q5_middleString {
    public static void getmiddle(String s){
        int middle=s.length()/2;
        if(s.length()%2==0){
            System.out.println(s.charAt(middle-1) +""+s.charAt(middle));
        }else{
            System.out.println(s.charAt(middle));
        }
    }
    public static void main(String[] args) {
        String even="NEPALI";
        String odd="NEPAL";
        getmiddle(even);
        getmiddle(odd);

    }
    
}
