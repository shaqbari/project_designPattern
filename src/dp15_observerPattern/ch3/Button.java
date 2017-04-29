package dp15_observerPattern.ch3;

import dp15_observerPattern.ch3.Observable.Observer;


//��������Ʈ�� ����ؼ� Observable�� ��ӹ��� �ʰ� ����� �� �ִ�.
public class Button {
	//������ ó���� ������ ���������� ���⼭�� String�� ����.
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
