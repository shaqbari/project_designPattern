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
		//����� �ٲٷ��� �� �ٲ��ְų� ���� MorseCode2�� ����� �̰� ��ӹ޾� ������ �Ѵ�.
		//�׷��Ƿ� ����� ���� ��ó�� deligate�� �������ش�.
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
