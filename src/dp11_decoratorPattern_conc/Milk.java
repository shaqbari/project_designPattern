package dp11_decoratorPattern_conc;

import dp11_decoratorPattern_abst.AbstAdding;
import dp11_decoratorPattern_abst.IBeverage;

//ConcreteDecorator: 실질적인 장식 인스턴스 및 정의이며 추가된 책임의 주체 부분이다.
public class Milk extends AbstAdding {

	public Milk(IBeverage meterial) {
		super(meterial);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+50;
	}
}
