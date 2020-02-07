package a;

public class ThisSuperGeneralMethodTest2 extends MySuper{
		
	public ThisSuperGeneralMethodTest2() {
		out();
	}
	
	public ThisSuperGeneralMethodTest2(String str, int n) {
		out();
		forOut("KimMalja","KimMalja".length());
	}
	
	public ThisSuperGeneralMethodTest2(String str) {
//		for(int i=1; i<=str.length(); i++){			
//			System.out.println(str);
//		}
		        //두가지를 쓰고 싶을 때, 생성자에서 일반 메소드를 호출하도록 만든다.
		
	}
	
	//public으로 안해도 될꺼같다! 자기들끼리 호출하려고 만든다!	
	private void out() {           //메소드를 만드는 이유는 중복되는 코드를 줄이기 위해서 이다.
		System.out.println("&&&&&&&&&&&&&&&&&&");
		System.out.println("******************");
	}
	private void forOut(String str, int n) {
		for(int i=1; i<=n; i++){
			System.out.println(str);
		}
	}
}

