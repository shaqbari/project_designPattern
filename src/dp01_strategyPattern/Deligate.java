package dp01_strategyPattern;

public class Deligate {
	//��������Ʈ:�����ϴ�!���ѱ��
	
	Ainterface ainterface;
	public Deligate() {
		ainterface=new AinterfaceImp();
	}
	
	
	public void funcA() {
		
		/*System.out.println("AAA");
		System.out.println("AAA");*/		
		// ~�� ����� �ʿ��մϴ�.
		
		//�ٸ���ü�� ����� ���� �����Ѵ�.
		ainterface.funA();
		ainterface.funA();
		
	}
}
