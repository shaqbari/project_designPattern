package dp15_observerPattern;

import dp15_observerPattern.ch1.Button;
import dp15_observerPattern.ch1.Button.OnClickListener;

public class Main1 {

	public static void main(String[] args) {
		Button button=new Button();
		//button.setOnClickListener(new ButtonClick()); Concrete Observer를 만들기도 하지만
		
		//내부익명클래스로 더 많이 쓴다.
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(Button button) {
				System.out.println(button+"is Clicked");
			}
		});
		
		
		
		button.onClick();
	}

}

//Concrete Observer
class ButtonClick implements OnClickListener{
	@Override
	public void onClick(Button button) {
		System.out.println(button+"is Clicked");
	}
	
}
