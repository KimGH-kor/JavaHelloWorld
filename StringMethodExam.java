
public class StringMethodExam {

	public static void main(String[] args) {
//		String str = new String("hello");
		String str = "hello"; // String�� Ư���ϰ� �̷��Ե� �ȴ�.
		System.out.println(str.length());//���ڿ��� ���̸� �������ش�. ���鵵 ���
		System.out.println(str.concat(" world")); // ���ڿ� ���� ��� = hello world
		System.out.println(str); 
		// concat�� ���� ����������� ��� = hello string�� �ѹ� ���� ��ü�� �ٲ��� �ʴ´�(�Һ�)
		str = str.concat(" world");
		System.out.println(str);
		
		System.out.println(str.substring(3));//�߶󳻱� ��� = lo world
		System.out.println(str.substring(3 , 7));//3~7������ �߶󳻱� ��� = lo w
		
	}

}
