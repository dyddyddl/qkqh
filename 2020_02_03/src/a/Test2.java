package a;

public class Test2 {
	
	static private int max;                      //static -> 생성자가 나오기 전에 메모리상에서 잡아!
	static public final int MIN = 13;
	//static public final int LAST; 
	static private final int FIRST;
	
	private final double rate; // final에 대한 변수를 만들어 줄때는 생성자의 자리에서 연산식에 의해서 값을 넣어줘도 되고, static으로 초기화 해도 된다.
	
	static { // static 블럭은 메인메소드가 실행되기전에 실행이 된다. // static한 속성을 초기화 하고싶을때 static블럭을 사용한다. // final속성도 가능
			 // 인스턴스가 만들어지는것과 상관없이 한번!
		max = 999;
		FIRST = MIN/3;
		method();
		System.out.println(max);
	}
	
	public Test2() {  // 생성자 : 인스턴스가 만들어지는 시점에서 맨처음 해야하는 로직을 가지고 있는것, 스스로 호출이되어져서 처리할 문장을 가지고 있는것
		 			  // 인스턴스가 만들어질때!
		max = 789;
		//LAST = 31;
		//FIRST = 1; //final 적인것은 생성자에서 사용하지 말아라!
		rate = MIN*9.9;
	}
	
	static public void method() {
		
		System.out.println("static한 method");
	}
	
	public static void main(String[] args) {  // main이 static메소드보다 나중에 실행된다. //프로그램의 시작과 끝을 나타낸다. 
		// TODO Auto-generated method stub
		max = 79;
		System.out.println(max);
		//System.out.println("main method");		
	}
}
