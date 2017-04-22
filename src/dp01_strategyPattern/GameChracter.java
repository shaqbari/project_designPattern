package dp01_strategyPattern;

public class GameChracter {
	
	//������
	private StrategyWeapon weapon;
	
	//��ȯ ����
	public void setWeapon(StrategyWeapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack(){
		if (weapon==null) {
			System.out.println("�Ǽհ���");
		}else {
			weapon.attack();				
		}
	}
	
}
