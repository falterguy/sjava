package java0703;

public class javamethod3 {

	public static void main(String[] args) {
		
		//�޼��带 ���ؼ� ���� 10�� �޾� ����Ѵ�
		ReturnMth rm= new ReturnMth();
		
		int num=rm.get();
		System.out.println(num);
	
		//�޼���κ��� �������� ���ϱ� ��� �޾Ƽ� ����ϱ�
	       int ��� = rm.sum();
	       System.out.println(���);
	
	    //������ ����ǥ�� �� �ڵ带 �ۼ��Ͽ� �̸��� ���̰� ���
	    String userName =rm.getName();
	    int age=34;
	    System.out.println(userName+""+age);   	
	}

}

class ReturnMth{
	
	String getName(){
		String name="�̼���";
		return name;
		
		
	}
	
	int sum() {
		int num1 = 30, num2 = 45;
		int result = num1 +num2;
		return result;
	}
	
	int get() {
		return 10;
	}
	
}