package HelloWoled2;

public class ExceotionExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try {
		int x = divide(i, j);
		}catch(ArithmeticException e) {
			System.out.println("오류: "+e.toString());
		}
		

	}
	
	//호출한 쪽에서 처리하도록 떠넘김//여러개 넘기는 것도 가능(throws 예외, 예외, 에외)
	public static int divide(int i, int j) throws ArithmeticException {
		int k = i/j;
		return k;
	}

}
