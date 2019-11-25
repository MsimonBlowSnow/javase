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

	@Override // 方法重写：子类中出现了和父类中方法声明一模一样的方法。
	// 与返回值类型有关,返回值是一致(或者是子父类)的
	public String print() {
		super.speak = "mmp";
		return speak;
	}

	public int ming(int i, int j) {
		int a = i * j;
		return a;
	}

	// 方法重载与返回值无关，与参数有关
	public String ming(int i, int j, int k) {
		return "木头人";

	}
}