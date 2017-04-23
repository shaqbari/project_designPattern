package dp08_1_abstractFactoryPattern_gt;

import dp08_1_abstractFactoryPattern_abst.BikeAbstFactory;
import dp08_1_abstractFactoryPattern_abst.Body;
import dp08_1_abstractFactoryPattern_abst.Wheel;

public class GtFactory implements BikeAbstFactory {

	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		return new GtWheel();
	}

}
