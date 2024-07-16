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
		System.out.println("결제 진행합니다.");
		int pricr=orderCoffee!=null ? orderCoffee.getPrice():orderTea.get();
		System.out.println("결제금액:"+price);
	}
}
}
