package dp12_visitorPattern;

public class VisitableA implements Visitable {
	private int age;
	
	
	
	public VisitableA(int age) {
		this.age = age;
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	
	public void setAge(int age){
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
}
