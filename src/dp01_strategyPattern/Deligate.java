package dp01_strategyPattern;

public class Deligate {
	//델리게이트:위임하다!떠넘기다
	
	Ainterface ainterface;
	public Deligate() {
		ainterface=new AinterfaceImp();
	}
	
	
	public void funcA() {
		
		/*System.out.println("AAA");
		System.out.println("AAA");*/		
		// ~의 기능이 필요합니다.
		
		//다른객체의 기능을 빌려 구현한다.
		ainterface.funA();
		ainterface.funA();
		
	}
}
