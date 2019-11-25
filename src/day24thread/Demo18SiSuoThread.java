package day24thread;

/*
 *  多线程同步的时候, 如果同步代码嵌套, 使用相同锁, 就有可能出现死锁
	* 尽量不要嵌套使用
		*ming获得了s1,等待获取s2,不过s2对象被an占有了
		*an获取了s2,等待s1,不过s1对象被s2占有了
		*an和ming都不让出对象，所以都不能执行完，叫做死锁
 * */
public class Demo18SiSuoThread {
	// main()方法为static方法，访问的成员变量必须是static修饰的变量
	private static String s1 = new String("s1");
	private static String s2 = new String("s2");

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				this.setName("ming");
				synchronized (s1) {
					while (true) {
						System.out.println(getName() + "获取s1,等待s2");
						synchronized (s2) {
							System.out.println(getName() + "获取s2,开吃");
						}
					}
				}
			}
		}.start();

		new Thread() {
			public void run() {
				this.setName("an");
				synchronized (s2) {
					while (true) {
						System.out.println(getName() + "获取s2,等待s1");
						synchronized (s1) {
							System.out.println(getName() + "获取s1,开吃");
						}
					}
				}
			}
		}.start();
	}
}
