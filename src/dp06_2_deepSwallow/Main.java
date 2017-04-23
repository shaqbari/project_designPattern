package dp06_2_deepSwallow;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat navi=new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012, 3));
		
		//Cat yo=navi;//얕은복사: navi의 주소값을  yo의 주소값으로 복사 밑에서 둘다 yo로나온다.
		Cat yo=navi.copy();//둘은 다른 이름을 가지게 된다.
		yo.setName("yo");
		//yo.setAge(new Age(2015, 1)); 둘은 다르게 출력된다. 깊은복사
		
		//cat에서 깊은복사 명시 안하면 Age의set메소드 이용시 얕은복사가 되어버린다.
		yo.getAge().setYear(2013); //둘다 2013이 출력된다. 얕은복사
		yo.getAge().setValue(2);//얕은복사
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		
		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
		
		System.out.println(navi.getAge().getValue());
		System.out.println(yo.getAge().getValue());
		
	
	}

}
