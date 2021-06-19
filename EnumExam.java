
public class EnumExam {
	//final 상수를 선언할때 쓰는 키워드 상수 선언 변수는 대문자로 작성이 약속
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
		
//		gender2 = "boy"; 이건 오류남

//특정값만 가져오고 싶으면 열거형을 사용하는 것이 좋다.
		
	}

}

//열거형 타입 변수명{값 ,값 ,}
enum Gender{
	MELE,FEMELE;
}