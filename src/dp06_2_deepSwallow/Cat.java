package dp06_2_deepSwallow;

public class Cat implements Cloneable{
	
	private String name;
	private Age age;
	
	public Cat copy() throws CloneNotSupportedException{
		Cat cat=(Cat)this.clone();
		
		//�̷��� �������縦 ��þ����ָ� Age�� set�޼ҵ� ���� �������簡 �ȴ�.
		cat.setAge(new Age(this.age.getYear(), this.age.getValue()));
		
		return cat;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(Age age) {
		this.age = age;
	}
	
	public Age getAge() {
		return age;
	}
}
