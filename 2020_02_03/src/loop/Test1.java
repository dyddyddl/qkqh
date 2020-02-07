package loop;

public class Test1 {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		
		for(a=1; a<=10; a++) {
			System.out.print(a+" ");
		}
		
		System.out.println("\n for A : " + a);
		System.out.println("----------------------");
		while(b <= 10) {			
			System.out.print(b+" ");
			b++;
		}		
		
		System.out.println("\n while B : " + b);
	}
}
