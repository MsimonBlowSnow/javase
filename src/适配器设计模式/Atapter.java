package 适配器设计模式;
/*适配器设计模式
 	*适配器设计模式是用一个抽象类来实现有很多方法的接口
 	*把重写该接口的方法定义为抽象方法，该抽象类就是一个适配器
 *优点： 
 	*1.能让不能完全实现该接口里面的抽象方法的类实现里面的部分方法：如下
 	*2.能让要使用给接口方法里面的莫个抽象方法的类直接继承适配器，就可以重写你要用的方法，不是所用方法 
 * */

/*问题要求:
 *1.有一个接口MING，请创建一个类实现仅仅有里面的一个方法
 	*思路:
 		*1.创建一个抽象类来实现接口MING,并重写所有的方法
 		*2.创建一个类来继承该抽象方法
 	*
 * */
public class Atapter {
	public static void main(String[] args) {
		new mingStudy().study();
	}
}
class mingStudy  extends ming{
	@Override
		public void study() {
			System.out.println("good good study,day day up");
		}
}
//防止创建对象
abstract class  ming implements Ming{

	@Override
	public void eat(){};

	@Override
	public void sleep(){};

	@Override
	public void play(){};

	@Override
	public void study() {};
	
}