package HelloWoled2;

public class ExceptionExam {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;//0���� ������ ������ ����.
		
		try {
			int k =i/j;
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�." +e.toString());
			//������.tostring() = ������ ������ �˷��ִ� �޼ҵ�
		}finally {
			System.out.println("������ �߻��ϵ� ���� ����");
		}
		
		System.out.println("main end");
		
	}

}
