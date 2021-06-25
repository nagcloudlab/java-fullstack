package example;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollnEx1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		String s1 = "Nag";
		String s2 = "Nag";
		String s3 = "Indu";
		String s4 = "Riya";
		String s5 = "Diya";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());

		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		System.out.println(set.size());
		
		for(String member:set) {
			System.out.println(member);
		}

	}

}
