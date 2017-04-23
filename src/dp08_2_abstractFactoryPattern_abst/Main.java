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
		
		//�ü���� ���� �ٸ� �ü���� factory�� �Ⱥ����� �Ѵ�.!		
		//�Ʒ��Ͱ��� ����ϴ� �ü���� ���� �ڵ����� os�� �ν��Ͽ� guiFactory�̿��ϰ� ����� �ִ�.
		//�̷��� �ϸ� �ü���� ���� �ڵ尡 �޶����� �ʾƵ� �ȴ�.
		
		GuiFactory Fac=FactoryInstacne.getGuiFac();
		MyButton Button=Fac.createButton();
		MyTextArea Area=Fac.createArea();		
		Button.click();
		System.out.println(Area.getMyText());
		
		
	}

}
