
public class LECDTVExam {

	public static void main(String[] args) {
		//interpace�� ����� ����� ����.
		TV tv = new LEDTV();
		tv.turnOn();
		tv.changeVolume(45);
		tv.changeChannel(4);
		tv.turnOff();

	}

}
