package day12String;

/*AString���滻����
 	*String replace(char old,char new);//��ԭ�ַ���û�б仯
 	*String replace(String old,String);
 *Bȥ���ַ�������Ŀո� 
 	*String trim();//ȥ�����οո�
 *C:String�İ��ֵ�˳��Ƚ������ַ�����������ʾ 
 	* int compareto(String str)
 	* int comparetoIngnoreCare(String str)
 * */
public class Demo12StringMethod {
	public static void main(String[] args) {
		//String replace(char old,char new);
		String str1="aaabbbccc";
		String str2=str1.replace('a', 'i');//��ԭ�ַ���û�б仯
	
		//String replace(String old,String);
		System.out.println(str2);
		str2=str1.replace("aaa", "1");//��ԭ�ַ���û�б仯
		System.out.println(str2);
		System.out.println(str1);
		
		//trim()
		System.out.println(" a b c edafd adddddvb  ".trim());//ȥ�����˵Ŀո�
		
		//compareto()
		String str="��"+0;
		String str0="��"+0;
		System.out.println("��"+0);	//��Unicode���
		System.out.println("��"+0);
		System.out.println(str.compareTo(str0));
		
		String str5="heima";
		String str6="HEIMA";
		System.out.println(str5.compareToIgnoreCase(str6));
	}
}
