package dp03_templateMethodPattern_lib;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{

	protected String doSecurity(String string) {
		//System.out.println("���ڵ�");
		System.out.println("��ȭ�� �˰����� �̿��� ���ڵ�");
		
		//return string+"decoded";
		return string+"powerDecoded";
	}

	protected boolean authentication(String id, String pw) {
		System.out.println("���̵�/��ȣ Ȯ�� ����");
		return true;
	}

	protected int authorization(String userName) {
		System.out.println("���� Ȯ��");
		//�������� �����̸� ������ ���̸� �� �� �ִ�
		//���̸� Ȯ���ϰ� �ð��� Ȯ���ϰ� ������ �ƴϰ� 10�ð� �����ٸ�
		//������ ���°ɷ��Ѵ�.
		
		return 0;
	}

	protected String connection(String info) {
		System.out.println("������ ���Ӵܰ�!");
		return info;
	}

}
