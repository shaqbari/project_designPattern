package dp07_2_builderPattern_practical;

public class Main {
	
	public static void main(String[] args) {
		//Computer computer=new Computer("256g ssd", "i7", "8g");
		//���ڳ� ������ �������� �Է��Ҷ� �򰥸��� �ִ�.
		
		Computer computer=ComputerBuilder
				.startWithCpu("i7")//cpu�� �����ϸ鼭 ������ �� �ִ�
				//.setCpu("i7")
				.setRam("8g")
				//.setStorage("256g ssd") //�̸޼ҵ� �Ⱦ��� "default"�� ����.
				.build();
		
		Computer computer1=ComputerBuilder
				.start()
				.setCpu("i5")
				.setRam("4g")
				.setStorage("128g ssd")
				.build();				
		
		System.out.println(computer.toString());
		System.out.println(computer1.toString());
	}
}
