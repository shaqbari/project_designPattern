package dp16_mediatorPattern;

import dp16_mediatorPattern.contract.Colleague;
import dp16_mediatorPattern.contract.Mediator;

public class ChatMediator extends Mediator {

	@Override
	public void mediate(String data) {
		for (Colleague colleague : colleagues) {
			//중재 가능성. (모두, 귓말, 차단등을 처리)
			colleague.handle(data);
		
		}
	}

}
