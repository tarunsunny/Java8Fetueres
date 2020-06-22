package cpm.marlabs.Strong;

public class TestStrin3 {

	public static void main(String[] args) {
		String s1 = "IRFAN";
		String s2 = " irfan ";
		System.out.println(s1.equals(s2));
		System.out.println("====");
		System.out.println(s1.equals(s2.toUpperCase()));
		System.out.println(s1.toLowerCase());
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println("=======");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("done");
		System.out.println("2**************************************");
		System.out.println(2 + 4);
		System.out.println(2 + "irfan");
		System.out.println("irfan" + null);
		System.out.println("irfan" + 2 + null);
		//System.out.println(null+null);
		System.out.println("3**************************************");
		String s0 = null;
		System.out.println(s0.charAt(0));


	}

}
