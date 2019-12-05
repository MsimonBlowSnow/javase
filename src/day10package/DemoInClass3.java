package day10package;
/**
 * 要求输出30，20，10
 * */
public class DemoInClass3 {
	public static void main(String[] args) {
		Outer31.Inner31 io=new Outer31().new Inner31();
		io.show();
	}
}

//内部类能获取外部类主要是应为他可以获取外部类的引用.this.数据
class Outer31{
    public int num = 10;
    class Inner31{
        public int num = 20;
        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer31.this.num);
        }
    }
}


