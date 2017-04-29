package dp16_mediatorPattern.contract;

public abstract class Colleague {
	private Mediator mediator;//어느 mediator에 속하는지 알기위해 mediator를 가져야 한다.

	public boolean join(Mediator mediator){
		if (mediator==null) {
			return false;
		}
		this.mediator=mediator;
		
		return mediator.addColleague(this);
		
	}
	
	public void sendData(String data) {
		if (mediator!=null) {			
			mediator.mediate(data);
		}
	}
	
	abstract public void handle(String data);
}
