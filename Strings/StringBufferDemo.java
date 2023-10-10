package Strings;
import java.util.*;
public class StringBufferDemo {

	public static void main(String[] args) {
	
	   StringBuffer buffer = new StringBuffer("Hello");
	   System.out.println("Buffer:"+buffer);
	   System.out.println("Length of the buffer:"+buffer.length());
	   System.out.println("Buffer Capacity:" +buffer.capacity());
	   	
	//appending and inserting
	   String s;
	   int a=57;
	   buffer = new StringBuffer(40);
	   s=buffer.append("a=").append(a).append("!").toString();
	   System.out.println(s);
	   System.out.println(buffer);
	   
	   
		   

	}

}
