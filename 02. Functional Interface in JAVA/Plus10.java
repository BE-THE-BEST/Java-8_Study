package Functional_Interface_Java;

import java.util.function.Function;

public class Plus10 implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer integer) { // apply를 무조건 상속받아야함
		return integer + 10;
	}
	// 내가 직접 인터페이스를 만들지 않아도 함수형 인터페이스로서 사용할 수 있도록 자바에서 제공해주는 기능
}
