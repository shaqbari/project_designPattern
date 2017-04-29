package dp13_2_chainOfResponsibility;

public class Armor implements Defense {

	private Defense nextDefense;
	private int def;
		
	public Armor(int def) {
		this.def = def;
	}

	public void defense(Attack attack) {
		//������ü�� å���� �� �� �ִ�.
		process(attack);//point1!! ���⼱ ó���� ������ �ϰ�  defense�� ������ defense�� ó�� 
		if (nextDefense!=null) {
			nextDefense.defense(attack);
		}
	}

	private void process(Attack attack){
		int amount = attack.getAmount();
		amount-=def;
		attack.setAmount(amount);
	}
	
	public void setNextDefense(Defense nextDefense) {
		this.nextDefense = nextDefense;
	}

	public void setDef(int def) {
		this.def = def;
	}
}
