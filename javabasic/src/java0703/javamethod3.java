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
	    
	    // ����(89), ����(78) ,����(50) �������� ������ ���ϴ� �޼���
	    // 3������ ����� ���ϴ� �޼���
	    // ������ ���
	  int tot=rm.total();
	 int avg=rm.avg(tot);
	 System.out.println(tot+""+avg);
	    
	   
	    
	        
	}

}

/* �ֻ��� ����
  2���� �ֻ��� ������ �Ѵ� �ֻ����� �ϳ� 6���̰� �ֻ��� ���� ū����� �̱�� �ֻ����� ���ϴ� �޼��� �� ���Ͽ� ���� �̰���� ���
 */

class ReturnMth{
	
	int avg( int tot ) {
		return tot/3;
	}
	
	int total() {
		int kor=89, eng=78 , mat=50;
		return (kor+eng+mat);
	}
	
	
	String  getName(){
		String name = "�̼���";
		return name;
	}
	
	
	int sum() {
		int num1 = 30, num2 = 45;
		int result = num1 + num2;
		return result;
	}
	
	int get() {
		return 10;
	}
	
}