package Functional_Interface_Java;

public class result {

	public static void main(String[] args) {
		// 인스턴스화
		Plus10 plus10 = new Plus10();
		System.out.println(plus10.apply(1));
	}
}
