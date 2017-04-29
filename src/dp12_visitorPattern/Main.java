package dp12_visitorPattern;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Visitable>visitables =new ArrayList<Visitable>();
		visitables.add(new VisitableA(1));
		visitables.add(new VisitableA(2));
		visitables.add(new VisitableA(3));
		visitables.add(new VisitableA(4));
		visitables.add(new VisitableA(5));
		visitables.add(new VisitableA(6));
		
		Visitor visitor=new VisitorA();
		//int ageSum;
		
		for (Visitable visitable : visitables) {
			visitable.accept(visitor);//유지보수를 위해서는 이visitor패턴을 이용하는 것이 좋다.
			//visitorA의클래스를 수정할 수 없을때 visitable을 만들어 방문해 사용한다.			
			
			//ageSum+=((VisitableA) visitable).getAge();
			//로직이 길어지면 파악하기 힘들다.
		}
		
		System.out.println(((VisitorA) visitor).getAgeSum());
		///System.out.println(ageSum);
	}

}
