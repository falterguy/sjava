package java0716_1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudy2 {

	public static void main(String[] args) {
		
		HashMap<String ,ImageBoard> board = new HashMap<>();
		
		ImageBoard temp = new ImageBoard("자바설치","javava","설치.jpg");
		board.put(temp.getTitle() , temp);
		temp = new ImageBoard("mysql설치","설치인생" ,"mysql설치.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("천장결과","운수없는날" ,"백만원의결과.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("최저임금...","편의점사장" ,"나혼자편의점.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("jsp언제 하지","설치인생" ,"mysql설치2.png");
		board.put(temp.getTitle(), temp);
		
		System.out.println(board.get("자바설치"));
		
		Scanner scan=new Scanner(System.in);
		// 이미지 게시판의 글제목을 입력하고
		// 보고싶은 글의 제목을 입력하면 해당 글의 내용을 볼수 있다.
		
		Set<String> titles=board.keySet();
		System.out.println("==이미지 게시판 목록==");
		titles.forEach( title -> System.out.println(title));
		
		System.out.print("글 제목 입력:");
		String inputTitle = scan.nextLine();
		
		System.out.println(board.get(inputTitle));
	}

}
