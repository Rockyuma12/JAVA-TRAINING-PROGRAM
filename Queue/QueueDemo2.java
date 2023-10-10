package Queue;
import java.util.*;
public class QueueDemo2 {
	
	public static void main(String[] args) {
	       
		Queue<String> queue= new LinkedList<>();
		queue.add("a");
		queue.add("b");
		queue.add("c");
		queue.add("d");
		
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element +"" +element +"");
		}
		System.out.println();
		{
			System.out.println("null");
			
		}
		
	}
}	
		
		
		


