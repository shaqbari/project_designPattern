package dp13_1_chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		Calculator plus=new PlusCalculator();
		Calculator sub=new SubCalculator();
		
		plus.setNextCalculator(sub);//plus에서 처리해보고 안되면 sub로 책임을 넘긴다.
		
		Request request1 =new Request(1, 2, "+");
		Request request2 =new Request(10, 2, "-");
		
		plus.process(request1);
		plus.process(request2);//plus에서 처리되지 못하고 sub로 넘어가 처리된다.
	}

}
