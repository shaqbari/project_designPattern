package dp14_facadePattern.system;

class HelpSystem01 {//public ���� default�� �����Ǿ� ��Ű�� �������� ���� ����
	public HelpSystem01() {
		System.out.println("Call Constructor :"+getClass().getName());
		//��û ������ �����̶� ����
	
	}

	public void process(){
		System.out.println("Call Process : "+getClass().getName());
		
	}
	
}
