package dp08_2_abstractFactoryPattern_concrete;

import dp08_2_abstractFactoryPattern_abst.GuiFactory;
import dp08_2_abstractFactoryPattern_abst.MyButton;
import dp08_2_abstractFactoryPattern_abst.MyTextArea;

public class FactoryInstacne {

	public static GuiFactory getGuiFac() {

		// �ڹ� ��ü os���� �Լ��� �̿��ؼ� �����ִ� os�� �˾Ƹ�����
		// �ü���� ���� main�� �ҽ��� �޶����� �ʾƵ� �ȴ�.
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


//������ ������ �� ���� default�� �������ش�.
class LinuxGuiFac implements GuiFactory{

	@Override
	public MyButton createButton() {
		//���������� ��ư �˰���
		
		return new LinuxMyButton();
	}

	@Override
	public MyTextArea createArea() {
		return new LinuxMyTextArea();
	}

}

class LinuxMyButton implements MyButton{

	public void click() {
		System.out.println("������ ��ư");
	}

}

class LinuxMyTextArea implements MyTextArea{

	public String getMyText() {
		return "������ �ؽ�Ʈ�����";
	}

}

class MacGuiFac implements GuiFactory{

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

class MacMyButton implements MyButton{

	public void click() {
		System.out.println("�� ��ư");
	}

}

class MacMyTextArea implements MyTextArea{

	public String getMyText() {
		return "�� �ؽ�Ʈ�����";
	}

}

class WinGuiFac implements GuiFactory{

	@Override
	public MyButton createButton() {
		//��������� ��ư �˰���
		
		return new WinMyButton();
	}

	@Override
	public MyTextArea createArea() {
		return new WinMyTextArea();
	}

}

class WinMyButton implements MyButton{

	public void click() {
		System.out.println("������ ��ư");
	}

}

class WinMyTextArea implements MyTextArea{

	public String getMyText() {
		return "������ �ؽ�Ʈ�����";
	}

}

