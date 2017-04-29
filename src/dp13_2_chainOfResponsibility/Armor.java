package dp13_2_chainOfResponsibility;

public class Armor implements Defense {

	private Defense nextDefense;
	private int def;
		
	public Armor(int def) {
		this.def = def;
	}

	public void defense(Attack attack) {
		//여러객체가 책임을 질 수 있다.
		process(attack);//point1!! 여기선 처리를 무조건 하고  defense가 있으면 defense도 처리 
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
