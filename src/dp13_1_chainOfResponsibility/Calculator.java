package dp13_1_chainOfResponsibility;

public abstract class Calculator {
	
	private Calculator nextCalculator;
	
	public void setNextCalculator(Calculator nextCalculator) {
		this.nextCalculator=nextCalculator;
	}
	
	public boolean process(Request request){
//		if (request.getOper().equal("+")) {
		if (operator(request)) {			
			return true;
		}else{//���⼭ �غ��� �ȵǸ� nextCalculator�� ����Ѵ�.		
			//return false;	
			if (nextCalculator!=null) {
				return nextCalculator.process(request);				
			}
			return false;			
		}
		
		//���� �ٸ��� �Ẹ�� �ȵǸ� �̰� ������ �ִ�.
		/*if(preCalculator!=null)
			if(preCalculator.process(request));
				return true
		return operator(request);*/
		
	};
	
	//������ ����� ���� �Ʒ� �޼ҵ带 �̿��Ѵ�.
	abstract protected boolean operator(Request request);
	
	
}
