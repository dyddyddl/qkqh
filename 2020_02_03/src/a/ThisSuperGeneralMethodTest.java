package a;

public class ThisSuperGeneralMethodTest extends MySuper{
		
	public ThisSuperGeneralMethodTest() {
		System.out.println("&&&&&&&&&&&&&&&&&&");
		System.out.println("******************");
	}
	
	public ThisSuperGeneralMethodTest(String str, int n) {
		for(int i=1; i<=n; i++){
			System.out.println(str);
		}
	}
	
	public ThisSuperGeneralMethodTest(String str) {
//		for(int i=1; i<=str.length(); i++){			
//			System.out.println(str);
//		}
		this();          //두가지를 쓰고 싶을 때, 생성자에서 일반 메소드를 호출하도록 만든다.
		//this("KimMalja","KimMalja".length());
	}
}

