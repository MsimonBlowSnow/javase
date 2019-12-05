package 枚举类;
/* A:案例演示
* 定义枚举类要用关键字enum
* 所有枚举类都是Enum的子类
* 枚举类的第一行上必须是枚举项，最后一个枚举项后的分号是可以省略的，但是如果枚举类有其他的东西，这个分号就不能省略。建议不要省略
* 枚举类可以有构造器，但必须是private的，它默认的也是private的。
* 枚举类也可以有抽象方法，但是枚举项必须重写该方法
* 枚举在switch语句中的使用*/
public class Demo02test {
	public static void main(String[] args) {
		//枚举的第一种方式
		method();
		//第二种枚举的方法
		method2();
		//第三种枚举方法
		method3();
		Week13 monWeek1= Week13.MON;
		switch (monWeek1) {
		case MON:
			System.out.println("星期一");break;
		case TUES:
			System.out.println("星期二");break;
		case WED:
			System.out.println("星期三");break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + monWeek1);
		}
	}

	private static void method3() {
		Week13 monWeek1= Week13.MON;
		Week13 tuesWeek1= Week13.TUES;
		Week13 wedWeek1= Week13.WED;
		monWeek1.show();
	}
	
	private static void method2() {
		Week12 monWeek1= Week12.MON;
		Week12 tuesWeek1= Week12.TUES;
		Week12 wedWeek1= Week12.WED;
		System.out.println(monWeek1.getName());
	}
	
	//自定义枚举的第一种方式
	private static void method() {
		Week11 monWeek1= Week11.MON;
		Week11 tuesWeek1= Week11.TUES;
		Week11 wedWeek1= Week11.WED;
	}
}
