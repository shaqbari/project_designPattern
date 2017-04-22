package dp02_adapterPattern;

public class AdapterImp implements Adapter {
	//Math math;
	
	//엄청 복잡한 로직(예: 이미지처리)을 유명한 라이브러리에서 조금만 바꿔 내가 쓸수 있게 할 수도 있다.
	//list --> (arr --> sort --> arr) -->list
	
	public Float twiceof(Float f) {
		
		//return (float)Math.twoTime(f.doubleValue());
		
		 //adapter안건들고 쉽게 알고리즘 교체가능
		return Math.doubled(f.doubleValue()).floatValue();
	}

	public Float halfof(Float f) {
		
		System.out.println("절반 함수 호출");//Math안건들고 기능추가가능
		return (float)Math.half(f.doubleValue());
	}

}
