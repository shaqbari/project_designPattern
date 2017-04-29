package dp11_decoratorPattern_abst;

//Decorator 역할: Component와 Concrete Decorator를 동일시 하도록 해주는 역할
public abstract class AbstAdding implements IBeverage {
								//Component이면서
	
	private IBeverage base;//Component를 가지기도 한다.
	
	public AbstAdding(IBeverage base) {
		this.base=base;
	}
	
	
	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}

}
