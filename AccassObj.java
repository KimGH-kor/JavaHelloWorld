
public class AccassObj {
	//범위기준으로 정렬하면 public protected default private
	public int p = 3;// 모두 공개
	protected int p2 = 4;//같은 패키지 안에 있으면 공개 -> 자식 클래스로써는 접근 가능
	int x = 2;//default접근 지정자(자기자신과 같은 패키지 내에서만 접근 가능)
	private int i = 1;//자기 자신만 접근 가능
}
