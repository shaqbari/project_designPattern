package dp04_factoryMethodPattern_concrete;

import dp04_factoryMethodPattern_framework.Item;
import dp04_factoryMethodPattern_framework.ItemFactory;

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
