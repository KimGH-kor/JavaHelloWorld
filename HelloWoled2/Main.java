package HelloWoled2;
import java.util.*;

public class Main{
		public static void main(String[] args){
		    Scanner a = new Scanner(System.in);
		    String sc = a.nextLine().trim();
		    int answer = 0;
		    
            if(sc.length() != 0){
		    for(int i = 0; i < sc.length(); i++){
		        if(sc.charAt(i)==' '){
		            answer += 1;
		        }
		    }
            answer++;
		    
		}
            System.out.println(answer);
        }
	}
