package java0710;

interface Animal1{ //�θ�Ŭ����
	static int a=10;
	final int b=10;
	static void mee() {
		
	}
	public void sound(); //�߻� �޼���
}




class Dog1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}
class Cat1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("�Ŀ�");
	}
}

class Pigeon implements Animal1,bird{
	@Override
	public void sound() {
		System.out.println("����");
	}
	@Override
	public void fly() {
		System.out.println("Ǫ��� ��ѱ� ����");
	}
}




public class InterfaceTest2 {
	
	public static void main(String[]args) {
		Dog1 d= new Dog1();
		Cat1 c= new Cat1();
		Pigeon p=new Pigeon();
		
	}	

}

