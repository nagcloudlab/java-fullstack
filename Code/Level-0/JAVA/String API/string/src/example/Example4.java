package example;

public class Example4 {

	public static void main(String[] args) {

//		StringBuffer buffer=new StringBuffer();
//		buffer.append("a");
//		buffer.append("b");

		StringBuilder builder = new StringBuilder();
		builder.append("a");
		builder.append("b");

		String s = builder.toString();
		System.out.println(s);

	}

}
