package Function;
import java.util.Scanner;
public class Q13_printMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int ar[][]= new int[n][n];

        System.out.println(" Enter the element of matrix:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                 System.out.print(ar[i][j]+" ");
            }
             System.out.println();
        }
        
        sc.close();
        
    }
    // // public static void printmatrix(int n){
       
    // }
}
