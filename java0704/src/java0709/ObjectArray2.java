package java0709;

public class ObjectArray2 {

	public static void main(String[] args) {
	
		String a=null;
		
		Game[] gm=new Game[7];
		
		gm[0]=new Game("��","PC","RTS");
		gm[1]=new Game("��Ÿũ����Ʈ","PC","SF");
		gm[2]=new Game("FC�¶���","PC,XBOX","Sports");
		gm[3]=new Game("�ٶ��ǳ���","PC,�����","RPG");
		gm[4]=new Game("��ũ����Ʈ","PC","SF");
		gm[5]=new Game("�������","PC","���̽�");
		gm[6]=new Game("�������","PC","FPS");
		
		for(int i=0; i<gm.length; i++) {
			System.out.println(gm[i]);
		}
		for(Game game:gm) {
			System.out.println(game);
		}
		
		
	}

}

// 7���� ���������� ���� ��ü�� �����ϰ� ����ϼ���
