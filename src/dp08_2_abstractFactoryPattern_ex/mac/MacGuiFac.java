package dp08_2_abstractFactoryPattern_ex.mac;

import dp08_2_abstractFactoryPattern_abst.GuiFactory;
import dp08_2_abstractFactoryPattern_abst.MyButton;
import dp08_2_abstractFactoryPattern_abst.MyTextArea;

public class MacGuiFac implements GuiFactory{

	@Override
	public MyButton createButton() {
		//�ư��� ��ư �˰���
		
		return new MacMyButton();
	}

	@Override
	public MyTextArea createArea() {
		return new MacMyTextArea();
	}

}
