package HelloWoled2;

public class InnerExam {
	//���� Ŭ����
	class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		//���� Ŭ���� �����
		//Ŭ������ �ҷ��´�
		InnerExam t = new InnerExam();
		//Ŭ���� ���� Ŭ������ �ҷ��´�.
		InnerExam.Cal cal = t.new Cal(); 
		
		cal.plus();
		System.out.println(cal.value);

	}

}
