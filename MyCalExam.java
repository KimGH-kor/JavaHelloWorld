

public class MyCalExam {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		
		cal.plue(4, 5);
		cal.multiple(2, 3);
		int i = cal.exec(5, 3);
		System.out.println(i);
		
		//static�޼ҵ�� �������̽� �̸�.�޼ҵ� �̸�() ���� �ҷ��;��Ѵ�
		Calculator.exec2(3, 4);
	}

}
