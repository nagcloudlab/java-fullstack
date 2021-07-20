package example;

public class Quiz {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("A");
		sb1.append("B");
		StringBuffer sb2 = sb1;
		sb1.append("C");
		sb1 = sb2;
		StringBuffer sb3 = sb2;
		sb3.append("D");
		sb3 = sb1;

		System.out.println(sb1 == sb2);
		System.out.println(sb1 == sb3);
		System.out.println(sb2 == sb3);

		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(sb3));
		System.out.println(sb2.equals(sb3));

	}

}
