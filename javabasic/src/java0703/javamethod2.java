package java0703;

import java.util.Scanner;

public class javamethod2 {

	public static void main(String[] args) {
	
		
		// ���� �ΰ� �Է� �޾� ���� ����ϱ�
		Calc calc = new Calc();
//		calc.sum(40,10);
		
		//calc.sum();
	
		// �������� ������ ���Ͽ� ����ϼ���
		int kor= 89, eng=74, mat=43;
		calc.scoreTotal(kor,eng,mat);
		
		//�޼��� ȣ���Ͽ� '�ż��� dog����~' ��� ���
		calc.easy(); calc.view();
		
		//�޼��带 ȣ���Ͽ� �̸��� ���̸� ����ϼ���
		//�Ű� ���� ���� �޼���, Ű���� �Է�x
		
		calc.old();
		
		TestMethod testMethod=new TestMethod();
		
		//�޼��带 ȣ���Ͽ� �Ʒ��� �����͸� ����ϼ���
		String animal="��帮Ʈ����";
		String ������="2024-07-01";
		testMethod.dog(animal,������);
		
		//���� ��¥�� ���� �ϸ� ����ϼ���
		//���ڿ� �޼��� substring �Ǵ� split ���
		String examDate="2024-08-13";
		testMethod.day(examDate);
		
		//4����� ������հ��� ���Ͽ� ����ϼ���
		//��հ��� ����
		int ���=31, ����=23, ����=28, ���=37;
		testMethod.name(���,����,����,���);
	}
		

}

class TestMethod{
	void name(int ���, int ����, int ����, int ���) {
		int old=���+����+����+���;
		int total=old/4;
		System.out.println(total+""+"��");
		
	}
	
	
	
	void dog(String animal,String ������) {
	System.out.println(animal+""+������);
	}
	void day(String examDate) {
	System.out.println(examDate.substring(5,10));
	//string[] current=day.split("-")
	//System.out.println(current[1]+""+current[2]);
	}
}
// �ν��Ͻ� �޼���, �ν��Ͻ� ������ ��ü(�ν��Ͻ�)�� ���� ���
// Ŭ���� �޼���, Ŭ���� ������ Ŭ���� �̸����� ���

class Calc{
	void old() {
		String name="ȫ�浿"; 
		int old=30;
		System.out.println(name+""+old);
	}
	
	
	
	void view() {// ���� a,b�� �� ����ϴ� �޼���
		int a=10, b=20;
		System.out.println(a+""+b);	
	}
	
	
	
	void easy() {
		System.out.println("�޼��� dog����!");
	}
	
	
	void scoreTotal(int k,int e, int m) {
		int total=k+e+m;
		System.out.println("����:"+total);		
	}
	
	void sum(int num1, int num2) {
		int result=num1+num2;
		System.out.println("��: "+result);
	}
	
	
	
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ����:");
		int num1=scan.nextInt();
		System.out.print("�ι�° ����:");
		int num2=scan.nextInt();
		int result=num1+num2;
		System.out.println("�� : "+result);
	
	
	 }
}
