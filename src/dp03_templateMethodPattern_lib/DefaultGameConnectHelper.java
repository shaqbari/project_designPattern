package dp03_templateMethodPattern_lib;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{

	protected String doSecurity(String string) {
		//System.out.println("디코드");
		System.out.println("강화된 알고리즘을 이요한 디코드");
		
		//return string+"decoded";
		return string+"powerDecoded";
	}

	protected boolean authentication(String id, String pw) {
		System.out.println("아이디/암호 확인 과정");
		return true;
	}

	protected int authorization(String userName) {
		System.out.println("권한 확인");
		//서버에서 유저이름 유저의 나이를 알 수 있다
		//나이를 확인하고 시간을 확인하고 성인이 아니고 10시가 지났다면
		//권한이 없는걸로한다.
		
		return 0;
	}

	protected String connection(String info) {
		System.out.println("마지막 접속단계!");
		return info;
	}

}
