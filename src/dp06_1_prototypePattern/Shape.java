package dp06_1_prototypePattern;

public class Shape implements Cloneable{
	//클론너블 인터페이스는 오브젝트 클래스에 이미 정의되어 있다.
	
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
}
