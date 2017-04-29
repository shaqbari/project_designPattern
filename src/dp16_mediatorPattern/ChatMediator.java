package dp16_mediatorPattern;

import dp16_mediatorPattern.contract.Colleague;
import dp16_mediatorPattern.contract.Mediator;

public class ChatMediator extends Mediator {

	@Override
	public void mediate(String data) {
		for (Colleague colleague : colleagues) {
			//���� ���ɼ�. (���, �Ӹ�, ���ܵ��� ó��)
			colleague.handle(data);
		
		}
	}

}
