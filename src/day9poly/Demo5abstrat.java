package day9poly;
/*有抽象方法一定是接口或者抽象类*/
/*抽象类不能实例化，且必须有abstract修饰
 * 抽象类的子类只有抽象或者实现抽象
 * 抽象方法强制子类去做的
 * */
public class Demo5abstrat {
	public static void main(String[] args) {
		
	}
}

abstract class father5 {
	abstract void print();
}

class son5 extends father5{

	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}
	
}