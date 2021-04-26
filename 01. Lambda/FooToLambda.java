package Lambda;

public class FooToLambda {

	public static void main(String[] args) {

		// 만들어놓은 인터페이스를 람다식으로 사용한다면?

		RunSomething runSomething = () -> System.out.println("DO IT LIKE ME!");
		System.out.println("람다식===");
		runSomething.doIt(); // 위의 람다식을 실행하기!

	}

}
