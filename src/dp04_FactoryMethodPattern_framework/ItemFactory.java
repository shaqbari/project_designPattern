package dp04_FactoryMethodPattern_framework;

public abstract class ItemFactory {
	//템플릿메소드 패턴을 이용한다.
	
	//아이템을 생성하기 전에 데이터베이스에서 아이템정보를 요청합니다.
	abstract protected void requestItemInfo(); 
	
	//아이템을 생성후 아이템 복제 등의 불법을 방지하기 위해 데이터베이스에 아이템생정보를 남깁니다.
	abstract protected void createItemLog(); 

	//아이템을 생성하는 알고리즘	
	abstract protected Item createItem();
	
	
	//팩도리 메소드:템플릿 메소드 패턴이 사용된다.
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
