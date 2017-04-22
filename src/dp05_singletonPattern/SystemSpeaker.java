package dp05_singletonPattern;

public class SystemSpeaker {
	static private SystemSpeaker instance;//1���� �����ϰ� �ν��Ͻ��������ص� �ٸ�Ŭ���������� ���� �ְ� static
	
	//java ���������� ��������� �θ��� Ŭ���������� �ν��Ͻ��������ִ�.
	//Ŭ���� ������ static���� �����ϸ� Ŭ���� ������ JVM�޸𸮿� �ö󰥶�, static������ �Բ� �ö� �Ѱ��� �����ȴ�.
	//public�� ���̸� ���� ���α׷������� ��𼭵� ������ �� �ִ� ���������� �ȴ�.
	
	//�ν��Ͻ� ������ �ν��Ͻ� �� �Բ� new������ ����� �޸𸮸� �Ҵ� �Ҷ� heap������ �ö󰣴�.
	//�ν��Ͻ����� ������ ���� ������ �Ҷ��� �ν��Ͻ� ������ �����Ѵ�.
	
	//�ν��Ͻ��� ����Ű�� ���۷��� ������ stack������ ���δ�. 
	
	//��������
	
	private int volume;

	private SystemSpeaker() {//�ٸ�Ŭ����(�ܺ�)���� ������ �޼ҵ� ȣ�� ���ϰ� �Ѵ�.=new�� ���´�.
		
	}
	
	//getter�θ� ������ �� �ְ� �Ѵ�.
	public static SystemSpeaker getInstance() {//�ν��Ͻ� �������ص� ȣ���� �� �ְ� static�޼ҵ�
		if (instance==null) {//null�϶��� �����ϰ��ϸ� 1���� ���������.
			instance=new SystemSpeaker();
			System.out.println("���λ���");
		}else {
			System.out.println("�̹̻���");
		}
		return instance;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
