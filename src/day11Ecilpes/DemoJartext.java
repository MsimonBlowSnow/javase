package day11Ecilpes;

import com.ming.domain.User;/*导包，自己做的jar,java文件在shop/src
							com.ming.domain*/

import day11Makejar.MyHelpClass;//可以删除day11Makejar,因为有jar包

public class DemoJartext {
	public static void main(String[] args) {
		int[] a={3,4,5,6,56,34,32,99,565,1};
		System.out.println(MyHelpClass.add(1,3));
		System.out.println(MyHelpClass.findMax(a));
		MyHelpClass.findAll(MyHelpClass.array(a));
		User c=new User();/*导包，自己做的jar,java文件在shop/src
		com.ming.domain*/
		System.out.println(c.getBirthday());
	}
}
