package dicehomework;

import java.util.Scanner;

public class avaMethod {

	public static void main(String[] args) {
		
		// ��ǻ�Ϳ� ���������� �ϱ�
		// ��ǻ���� ���������� ���� comInput �޼��带 ����Ѵ�.
		// ������ ������������ �ѱ۷� �Է��Ѵ�.
		// ��,��,��, �� ���� ����Ѵ�.
		// �޼��� - ���� ���������� �Է��ϰ� �����ϴ� �޼���
		// 		- ��ǻ�Ϳ� ���Ͽ� ��� ����ϴ� �޼���
		// Game Ŭ������ �ʿ��� ������ �޼��� �ۼ�
		// main �޼��� ������ Game Ŭ������ ��ü�� �޼���鸸 ����
		Game game=new Game();
		game.comInput();
		game.userInput();
		game.result();
	}

}

class Game{//rock-paper-scissors ����
	String user;
	String com;
	void result() {
		if(user.equals(com)) {
			System.out.println("���");
		}else if((user.equals("����")&&com.equals("��"))||(user.equals("����")&&com.equals("����")||(user.equals("��")&&com.equals("����"))))
				{
			System.out.println("������, ��ǻ�� ��");
		}else {System.out.println("���� ��, ��ǻ�� ��");
	}
	}
	void userInput() {
		Scanner scan=new Scanner(System.in);
		System.out.print("����������:");
		this.user=scan.nextLine();
	}
	
	
	
	void comInput() {
		int temp =(int)(Math.random()*3);
		switch(temp) {
		case 0: this.com="����";break;
		case 1:this.com="����";break;
		case 2:this.com="��";break;
		}
		
	
		}
	
		
	
}	
