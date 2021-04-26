package Lambda;

public class FooToLambdaInt {

	public static void main(String[] args) {

		RunSomethingInt runSomething = (number) -> { //매개변수를 괄호 안에 넣고 
			return number + 10;//return 선언 
		};

		System.out.println(runSomething.doIt(1));

	}

}
