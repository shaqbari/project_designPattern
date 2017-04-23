package dp08_2_abstractFactoryPattern_ex.linux;

import dp08_2_abstractFactoryPattern_abst.MyTextArea;

public class LinuxMyTextArea implements MyTextArea{

	public String getMyText() {
		return "리눅스 텍스트에어리어";
	}

}
