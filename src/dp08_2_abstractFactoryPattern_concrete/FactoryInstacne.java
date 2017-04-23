package dp08_2_abstractFactoryPattern_concrete;

import dp08_2_abstractFactoryPattern_abst.GuiFactory;
import dp08_2_abstractFactoryPattern_abst.MyButton;
import dp08_2_abstractFactoryPattern_abst.MyTextArea;

public class FactoryInstacne {

	public static GuiFactory getGuiFac() {

		// 자바 자체 os조사 함수를 이용해서 쓰고있는 os를 알아맞추자
		// 운영체제에 따라 main의 소스가 달라지지 않아도 된다.
		switch (getOsCode()) {
		case 0:
			return new MacGuiFac();
		case 1:
			return new WinGuiFac();
		case 2:
			return new LinuxGuiFac();
		default:
			return null;
		}

	}

	private static int getOsCode() {
		String osName = System.getProperty("os.name");
		if (osName.equals("Mac OS X")) {
			return 0;
		} else if (osName.equals("Windows 10")) {
			return 1;
		}
		return 0;
	}
}


//로직에 접근할 수 없게 default로 선언해준다.
class LinuxGuiFac implements GuiFactory{

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

class LinuxMyButton implements MyButton{

	public void click() {
		System.out.println("리눅스 버튼");
	}

}

class LinuxMyTextArea implements MyTextArea{

	public String getMyText() {
		return "리눅스 텍스트에어리어";
	}

}

class MacGuiFac implements GuiFactory{

	@Override
	public MyButton createButton() {
		//맥관련 버튼 알고리즘
		
		return new MacMyButton();
	}

	@Override
	public MyTextArea createArea() {
		return new MacMyTextArea();
	}

}

class MacMyButton implements MyButton{

	public void click() {
		System.out.println("맥 버튼");
	}

}

class MacMyTextArea implements MyTextArea{

	public String getMyText() {
		return "맥 텍스트에어리어";
	}

}

class WinGuiFac implements GuiFactory{

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

class WinMyButton implements MyButton{

	public void click() {
		System.out.println("윈도우 버튼");
	}

}

class WinMyTextArea implements MyTextArea{

	public String getMyText() {
		return "윈도우 텍스트에어리어";
	}

}

