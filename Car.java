
public class Car{
//타입 필드명
	String name;
	int number;
	
	//직접 매개변수를 지정하면 기본생성자는 자동으로 생성안된다.
	public Car(String name) {
		this.name = name;
	}

	//기본생성자를 직접 생성
	public Car() {
//		this.name = "이름없음";
//		this.number = 0;
		this("이름없음",0);
		//위에 값이랑 같다.
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void run() {
		System.out.println("달린다");
	}
}
