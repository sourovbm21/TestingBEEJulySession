package Java;

public class ImmutableString {

	public static void main(String[] args) {

		
		String s ="abc";
		System.out.println(s);
		String y ="abc";
		System.out.println(s.concat(y));
		s = s.concat(y);
		System.out.println(s);
	
	
		
		

		
	}

}
