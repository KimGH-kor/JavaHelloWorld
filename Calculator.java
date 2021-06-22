
public interface Calculator {
	public int plue(int i, int j);
	public int multiple(int i, int j);
//	public int exec(int i, int j) {
//		return i * j;
//	} interface에 바로 리턴값을 넣어버리면 오류(추상클레스만 가졌었으니깐)
	
	default int exec(int i, int j) {
		return i * j;
	}//자바 8부터 가능하게 되었다.
	
	//static메소드도 가능해졌다.
	public static int exec2(int i, int j) {
		return i * j ;
	}
}
