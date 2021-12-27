import java.util.Scanner;

public class JPA02 {
    public static void main(String[] argv) {
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter score:");
        while (true) {
            x = sc.nextInt();
            if (x >= 60) {
                System.out.println("You pass");
                
            }
            System.out.println("End");  
        } 
    }
}
