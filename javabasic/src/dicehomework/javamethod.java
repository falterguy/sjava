package dicehomework;

import java.util.Scanner;

public class javamethod {

	public static void main(String[] args) {
	
		MethodUtil util = new MethodUtil();
		// �ΰ��� ������ ��ȯ �ϱ�
		int[]num=util.twoNum();
		
		// �簢���� �ʺ�� ���̸� �����ϰ� ���̸� ����ϼ���.
		// ���̴� main�޼��忡�� ��µǰ� �ϼ���
		int area=util.triangle();
		System.out.println("����:"+area+""+"cm");
		
		// �α��� ������ ���̵�� skyblue, ��й�ȣ�� 1234sea
		// login �޼��带 �����Ͽ� �α��� ���θ� ����ϼ���.
		// ���̵� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ���
		// �ϳ��� ����ġ�� �α��� ���� ���
		// �α��� ���� ����� main���� 
//		boolean isFail=util.login();
//		if(isFail) {
//			System.out.println("�α��� ����");
//		}else {
//			System.out.println("�α��� ����");
//		}
	
		// ���� ������ Ű���带 ���� �Է� ��������
		// �Է��� �� ������ ���� 100�� ������ 
		// 100 - ���� ����� ����ϰ�
		// 100�� ���� ������ �������� ���� ����ϼ���
		// main�޼��忡�� ���
		
int result =util.inputInt();
System.out.println(result);
	
	}


		
	}


class MethodUtil{
	
	boolean login(){
		Scanner sc=new Scanner(System.in);
		System.out.print("���̵�:");
		String id=sc.nextLine();
		System.out.print("��й�ȣ:");
		String password=sc.nextLine();
		boolean isSuccess=true;
		if(id.equals("skyblue")) {
			if(password.equals("1234sea"))
				return isSuccess;
		}
		return isSuccess=false;	
	}
	 int inputInt() {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("�� ���� �Է�:");
		 int num1=sc.nextInt();
		 int num2=sc.nextInt();
		 int num3=sc.nextInt();
		 
		 int hun=num1+num2+num3;
		 
		 if( hun>100){
			 return 100-hun;
		 }else{
			 return hun;
		 }
	 }	 
		
			 
	
	
	
	int[] twoNum() {
		int num1=20,num2=50;
		//int[] temp= new int[] {num1,num2};
		return new int[] {num1,num2};
		//return ���� ��ȯ ��ų�� �ִ� ���� ���� ���̴�.
	}
	int triangle() {
		int wid=20, hig=10; 
		int area= wid*hig;
		return area;
	}
	
	
}