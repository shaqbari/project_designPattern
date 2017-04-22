package dp04_FactoryMethodPattern;

import java.util.Date;

import dp04_FactoryMethodPattern_framework.Item;
import dp04_FactoryMethodPattern_framework.ItemFactory;

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
