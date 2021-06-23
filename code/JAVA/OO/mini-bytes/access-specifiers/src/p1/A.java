package p1;

public class A {

	public static int pubSta = 5;

	private int pri = 1;
	int de = 2;
	protected int pro = 3;
	public int pub = 4;

	public void aInstanceMethod() {

		System.out.println(pri);
		System.out.println(de);
		System.out.println(pro);
		System.out.println(pub);

		System.out.println(pubSta);
	}

}
