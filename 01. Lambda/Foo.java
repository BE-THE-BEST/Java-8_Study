package Lambda;

public class Foo {

	public static void main(String[] args) {

		int baseNumber = 10;// 정해진 숫자만 더하게 하고 싶을 때에는?

		RunSomethingInt runSomething = (number) -> number + baseNumber;

	}

}
