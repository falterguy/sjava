package Service;

import java.util.Scanner;

import DTO.Coffee;
import DTO.Tea;

public class Order implements kiosk {

	private Coffee orderCoffee;
	private Tea orderTea;
	
	public Order(Coffee orderDrink) {
		this.orderCoffee=orderCoffee;
	}
	public Order(Tea orderTea) {
		this.orderTea = orderTea;
	}
	
	@Override
	public void action() {
		
		//�ֹ� Ȯ�� �� ���� ���� �ϱ�
		
		System.out.println("�ֹ� �޴� Ȯ��");
		System.out.println(orderCoffee!=null ? orderCoffee:orderTea);
		System.out.println("===����===");
		Scanner sc=new Scanner(System.in);
		System.out.print("1.���� 2.�ݱ�:");
		if(sc.nextInt()==2) return;
		kiosk payment = new Payment(orderCoffee!=null? orderCoffee:orderTea);
		payment.action();
		
	}
}
