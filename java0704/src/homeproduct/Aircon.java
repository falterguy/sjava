package homeproduct;

public class Aircon extends House{
	
	static final String[] windText= {"��","��","��"};
	
	int wind=0;
	int temperature;
	
	
	Aircon(){}
		Aircon(String brand, int price){
			super(brand,price);
		}
		void tempUP() {
			this.temperature++;
		}
		void tempDOWN() {
			this.temperature--;
		}
		
		void windControl() {//�޼ҵ� �ڵ� ����ȵ� ������ ���� �ʰ� �����Ҷ� ����
			wind++;
			if(wind==windText.length) wind=0;
			System.out.println("���� �ٶ�����:"+windText[wind]);//[wind]��� ������ �ε��� ǥ��
		}

	
}