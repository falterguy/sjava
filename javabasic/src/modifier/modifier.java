package modifier;

public class modifier {

	public static void main(String[] args) {
		
		Book book=new Book();
		book.setTitle("JAVA �Ӽ�");
		book.setAuthor("������");
		book.setPage(786);
		
		System.out.println(book.getTitle());
		
		Book book2 = new Book("JAVA,��,������","�̺���",564);
		
		System.out.println(book2);
		
	}

}


/*
	Ŭ����
		- ����,�޼���
		- �ν��Ͻ�,Ŭ����
		- �����ڸ޼���
		- �ν��Ͻ�����, Ŭ���� ���� �ʱ�ȭ
		- �����ε�
		- �������̵�
		- ���
		- ������
		- ������
		- �߻�ȭ
		- �������̽�
		- ����Ŭ����(�͸�Ŭ����, ����Ŭ����)
		- ������
		
	�÷��� - �ڷᱸ���� �˰���
	 - collection,List,Map,Set
	 - ArrayList, vector,LinkedList,
	 - Queue,stack,HashSet,TreeSet
	 - HashMap,treeMap ���

���׸�
�ֳ����̼�
��Ʈ��
������
Java �⺻ ���� ��
 -> JSP - ���尴ü, MVC����
 -> ������ũ���ӿ�ũ - ��������Ʈ
 -> MVC ���� -> ������ ���θ�
 -> ������Ʈ(��) - TEAM

*/