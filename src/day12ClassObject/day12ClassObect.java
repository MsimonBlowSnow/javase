package day12ClassObject;

import com.ming.domain.User;

/*Object ����
 * �ö��������е��޸����Ĭ�ϼ̳ж�����,
 * �ö��������⼸�ֳ��õķ���
 * hashCode(),toString(),getClass(),equals�ȷ���
 * hashcode():����һ�������hashֵ
 * getClass():����һ��������ֽ����ļ�,ͨ�������������һ������
 * toString():����д���������getClass().getName()+"@"+ Integer.toHexString(hashCode())
 * equals():object��equals����û�о�����д������object��equals�����Ƚϵ�����������ĵ�ֵַ����==һ��
 * һ�㽨����д�����String�����DemoStudHelp�е�equals()����һ����
 * ==��equals()������
 * equals()ֻ�ܱȽ�����ֵ,������û����д֮ǰ��==��࣬�Ƚϵ�ֵַ
 * */

public class day12ClassObect {

	public static void main(String[] args) {
		Object a = new Object();
		User b = new User();// ͨ���Լ�����jar����������
		System.out.println(a.toString());
		System.out.println(b.hashCode());
		System.out.println(b.getClass().getName());
		DemoStudHelp c = new DemoStudHelp("����", "27");
		DemoStudHelp d = new DemoStudHelp("����", "27");
		System.out.println(d.toString());//����д
		System.out.println(c.equals(d));//true,û��д�ȵ�ֵַʱΪfalse��
										//���Ǹ÷����Ѿ���д
	}

}
