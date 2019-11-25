package day24thread;
/*yield让出cpu
 * 让出cpu让另一个执行
 */
public class Demo12Thread {
	public static void main(String[] args) {
		new Demo12().start();
		new Demo12().start();
	}
}

class Demo12 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			if(i%10==0) {
				this.yield();//让出cpu
			}
			System.out.println(i+this.getName());
		}
	}
}