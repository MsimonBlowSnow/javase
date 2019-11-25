package day24thread;

/*
 *  ���߳�ͬ����ʱ��, ���ͬ������Ƕ��, ʹ����ͬ��, ���п��ܳ�������
	* ������ҪǶ��ʹ��
		*ming�����s1,�ȴ���ȡs2,����s2����anռ����
		*an��ȡ��s2,�ȴ�s1,����s1����s2ռ����
		*an��ming�����ó��������Զ�����ִ���꣬��������
 * */
public class Demo18SiSuoThread {
	// main()����Ϊstatic���������ʵĳ�Ա����������static���εı���
	private static String s1 = new String("s1");
	private static String s2 = new String("s2");

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				this.setName("ming");
				synchronized (s1) {
					while (true) {
						System.out.println(getName() + "��ȡs1,�ȴ�s2");
						synchronized (s2) {
							System.out.println(getName() + "��ȡs2,����");
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
						System.out.println(getName() + "��ȡs2,�ȴ�s1");
						synchronized (s1) {
							System.out.println(getName() + "��ȡs1,����");
						}
					}
				}
			}
		}.start();
	}
}
