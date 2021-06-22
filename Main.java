import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        
        int H = sca.nextInt();
        int M = sca.nextInt();

        final int B = 60;
        
        
        if(M-45 < 0) {
        	H -= 1;
        	M = B-45+M;
        }else {
        	M-=45;
        }
        
    	if(H<0) {
    		H = 23;
    	}
    	
    	System.out.println(H);
    	System.out.println(M);
    }
}