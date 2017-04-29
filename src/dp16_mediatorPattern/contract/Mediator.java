package dp16_mediatorPattern.contract;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
	protected List<Colleague> colleagues;
	
	public Mediator() {
		colleagues=new ArrayList<Colleague>();
	}
	
	public boolean addColleague(Colleague colleague){
		if (colleagues!=null) {
			return colleagues.add(colleague);
		}else {
			//throw exception을 해도 된다.
			return false;
		}		
	}
	
	public abstract void mediate(String data);
}
