package HelloWoled2;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();//값을 받아옴
        int[] B = new int[123];// 아스키코드 소문자 97~122
        int C = 1;
        
        for(int i = 97; i < 123; i++) {
        	B[i] = -1;
        }
        
        for(int i = 0; i < A.length(); i++){//배열 각 자리에 값을 넣음 ->앞에 자리일수록 값에 +씩 늘어남
        	char D = A.charAt(i);
        	if(B[(int)D] == -1) {
        	B[(int)D] += C;
        	C++;
        	}else {
        		C++;
        	}
        	
        }
        for(int i =97; i < 123; i++) {
        	System.out.print(B[i]+" ");
        }
        
        
    }
}