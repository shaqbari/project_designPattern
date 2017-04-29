package dp11_decoratorPattern_abst;

//Decorator ����: Component�� Concrete Decorator�� ���Ͻ� �ϵ��� ���ִ� ����
public abstract class AbstAdding implements IBeverage {
								//Component�̸鼭
	
	private IBeverage base;//Component�� �����⵵ �Ѵ�.
	
	public AbstAdding(IBeverage base) {
		this.base=base;
	}
	
	
	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}

}
