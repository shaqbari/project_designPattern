package dp01_strategyPattern;

public class Main {

	public static void main(String[] args) {
		//인터페이스는 기능의 선언과 구현 분리하며 기능을 사용할 수 있는 통로가된다.
		Ainterface ainterface=new AinterfaceImp();
		ainterface.funA();
		
		//델리게이트(위임하다)란 특정객체의 기능을 사용하기 위해 다른 객체의 기능을 호출하는것이다.
		Deligate deligate=new Deligate();
		deligate.funcA();
		
		//strategy pattern이란 여러 알고리즘을 하나의 추상적인 접근점(인터페이스)로 만들어
		//접근점에서 서로 교환 가능(set메소드)하도록 하는 패턴. 전략에 따라 무기교체!
		GameChracter chracter= new GameChracter();
		chracter.attack();
		
		chracter.setWeapon(new Knife());
		chracter.attack();
		
		chracter.setWeapon(new Sword());
		chracter.attack();
		
		//유지보수 요청: 도끼도 구현해줘! 도끼도 구현쉽게 가능
		chracter.setWeapon(new Axe());
		chracter.attack();
	}

}
