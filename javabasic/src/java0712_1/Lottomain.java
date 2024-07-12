package java0712_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lottomain {

	public static void main(String[] args) {
		int[]�ϵ�=new int[] {8,12,23,29,35,41};
		
		ArrayList<Lotto> list=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		
		System.out.print("�ڵ� ����? :");
		int howMany= scan.nextInt();
		
		for(int i=1; i<=howMany; i++) {
			int[] temp=new int[6];
			for(int k=0; k<temp.length; k++) { //6�� ���� �ߺ�����
				temp[k]=(int)(Math.random()*45)+1;
				for(int j=0; j<k; j++) {
					if(temp[k]==temp[j]) {
						k--; break;
					}
				}
			}
			list.add(new Lotto(temp));
		}
		list.forEach(lt-> System.out.println(lt));
		
		//���� ������ �ζǹ�ȣ�� �߿� 3��� 4���� ��ΰ�?
		//3���� 5���� ���ڰ� ��ġ, 4���� 4���� ���ڰ� ��ġ
		
		int ���=0 , ���=0;
		for( Lotto lotto :list) {
			int[]temp=lotto.getNum();
			for(int i:temp) {
				int cnt=0;
				for(int k:�ϵ�) {
					if(i==k)
						cnt++;
				}
			}
			if(cnt==6) System.out.println("1��");
			if(cnt==5) ���++;
			if(cnt==4) ���++;
		}
		System.out.println("3��"+���+"��");
		System.out.println("4��"+���+"��");
						
				}
				
			}
		
		
		
		
		
	


