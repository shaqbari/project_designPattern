package dp07_2_builderPattern_practical;

public class Main {
	
	public static void main(String[] args) {
		//Computer computer=new Computer("256g ssd", "i7", "8g");
		//인자나 변수가 많아지면 입력할때 헷갈릴수 있다.
		
		Computer computer=ComputerBuilder
				.startWithCpu("i7")//cpu를 셋팅하면서 시작할 수 있다
				//.setCpu("i7")
				.setRam("8g")
				//.setStorage("256g ssd") //이메소드 안쓰면 "default"가 들어간다.
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
