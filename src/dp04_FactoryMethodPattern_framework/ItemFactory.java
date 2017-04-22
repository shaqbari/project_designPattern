package dp04_FactoryMethodPattern_framework;

public abstract class ItemFactory {
	//���ø��޼ҵ� ������ �̿��Ѵ�.
	
	//�������� �����ϱ� ���� �����ͺ��̽����� ������������ ��û�մϴ�.
	abstract protected void requestItemInfo(); 
	
	//�������� ������ ������ ���� ���� �ҹ��� �����ϱ� ���� �����ͺ��̽��� �����ۻ������� ����ϴ�.
	abstract protected void createItemLog(); 

	//�������� �����ϴ� �˰���	
	abstract protected Item createItem();
	
	
	//�ѵ��� �޼ҵ�:���ø� �޼ҵ� ������ ���ȴ�.
	public Item createInstance(){
		Item item;
		//step1
		requestItemInfo();
		
		//step2
		createItemLog();
		
		//step3
		item =createItem();
		return item;
	}
	
}
