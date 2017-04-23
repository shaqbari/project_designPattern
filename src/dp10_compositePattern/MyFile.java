package dp10_compositePattern;

public class MyFile extends MyComponent {
	
	public MyFile(String name) {
		super(name);
	}

	private Object data;
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}
	
}
