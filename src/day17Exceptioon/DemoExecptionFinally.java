package day17Exceptioon;
/* A:finally的特点
* 被finally控制的语句体一定会执行
* 特殊情况：在执行到finally之前jvm退出了(比如System.exit(0))
* B:finally的作用
* 用于释放资源，在IO流操作和数据库操作中会见到
* C:案例演示
* finally关键字的特点及作用
*就算没有catch 中有return，在执行return前，会先执行finally
*/
public class DemoExecptionFinally {
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("不能除0");
			return ;
		}finally {
			System.out.println("除你码的0");
		}
		
	}
}
