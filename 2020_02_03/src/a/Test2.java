package a;

public class Test2 {
	
	static private int max;                      //static -> �����ڰ� ������ ���� �޸𸮻󿡼� ���!
	static public final int MIN = 13;
	//static public final int LAST; 
	static private final int FIRST;
	
	private final double rate; // final�� ���� ������ ����� �ٶ��� �������� �ڸ����� ����Ŀ� ���ؼ� ���� �־��൵ �ǰ�, static���� �ʱ�ȭ �ص� �ȴ�.
	
	static { // static ���� ���θ޼ҵ尡 ����Ǳ����� ������ �ȴ�. // static�� �Ӽ��� �ʱ�ȭ �ϰ������ static���� ����Ѵ�. // final�Ӽ��� ����
			 // �ν��Ͻ��� ��������°Ͱ� ������� �ѹ�!
		max = 999;
		FIRST = MIN/3;
		method();
		System.out.println(max);
	}
	
	public Test2() {  // ������ : �ν��Ͻ��� ��������� �������� ��ó�� �ؾ��ϴ� ������ ������ �ִ°�, ������ ȣ���̵Ǿ����� ó���� ������ ������ �ִ°�
		 			  // �ν��Ͻ��� ���������!
		max = 789;
		//LAST = 31;
		//FIRST = 1; //final ���ΰ��� �����ڿ��� ������� ���ƶ�!
		rate = MIN*9.9;
	}
	
	static public void method() {
		
		System.out.println("static�� method");
	}
	
	public static void main(String[] args) {  // main�� static�޼ҵ庸�� ���߿� ����ȴ�. //���α׷��� ���۰� ���� ��Ÿ����. 
		// TODO Auto-generated method stub
		max = 79;
		System.out.println(max);
		//System.out.println("main method");		
	}
}
