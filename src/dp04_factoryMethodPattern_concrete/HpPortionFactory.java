package dp04_factoryMethodPattern_concrete;

import java.util.Date;

import dp04_factoryMethodPattern_framework.Item;
import dp04_factoryMethodPattern_framework.ItemFactory;

public class HpPortionFactory extends ItemFactory{

	protected void requestItemInfo() {
		System.out.println("�����ͺ��̽����� ü�� ȸ�� ������ ������ �����ɴϴ�.");
	
	}

	protected void createItemLog() {
		System.out.println("ü�� ȸ�������� ���� �����߽��ϴ�."+new Date());
		
		//�߰�
		System.out.println("�����ͺ��̽��� �� �����߽��ϴ�");
	}

	protected Item createItem() {
		return new HpPortion();
	}
	
}
