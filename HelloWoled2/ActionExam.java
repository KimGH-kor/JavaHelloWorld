package HelloWoled2;

public class ActionExam {

	public static void main(String[] args) {
//		���� ��ӹ޾� ���� ���
//		Action action = new MyAction();
//		action.exec();
		
		//�͸�޼ҵ� �̸����� ��ü�� ����� ��
		//�ѹ��� ���� ���Ŷ�� �͸�Ŭ����/�͸���øŬ����
		Action action = new Action() {
			@Override
			public void exec() {
				System.out.println("exec");
				
			}
		};
		
		action.exec();
		

	}

}
