package dp07_2_builderPattern_practical;


public class Computer {
	private String cpu;
	private String ram;
	private String storage;
		
	/**
	 * 
	 * @param cpu �������Դϴ�
	 * @param ram ���Դϴ�.
	 * @param storage ������Դϴ�.
	 * ������ ������ �̷��� doc�� �����ϸ� ������
	 * 
	 * ��û �������ٸ� �򰥸��� �Ǽ��� ������ �����.
	 */
	public Computer(String cpu, String ram, String storage) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
	}
	
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	@Override
	public String toString() {
		return cpu+", "+ram+", "+storage;
	}

}
