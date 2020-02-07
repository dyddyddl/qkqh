package str;

public class ToStringTestUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringTest tt1 = new ToStringTest();
		ToStringTest tt2 = new ToStringTest("최말자", 18);
		
		Test1 test1 = new Test1();
		System.out.println(tt1);
		System.out.println(tt2);
		System.out.println(test1);
		
		
		//toString() == overiding
		//println(인스턴스(레퍼런스명))를 써주면 toString()을 자동으로 호출한다.
	
	}
}
