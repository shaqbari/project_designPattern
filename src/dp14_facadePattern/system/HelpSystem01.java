package dp14_facadePattern.system;

class HelpSystem01 {//public 빼면 default로 지정되어 패키지 내에서만 접근 가능
	public HelpSystem01() {
		System.out.println("Call Constructor :"+getClass().getName());
		//엄청 복잡한 로직이라 가정
	
	}

	public void process(){
		System.out.println("Call Process : "+getClass().getName());
		
	}
	
}
