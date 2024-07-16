package java0716_1;

public class SignUp implements PageAction {
	
	@Override
	public String action() {
		System.out.println("회원가입 데이터 베이스에 저장완료");
			return "회원가입 완료 페이지 이동";
		}
	}

	

