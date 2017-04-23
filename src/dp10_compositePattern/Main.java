package dp10_compositePattern;

public class Main {
	private static void show(MyComponent component){
		System.out.println(component.getClass().getName()+"|"+component.getName());
		if (component instanceof MyFolder) {
			for (MyComponent c : ((MyFolder)component).getChildren()) {
				show(c);//재귀적으로 호출되면서 탐색이 된다.
			}
		}
	};
	
	
	public static void main(String[] args) {
		MyFolder 
		root=new MyFolder("root"),
		home=new MyFolder("home"),
		garam=new MyFolder("home"),
		music=new MyFolder("music"),
		picture=new MyFolder("picture"),
		doc=new MyFolder("doc"),
		usr=new MyFolder("usr");
		
		MyFile
		track1=new MyFile("track1"),
		track2=new MyFile("track2"),
		pic1=new MyFile("pic1"),
		doc1=new MyFile("doc1"),
		java=new MyFile("java");
		
		root.addComponent(home);
			home.addComponent(garam);
				garam.addComponent(music);
					music.addComponent(track1);
					music.addComponent(track2);
				garam.addComponent(picture);
					picture.addComponent(pic1);
				garam.addComponent(doc);
					doc.addComponent(doc1);
		root.addComponent(usr);
			usr.addComponent(java);
		
		show(root);
	}

}
