package dp07_1_builderPattern;


//Director¿ªÇÒ
public class ComputerFactory {
	BluePrint bluePrint;
	
	
	public void setBlueprint(BluePrint bluePrint) {
		this.bluePrint=bluePrint;
	}


	public void make() {		
		bluePrint.setCpu();
		bluePrint.setRam();
		bluePrint.setStorage();
		
	}


	public Computer getComputer() {
		
		return bluePrint.getComputer();
	}
	
}
