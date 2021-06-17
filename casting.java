
public class casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;	//==(double) 1;	자동으로 이렇게 해준다.
		
		System.out.println(b);
		
		double c = 1.1;
		int d = (int) 1.1; // 강제로 int로 바꾼다. -> 손실이 일어나기 때문에 오류로 알려준다.
//		int e = 1.1; 오류남
		
		System.out.println(d);
		
		//1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		
	}

}
