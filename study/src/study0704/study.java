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
	
	for(int i=0; i<arr.size(); i++) {
		System.out.println(arr.get(i));
	}
	
	for(String name:arr) {
		System.out.println(name);
	}
	
	
	//ArrayList�� ����ϱ�-������ �����迭�� String[]���
	//�̸� 10�� ����(�ƹ��ų� �Է�)
	//�̸� �߿��� �达�� ��� 
	
	
		
	}

}
