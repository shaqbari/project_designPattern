package dp07_1_builderPattern;

//concretebuilder역할
public class LgGramBlueprint extends BluePrint {
	
	//private Computer computer;//abstract builder가 가질수도 있고, concrete builder가 가질수도 있다.
	private String cpu;
	private String ram;
	private String storage;
	
	
	public LgGramBlueprint() {
		//computer=new Computer("default", "default", "default");
	
	}
	
	@Override
	public void setCpu() {
		//computer.setCpu("i7");
		cpu="i7";
	}

	@Override
	public void setRam() {
		//computer.setRam("8g");
		ram="8g";
	}

	@Override
	public void setStorage() {
		//computer.setStorage("256 ssd");
		storage="256g ssd";
	}

	public Computer getComputer() {
		//return computer;
		return new Computer(cpu, ram, storage);	//이런식으로 해도된다.	
	}

}
