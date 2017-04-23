package dp09_bridgePattern;

public class MorseCode {
	
	private MorseCodeFunction function;
	
	public MorseCode(MorseCodeFunction function) {
		this.function=function;
	}
	
	public void setFunction(MorseCodeFunction function) {
		this.function = function;
	}
	
	public void dot(){
		function.dot();
	}
	
	public void dash(){
		function.dash();
	}
	
	public void space(){
		function.space();
	}	
	
/*	public void dot(){
		System.out.print(".");
		//System.call.shortBip();
		//기능을 바꾸려면 다 바꿔주거나 새로 MorseCode2를 만들어 이걸 상속받아 만들어야 한다.
		//그러므로 기능을 따로 위처럼 deligate로 구현해준다.
	};
	public void dash(){
		System.out.print("-");
		//System.call.longBip();
	};
	public void space(){
		System.out.print(" ");
		//System.call.longTip();
	};*/
}
