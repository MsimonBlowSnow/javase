package day16List;

import java.util.LinkedList;

public class DemoLinkedListQueue {
	private LinkedList a= new LinkedList();
	private boolean isEmpty() {
		return a.isEmpty();
	}
	
	public void QueueIn(Object c) {
		a.addLast(c);
	}
	public Object QueueOut() {
		if(!isEmpty())
			return a.removeFirst();
		return null;
	}
	
	public void queueToString() {
		System.out.println(a);
	}
}
