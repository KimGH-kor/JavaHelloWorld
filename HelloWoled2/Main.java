package HelloWoled2;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();//���� �޾ƿ�
        int[] B = new int[123];// �ƽ�Ű�ڵ� �ҹ��� 97~122
        int C = 1;
        
        for(int i = 97; i < 123; i++) {
        	B[i] = -1;
        }
        
        for(int i = 0; i < A.length(); i++){//�迭 �� �ڸ��� ���� ���� ->�տ� �ڸ��ϼ��� ���� +�� �þ
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