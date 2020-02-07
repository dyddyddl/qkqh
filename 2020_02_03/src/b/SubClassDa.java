package b;

public class SubClassDa extends SuperClassDa {
	private int age=10;
	private String addr="기본값";
		
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
	
	public void output() {
		System.out.println("나이 : " + age + " 주소 : " + addr);
		System.out.println("기초 : " + super.getAge()+ " 주소 : " + super.getAddr());
		System.out.println("주소 : " + getAddr());
		System.out.println("성별 : " + gender);

	}
}
	//private 접근시 getter setter 사용해야함
