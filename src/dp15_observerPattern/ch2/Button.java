package dp15_observerPattern.ch2;

import java.util.Observable;

//public class Button extends View, Observable {//���߻���� �Ұ��� �ϴ�.
public class Button extends Observable {//���߻���� �Ұ��� �ϴ�.
	public void onClick(){
		setChanged();
		notifyObservers();
	}
}
