package HelloWoled2;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();
        
        if(B>=C){
            System.out.println("-1");
        }else{
            System.out.println((A/(C-B))+1);
        }
    }
}