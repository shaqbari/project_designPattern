package dp08_2_abstractFactoryPattern_ex.win;

import dp08_2_abstractFactoryPattern_abst.GuiFactory;
import dp08_2_abstractFactoryPattern_abst.MyButton;
import dp08_2_abstractFactoryPattern_abst.MyTextArea;

public class WinGuiFac implements GuiFactory{

	@Override
	public MyButton createButton() {
		//윈도우관련 버튼 알고리즘
		
		return new WinMyButton();
	}

	@Override
	public MyTextArea createArea() {
		return new WinMyTextArea();
	}

}
