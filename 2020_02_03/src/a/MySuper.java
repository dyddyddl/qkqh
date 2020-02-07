package a;

public class MySuper {
	public MySuper() {
		this(1,3);
		
//		for(int i=0; i<=10; i++) {
//			System.out.println("/////////////////");
//			System.out.println("^^;");
//		}
	}
	
	public MySuper(int end) {
		this(1,end);
		
		for(int i=0; i<=end; i++) {
			System.out.println("/////////////////");
			System.out.println("^^;");
		}
	}
	
	public MySuper(int start, int end) {
		for(int j=start; j<=end; j++) {
			System.out.println("/////////////////");
			System.out.println("^^;");
		}
	}
}
