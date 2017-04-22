package dp03_templateMethodPattern_lib;

public abstract class AbstGameConnectHelper {
	//라이브러리로 배포되었다고 가정
	//알고리즘의 단계이기 때문에 노출이 되면 안된다.
	//하지만 하위클래스가 재정의를 해야하기 때문에 protected로 선언해야 한다.
	//자식클래스는 다른 패키지에서도 호출가능! 인스턴스는 아님!
	
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String pw);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	//템플릿 메소드
	public String requestConnection(String encodedInfo){
		
		//보안작업 ->암호화 된 문자열을 복호화
		String decodedInfo=doSecurity(encodedInfo);
		String id="aaa";
		String pw="bbb";
		
		//반환된 것을 가지고 아이디, 암호를 할당한다.
		if (!authentication(id, pw)) {
			throw new Error("아이디 암호 불일치");
		}
		
		String userName="userName";
		int i=authorization(userName);
		
		switch(i){
		//추가 구현
		case -1:
			throw new Error("셧다운");
		case 0://게임메니저
			System.out.println("게임메니저");
			break;
		case 1://유료회원
			break;
		case 2://무료회원
			break;
		case 3://권한없음
			break;
		case 4://기타상황
			break;
		}		
		
		return connection(decodedInfo);
	};
}
