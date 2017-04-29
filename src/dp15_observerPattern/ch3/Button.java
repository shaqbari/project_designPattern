package dp15_observerPattern.ch3;

import dp15_observerPattern.ch3.Observable.Observer;


//델리게이트를 사용해서 Observable을 상속받지 않고도 사용할 수 있다.
public class Button {
	//보통은 처리된 내역을 남겨주지만 여기서는 String을 쓴다.
	private Observable<String> observable;
	
	public Button() {
		observable=new Observable<String>();
	}
	
	public synchronized void addObserver(Observer<String> o) {
		observable.addObserver(o);
	}
	
	public void notifyObservers() {
		observable.notifyObservers(null);		
	}
	
	public void onClick(){
		observable.setChanged();
		notifyObservers();
	}
	
}
