package HomeWork;

public class Task {

	// After completing below task it will gives you enough confidence when you
	// build your own logic.

	/*
	 * 01.Create a method with no arguments; 02.Create a method which return void;
	 * 03.Create a method which return a boolean value; 04.Create a method with one
	 * parameter Data type is integer; 05.Create a method with Two parameter Data
	 * type is String; 06.Create a method with Two parameter Data type is integer
	 * and String; 07.Create a method with Three parameter Data type is integer,
	 * String , boolean; 08.Create a method which accept two integer arguments and
	 * return sum of those two integer; 09.Create a method which accept two string
	 * arguments and return boolean value; 10.Print 1 to 10 using while loop;
	 */

	// All of you have to finish below task before next
	// class.(08/08/2022-12.08.2022)
	/*
	 * Problem:- 11. Given a string and a non-negative int n, return a larger string
	 * that is n copies of the original string. Example below : stringTimes("Hi", 2)
	 * → "HiHi" stringTimes("Hi", 3) → "HiHiHi" stringTimes("Hi", 1) → "Hi"
	 */
	public static String problem_11(String s, int a) {

		String newOne = "";
		for (int i = 0; i < a; i++) {
			newOne = newOne + s;
		}
		return newOne;
	}

	/*
	 * Problem:-12 Given a string, we'll say that the front is the first 3 chars of
	 * the string, If the string length is less than 3, the front is whatever is
	 * there, Return a new string which is 3 copies of the front. Example below :
	 * front3("Java") → "JavJavJav" front3("Chocolate") → "ChoChoCho" front3("abc")
	 * → "abcabcabc"
	 */
	public static String problem_Twelve(String str) {

		String front;
		if (str.length() <= 0) {
			front = str.substring(0, 3);
		} else {
			front = str;
		}
		return front + front + front;
	}

	/*
	 * Problem:-13 Given a string, take the last char and return a new string with
	 * the last char added at the front and back, so "cat" yields "tcatt". The
	 * original string will be length 1 or more. backAround("cat") → "tcatt"
	 * backAround("Hello") → "oHelloo" backAround("a") → "aaa
	 */
	public static String problem_thirteen(String str) {
		String last = str.substring(str.length() - 1);
		String front = last + str + last;
		return front;
	}

	/*
	 * Problem-14 Return true if the given non-negative number is a multiple of 3 or
	 * a multiple of 5. Use the % "mod" operator or35(3) → true or35(10) → true
	 * or35(8) → false
	 */
	public static boolean problem_Fourteen(int x) {
		if (x % 3 == 0 || x % 5 == 0) {
			return true;
		} else
			return false;
	}

	/*
	 * Problem :-15 Given a string, take the first 2 chars and return the string
	 * with the 2 chars added at both the front and back, so "kitten"
	 * yields"kikittenki". If the string length is less than 2, use whatever chars
	 * are there. front22("kitten") → "kikittenki" front22("Ha") → "HaHaHa"
	 * front22("abc") → "ababcab"
	 */
	public static String problem_Fifteen(String str) {

		String newStr;
		if (str.length() <= 2) {
			newStr = str + str + str;
		} else {
			String s = str.substring(0, 2);
			newStr = s + str + s;
		}
		return newStr;
	}
     /*Problem :-16
      * Given a string, if the string "del" appears starting at index 1, 
      * return a string where that "del" has been deleted. Otherwise, return the string unchanged.
        delDel("adelbc") → "abc"
        delDel("adelHello") → "aHello"
        delDel("adedbc") → "adedbc"
      */
	public static String problem_Sixteen(String str) {
		if (str.length()>=4 && str.substring(1,4).equals("del")) {
			return str.substring(0, 1) + str.substring(4);
		}else 
			return str;	
	}
	
	public static void main(String[] args) {

		// The method will return a new string which i am printing using
		System.out.println("inside problem 11 : -->  "+problem_11("hello", 3));
		System.out.println("inside problem 12 : -->  "+problem_Twelve("ja"));
		System.out.println("inside problem 13 : -->  "+problem_thirteen("J"));
		System.out.println("inside problem 14 : -->  "+problem_Fourteen(2));
		System.out.println("inside problem 15 : -->  "+problem_Fifteen("hello"));
		System.out.println("inside problem 16 : -->  "+problem_Sixteen("hello"));

	}

}
