package day17set;

import java.util.HashSet;

/*set��������α�֤ÿ��Ԫ�ز���ȵ�
 * �Զ���Ԫ�أ�
 * �ȵ���hashcode��������hashcode �Ƿ���ͬ��
 * ��ͬ:����equals
 * ��ͬ:ֱ�Ӳ�ȥ���ظ�
 * Ϊ����ߴ����ִ��Ч��,Ҫʹÿ��Ԫ�ص�hashcode �ķ���ֵ�ڲ�ͬ����ʱ�ǲ�ͬ��
 * */


/*�������⣺
 * hashset���������ʵ��ȥ�ص�
 * * 1.HashSetԭ��
	* ����ʹ��Set���϶�����Ҫȥ���ظ�Ԫ�ص�, ����ڴ洢��ʱ�����equals()�Ƚ�, Ч�ʽϵ�,��ϣ�㷨�����ȥ�ظ���Ч��, ������ʹ��equals()�����Ĵ���
	* ��HashSet����add()�����洢�����ʱ��, �ȵ��ö����hashCode()�����õ�һ����ϣֵ, Ȼ���ڼ����в����Ƿ��й�ϣֵ��ͬ�Ķ���
		* ���û�й�ϣֵ��ͬ�Ķ����ֱ�Ӵ��뼯��
		* ����й�ϣֵ��ͬ�Ķ���, �ͺ͹�ϣֵ��ͬ�Ķ����������equals()�Ƚ�,�ȽϽ��Ϊfalse�ʹ���, true�򲻴�
* 2.���Զ�����Ķ������HashSetȥ�ظ�
	* ���б�����дhashCode()��equals()����
	* hashCode(): ������ͬ�Ķ��󷵻�ֵ������ͬ, ���Բ�ͬ�ķ���ֵ������ͬ(���Ч��)
	* equals(): ������ͬ����true, ���Բ�ͬ����false,����false��ʱ��洢

 * */
public class DemoHashSet1 {
	public static void main(String[] args) {
		HashSet<Student17> a= new HashSet<Student17>();
		HashSet<Student1> b=new HashSet<Student1>();//Ĭ��Ȩ�޷�ͬһ�����¿��Է���	
		//set����û��ȥ���ظ���Ԫ�أ�û����дHashcode����
		b.add(new Student1(20,"���"));
		b.add(new Student1(20,"���"));
		b.add(new Student1(21,"�Ÿ�"));
		b.add(new Student1(21,"�Ÿ�"));
		System.out.println("b����:"+b);
		//setû���ظ���Ԫ��,��дHashcode����
		a.add(new Student17(20,"���"));
		a.add(new Student17(20,"���"));
		a.add(new Student17(21,"�Ÿ�"));
		a.add(new Student17(21,"�Ÿ�"));
		System.out.println(a);
	}
}
