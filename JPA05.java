import java.util.Scanner;

public class JPA05 {
    public static void main(String[]argv){
        Scanner sc = new Scanner(System.in);
        int [] x = new int [10];
        System.out.println("請輸入10個整數:");
        int c = 0,sum = 0;
        double s = 1.0; 
        for(int i=0;i<10;i++){
            System.out.print("第"+(i+1)+"個整數:");
            x[i] = sc.nextInt();
            if (x[i]>60){
               c++;
               sum += x[i];
            }
            
        }
        System.out.println("陣列中大於60的有"+c+"個");
        System.out.println("總和為"+sum);
        System.out.println("平均值為"+sum*s/c);
    }
}
