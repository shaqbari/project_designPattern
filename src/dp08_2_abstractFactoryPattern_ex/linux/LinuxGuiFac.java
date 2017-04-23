package dp08_2_abstractFactoryPattern_ex.linux;

import dp08_2_abstractFactoryPattern_abst.GuiFactory;
import dp08_2_abstractFactoryPattern_abst.MyButton;
import dp08_2_abstractFactoryPattern_abst.MyTextArea;

public class LinuxGuiFac implements GuiFactory{

	@Override
	public MyButton createButton() {
		//리눅스관련 버튼 알고리즘
		
		return new LinuxMyButton();
	}

	@Override
	public MyTextArea createArea() {
		return new LinuxMyTextArea();
	}

}
