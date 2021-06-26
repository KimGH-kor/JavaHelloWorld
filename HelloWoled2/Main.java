package HelloWoled2;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();//°ú¸ñ ¼ö
        String C[] = new String[A]; 
        
        
        for(int i = 0; i < A; i++){
        	String B = sc.next();
            C[i] = B;
            int result = 0;
            int count = 0;
            for(int k = 0; k < C[i].length(); k++){
            if(C[i].charAt(k) == 'O'){
                count++;
                result += count;
            }else{
                count = 0;
            }
            }
            System.out.println(result);   
        }
        
        
        }
}