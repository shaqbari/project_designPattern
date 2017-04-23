package dp08_1_abstractFactoryPattern_abst;

import dp08_1_abstractFactoryPattern_gt.GtFactory;
import dp08_1_abstractFactoryPattern_sam.SamFactory;

public class Main {

	public static void main(String[] args) {
		BikeAbstFactory factory=new SamFactory();
		Body body=factory.createBody();
		Wheel wheel=factory.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
		body.sustain();
		wheel.move();
		
		//관련있는 부품을 가진  물건을 다양하게 하나의 factory에서 만들어 낼 수 있다.
		BikeAbstFactory factory2=new GtFactory();
		Body body2=factory2.createBody();
		Wheel wheel2=factory2.createWheel();
		
		System.out.println(body2.getClass());
		System.out.println(wheel2.getClass());
		body2.sustain();
		wheel2.move();
		
		
		
	}

}
