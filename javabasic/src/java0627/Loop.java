package java0627;

public class Loop {
		
	public static void main(String[] args) {
		//�ݺ��� -for,while,do-while
		// for
		//for(�ʱⰪ; ���ǽ�; ������){�ݺ�����}
		//���ǽ��� ������ �ɶ����� �߰�ȣ���� ������ ��� ����ȴ�.
		//�ʱⰪ->���ǽĺ�->���̶��->�߰�ȣ->������->���ǽĺ�->���̶��->�߰�ȣ->������->���ǽĺ�->�����̶��->��
	for(int i=1; i<=17; i+=2){
		System.out.println("�� �ݺ���......"+i);
		}
	for(int i=10; i>0; i--) {
		System.out.println(i);
	}
	
	int num=1;
	int a=1;
	num = num+a;
	System.out.println(num); //2
	a++;
	
	num=num+a;
	System.out.println(num); //4
	a++;
	
	num=num+a;
	System.out.println(num); //7
	a++;
	
	
	
	}
}
