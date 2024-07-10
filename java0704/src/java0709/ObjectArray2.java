package java0709;

public class ObjectArray2 {

	public static void main(String[] args) {
	
		String a=null;
		
		Game[] gm=new Game[7];
		
		gm[0]=new Game("롤","PC","RTS");
		gm[1]=new Game("스타크레프트","PC","SF");
		gm[2]=new Game("FC온라인","PC,XBOX","Sports");
		gm[3]=new Game("바람의나라","PC,모바일","RPG");
		gm[4]=new Game("워크레프트","PC","SF");
		gm[5]=new Game("테일즈런너","PC","레이싱");
		gm[6]=new Game("서든어택","PC","FPS");
		
		for(int i=0; i<gm.length; i++) {
			System.out.println(gm[i]);
		}
		for(Game game:gm) {
			System.out.println(game);
		}
		
		
	}

}

// 7개의 게임정보를 가진 객체를 생성하고 출력하세요
