package dp11_decoratorPattern_conc;

import dp11_decoratorPattern_abst.AbstAdding;
import dp11_decoratorPattern_abst.IBeverage;

//ConcreteDecorator: �������� ��� �ν��Ͻ� �� �����̸� �߰��� å���� ��ü �κ��̴�.
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
		
		if (espressoCount>1) {//�ѹ��� �߰��ϸ� ����
			addPrice=70;
		}
		
		
		return addPrice;
	}
}
