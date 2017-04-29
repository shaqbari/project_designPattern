package dp16_mediatorPattern;

import dp16_mediatorPattern.contract.Colleague;
import dp16_mediatorPattern.contract.Mediator;

public class Main {

	public static void main(String[] args) {
		Mediator mediator=new ChatMediator();		
		
		Colleague colleague1=new ChatCollegue();
		Colleague colleague2=new ChatCollegue();
		Colleague colleague3=new ChatCollegue();
		
		colleague1.join(mediator);
		colleague2.join(mediator);
		colleague3.join(mediator);
	
		colleague1.sendData("AAA");
		colleague2.sendData("BBB");
		colleague3.sendData("CCC");
	}

}
