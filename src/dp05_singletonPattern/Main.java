package dp05_singletonPattern;

public class Main {

	public static void main(String[] args) {
		//SystemSpeaker speaker=new SystemSpeaker(); 생성자가 private라서 안된다.
		SystemSpeaker speaker1=SystemSpeaker.getInstance();
		SystemSpeaker speaker2=SystemSpeaker.getInstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(4);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(10);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		System.out.println(speaker1);
		System.out.println(speaker2);
	}
}
