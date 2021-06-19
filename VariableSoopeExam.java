
public class VariableSoopeExam {
	int globalScope = 10;
	
	static int staticVal = 7;
	
	public void soopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {

		System.out.println(globalScope);
//		System.out.println(localScope); ������
//		System.out.println(value); ������
		System.out.println(value2);
		//�̰��� ����
	}
	
	public static void main(String[] args) {
		//�̷��� �� ������ ���� ������ static����
		//��� Ŭ������ �ν��Ͻ�ȭ ���� ���� ä�� ����� �� ����.ex)new
		//Ű���� static�� ����ϸ� �ν��Ͻ�ȭ ���� �ʾƵ� ��밡��
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		
		System.out.println(staticVal);//static�� �ٷ� ��밡�� 7
		
		VariableSoopeExam v1 = new VariableSoopeExam();
		System.out.println(v1.globalScope);//10
		VariableSoopeExam v2 = new VariableSoopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);//10 �ν��Ͻ� ����
		System.out.println(v2.globalScope);//20
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);//100 Ŭ���� ����
		System.out.println(v2.staticVal);//100 �������� ����Ű�� �ֱ� ������
		System.out.println(VariableSoopeExam.staticVal);//100 Ŭ���� ������ Ŭ���������� �ٷξ��°��� �ٶ����ϴ�
	}

}
