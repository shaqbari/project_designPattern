package dp08_1_abstractFactoryPattern_abst;

public interface BikeAbstFactory {
	public Body createBody();
	public Wheel createWheel();
}
