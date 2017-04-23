package dp08_2_abstractFactoryPattern_abst;

public interface GuiFactory {
	public MyButton createButton();
	public MyTextArea createArea();
}
