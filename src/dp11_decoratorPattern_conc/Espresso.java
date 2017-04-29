package dp11_decoratorPattern_conc;

import dp11_decoratorPattern_abst.AbstAdding;
import dp11_decoratorPattern_abst.IBeverage;

//ConcreteDecorator: 실질적인 장식 인스턴스 및 정의이며 추가된 책임의 주체 부분이다.
public class Espresso extends AbstAdding {
	static protected int espressoCount=0;
	
	public Espresso(IBeverage base) {
		super(base);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+getAddPrice();
	}

	private static int getAddPrice() {
		espressoCount+=1;
		int addPrice=100;
		
		if (espressoCount>1) {//한번더 추가하면 할인
			addPrice=70;
		}
		
		
		return addPrice;
	}
}
