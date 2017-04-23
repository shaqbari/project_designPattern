package dp08_1_abstractFactoryPattern_sam;

import dp08_1_abstractFactoryPattern_abst.BikeAbstFactory;
import dp08_1_abstractFactoryPattern_abst.Body;
import dp08_1_abstractFactoryPattern_abst.Wheel;

public class SamFactory implements BikeAbstFactory {

	@Override
	public Body createBody() {
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		return new SamWheel();
	}

}
