
public class Car{
//Ÿ�� �ʵ��
	String name;
	int number;
	
	//���� �Ű������� �����ϸ� �⺻�����ڴ� �ڵ����� �����ȵȴ�.
	public Car(String name) {
		this.name = name;
	}

	//�⺻�����ڸ� ���� ����
	public Car() {
//		this.name = "�̸�����";
//		this.number = 0;
		this("�̸�����",0);
		//���� ���̶� ����.
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void run() {
		System.out.println("�޸���");
	}
}