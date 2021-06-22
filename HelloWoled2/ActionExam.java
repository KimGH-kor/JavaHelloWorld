package HelloWoled2;

public class ActionExam {

	public static void main(String[] args) {
//		보통 상속받아 쓰는 방법
//		Action action = new MyAction();
//		action.exec();
		
		//익명메소드 이름없는 객체를 만드는 것
		//한번만 쓰고 말거라면 익명클래스/익명중첩클래스
		Action action = new Action() {
			@Override
			public void exec() {
				System.out.println("exec");
				
			}
		};
		
		action.exec();
		

	}

}
