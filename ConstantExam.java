public class ConstantExam {

	public static void main(String[] args) {

		int i ;
		i = 10;
		i = 5;
		
		//�ѹ� �����ϸ� �ٲ� �� ������
		//��� ������� �빮�ڷ� �ۼ�
		final int J;
		J= 10;
//		J= 5;
		
		double circleArea;
		final double PI = 3.141592;
		circleArea = 3 * 3 * PI;
		
		//����� �ܾ�� �ܾ���̸� �����_
		final int OIL_PRICE = 1450;
		
		int totalPrice = 50 * OIL_PRICE;
		
		System.out.println(i);
		System.out.println(circleArea);
		System.out.println(totalPrice);

	}

}
