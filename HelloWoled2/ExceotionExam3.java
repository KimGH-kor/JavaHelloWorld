package HelloWoled2;

public class ExceotionExam3 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try {
		int x = divide(i, j);
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
		

	}
	
	public static int divide(int i, int j)throws IllegalArgumentException{
		//강제로 오류 생성
		if(j == 0) {
			throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
		}
		int k = i/j;
		return k;
	}

}
