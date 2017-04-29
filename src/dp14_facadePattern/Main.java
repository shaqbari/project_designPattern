package dp14_facadePattern;

import dp14_facadePattern.system.Fasade;

public class Main {

	public static void main(String[] args) {
		Fasade fasade=new Fasade();
		fasade.process();
		
		//HelpSystem에는 접근할 수 없다.
	}

}
