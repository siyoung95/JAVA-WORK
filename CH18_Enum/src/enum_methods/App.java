package enum_methods;

public class App {
	public static void main(String[] args) {
		// values()
		Fruit[] fruits = Fruit.values(); // 이넘.values() => 배열로 리턴

		for (Fruit fruit : fruits) {
			System.out.println(fruit);
		}
		
		for (Fruit fruit : Fruit.values()) {
			System.out.println(fruit);
		}
		//ordinal() : 순서(인덱스번호)를 리턴
		System.out.println(Fruit.BANANA.ordinal()); // ordinal() => enum 상수의 순서(위치)
		
		//valueOf("문자열")
		Fruit f1 = Fruit.valueOf("ORANGE"); // (문자열)과 같은 enum 상수를 찾음
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);
		
		
	}

}
