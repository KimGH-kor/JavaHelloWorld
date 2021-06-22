package HelloWoled2;

public class ExceptionExam {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;//0으로 나누면 오류가 난다.
		
		try {
			int k =i/j;
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다." +e.toString());
			//변수명.tostring() = 예외의 정보를 알려주는 메소드
		}finally {
			System.out.println("오류가 발생하든 말든 실행");
		}
		
		System.out.println("main end");
		
	}

}
