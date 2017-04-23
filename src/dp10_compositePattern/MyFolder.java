package dp10_compositePattern;


import java.util.ArrayList;
import java.util.List;

public class MyFolder extends MyComponent {
	List<MyComponent> children = new ArrayList<MyComponent>();
	
	public MyFolder(String name) {
		super(name);
	}

	
	public boolean addComponent(MyComponent component){
		return children.add(component);
	}
	
	public boolean removeComponent(MyComponent component){
		return children.remove(component);
	}


	public List<MyComponent> getChildren() {
		return children;
	}
	
}
