package java0626;

import java.util.Scanner;

public class iput2 {

	public static void main(String[] args) {
	
/*�ڵ� �ۼ��ϱ��� �ؾ����� - ���� �ľ�-�䱸���׵���
 *  ���ڿ�-""ū����ǥ�� ǥ���Ͽ� �ۼ��Ѵ�.
 * ���ڿ��� String Ŭ����Ÿ���� ����ؾ��Ѵ�.
 
  ����2
  ���� �̸�, �ҼӺμ���, �� �޿����� Ű���带 ���� �Է¹޴´�.
  ������ 8%�� ����. �Ǽ��ɾ��� ������ ���
  �̸�,�μ�,�Ǽ��ɾ��� ����ϼ��� 
  �θ��� ������ ���� ����ϼ���					*/
		
	Scanner sc=new Scanner(System.in);
		
		String name, dept;
	int money;
	
	
	System.out.printf("�̸�:");
	 name=sc.nextLine();
	System.out.printf("�μ���:");
	 dept=sc.nextLine();
	System.out.println("���޿���:");
	 money=sc.nextInt();
	
	float tax=0.08f;
	
	int �Ǽ��ɾ�=(int)(money-(money*tax));
	System.out.println("�̸�:"+name+"�μ�:"+dept+"���ɾ�:"+�Ǽ��ɾ�);
		
		

	}

}
