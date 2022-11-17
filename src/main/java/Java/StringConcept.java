package Java;

public class StringConcept {

	public static void main(String[] args) {

		/*
		 * 
		 * Two ways to create string String literal etc : String s =
		 * "i like automating software"; by using new memory operator. etc : String st =
		 * new String("like automating software"); Using String buffer and String
		 * builder
		 * 
		 */

		// please do your own
		// do one step at a time .

		String str = "We are learning java";
		System.out.println("Total length of \"We are learning java\" " + str.length());
		System.out.println(str.charAt(2));
		System.out.println("i am first occarance " + str.indexOf("a"));// First occurance.
		System.out.println("i am second occarance " + str.indexOf("a", str.indexOf("a") + 1));
		System.out.println("i am 3rd  occarance " + str.indexOf("a", str.indexOf("a", str.indexOf("a") + 1)));
		System.out.println("i am last occarance " + str.lastIndexOf("a"));

		// String concatination

		String s = "tohidur";
		String r = "rahman";

		s.concat(r);// it will add tohidur + rahman
		System.out.println(s.concat(r));

		// Substring //"We are learning java";//+111-0000-34567
		str.substring(0, 5);
		s.length();//
		System.out.println("########" + s.length());
		System.out.println(s.substring(1, s.length() - 1));
		System.out.println(str.substring(4, 14)); // i will cut from 4th index to before 14th index on that given
													// string.

		// String comparison
		String s1 = "sourov.";
		String s2 = "rahman";

		s1.equals(s2);// ==

		System.out.println("#########################");
		String xx = "java";
		String yy = "java";
		System.out.println("using equals method @@@@: " + xx.equals(yy));// value
		System.out.println("using equal to  : @@@@@@###" + xx == yy);// ref variable

		System.out.println("#########################");

		System.out.println("using equals method : " + s1.equals(s2));// t/f/f
		System.out.println("using equal to sign : " + s1 == s2);// t/f/f
		System.out.println(s1.equalsIgnoreCase(s2));// t/t/f

		String pp = "Java";
		String qq = "Selenium";
		String yyy = "learning";
		pp.concat(qq);
		pp.concat(yyy);
		System.out.println("@@@@@@@@@@@@@@@@@??" + pp.concat(qq));
		System.out.println("@@@@@@@@@@@@@@@@@" + pp.concat(yyy));
		// trim
		String p = "      i am on train ";
		System.out.println("before trim :" + p);
		String p1 = p.trim();// i am on train
		System.out.println("after trim :" + p1);
		// Split
		// javalearning//ava,earning
		/*
		 * Split method will return an arry of String.
		 */
		String x = "java learning class";
		String sarry[] = x.split(" ");// "java" , "learning" , "class"
		for (int i = 0; i < sarry.length; i++) {
			System.out.println("inside loop and printin an array :---> " + sarry[i]);
		}
		// task

		String w = "java ";
		String y = "learning";
		int a = 2;
		int b = 3;

		System.out.println(w + y);// java learning

		System.out.println(a + b);// 5
		System.out.println(w + y + a + b); // java learning23
		System.out.println(a + b + w + y);// 5java learning//23//
		System.out.println(w + y + (a + b)); //

		// Prove given number is a positive number.
		int bc = 10;// -10

		if (bc >= 0) {
			System.out.println("yes it is positive number " + bc);// 5
		} else {
			System.out.println("yes it is negative  number " + bc);// 5
		}

		// String Buffer @ String builder

		StringBuffer sb = new StringBuffer("Java learning ");

		System.out.println(sb);

		for (int i = sb.length() - 1; i >= 0; i--) {

			System.out.print(sb.charAt(i));
		}

		// 1kg -$4.00
		// 1kg -$4.00
		// 1kg -$4.00

	}

}
