package example;

import java.util.ArrayList;

public class TotalChickenPrice {

	public static void main(String[] args) {
		
		//Arraylist ����
		
		ArrayList<Chicken> order = new ArrayList<Chicken>();
		
		//1.�ֹ��� ġŲ�� ArrayList�� �߰��ϼ���
		
		order.add(new Chicken("�Ķ��̵� ġŲ", 9900));
		order.add(new Chicken("�ν�Ʈ ġŲ", 9900));
		order.add(new Chicken("��� ġŲ", 10900));
		order.add(new Chicken("���� ġŲ", 10900));
		order.add(new Chicken("�Ĵ� ġŲ", 12900));
		order.add(new Chicken("���� ġŲ", 13900));
		
		//2.ArrayList�� ��ȸ�Ͽ� ������ ���ϼ���

		int sum = 0; // ������ ������ ���� ����
		
		// ��� ���
		
		System.out.printf("����: %d\n", sum);
		
	}

}

class Chicken {
	private String name;
	private int price;
	
	public Chicken(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}
