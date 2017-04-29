package dp14_facadePattern.system;

public class Fasade {
	private HelpSystem01 helpSystem01;
	private HelpSystem02 helpSystem02;
	private HelpSystem03 helpSystem03;
	
	
	public Fasade() {
		super();
		this.helpSystem01 = new HelpSystem01();
		this.helpSystem02 = new HelpSystem02();
		this.helpSystem03 = new HelpSystem03();
	}
	
	public void process(){
		helpSystem01.process();
		helpSystem02.process();
		helpSystem03.process();
		
	}
	
}
