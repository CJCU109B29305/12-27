import java.util.Scanner;

public class JPA04 {
    public static void main(String[]args){
        int x ;
        int sum = 1;
        System.out.print("Input n(0 <= n <= 16):");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (0<=x & x<=16){
            for(int i=1;i<=x;i++){
            
                sum *= i;
            }
            System.out.println(x+"的階乘 = "+sum);
        }
        else{
        }    
    }
}