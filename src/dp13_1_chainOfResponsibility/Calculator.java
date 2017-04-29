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
		}else{//여기서 해보고 안되면 nextCalculator를 사용한다.		
			//return false;	
			if (nextCalculator!=null) {
				return nextCalculator.process(request);				
			}
			return false;			
		}
		
		//먼저 다른걸 써보고 안되면 이걸 쓸수도 있다.
		/*if(preCalculator!=null)
			if(preCalculator.process(request));
				return true
		return operator(request);*/
		
	};
	
	//로직을 숨기기 위해 아래 메소드를 이용한다.
	abstract protected boolean operator(Request request);
	
	
}
