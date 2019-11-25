package day10package;

//import java.util.Scanner;
//导报可以用通配符*，如：不过不提倡，因为这样加载速度会变慢
import java.awt.color.*;

/*导包使用某个包下的具体数据要用导该包或者直接调用包名 
 * 
 *注意:使用cmd 编译时，可以用D:\java\HelloWorld举例
 * 编译Javac -d . HelloWorld 在HelloWorld生成一个Java1的文件
 * 运行Java Java1.HelloWorld 
 * */


public class DemoPackage {
	public static void main(String[] args) {
		//Scanner a=new Scanner(System.in);//导包情况下
		java.util.Scanner a=new java.util.Scanner(System.in);
		
	}
}
