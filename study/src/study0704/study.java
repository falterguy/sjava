package study0704;

import java.util.ArrayList;

public class study {

	public static void main(String[] args) {
	//�ڹ��� �ڷᱸ��
	//�ڷᱸ���� �����͸� ȿ�������� ���� �����ϱ� ���� ����
	
	ArrayList<String> arr = new ArrayList<String>();				//Ŭ���� �빮�� ����, �ε��� ����X
	arr.add("�̼���");
	arr.add("�庸��");
	arr.add("������");
	
	System.out.println(arr);	//�׽�Ʈ�� Ȯ�ο� ���� ���X
	
//	for(int i=0; i<arr.size(); i++) {
//		System.out.println(arr.get(i));
//	}
//	
//	for(String name:arr) {
//		System.out.println(name);
//	}
	
	
	//ArrayList�� ����ϱ�-������ �����迭�� String[]���
	//�̸� 10�� ����(�ƹ��ų� �Է�)
	//�̸� �߿��� �达�� ��� 
	
	ArrayList<String>name=new ArrayList<String>();
	name.add("������");
	name.add("��μ�");
	name.add("ȫ�浿");
	name.add("��浿");
	name.add("������");
	name.add("������");
	name.add("�縸��");
	name.add("������");
	name.add("���ȯ");
	name.add("�Ž°�");
	
	for(int i=0; i<name.length; i++) {
		if(name[i]"��"==0)
	}
	System.out.print(name.get(i));
		
	

}
