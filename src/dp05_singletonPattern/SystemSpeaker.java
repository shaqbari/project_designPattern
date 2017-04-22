package dp05_singletonPattern;

public class SystemSpeaker {
	static private SystemSpeaker instance;//1개만 존재하고 인스턴스생성안해도 다른클래스에서도 쓸수 있게 static
	
	//java 전역변수는 멤버변수라 부르며 클래스변수와 인스턴스변수가있다.
	//클래스 변수는 static으로 선언하며 클래스 원본이 JVM메모리에 올라갈때, static영역에 함께 올라가 한개만 생성된다.
	//public을 붙이면 같은 프로그램내에서 어디서든 접근할 수 있는 전역변수가 된다.
	
	//인스턴스 변수는 인스턴스 와 함께 new연산자 사용해 메모리를 할당 할때 heap영역에 올라간다.
	//인스턴스마다 고유의 값을 가져야 할때는 인스턴스 변수로 선언한다.
	
	//인스턴스를 가리키는 레퍼런스 변수는 stack영역에 쌓인다. 
	
	//지역변수
	
	private int volume;

	private SystemSpeaker() {//다른클래스(외부)에서 생성자 메소드 호출 못하게 한다.=new를 막는다.
		
	}
	
	//getter로만 생성할 수 있게 한다.
	public static SystemSpeaker getInstance() {//인스턴스 생성안해도 호출할 수 있게 static메소드
		if (instance==null) {//null일때만 생성하게하면 1개만 만들어진다.
			instance=new SystemSpeaker();
			System.out.println("새로생성");
		}else {
			System.out.println("이미생성");
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
