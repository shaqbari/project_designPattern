package dp13_1_chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		Calculator plus=new PlusCalculator();
		Calculator sub=new SubCalculator();
		
		plus.setNextCalculator(sub);//plus���� ó���غ��� �ȵǸ� sub�� å���� �ѱ��.
		
		Request request1 =new Request(1, 2, "+");
		Request request2 =new Request(10, 2, "-");
		
		plus.process(request1);
		plus.process(request2);//plus���� ó������ ���ϰ� sub�� �Ѿ ó���ȴ�.
	}

}
