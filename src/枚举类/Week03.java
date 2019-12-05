package 枚举类;
//里面有抽象方法
public abstract class Week03 {
	//创建匿名内部类
	public static final Week03 MON=new Week03("星期一") {
		@Override
		public void show() {
			System.out.println(this.getName());
		}
	};
	public static  final Week03 TUES=new Week03("星期二"){
		@Override
		public void show() {
			System.out.println(this.getName());
		}
	};
	public static final Week03 WED=new Week03("星期三"){
		@Override
		public void show() {
			System.out.println(this.getName());
		}
	};
	private String name;
	private Week03(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	};
	public abstract void show();
}
