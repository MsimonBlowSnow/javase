package day11Ecilpes;

import com.ming.domain.User;/*�������Լ�����jar,java�ļ���shop/src
							com.ming.domain*/

import day11Makejar.MyHelpClass;//����ɾ��day11Makejar,��Ϊ��jar��

public class DemoJartext {
	public static void main(String[] args) {
		int[] a={3,4,5,6,56,34,32,99,565,1};
		System.out.println(MyHelpClass.add(1,3));
		System.out.println(MyHelpClass.findMax(a));
		MyHelpClass.findAll(MyHelpClass.array(a));
		User c=new User();/*�������Լ�����jar,java�ļ���shop/src
		com.ming.domain*/
		System.out.println(c.getBirthday());
	}
}
