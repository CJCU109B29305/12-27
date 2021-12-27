import java.util.Scanner;

public class JPA03 {
    public static void main(String[]args){
        int x ;
        int sum = 0;
        System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for(int i=0;i<=x;i++){
            
            sum += i;
        }
        System.out.println(sum);

    }
}
