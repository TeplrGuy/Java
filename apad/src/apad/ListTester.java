/**
 * 
 */
package apad;

/**
 * @author Gil
 *
 */
public class ListTester {

	/**
	 * A class to test our ADT design
	 */
	
	static List numbers = new List();
	static List alpha = new List();
	static List results = new List();
	static List fibbinaci = new List();
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

		System.out.println(alpha);
		System.out.println(numbers);

		for(int count =0;count<alphabets.length();count++){
			results.enqueue(numbers.peek());
			numbers.dequeue();
			results.enqueue(alpha.peek());
			alpha.dequeue();
		}
		System.out.println(results);
		System.out.print("\n");
		System.out.println("Fibbinaci numbers");
		for (int i = 0; i < 20; i++) {
			System.out.println((fibbinaci.Fibbinaci(i)));
		}
		
		
	
	}
}