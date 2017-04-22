package dp02_adapterPattern;

public class Main {

	public static void main(String[] args) {
		Adapter adapter=new AdapterImp();
		
		System.out.println(adapter.twiceof(100f));
		System.out.println(adapter.halfof(100f));
	}

}
