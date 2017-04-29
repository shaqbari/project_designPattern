package dp14_facadePattern.system;

class HelpSystem02 {//public 빼면 default로 지정되어 패키지 내에서만 접근 가능
	public HelpSystem02() {
		System.out.println("Call Constructor :"+getClass().getName());
	}

	public void process(){
		System.out.println("Call Process : "+getClass().getName());
		
	}
	
}
