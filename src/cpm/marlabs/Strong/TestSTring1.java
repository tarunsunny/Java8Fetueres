package cpm.marlabs.Strong;

public class TestSTring1 {
public static void main(String[] args) {
	String s1 = " irfan ";
	String s2 = " irfan ";
	String s3 = new String(s1);
	String s4 = new String(s2);

	System.out.println(s4);
	System.out.println("------");
	System.out.println(s1 == s2);
	System.out.println(s3 == s4);
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));



}
}
