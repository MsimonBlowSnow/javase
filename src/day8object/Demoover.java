package day8object;

public class Demoover {
		public static void main(String[] args) {
			Zi1 son= new Zi1("laji");
			System.out.println(son.print());
			System.out.println(son.ming(1, 2));
			System.out.println(son.ming(1, 2, 3));
		}	
}

class Fu1 {
	String speak;

	public Fu1() {
	}

	public Fu1(String speak) {
		this.speak=speak;
	}

	public String print() {
		System.out.println(speak);
		return speak;
	}
}

class Zi1 extends Fu1 {
	public Zi1() {
	}

	public Zi1(String speak) {
		super(speak);
	}

	@Override // ������д�������г����˺͸����з�������һģһ���ķ�����
	// �뷵��ֵ�����й�,����ֵ��һ��(�������Ӹ���)��
	public String print() {
		super.speak = "mmp";
		return speak;
	}

	public int ming(int i, int j) {
		int a = i * j;
		return a;
	}

	// ���������뷵��ֵ�޹أ�������й�
	public String ming(int i, int j, int k) {
		return "ľͷ��";

	}
}