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
		
		//�����ִ� ��ǰ�� ����  ������ �پ��ϰ� �ϳ��� factory���� ����� �� �� �ִ�.
		BikeAbstFactory factory2=new GtFactory();
		Body body2=factory2.createBody();
		Wheel wheel2=factory2.createWheel();
		
		System.out.println(body2.getClass());
		System.out.println(wheel2.getClass());
		body2.sustain();
		wheel2.move();
		
		
		
	}

}
