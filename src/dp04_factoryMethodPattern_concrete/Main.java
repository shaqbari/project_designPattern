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
		
		//다른아이템 생성하거나 중간과정의 알고리즘이 바뀌어도 메인클래스의 변경이 없거나 호출만해주면된다.
		
	}

}
