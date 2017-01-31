
public class StringMethods {

	public static boolean endsWithRep(String s1, String s2, int n){
		String suffix = new String();
		for (int i = 0; i < n; i++) {
			suffix += s2;
		}
		return s1.endsWith(suffix);
	}
	
	public static void main(String[] args) {
		System.out.print("StringMethods Exercise: we want to check if a string ends with a"
				+ " particular repetition of a certain string\n\n"
				+ "First case: \"foobarbar\", \"bar\", 2\n");
		if (endsWithRep("foobarbar", "bar", 2))
			System.out.println("true");
		else System.out.println("false");
		
		System.out.println("Second case: \"foobarbar\", \"baz\", 1");
		if (endsWithRep("foobarbar", "baz", 1))
			System.out.println("true");
		else System.out.println("false");
	}
}

/******************************************Code Testing************************************

StringMethods Exercise: we want to check if a string ends with a particular repetition of a 
certain string

First case: "foobarbar", "bar", 2
true
Second case: "foobarbar", "baz", 1
false

********************************************************************************************/