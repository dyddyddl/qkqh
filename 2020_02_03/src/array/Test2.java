package array;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3[] test3s = new Test3[3];
	
		
		for(int i=0; i<test3s.length; i++) {
			
			test3s[i] = new Test3("aaa","ddd");
		}
		
		for(int i=0; i<test3s.length; i++) {
			System.out.println(test3s[i]);
		}
	}

}


class Test3 {
	
	String name;
	String addr;
	
	
	public Test3(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	
	

	@Override
	public String toString() {
		return "Test3 [name=" + name + ", addr=" + addr + "]";
	}	
}