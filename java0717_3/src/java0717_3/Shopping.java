package java0717_3;

public class Shopping {

	public static void main(String[] args) {
		Electronics elec=new Electronics("E12001", "�����",1702000, "�Ｚ");
		Clothing clt = new Clothing("C12032", "����",30000,"L");
		
		ShoppingCart shop= new ShoppngCart();
		shop.addCart(elec ,3); //��ǰ�� ����
		shop.addCart(clt,2);
		
		shop.showCart();
		
	}

}
