
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
//		System.out.println(localScope); 오류남
//		System.out.println(value); 오류남
		System.out.println(value2);
		//이것이 범위
	}
	
	public static void main(String[] args) {
		//이렇게 다 오류가 나는 이유는 static떄문
		//모든 클래스는 인스턴스화 하지 않은 채로 사용할 수 없다.ex)new
		//키워드 static을 사용하면 인스턴스화 하지 않아도 사용가능
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		
		System.out.println(staticVal);//static은 바로 사용가능 7
		
		VariableSoopeExam v1 = new VariableSoopeExam();
		System.out.println(v1.globalScope);//10
		VariableSoopeExam v2 = new VariableSoopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);//10 인스턴스 변수
		System.out.println(v2.globalScope);//20
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);//100 클래스 변수
		System.out.println(v2.staticVal);//100 같은것을 가리키고 있기 떄문에
		System.out.println(VariableSoopeExam.staticVal);//100 클래스 변수는 클레스명으로 바로쓰는것이 바람직하다
	}

}
