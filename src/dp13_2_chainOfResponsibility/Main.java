package dp13_2_chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		Attack attack=new Attack(100);
		
		Armor armor1=new Armor(10);
		Armor armor2=new Armor(15);
	
	
		armor1.setNextDefense(armor2);//ù��°����				
		armor1.defense(attack);		
		System.out.println(attack.getAmount());
		
		//point2 �������� å�ӻ罽�� å���� �� �߰��� �� �ִ�.
		Defense defense=new Defense() {			
			@Override
			public void defense(Attack attack) {
				int amount=attack.getAmount();				
				attack.setAmount(amount-=50);
			}
		};
		
		//�߰� ����
		armor2.setNextDefense(defense);
	
		attack.setAmount(100);//�ι�°����
		armor1.defense(attack);		
		System.out.println(attack.getAmount());
	
	}

}
