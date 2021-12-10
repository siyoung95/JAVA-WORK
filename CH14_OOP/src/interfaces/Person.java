package interfaces;
// 인터페이스를 구현(상속)할때 implements 사용 , 상속한 클래스에서 추상메소드 완성(구현)
public class Person implements Describable {
	@Override
	public String getDescription() {
		return "사람입니다.";
	}

}
