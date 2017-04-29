package dp13_2_chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		Attack attack=new Attack(100);
		
		Armor armor1=new Armor(10);
		Armor armor2=new Armor(15);
	
	
		armor1.setNextDefense(armor2);//첫번째공격				
		armor1.defense(attack);		
		System.out.println(attack.getAmount());
		
		//point2 동적으로 책임사슬에 책임을 더 추가할 수 있다.
		Defense defense=new Defense() {			
			@Override
			public void defense(Attack attack) {
				int amount=attack.getAmount();				
				attack.setAmount(amount-=50);
			}
		};
		
		//추가 착용
		armor2.setNextDefense(defense);
	
		attack.setAmount(100);//두번째공격
		armor1.defense(attack);		
		System.out.println(attack.getAmount());
	
	}

}
