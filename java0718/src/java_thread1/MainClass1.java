package java_thread1;

public class MainClass1 {

	public static void main(String[] args) {
		
		//MyThread th= new MyThread(); //������ ��ü ����
		//th.start(); //������ ����
		
		for(int i=1; i<=10; i++) {
			System.out.println("���� Main"+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
//		Scanner sc= new Scanner(System.in);
//		System.out.print("�����Է�:");
//		int num = sc.nextInt();
//		System.out.println(num);


class MyThread extends Thread{//�żҵ� �̸� ����X ������ ����
	@Override
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("��~������ ~~��~"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		
	}
}
	}
}
}


/*
	���μ��� - cpu�� ���� �޸�(ram)�� �ε� �Ǿ��ִ� ���α׷��� ���Ѵ�.
			��, �������� ���α׷� ���� ���μ����̴�.
			102���� ���μ����� �ִٶ�� ���� 102���� ���α׷��� �������̴� ��� ����̴�.
			����ǻ�Ϳ� �������� ���μ��� Ȯ���ϴ� ���
			1. �ϴ��� �۾�ǥ���ٿ��� ������ ���콺 Ŭ��
			2. ����������Ʈâ�� ����(�����⿡�� cmd��� �˻� �Ǵ� ctrl+r�ϰ� cmd�Է� ����)
			   ������- tasklist ���ɾ�
			   ��,������-�͹̳ο�� ps - e
			   
			   ���μ��� ���� - taskkill / pid[pid��]
			   ��,������ - pkill -9  -f ���μ��� �̸�
			   		   - sudo kill ���μ�����ȣ
	������ -  ���μ����ȿ��� ���� ������ �����ϴ� ����
			�����带 �߰��ϸ� ���ÿ� ���� ���� ������ ������ �� �ִ�.
			
	�ڹ� ������
	������ ������
	Thread() : ���ο� ������ ��ü �Ҵ�
	Thread("�̸�") : ���ο� ������ ��ü�� �Ҵ� �ϸ鼭 �̸� �ο�
	

*/