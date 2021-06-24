package example;

// topic : string methods

public class Example3 {

	public static void main(String[] args) {

		String str = "abcdefgh";

		int len = str.length();
		System.out.println(len);

		System.out.println(str.charAt(0));
		System.out.println(str.startsWith("abc"));
		System.out.println(str.startsWith("xyz"));
		System.out.println(str.contains("cde"));
		System.out.println(str.endsWith("fgh"));

		System.out.println(str.indexOf('c'));
		System.out.println(str.lastIndexOf('c'));
		System.out.println(str.indexOf("egf"));

		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		System.out.println(str.substring(4));
		System.out.println(str.substring(4, 6));
		System.out.println(str.replace('d', 'D'));

		String menu = "idly,vada,poori";
		String[] menuIItems = menu.split(",");
		for (int i = 0; i < menuIItems.length; i++) {
			System.out.println(menuIItems[i]);
		}

		String s1 = "Abc";  // 97 - 65 = 32
		String s2 = "abc";
		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equalsIgnoreCase(s2));

//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareToIgnoreCase(s2));
		
		String st="aabbca";
		System.out.println(st.replace('a', 'A'));
		
		String s="im Nag, 37 yrs old";
		String ss=s.replaceAll("[\\d]", "*");
		System.out.println(ss);
		
		
		//------------------------------------------------------------
		
		String x="123";
		String y="456";
		
		System.out.println(x+y);
		
		System.out.println(Integer.parseInt(x)+Integer.parseInt(y));
		

		//------------------------------------------------------------
		
		int pri=123;
		String string=String.valueOf(pri);
		
		//------------------------------------------------------------	
		
		int amt=1234;
		System.out.println(amt); // 0012
		
		String out=String.format("%05d", amt);
		System.out.println(out);
		
		
	}

}
