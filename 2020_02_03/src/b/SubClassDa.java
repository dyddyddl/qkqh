package b;

public class SubClassDa extends SuperClassDa {
	private int age=10;
	private String addr="�⺻��";
		
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
		System.out.println("���� : " + age + " �ּ� : " + addr);
		System.out.println("���� : " + super.getAge()+ " �ּ� : " + super.getAddr());
		System.out.println("�ּ� : " + getAddr());
		System.out.println("���� : " + gender);

	}
}
	//private ���ٽ� getter setter ����ؾ���
