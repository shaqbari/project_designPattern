package dp15_observerPattern.ch2;

import java.util.Observable;

//public class Button extends View, Observable {//다중상속이 불가능 하다.
public class Button extends Observable {//다중상속이 불가능 하다.
	public void onClick(){
		setChanged();
		notifyObservers();
	}
}
