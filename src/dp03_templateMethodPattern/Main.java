package dp03_templateMethodPattern;

import dp03_templateMethodPattern_lib.AbstGameConnectHelper;
import dp03_templateMethodPattern_lib.DefaultGameConnectHelper;

public class Main {

	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		String result=helper.requestConnection("���̵� ��ȣ�� ��������");
		System.out.println(result);
		//helper. �ٸ� ��Ű���� �ְ� �Ǿ� ����(doSecurity �޼ҵ��)�� �������� �Ǿ���.
		
	}
}
