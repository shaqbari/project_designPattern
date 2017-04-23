package dp08_2_abstractFactoryPattern_ex.win;

import dp08_2_abstractFactoryPattern_abst.MyTextArea;

public class WinMyTextArea implements MyTextArea{

	public String getMyText() {
		return "윈도우 텍스트에어리어";
	}

}
