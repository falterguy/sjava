package java0710;

abstract class animal{ //�θ�Ŭ����
	
	
	public abstract void sound(); //�߻�޼���
}
interface bird{
	public void fly();
}
class dog extends animal{
	@Override
	public void sound() {
		 System.out.println("�۸�");
	}
}
class cat extends animal{
	@Override
	public void sound() {
		System.out.println("�Ŀ�");
	}
}
class Pigeon extends animal{
	@Override
	public void sound() {
		System.out.println("����");
	}

}
public class InterfaceTest {

	public static void main(String[] args) {
		animal d= new dog();
		animal c= new cat();
		animal p= new Pigeon();
		d.sound();
		c.sound();	
		p.sound();
	}

}

/*
	�������� �Ҹ��� ����Ѵ�
	��,�����,��,��ѱ�,�� ���
	�� ������ ���� �ٸ� ��ü�̱� ������ ������ Ŭ������ ����
	������ ��, �����, �ߵ��� ������ ������ �����ϹǷ�
	animal�̶�� �θ� Ŭ������ �ΰڴ�
	
	Ŭ���� ���
	1. ���� ���- �ϳ��� Ŭ������ ��� �����ϴ�.
	
	
	
	
*/