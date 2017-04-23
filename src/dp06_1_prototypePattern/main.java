package dp06_1_prototypePattern;

public class main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle1 = new Circle(1, 1, 3);
		Circle circle2 = circle1.copy();
		
		System.out.println(circle1.getX() + "," + circle1.getY() + "," + circle1.getR());
		System.out.println(circle2.getX() + "," + circle2.getY() + "," + circle2.getR());
	
		//변수가 엄청 많거나 복잡한 인스턴스의 경우 유용하게 쓰일수 있다.
	}

}
