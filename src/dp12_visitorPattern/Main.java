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
			visitable.accept(visitor);//���������� ���ؼ��� ��visitor������ �̿��ϴ� ���� ����.
			//visitorA��Ŭ������ ������ �� ������ visitable�� ����� �湮�� ����Ѵ�.			
			
			//ageSum+=((VisitableA) visitable).getAge();
			//������ ������� �ľ��ϱ� �����.
		}
		
		System.out.println(((VisitorA) visitor).getAgeSum());
		///System.out.println(ageSum);
	}

}
