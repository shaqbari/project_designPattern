package dp02_adapterPattern;

public class Math {
	//이미 있던 많이 배포된 유명란 라이브러리라고 가정하자
	
	//두배
	public static double twoTime(double num){
		return num*2;
	}
	
	//절반
	public static double half(double num){
		
		//System.out.println("half 함수 호출"); 여기다가 구현하면 보기싫은 사람도 써야한다.
		
		return num/2;
	}
	
	//강화된 알고리즘
	public static Double doubled(Double d){
		return d/2;
	}
}
