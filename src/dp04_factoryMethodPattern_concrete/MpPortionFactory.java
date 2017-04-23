package dp04_factoryMethodPattern_concrete;

import java.util.Date;

import dp04_factoryMethodPattern_framework.Item;
import dp04_factoryMethodPattern_framework.ItemFactory;

public class MpPortionFactory extends ItemFactory{

	protected void requestItemInfo() {
		System.out.println("데이터베이스에서 마력 회복 물약의 정보를 가져옵니다.");
	}

	protected void createItemLog() {
		System.out.println("마력 회복물약을 새로 생성했습니다."+new Date());
		
	}

	protected Item createItem() {
		return new MpPortion();
	}
	
}
