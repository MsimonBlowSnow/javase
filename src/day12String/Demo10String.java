package day12String;
/*String���õķ���
 	* byte[] getBytes():���ַ���ת��Ϊ�ֽ����顣
 	* char[] toCharArray():���ַ���ת��Ϊ�ַ�����
 	* static String valueOf(char[] chs):���ַ�����ת��Ϊ�ַ���
 	* static String valueOf(int i):��int����ת��Ϊ�ַ���
 	* static String valueOf(Object obj):�൱�ڶ������toString����
 		* String�е�ValueOf���԰��������͵�����ת��Ϊ�ַ�����
 	* String toLowerCase():���ַ���ת��ΪСд
 	* String toUpperCase():���ַ���ת���ɴ�д��
 	* String concat(String str):���ַ���ƴ��
 * */
public class Demo10String {
	public static void main(String[] args) {
		String str="abc";
		String str1="������";
		byte[] arr1=str1.getBytes();
		byte[] arr=str.getBytes();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");//����
		}
		for (byte b : arr1) {
			System.out.print(b+" ");//gbk��һ���й��Ĵ��������ֽڣ��ҵ�һ���ֽ��Ǹ���
		}
		System.out.println();
		
		//toCharArray()
		char[] arr2= str.toCharArray();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		//valueOf
		String str2=String.valueOf(97);
		System.out.println(str2);//97 �ַ�
		str2=String.valueOf(arr2);//abc
		System.out.println(str2);
	}
	
}
