package dp15_observerPattern;

import dp15_observerPattern.ch3.Button;
import dp15_observerPattern.ch3.Observable;
import dp15_observerPattern.ch3.Observable.Observer;

public class Main3 {
	public Main3() {
		//������� �ʰ� ����ϴ� ���!!
		//1.���׸�
		//2.��������Ʈ
		//3.���ο� �������� �ִ´�.
		
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
