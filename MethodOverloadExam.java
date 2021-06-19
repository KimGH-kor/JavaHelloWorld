
public class MethodOverloadExam {

	public static void main(String[] args) {
		Myclass2 n = new Myclass2();
		
		System.out.println(n.plus(10, 20));
		
		System.out.println(n.plus(1, 5, 7, 2));
		
		System.out.println(n.plus("Hello", "World"));
				

	}

}
