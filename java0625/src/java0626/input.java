package java0626;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		
		System.out.println("�ڹ����");
		//System.in - �Է�
		//�Է¹����� �ִ� ���� Ŭ���� - Scanner
		Scanner scan=new Scanner(System.in);
		
		//float Ÿ�� -nextFloat() double-nextDouble()
		//byte-nextByte() short-nextShort()
		//char �� ����.
		//���ڿ��Է�-nextLine() , next()
		
//		System.out.print("���� �Է�:");
//		int a= scan.nextInt();
//		System.out.println(a);
		
		//������ ���ְ� �Ծ�����
//		ö���� ������ �Ա����� �������� ����
//		��Զ��� ���,�ٳ��������� �Ծ���
//		ö���� ���ɰ����� ������ �ݾ��� ���ΰ�?
		
//		int ��Զ��,�ﰢ���,�ٳ�������; 	
//		System.out.print("��Զ�� ����:");
//		��Զ��=scan.nextInt();
//		System.out.print("�ﰢ���:");
//		�ﰢ���=scan.nextInt();
//		System.out.print("�ٳ�������");
//		�ٳ�������=scan.nextInt();
//		
//		int ���ұݾ�=��Զ��+�ﰢ���+�ٳ�������;
//		System.out.println("���ɰ�:"+���ұݾ�+"��");
//		System.out.printf("���ɰ�:%d��\n",���ұݾ�);
		
		// �μ��� ģ������ ���������� ���Դ�.
		// ���ͼ����� ������ ���� �ͼ� ���� ���ٿԴ�.
		// �̹����� �Ź��� ¦¦�̷� �ž �ٽ� ���� ���ٿԴ�.
		// �μ��� ���� 5���̴�. �μ��� 1�� �ö󰡴µ� 3.4�ʰ� �ɸ���
		// �μ��� ���� ���� ���Դ� �ϴµ� �ɸ� �� �ð��� ����?
//		
//		int f=5;
//		float sec=3.4f;
//		int t=4;
//		float o=(f-1)*sec*t;
//		System.out.print(o);
		
//		���α׷� �ڵ�� �⺻ ���������� ����ȴ�.
//		if,�Լ�(�޼���), �ݺ��� ,goto��

//		�������� ������ ����,�Ǽ�,����,boolean(��,����)
//		�������� Ÿ��
//		����-byte,short,int,long
//		����-char
//		�Ǽ�-float,double
//		������-boolean
		
/*		���� ������
		int num; ���� Ÿ�� ���� ����
		double dnum; �Ǽ� Ÿ�� ���� ����
		char ch;���� Ÿ�� ���� ����
		boolean bool; �� ���� ���� ����
		
		������ �ʱ�ȭ
		int num =10; ���� ����� �Բ� �����͸� ����
		
		��¹��
		System.out.println(��³���);
		System.out.print(��³���);
		System.out.printf(��³���);
		
		printf ���� �Բ� ����ϴ� ����������
			%d, %u - ����, %f - �Ǽ�, %c -���� , %s-���ڿ�
		
		int age=28;
		System.out.printf("%s ������ ���̰� %d���� �������� %c" ,
				"�ڵ���",28,'��');
		
		�Է¹��
		Scanner Ŭ���� ��ü �ʿ�
		Scanner ���� = new Scanner(System.in);
			*Scanner Ŭ������ ���οܺ�Ŭ�����̹Ƿ� import �ؾ��Ѵ�.
		
			����.nextInt(); intŸ�� ������ �Է�
			����.nextByte(); byteŸ�� ������ �Է�
			����.nextLong(); longŸ�� ������ �Է�
			����.nextFloat(); floatŸ�� �Ǽ��� �Է�
			����.nextDouble(); doubleŸ�� �Ǽ��� �Է�
			����.next();���ڿ� �Է�
			����.nextLine();���ڿ��Է�
			
	c���,�ڹ�,�����а���,������ ������ �Է��ϼ���
	�������� ������ ����� ���� ����ϼ���.
						
*/
	int c���,�ڹ�,�����а���;
	System.out.println("c�������:");
	c���=scan.nextInt();
	System.out.println("�ڹ�����:");
	�ڹ�=scan.nextInt();
	System.out.println("�����а�������:");
	�����а���=scan.nextInt();
	int total=c���+�ڹ�+�����а���;
	int average=total/3
	System.out.printf("����:%d�� ,���:%d�� \n",total,average);
	
	
	
		
		
		
	}

}
