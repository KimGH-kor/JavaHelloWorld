
public class casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;	//==(double) 1;	�ڵ����� �̷��� ���ش�.
		
		System.out.println(b);
		
		double c = 1.1;
		int d = (int) 1.1; // ������ int�� �ٲ۴�. -> �ս��� �Ͼ�� ������ ������ �˷��ش�.
//		int e = 1.1; ������
		
		System.out.println(d);
		
		//1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		
	}

}
