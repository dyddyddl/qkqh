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
		        //�ΰ����� ���� ���� ��, �����ڿ��� �Ϲ� �޼ҵ带 ȣ���ϵ��� �����.
		
	}
	
	//public���� ���ص� �ɲ�����! �ڱ�鳢�� ȣ���Ϸ��� �����!	
	private void out() {           //�޼ҵ带 ����� ������ �ߺ��Ǵ� �ڵ带 ���̱� ���ؼ� �̴�.
		System.out.println("&&&&&&&&&&&&&&&&&&");
		System.out.println("******************");
	}
	private void forOut(String str, int n) {
		for(int i=1; i<=n; i++){
			System.out.println(str);
		}
	}
}

