package Lambda;


@FunctionalInterface // 어노테이션 필수!
public interface RunSomething {

	// 추상 메소드가 하나만 있다면?=함수형 인터페이스
	void doIt(); // 키워드 abstract 생략

	// 추상 메소드가 두 개 있다면 함수형 인터페이스가 아니다!

	// 다른 형태의 메소드가 있어도 상관 없다! 무조건 '추상 메소드' 개수만 센다.
	static void printName() {
		System.out.println("지영");
	}

	default void printAge() {
		System.out.println("27");
	}
}
