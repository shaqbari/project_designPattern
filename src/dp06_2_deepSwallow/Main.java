package dp06_2_deepSwallow;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat navi=new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012, 3));
		
		//Cat yo=navi;//��������: navi�� �ּҰ���  yo�� �ּҰ����� ���� �ؿ��� �Ѵ� yo�γ��´�.
		Cat yo=navi.copy();//���� �ٸ� �̸��� ������ �ȴ�.
		yo.setName("yo");
		//yo.setAge(new Age(2015, 1)); ���� �ٸ��� ��µȴ�. ��������
		
		//cat���� �������� ��� ���ϸ� Age��set�޼ҵ� �̿�� �������簡 �Ǿ������.
		yo.getAge().setYear(2013); //�Ѵ� 2013�� ��µȴ�. ��������
		yo.getAge().setValue(2);//��������
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		
		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
		
		System.out.println(navi.getAge().getValue());
		System.out.println(yo.getAge().getValue());
		
	
	}

}
