package ö����;
//�����г��󷽷�
public abstract class Week03 {
	//���������ڲ���
	public static final Week03 MON=new Week03("����һ") {
		@Override
		public void show() {
			System.out.println(this.getName());
		}
	};
	public static  final Week03 TUES=new Week03("���ڶ�"){
		@Override
		public void show() {
			System.out.println(this.getName());
		}
	};
	public static final Week03 WED=new Week03("������"){
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
