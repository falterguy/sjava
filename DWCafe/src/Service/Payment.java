package Service;

import java.util.Scanner;

import DTO.Coffee;
import DTO.Tea;

public class Payment implements kiosk {

	private Coffee orderCoffee;
	private Tea orderTea;
	
	public Payment(Coffee orderDrink) {
		this.orderCoffee=orderCoffee;
	}
	public Payment(Object drink) {
		if(drink instanceof Coffee)
		this.orderCoffee = (Coffee)drink;
		if(drink instanceof Tea)
			this.orderTea =(Tea)drink; 
	}
	
	@Override
	public void action() {
		System.out.println("���� �����մϴ�.");
		int pricr=orderCoffee!=null ? orderCoffee.getPrice():orderTea.get();
		System.out.println("�����ݾ�:"+price);
	}
}
}
