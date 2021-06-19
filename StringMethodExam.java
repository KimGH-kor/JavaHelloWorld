
public class StringMethodExam {

	public static void main(String[] args) {
//		String str = new String("hello");
		String str = "hello"; // String은 특별하게 이렇게도 된다.
		System.out.println(str.length());//문자열의 길이를 가르쳐준다. 공백도 계산
		System.out.println(str.concat(" world")); // 문자열 결함 결과 = hello world
		System.out.println(str); 
		// concat을 따로 저장안했으니 결과 = hello string은 한번 만든 객체를 바꾸지 않는다(불변)
		str = str.concat(" world");
		System.out.println(str);
		
		System.out.println(str.substring(3));//잘라내기 결과 = lo world
		System.out.println(str.substring(3 , 7));//3~7번까지 잘라내기 결과 = lo w
		
	}

}
