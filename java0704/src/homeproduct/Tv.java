package homeproduct;

public class Tv extends House {
	
	int channel; // ä��
	int vol; // �Ҹ�
	
	
	
	Tv(){ //������ �޼���
		super();
	}
	//�Ű����� �ִ� ������ �޼���
	Tv(String brand, int price){
		super(brand,price); //�θ�Ŭ���� �����ڸ޼��� ȣ��
	}
	
	void channel() {
		this.channel++;
	}
	void channelDown() {
		this.channel--;
	}
}
