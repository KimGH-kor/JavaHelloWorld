package HelloWoled2;

public class ExceotionExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try {
		int x = divide(i, j);
		}catch(ArithmeticException e) {
			System.out.println("����: "+e.toString());
		}
		

	}
	
	//ȣ���� �ʿ��� ó���ϵ��� ���ѱ�//������ �ѱ�� �͵� ����(throws ����, ����, ����)
	public static int divide(int i, int j) throws ArithmeticException {
		int k = i/j;
		return k;
	}

}
