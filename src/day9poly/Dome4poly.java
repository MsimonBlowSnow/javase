package day9poly;

public class Dome4poly {
	public static void main(String[] args) {
		father4 a=new son4();
		a.show2();//lajison 子类默认有一个同样的show()
	}
}

class son4 extends father4{
	public void show2() {
		System.out.println("lajison");
	}
}

class father4{
	public void show() {
		show2();
	}
	public void show2() {
		System.out.println("lajifu");
	}
}
