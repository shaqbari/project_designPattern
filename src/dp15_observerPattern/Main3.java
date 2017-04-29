package dp15_observerPattern;

import dp15_observerPattern.ch3.Button;
import dp15_observerPattern.ch3.Observable;
import dp15_observerPattern.ch3.Observable.Observer;

public class Main3 {
	public Main3() {
		//상속하지 않고 사용하는 방법!!
		//1.제네릭
		//2.델리게이트
		//3.내부에 옵저버를 넣는다.
		
		Button button=new Button();
		button.addObserver(new Observer<String>() {
			@Override
			public void update(Observable<String> o, String arg) {
				System.out.println(o+"is Clicked");
			}			
		});
		
		button.onClick();
		button.onClick();
		button.onClick();
		
	}
}
