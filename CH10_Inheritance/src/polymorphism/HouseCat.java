package polymorphism;

public class HouseCat extends Cat {
	@Override //어노테이션 오버라이드
	public void vocal() { //오버라이딩 메소드 : 자식클래스에서 부모와 똑같은 메소드를 만듬
		System.out.println("미야우~");
	}
}
