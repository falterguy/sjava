package java_thread1;

public class Mainclass3 {

	public static void main(String[] args) {
		MeThread th1=new MeThread(2000,"��õ");
		MeThread th2=new MeThread(3000,"��õ");
		// ���������� ������ ����
		try {
			th1.join();
		}catch(Interupteger)
		
		
		
//		while(true) {
//			System.out.print("");
//			int num=MeThread.num;
//			if(MeThread.num==15) {
//				th1.stop();
//				th2.stop();
//				break;
//			}
//		}
	}

}
/* sleep (�и�������)- ������ �簣���� ����
 * Start()-������ ����,run �ż���ȣ��
 * join() - �ش� �����尡 ������ ���� ���� ������ ���
	run() - �����尡 �����ϴ� �޼���
	stop()- ������ �ߴ�(������X)
	interrupt()- ����� �ߴ�
	setriop(������) -�������� �켱����
	getPriority()- ������ ������ �켱������
	isAlive()- ���� �����尡 ��Ƴ��ٸ� true, ����Ǿ����� false
	
	suspend()-�����带 �Ͻ����� ��Ų��(����� �������� ����)
	resume() - �Ͻ������� �����带 ����(����� ��������X)
	
	yield()-�ٸ� �����忡�� ���� ���¸� �纸 �ϰ� ���
	notify()- ��� ���¿� �ִ� �����带 ���� ��� �� ��ȯ �����⿡ �ִ� ������� ���� ���·� ��ȯ�ȴ�.
			
*/