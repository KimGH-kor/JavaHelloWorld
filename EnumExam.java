
public class EnumExam {
	//final ����� �����Ҷ� ���� Ű���� ��� ���� ������ �빮�ڷ� �ۼ��� ���
	public static final String MALE ="MALE";
	public static final String FEMALE ="FEMALE";
	
	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		gender1 = "boy";
		
		
		Gender gender2;
		gender2 = Gender.MELE;
		gender2 = Gender.FEMELE;
		
//		gender2 = "boy"; �̰� ������

//Ư������ �������� ������ �������� ����ϴ� ���� ����.
		
	}

}

//������ Ÿ�� ������{�� ,�� ,}
enum Gender{
	MELE,FEMELE;
}