package dp03_templateMethodPattern_lib;

public abstract class AbstGameConnectHelper {
	//���̺귯���� �����Ǿ��ٰ� ����
	//�˰����� �ܰ��̱� ������ ������ �Ǹ� �ȵȴ�.
	//������ ����Ŭ������ �����Ǹ� �ؾ��ϱ� ������ protected�� �����ؾ� �Ѵ�.
	//�ڽ�Ŭ������ �ٸ� ��Ű�������� ȣ�Ⱑ��! �ν��Ͻ��� �ƴ�!
	
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String pw);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	//���ø� �޼ҵ�
	public String requestConnection(String encodedInfo){
		
		//�����۾� ->��ȣȭ �� ���ڿ��� ��ȣȭ
		String decodedInfo=doSecurity(encodedInfo);
		String id="aaa";
		String pw="bbb";
		
		//��ȯ�� ���� ������ ���̵�, ��ȣ�� �Ҵ��Ѵ�.
		if (!authentication(id, pw)) {
			throw new Error("���̵� ��ȣ ����ġ");
		}
		
		String userName="userName";
		int i=authorization(userName);
		
		switch(i){
		//�߰� ����
		case -1:
			throw new Error("�˴ٿ�");
		case 0://���Ӹ޴���
			System.out.println("���Ӹ޴���");
			break;
		case 1://����ȸ��
			break;
		case 2://����ȸ��
			break;
		case 3://���Ѿ���
			break;
		case 4://��Ÿ��Ȳ
			break;
		}		
		
		return connection(decodedInfo);
	};
}
