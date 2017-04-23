package dp09_bridgePattern;

public class Main {
	public static void main(String[] args) {
		PrintMorseCode code=new PrintMorseCode(new DefaultMCF());
		
		//code.g();code.a();code.r();code.a();code.m();
		code.g().a().r().a().m();//chaining!!
		
		PrintMorseCode code2=new PrintMorseCode(new FlashMCF());
		code2.g().a().r().a().m();
		
		PrintMorseCode code3=new PrintMorseCode(new SoundMCF());
		code3.g().a().r().a().m();
		
		//이렇게 기능과 구현을 분리하면 다양한 하드웨어와 연결하거나 자원을 쓸 수 있다.
	}
}
