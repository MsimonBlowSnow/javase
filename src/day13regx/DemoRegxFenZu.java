package day13regx;

/** A:������ʽ�ķ��鹦��
	* ���������ͨ�������Ҽ����俪��������š����磬�ڱ��ʽ ((A)(B(C))) �У������ĸ��������飺 
* 
		1     ((A)(B(C))) 
		2     (A 
		3     (B(C)) 
		4     (C) 
	
		����ʼ�մ����������ʽ��
B:������ʾ
	a:�и�
		�����밴�յ����и "sdqqfgkkkhjppppkl";
	b:�滻
		��������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
		���ַ�����ԭ��:����Ҫѧ��̡���

*$1��ȡ�ڼ�������
*ReplaceAll(regx,statement)
*����regx��statement
*/
public class DemoRegxFenZu {
	public static void main(String[] args) {
		String a="sdqqfgkkkhjppppkl";
		String[] c=a.split("(.)\\1+");//��.)\\1��һ�����һ��  (.)\\1+��һ����ֶ��
		for(String i:c)
		System.out.println(i);
		String f="����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		String[] l= f.split("\\.");
		StringBuilder l1=new StringBuilder("");
		for(String i:l) {
			l1.append(i);
		}
		String f1=l1.toString();
		System.out.println(f1);
		//$1  ����  regex  �����һ�������Է��飨������ ([^\\.]+) �����񵽵����ݣ����磺
		String f2=f1.replaceAll("(.)\\1+", "$1");
		System.out.println(f2);
	}
}
