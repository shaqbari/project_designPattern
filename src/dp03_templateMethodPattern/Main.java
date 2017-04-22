package dp03_templateMethodPattern;

import dp03_templateMethodPattern_lib.AbstGameConnectHelper;
import dp03_templateMethodPattern_lib.DefaultGameConnectHelper;

public class Main {

	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		String result=helper.requestConnection("아이디 암호등 접속정보");
		System.out.println(result);
		//helper. 다른 패키지에 있게 되어 로직(doSecurity 메소드등)이 숨겨지게 되었다.
		
	}
}
