//제일 뒷부분은 *로 처리하면 그 폴더안에 있는 모든 클래스를 사용가능
import kr.co.helloWorld.javastudy.*;

public class HelloExam {

	public static void main(String[] args) {
		//ctrl+shift+o 누르면 자동 import
		//다른 폴더에 있는 클레스를 가져올때는 import해주어야한다.
		Hello hello = new Hello();
		
		//import를 안할경우
//		kr.co.helloWorld.javastudy.Hello hello = new kr.co.helloWorld.javastudy.Hello();
	}

}
