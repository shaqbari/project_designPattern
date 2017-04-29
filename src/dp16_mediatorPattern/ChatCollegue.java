package dp16_mediatorPattern;

import dp16_mediatorPattern.contract.Colleague;

public class ChatCollegue extends Colleague {

	@Override
	public void handle(String data) {
		System.out.println(this+"-"+data);
	}

}
