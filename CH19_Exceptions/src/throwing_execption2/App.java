package throwing_execption2;

public class App {
	public static void main(String[] args) {
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(35);
		} catch (Exception e) {
			// 온도 예외 발생
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
