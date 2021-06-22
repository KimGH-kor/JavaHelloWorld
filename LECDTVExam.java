
public class LECDTVExam {

	public static void main(String[] args) {
		//interpace도 상속의 개념과 같다.
		TV tv = new LEDTV();
		tv.turnOn();
		tv.changeVolume(45);
		tv.changeChannel(4);
		tv.turnOff();

	}

}
