package HelloWoled2;

public class InnerExam {
	//내부 클래스
	class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		//내부 클래스 사용방법
		//클레스를 불러온다
		InnerExam t = new InnerExam();
		//클래스 안의 클래스를 불러온다.
		InnerExam.Cal cal = t.new Cal(); 
		
		cal.plus();
		System.out.println(cal.value);

	}

}
