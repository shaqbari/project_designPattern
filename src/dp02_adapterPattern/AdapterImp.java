package dp02_adapterPattern;

public class AdapterImp implements Adapter {
	//Math math;
	
	//��û ������ ����(��: �̹���ó��)�� ������ ���̺귯������ ���ݸ� �ٲ� ���� ���� �ְ� �� ���� �ִ�.
	//list --> (arr --> sort --> arr) -->list
	
	public Float twiceof(Float f) {
		
		//return (float)Math.twoTime(f.doubleValue());
		
		 //adapter�Ȱǵ�� ���� �˰��� ��ü����
		return Math.doubled(f.doubleValue()).floatValue();
	}

	public Float halfof(Float f) {
		
		System.out.println("���� �Լ� ȣ��");//Math�Ȱǵ�� ����߰�����
		return (float)Math.half(f.doubleValue());
	}

}
