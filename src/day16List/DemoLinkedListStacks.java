package day16List;

import java.util.LinkedList;

public class DemoLinkedListStacks {
	LinkedList a=new LinkedList();
	public void stacksIn(Object c) {
		a.addFirst(c);
	}
	
	public Object stacksOut() {
		if(!isEmpty())
			return a.removeFirst();
		return null;
	}
	private boolean isEmpty() {
		return a.isEmpty();
	}
	public void stacksToString() {
		System.out.println(a);
	}
}
