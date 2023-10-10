package Set;
import java.util.*;
public class SetDemo {
	
	public static void main(String args [])
	{
		Set<Integer>s= new HashSet<Integer>();
		s.add(30);
		s.add(40);
		s.add(21);
		s.add(14);
		s.add(18);
		System.out.println(s);
		
	}

}


//* Set
// * -No duplicates allowed
 //*-since set is an interface we can't create the objects of it
 //* Hashset - hashing
 //* LinkedHahset - Doubly linked list
