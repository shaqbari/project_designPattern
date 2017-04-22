package dp01_strategyPattern;

public class GameChracter {
	
	//접근점
	private StrategyWeapon weapon;
	
	//교환 가능
	public void setWeapon(StrategyWeapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack(){
		if (weapon==null) {
			System.out.println("맨손공격");
		}else {
			weapon.attack();				
		}
	}
	
}
