package study0704;

import java.util.Scanner;

public class study0704 {
	
	


	public static void main(String[] args) {
		
		
//		long aa=new;
//		String word=new String("i like banana");
//		String word2="i like banana"

	//정수데이터 12개 저장할 수 있는 배열 만들기
	//[]추가될때마다 차원배열 뒤쪽 크기
		
//		int[] arr= new int[12];
		
		//5개 실수 데이터 저장할수 있는 배열 만들기 
//		float[] save= new float[5];
		
		//4명의 이름을 저장할수 잇는 배열
//		String[] name= new String[4];
		 
//		Member[] mem = new Member[120];
		
	
//		정수 데이터 42개 저장
//		int[] num = new int[42];
	
//		10,20,30,40,50을 배열에 저장
		//num.length 배열의 크기
//		
//		int[]num = new int[5];
//		num[0]=10;
//		num[1]=20;
//		num[2]=30;
//		num[3]=40;
//		num[4]=50;
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
//		int[]width = new int[]{10,20,30,44,55,11,22,33,66,77};
//		
//		for(int i=0; i<width.length; i++ ) {
//			System.out.println(width[i]);
//		}
//		
//		String[] we=new String[] {"이순신","김유신","김춘추","장보고","장영실","이사부","이성계","계백","을지문덕"};
//		for(int i=0; i<we.length; i++) {
//			System.out.println(we[i]);
//		}
		
		//7개 정수 저장할 배열
//		int[] seven=new int[7];
//		Scanner sc=new Scanner(System.in);
//		for(int i=0; i<seven.length; i++) {
//			System.out.print("정수 입력: ");
//			seven[i] = sc.nextInt();
			
	//6명의 몸무게를 입력하고 출력
//		float[] wid= new float[6];
//		Scanner sc= new Scanner(System.in);
//		for(int i=0; i<wid.length; i++) {
//			System.out.print("몸무게를 입력하시오:");
//			wid[i]=sc.nextFloat(); //next뒤에 해당 타입
//		}
		
		//몸무게가 저장된 배열에서 몸무게가 50이상인 사람만 출력
//		for(int i=0; i<wid.length; i++) {
//			if(wid[i]>=50) {
//				System.out.println(wid[i]); //출력
//			}
//		}
		//number 배열의 값 출력
		//짝수만 출력하세요
		int[] number = new int[] {
				55,44,33,88,99,54,14,28,91,4,6,9
		};
		for(int i=0; i<number.length; i++) {
			if(number[i]%2==0) {
				System.out.println(number[i]);
			}
			
			
		}
		
		
		
		
		
	
	}
}

class Member{
	int age;
}