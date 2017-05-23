/**
 * 
 */
package apad;

/**
 * @author Gil
 *
 */
public interface ListInterface {

	public void dequeue() throws ListException;
	public Object peek() throws ListException;
	public boolean isEmpty();
	public int size();
	public void enqueue(Object newItem) throws ListException;
	//public void combine(Object newItem) throws ListException;
	public void deueueAll() throws ListException;
	public String toString();
	
	
}
