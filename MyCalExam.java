

public class MyCalExam {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		
		cal.plue(4, 5);
		cal.multiple(2, 3);
		int i = cal.exec(5, 3);
		System.out.println(i);
		
		//static메소드는 인터페이스 이름.메소드 이름() 으로 불러와야한다
		Calculator.exec2(3, 4);
	}

}
