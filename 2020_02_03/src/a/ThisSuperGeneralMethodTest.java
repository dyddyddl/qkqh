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
		this();          //�ΰ����� ���� ���� ��, �����ڿ��� �Ϲ� �޼ҵ带 ȣ���ϵ��� �����.
		//this("KimMalja","KimMalja".length());
	}
}

