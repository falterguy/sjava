package homeproduct;

public class mainclass {

	public static void main(String[] args) {
		
//		String a;
//		a.toString()
//		Interger b;
//		b.toString();
//		Date aa;
//		aa.toString();
		
		Tv tv=new Tv();
		tv.brand="�Ｚ";
		tv.power();
		tv.power();
		
		Aircon air =new Aircon();
		air.brand="LG�ּ�";
		System.out.println(air.brand);
		air.power();
		air.power();
		
	}

}

// Ŭ���� ���
// ��� �Ϸ��� �ڽ�Ŭ���� �̸� �ڿ� extends �θ�Ŭ�����̸�
// extens - Ȯ��,����...
// Tv extends House -> TvŬ������ �ڽ��̰� House�� �θ�Ŭ�����̴�.
// ����� �ϴ� ���� ū ����- ������
// �θ�Ŭ������ �ν��Ͻ� ����, �ν��Ͻ��޼���, Ŭ��������, 
// Ŭ�����޼��� ��밡���ϴ�.
// ��, �θ�Ŭ������ ���� ��������� ���Ѵ�. �Ϻ�
// ����ɷ��ִ� ������ �޼���� ��� �Ұ�