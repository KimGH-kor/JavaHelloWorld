
public class Myclass2 {
	//메소드 오버로딩 = 이름은 같지만 매개변수가 다른 것
	public int plus(int x, int y) {
		return x+y;
	}
	
	public int plus(int x, int y, int z) {
		return x+y+z;
	}

	public String plus(String x, String y) {
		return x + y;
	}
	//매게변수의 이름이 달라도 상관없다
	public int plus(int i, int j, int k, int l) {
		return i+j+k+l;
	}
	
}
