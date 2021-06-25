import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int num = A*B*C;
        int re = (int)(Math.log10(num)+1);
        int[] D = new int[10];
        
        for(int i = 0; i < re; i++){
            D[num%10]++;
            num = num/10;
            }
        for(int i = 0; i < 10; i++){
            System.out.println(D[i]);
        }
    }
}