package HelloWoled2;

public class InnerExam2 {
	//������ �ʵ�� ����� ����Ŭ����(staticŬ����)
	static class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		//staticŬ������ ��ü�� ������ �ʿ���� ��밡���ϴ�.
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
	}

}
