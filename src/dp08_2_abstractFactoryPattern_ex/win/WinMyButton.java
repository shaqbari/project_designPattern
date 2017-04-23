package dp08_2_abstractFactoryPattern_ex.win;

import dp08_2_abstractFactoryPattern_abst.MyButton;

public class WinMyButton implements MyButton{

	public void click() {
		System.out.println("윈도우 버튼");
	}

}
