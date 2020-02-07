package b;

public class SuperClassDa {
	private int age = 99;
	private String addr="강남구 삼성로";
	protected char gender = 'm';
	
	public void m1() {
		System.out.println("Super의 m1 메소드 age의 값은? " + age + " addr" + addr);
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void m2() {
		
	}
	
	public void m2(int n) {
		
	}
	
	public void output() {
		
	}	
}
