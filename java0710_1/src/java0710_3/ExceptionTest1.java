package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		try {
		String name=null;
		String a="aaa" ;
		String a="bbb";
		name.length();
		System.out.println(10/3);
		}catch(NullPointerException n) {
			n.printStackTrace();//
			System.out.println(n.getClass());
			System.out.println("���ڿ� �Է��ض�!")
		
		}catch(Exception e) {
		
		System.out.println("0���� ������ �Ѹ� �ȵ�");
		
		}
		System.out.println("���Ⱑ ���α׷� ��");
	}

}

/*
 	����ó��
 	 - ���α׷� �����߿� �߻��ϴ� ���� �߻��ϸ� ��� ���α׷� ����ȴ�.
 	   ����ó���� ���ָ� ������ �߻��ص� ���α׷��� ������� �ʴ´�.
 	 - ����ڰ� �߸��� ���� �Է��ϴ� ��쿡 �˷��� �� �ִ�.
 	 - ������ ������ �ذ��ϴ� ����� �ƴϰ�, ȸ���ϴ� ����̴�.
 	
*/
