package day13regx;
//Greedy ������ 
//X? X��һ�λ�һ��Ҳû�� 
//X* X����λ��� 
//X+ X��һ�λ��� 
//X{n} X��ǡ�� n �� 
//X{n,} X������ n �� 
//X{n,m} X������ n �Σ����ǲ����� m �� 
//  
public class DemoRegx3 {
	public static void main(String[] args) {
		System.out.println("a".matches("[abc]?"));//true abc����һ�λ���һ��Ҳû��
		System.out.println("z".matches("[abc]?"));//false �����������ַ�
		System.out.println("aaa".matches("[abc]*"));//true 
		System.out.println("aea".matches("[abc]*"));//false �����������ַ�
		System.out.println("aba".matches("[abc]*"));//true
		System.out.println("aaa".matches("[abc]+"));//true
		System.out.println("aea".matches("[abc]+"));//false �����������ַ�
		System.out.println("".matches("[abc]+"));//false
		System.out.println("aaaa".matches("[a]{2,}"));//true a������������
		System.out.println("aaaaa".matches("[a][4]"));//false a���������Ĵ�
		System.out.println("aaaa".matches("[a]{0,4}"));//true a����0���Ĵ�
	}
}
