package dp04_FactoryMethodPattern;

import dp04_FactoryMethodPattern_framework.Item;
import dp04_FactoryMethodPattern_framework.ItemFactory;

public class Main {

	public static void main(String[] args) {
		Item item;
		ItemFactory factory;
		
		factory=new HpPortionFactory();
		item=factory.createInstance();
		item.useItem();
		
		MpPortionFactory mpPortionFactory=new MpPortionFactory();
		MpPortion mpPortion=(MpPortion) mpPortionFactory.createInstance();
		mpPortion.useItem();
		
		//�ٸ������� �����ϰų� �߰������� �˰����� �ٲ� ����Ŭ������ ������ ���ų� ȣ�⸸���ָ�ȴ�.
		
	}

}
