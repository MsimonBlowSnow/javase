package day24thread;
/*yield�ó�cpu
 * �ó�cpu����һ��ִ��
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
				this.yield();//�ó�cpu
			}
			System.out.println(i+this.getName());
		}
	}
}