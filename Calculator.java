
public interface Calculator {
	public int plue(int i, int j);
	public int multiple(int i, int j);
//	public int exec(int i, int j) {
//		return i * j;
//	} interface�� �ٷ� ���ϰ��� �־������ ����(�߻�Ŭ������ ���������ϱ�)
	
	default int exec(int i, int j) {
		return i * j;
	}//�ڹ� 8���� �����ϰ� �Ǿ���.
	
	//static�޼ҵ嵵 ����������.
	public static int exec2(int i, int j) {
		return i * j ;
	}
}
