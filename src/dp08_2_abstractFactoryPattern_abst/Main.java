package dp08_2_abstractFactoryPattern_abst;

import dp08_2_abstractFactoryPattern_concrete.FactoryInstacne;

public class Main {

	public static void main(String[] args) {
		/*GuiFactory linuxFac=new LinuxGuiFac();
		MyButton linuxButton=linuxFac.createButton();
		MyTextArea linuxArea=linuxFac.createArea();		
		linuxButton.click();
		System.out.println(linuxArea.getMyText());
		
		GuiFactory MacFac=new MacGuiFac();		MyButton MacButton=MacFac.createButton();
		MyTextArea MacArea=MacFac.createArea();		
		MacButton.click();
		System.out.println(MacArea.getMyText());
		
		GuiFactory WinFac=new WinGuiFac();
		MyButton WinButton=WinFac.createButton();
		MyTextArea WinArea=WinFac.createArea();		
		WinButton.click();
		System.out.println(WinArea.getMyText());*/
		
		//운영체제에 따라 다른 운영체제의 factory는 안보여야 한다.!		
		//아래와같이 사용하는 운영체제에 따라 자동으로 os를 인식하여 guiFactory이용하게 만들수 있다.
		//이렇게 하면 운영체제에 따라 코드가 달라지지 않아도 된다.
		
		GuiFactory Fac=FactoryInstacne.getGuiFac();
		MyButton Button=Fac.createButton();
		MyTextArea Area=Fac.createArea();		
		Button.click();
		System.out.println(Area.getMyText());
		
		
	}

}
