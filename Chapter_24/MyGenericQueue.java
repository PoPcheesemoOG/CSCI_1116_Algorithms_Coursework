/* Name: Paul Helske
 * Date: 07/17/23
 */

import java.util.LinkedList;

public class MyGenericQueue<E> extends LinkedList<E> {
	public void enqueue(E e) {
		this.addLast(e);
	}
	public E dequeue() {
		return this.removeFirst();
	}
	public int getSize() {
		return this.size();
	}
	public static void main(String[] args) {
		MyGenericQueue queue = new MyGenericQueue();
		queue.enqueue("Bingo");
		queue.enqueue("Bango");
		queue.enqueue("Bongo");
		
		System.out.println(queue);
		
		queue.dequeue();
		queue.dequeue();
		
		System.out.println(queue);
	}
}