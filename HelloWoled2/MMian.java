package HelloWoled2;

public class MMian {
	public String sub(int i, int j) {
		return i> j ? "rere" : "adad";
	}

	public static void main(String[] args) {
		MMian mi = new MMian();
		String a =	mi.sub(3, 4);
		System.out.println(a);
		
	}

}
