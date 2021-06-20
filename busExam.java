
public class busExam {

	public static void main(String[] args) {
		bus bus = new bus();
		
		bus.run();//달리다
		bus.ppangppang();//빵빵
		
		Car car = new Car();
		car.run();
		
//		car.ppangppang();부모클래스는 자식클래스꺼를 쓸 수 없다.
	}
}

