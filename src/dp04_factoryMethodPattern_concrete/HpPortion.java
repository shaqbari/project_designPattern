package dp04_factoryMethodPattern_concrete;

import dp04_factoryMethodPattern_framework.Item;

public class HpPortion implements Item {

	public void useItem() {
		System.out.println("체력회복");
	}

}
