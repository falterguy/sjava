package java0710;

interface Animal1{ //ºÎ¸ðÅ¬·¡½º
	static int a=10;
	final int b=10;
	static void mee() {
		
	}
	public void sound(); //Ãß»ó ¸Þ¼­µå
}




class Dog1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("¸Û¸Û");
	}
}
class Cat1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("³Ä¿Ë");
	}
}

class Pigeon implements Animal1,bird{
	@Override
	public void sound() {
		System.out.println("±¸±¸");
	}
	@Override
	public void fly() {
		System.out.println("Çªµåµæ ºñµÑ±â ³¯´Ù");
	}
}




public class InterfaceTest2 {
	
	public static void main(String[]args) {
		Dog1 d= new Dog1();
		Cat1 c= new Cat1();
		Pigeon p=new Pigeon();
		
	}	

}

