package dp04_factoryMethodPattern_concrete;

import java.util.Date;

import dp04_factoryMethodPattern_framework.Item;
import dp04_factoryMethodPattern_framework.ItemFactory;

public class MpPortionFactory extends ItemFactory{

	protected void requestItemInfo() {
		System.out.println("�����ͺ��̽����� ���� ȸ�� ������ ������ �����ɴϴ�.");
	}

	protected void createItemLog() {
		System.out.println("���� ȸ�������� ���� �����߽��ϴ�."+new Date());
		
	}

	protected Item createItem() {
		return new MpPortion();
	}
	
}
