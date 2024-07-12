package java0711;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Member> list=new ArrayList<>();
		
		list.add(new Member("�̼���",34,"19990405"));
		list.add(new Member("������",23,"20010306"));
		list.add(new Member("ȫ�浿",31,"19940518"));
		list.add(new Member("�念��",31,"19941102"));
		list.add(new Member("�����",25,"19990703"));
	
		System.out.println(list);
		
		for(Member m : list ) {
			if(m.getAge()>=30) {
			System.out.println(m);
			
		}
		}
		System.out.println("===1995�� ���Ŀ� �¾ �����?===");
		for(Member m :list) {
			String temp=m.getBirth().substring(0,4);//�ε���
			int year = Integer.parseInt(temp);
			if(year > 1995)
				System.out.println(m);
		}
		// 8��,9��,10��,11���� �¾ ��������
				System.out.println("===8��,9��,10��,11���� �¾ ���===");
				
				for( Member member : list) {
					String temp = member.getBirth().substring(4,6);
					int mon = Integer.parseInt(temp);
					if( mon >=8 && mon <= 11) {
						System.out.println( member );
					}
				}
				
				
				list.add( 2 , new Member("�念��", 34 , "") );
				System.out.println(  list );
				
				// ��������� ���� ����� ã�Ƽ� �׻���� ���̸� ���� �⵵���ְ�
				// 0��0�� �� ���� �ǰ� �϶�
				
				for( Member mem : list) {
					if( mem.getBirth().isBlank() ) {
						int year = 2024 - mem.getAge();
						mem.setBirth( year + "0000" );
					}
				}
				
				System.out.println( list );
				//�����ڰ� ������ Ŭ������ �÷��ǿ� ����ϴ� ���
				//�÷����� �޼��� ���� ������ ����Ϸ��� �ʿ��� �޼��带 Ŭ������ �����ؾ� �Ѵ�.
				//�ʿ��� �޼���� �ֻ��� �θ� Ŭ������ object�� �����Ѵ�
				//�߰��� �÷��ǿ� ���õ� �������̽��� implements �ϱ⵵ �ؾ��Ѵ�
				
				Member t = new Member("ȫ�浿",31,"19940518");
				
				System.out.println(list.indexOf( t )); // MemberŬ���� ��ü�� idexOf�� �־ ã��
				
				System.out.println(list.indexOf( t ));
				
				list.remove(t);
				System.out.println(list);
				
				list.forEach(m->System.out.println(m));
				
				Member[] mem = list.toArray(new Member[list.size()]);
				
				for(Member mm:mem) {
					System.out.println(mm);
				}
				
			// ����
				Collections.sort(list);
				System.out.println("====���� ��====");
				list.forEach(m->System.out.println(m));
				
			}
	}