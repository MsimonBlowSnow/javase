package day15jihe;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
/* vector在被List替代
 * Enumeration方法：
 * hasMoreElement();相当于Iterator中hasNext();
 * 和 nextElement();相当于next();
 * */
public class DemoVector {
	public static void main(String[] args) {
		Vector a =new Vector();
		a.addElement("a");
		a.addElement("b");
		a.addElement("c");
		a.addElement("d");
		Enumeration c=a.elements();
		while(c.hasMoreElements()) {
			System.out.println(c.nextElement());
		}
		
	}
}
