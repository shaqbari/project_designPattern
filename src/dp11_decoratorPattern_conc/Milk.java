package dp11_decoratorPattern_conc;

import dp11_decoratorPattern_abst.AbstAdding;
import dp11_decoratorPattern_abst.IBeverage;

//ConcreteDecorator: �������� ��� �ν��Ͻ� �� �����̸� �߰��� å���� ��ü �κ��̴�.
public class Milk extends AbstAdding {

	public Milk(IBeverage meterial) {
		super(meterial);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+50;
	}
}
