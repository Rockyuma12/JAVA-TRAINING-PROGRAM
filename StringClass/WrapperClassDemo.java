package StringClass;

public class WrapperClassDemo {

	public static void main(String[] args) {
	
		//unboxing
		Integer i = new Integer(20);
		System.out.println(i);
		
		int c = i.intValue();
		System.out.println(c);
		
		//without using intvalue
		int d = i;
		System.out.println(d);
		
		
		
		
	}

}
