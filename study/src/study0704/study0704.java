package study0704;

import java.util.Scanner;

public class study0704 {
	
	


	public static void main(String[] args) {
		
		
//		long aa=new;
//		String word=new String("i like banana");
//		String word2="i like banana"

	//���������� 12�� ������ �� �ִ� �迭 �����
	//[]�߰��ɶ����� �����迭 ���� ũ��
		
//		int[] arr= new int[12];
		
		//5�� �Ǽ� ������ �����Ҽ� �ִ� �迭 ����� 
//		float[] save= new float[5];
		
		//4���� �̸��� �����Ҽ� �մ� �迭
//		String[] name= new String[4];
		 
//		Member[] mem = new Member[120];
		
	
//		���� ������ 42�� ����
//		int[] num = new int[42];
	
//		10,20,30,40,50�� �迭�� ����
		//num.length �迭�� ũ��
//		
//		int[]num = new int[5];
//		num[0]=10;
//		num[1]=20;
//		num[2]=30;
//		num[3]=40;
//		num[4]=50;
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
//		int[]width = new int[]{10,20,30,44,55,11,22,33,66,77};
//		
//		for(int i=0; i<width.length; i++ ) {
//			System.out.println(width[i]);
//		}
//		
//		String[] we=new String[] {"�̼���","������","������","�庸��","�念��","�̻��","�̼���","���","��������"};
//		for(int i=0; i<we.length; i++) {
//			System.out.println(we[i]);
//		}
		
		//7�� ���� ������ �迭
//		int[] seven=new int[7];
//		Scanner sc=new Scanner(System.in);
//		for(int i=0; i<seven.length; i++) {
//			System.out.print("���� �Է�: ");
//			seven[i] = sc.nextInt();
			
	//6���� �����Ը� �Է��ϰ� ���
//		float[] wid= new float[6];
//		Scanner sc= new Scanner(System.in);
//		for(int i=0; i<wid.length; i++) {
//			System.out.print("�����Ը� �Է��Ͻÿ�:");
//			wid[i]=sc.nextFloat(); //next�ڿ� �ش� Ÿ��
//		}
		
		//�����԰� ����� �迭���� �����԰� 50�̻��� ����� ���
//		for(int i=0; i<wid.length; i++) {
//			if(wid[i]>=50) {
//				System.out.println(wid[i]); //���
//			}
//		}
		//number �迭�� �� ���
		//¦���� ����ϼ���
		int[] number = new int[] {
				55,44,33,88,99,54,14,28,91,4,6,9
		};
		for(int i=0; i<number.length; i++) {
			if(number[i]%2==0) {
				System.out.println(number[i]);
			}
			
			
		}
		
		
		
		
		
	
	}
}

class Member{
	int age;
}