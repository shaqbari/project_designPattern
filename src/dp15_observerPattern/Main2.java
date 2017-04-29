package dp15_observerPattern;

import java.util.Observable;
import java.util.Observer;

import dp15_observerPattern.ch2.Button;

public class Main2 {
	public static void main(String[] args) {
		//Observable observable; f3누르면 실제 코딩된거 볼 수 있다.
		//Observer Observer;
		
		Button button=new Button();
		
		button.addObserver(new Observer() {
			@Override
			public void update(Observable o, Object arg) {
				System.out.println(o+"is Clicked");
			}
		});
		
		button.onClick();
		button.onClick();
		button.onClick();
		
	}
}
