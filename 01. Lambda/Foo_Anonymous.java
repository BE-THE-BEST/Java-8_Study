package Lambda;

public class Foo_Anonymous {

	public static void main(String[] args) {

		//만약 함수형 인터페이스가 없었다면? 익명 내부 클래스를 만들어 썼었다!
		RunSomething runSomething = new RunSomething() {
			
			@Override
			public void doIt() {
				System.out.println("DO IT!");
				// 인터페이스를 상속받아온다 .
				// 인터페이스가 만약 1개라면? = 즉, 함수형 인터페이스라면 
			}
		};
	}

}
