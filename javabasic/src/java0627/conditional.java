package java0627;

import java.util.Scanner;

public class conditional {

	public static void main(String[] args) {
	
//		���ǹ� - if, switch
//		�ݺ��� - for, while, do-while

//		if���� ���ǽ� - �񱳿����ڿ� �������ڷ� ���� �����.
//		��, ���� ������ ���ü� �ִ� ��
//		Ű��150 �̻��̴�. 		Ű>=150
//		10�� ���� ���� ����		��ü���⳯¥ �� == 10
//		32000�� �̻��� ���� ����  ����ݾ�>=32000
//		�Ǹ����� ��ǰ�鸸 ��� ��ǰ���� == �Ǹ� , ������ > 0

		int tall = 135;
		if(tall>=150) {
			// Ű�� 150�̻��� �´ٸ� ������ �Ұ�����
		}else {
		//	Ű�� 150�̻��� �ƴ϶�� ������ �Ұ�����
		
		}
	
	
		
// ���� �հ� ����- �հ�(60�� �̻�), ���հ�(60�� �̸�)
//		int score=72;
//		if(score>=60) {System.out.println("�հ�");
//		} else {
//			System.out.println("���հ�");
//		}
		
		
		// if~else - ���ǽ��� ��,������ ���� ����Ǵ� ������ �ٸ����
		// �ϳ��� ���ǿ� �ΰ��� ������ �ִ°�쿡 if~else ������ �ۼ�

		//���� ���� ��� - A(90���̻�),B(80���̻�),C(70���̻�),D(������)
		int score=89;
		if(score>=90) {System.out.println("A");

		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}

//		switch - ���� ������ case�� �����Ͽ�
//			case�� ��ġ�ϴ� ���� ��� �ߵ� �Ǵ� ���ǹ�
//		������ ������ �����. ����Ű�� w,a,s,d�̰�
//		pŰ�� �Ͻ�����, oŰ�� ����ϱ� , i�� ó������ �ٽý���
//		ctrl+s�� ���ӽ��� �̶�� �Ѵٸ�
		/*
		 switch(Ű���尪){
		 case 'a': ���೻��
		 case 'w':���೻��
		 case 's':���೻��
		 case 'd':���೻��
		 case 'p':���೻��
		 case 'o':���೻��
		 case 'i':���೻��
		 case 'ctrl':
		 	switch(Ű2){
		 	case's':
		 	
		 	}
		 	
		 ���α׷��� �޴� ����
		 switch(menu){
		 	case "open":
		 	case "save":
		 	case "build":
		 	case "git":
		 	case "exit":
		 }
		 	
		���ǽ��� == �����ڰ� ���ȴٸ� switch���� �ۼ��ϴ°��� ��� �غ���
		
		*/
		
//		���۹�ư�� Ŭ���ϸ� ������ �����ϰ�
//		�����ư�� Ŭ���ϸ� ������ �����ϰ�
//		�����ư�� Ŭ���ϸ� ������ �����ض�
		
		String button="����";
		
		switch(button) {
		case "����":
			System.out.println("���� ����");
			break;
		case "�ڵ�����":
		case "����":
			System.out.println("���� ����");
		case "����":
			System.out.println("���� ����");
		}
		
//		���ο� ������ ���̸� Ű����� �Է��ϼ��� (����X)
//		���� �Ǵ� ������ ���̰� ũ�ٸ� �����簢��
//		���ο� ������ ���̰� ���ٸ� ���簢���̶�� ����ϼ���
//		switch������ (if�� X)
		
		 Scanner sc=new Scanner(System.in);
		 
		 int width=0, height=0;
		 
		 System.out.print("���α���:");
		 width=sc.nextInt();
		 System.out.print("���α���:");
		 height=sc.nextInt();
		 
		 int res = width-height; //20-5 ->15
		 // 5-8 ->-3
		 //% -> 15% -> 
		 switch(res) {
		 case 0:
			 System.out.println("���簢��");
			 break;
		 default:
			 System.out.println("�����簢��");
		 }
		 
		//switch���� default�� ������ �ѹ��� ���
		//switch�� ���� ���� case�� ��ġ�ϴ°� ���ٸ� default ����ȴ�
		//�־��� case�� ��ġ�ϴ°� �ϳ��� ������ default�� ���� �ϰ� ����
		 
		
		
		
		
		
	}
}



