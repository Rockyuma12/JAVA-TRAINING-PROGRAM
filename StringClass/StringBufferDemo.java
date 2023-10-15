package StringClass;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		//string buffer vs capacity
		StringBuffer buffer = new StringBuffer("Welcome");
		System.out.println("Buffer =" + buffer);
	   	System.out.println("length= "+buffer.length());
		System.out.println("capacity "+ buffer.capacity());
		
		
	   //appending and inserting into stringbuffer
	   String s;
	   int a= 45;
	   buffer = new StringBuffer(41);
	   
	   s= buffer.append("a=  ").append(a).append("!").toString();
	   System.out.println(s);
	   System.out.println(buffer);
	   
	   buffer = new StringBuffer("I JAVA!");
	   buffer.insert(2, "liked     ");
	   System.out.println(buffer);
	   
	   buffer.delete(7, 11);
	   System.out.println(buffer);
	   
	   System.out.println(buffer.reverse());
	}

}
	   
	   
	   
	   
	   	
		
	   	
	


	
