package HelloWoled2;

public class InnerExam2 {
	//정적인 필드로 만드는 내부클래스(static클래스)
	static class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		//static클래스는 객체를 생성할 필요없이 사용가능하다.
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
	}

}
