package classBasic;

public class ClassBasic {

	public static void main(String[] args) {
		// Scanner String Arrays
		// ���� �� Ŭ���� Ÿ���� ������ �����Ѵ�.
		// ������ ������ �����͸� �����Ѵ�.
		// Ŭ���� Ÿ������ ������ ������ ��ü �Ǵ� �ν��Ͻ���� �Ѵ�.
		
		// Ŭ���� �ν��Ͻ� ���� - ������ �޼���
		Member member1 = new Member();
		Member member2 = new Member();
		
		System.out.println(member1);
		
		member1.name="�̼���";
		member1.age=23;
		
		System.out.println(member1.name);
		System.out.println(member1.age);
		
		member2.name="������";
		member2.age=34;
		
		//java- 495p , �޸� �����ϱ�� -893p
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";
		book1.page=495;
		
		book2.title = "�޸�����ȭ���";
		book2.page=495;
		
		// ����Ʈ�� ��ǰ��, �ü��,�޸�(ram)ũ�⿡ ���� ������ �� �ִ� Ŭ������ �����ϰ�
		// �ν��Ͻ��� �����Ͽ� �� ����,����� �ϼ���
		// �� ����, ����� �ϼ���
		
		Phone phone1=new Phone();
		Phone phone2=new Phone();
		Phone phone3=new Phone();
		
		phone1.name="������1";
		phone1.system="�ȵ���̵�";
		phone1.ram=128;
		
		phone2.name="������";
		phone2.system="ios";
		phone2.ram=256;
		
		phone3.name="������2";
		phone3.system="�ȵ���̵�2";
		phone3.ram=512;
	
		System.out.print(phone1);
		System.out.print(phone2);
		System.out.print(phone3);
	}

}
class Phone{
	String name;
	String system;
	int ram;
	
}
	
	







//å ����� ������������ �����ϱ����� Ŭ���� ����
class Book{
	String title;
	int page;
	
}



// Ŭ���� - ���赵, ��ü-��ǰ
// Ŭ���� - ��Ʋ, ��ü-�ؾ

// Ŭ������ ����� ���� ������ Ÿ�� �̶�� �Ѵ�.
class Member{ //Member ��� �̸��� Ŭ���� ����
	String name; //�̸�
	int age; //����
	Member(){
		
	}
	
}








