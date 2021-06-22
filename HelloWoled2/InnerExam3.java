package HelloWoled2;

public class InnerExam3 {
	//메서드 안에서 선언된 내부클래스
	public void exec() {
		class Cal{
			int value = 0;
			public void plus() {
				value++;
			}
		}
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	}
	
	public static void main(String[] args) {
		InnerExam3 t = new InnerExam3();
		t.exec();
	}

}
