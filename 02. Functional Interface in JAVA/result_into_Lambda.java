package Functional_Interface_Java;

import java.util.function.Function;

public class result_into_Lambda {

	public static void main(String[] args) {
		//함수형 인터페이스인 Function 인터페이스를 람다식으로 구현 
		Function<Integer, Integer> plus10 = (i) -> i + 10;

	}

}
