/**
 * 
 */
package apad;

/**
 * @author Gil
 *
 */
public class CombineTwoList {

	/**
	 * 
	 */

	static List numbers = new List();
	static List alpha = new List();
	static List results = new List();

	public CombineTwoList() {
		// TODO Auto-generated constructor stub
	}

	public static void options() {
		System.out.println("1 to ");
	}

	/**
	 * @param args
	 * @throws ListException
	 */
	public static void main(String[] args) throws ListException {
		// TODO Auto-generated method stub3
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		Object temp, temp2;
		for (int count = 0; count < alphabets.length(); count++) {

			numbers.enqueue(count);

		}
		for (int count = 0; count < alphabets.length(); count++) {

			alpha.enqueue(alphabets.charAt(count));

		}
		/*
		 * for(int count =0;count<alphabets.length();count++){ temp =
		 * numbers.peek(); results.enqueue(temp); //numbers.dequeue(); temp =
		 * (Object)alpha.toString().charAt(count); //results.enqueue(temp); }
		 */
		System.out.println(alpha);
		System.out.println(numbers);

		//System.out.println(results);

	}
}