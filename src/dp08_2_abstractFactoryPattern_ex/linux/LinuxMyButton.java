package dp08_2_abstractFactoryPattern_ex.linux;

import dp08_2_abstractFactoryPattern_abst.MyButton;

public class LinuxMyButton implements MyButton{

	public void click() {
		System.out.println("리눅스 버튼");
	}

}
