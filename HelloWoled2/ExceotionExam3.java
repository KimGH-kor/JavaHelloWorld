package HelloWoled2;

public class ExceotionExam3 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try {
		int x = divide(i, j);
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
		

	}
	
	public static int divide(int i, int j)throws IllegalArgumentException{
		//������ ���� ����
		if(j == 0) {
			throw new IllegalArgumentException("0���� ���� �� �����ϴ�.");
		}
		int k = i/j;
		return k;
	}

}
