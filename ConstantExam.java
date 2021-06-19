public class ConstantExam {

	public static void main(String[] args) {

		int i ;
		i = 10;
		i = 5;
		
		//한번 저장하면 바꿀 수 없으며
		//상수 약속으로 대문자로 작성
		final int J;
		J= 10;
//		J= 5;
		
		double circleArea;
		final double PI = 3.141592;
		circleArea = 3 * 3 * PI;
		
		//상수는 단어와 단어사이를 언더바_
		final int OIL_PRICE = 1450;
		
		int totalPrice = 50 * OIL_PRICE;
		
		System.out.println(i);
		System.out.println(circleArea);
		System.out.println(totalPrice);

	}

}
