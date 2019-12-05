package day13regx;
//Greedy 数量词 
//X? X，一次或一次也没有 
//X* X，零次或多次 
//X+ X，一次或多次 
//X{n} X，恰好 n 次 
//X{n,} X，至少 n 次 
//X{n,m} X，至少 n 次，但是不超过 m 次 
//  
public class DemoRegx3 {
	public static void main(String[] args) {
		System.out.println("a".matches("[abc]?"));//true abc出现一次或者一次也没有
		System.out.println("z".matches("[abc]?"));//false 出现了其他字符
		System.out.println("aaa".matches("[abc]*"));//true 
		System.out.println("aea".matches("[abc]*"));//false 出现了其他字符
		System.out.println("aba".matches("[abc]*"));//true
		System.out.println("aaa".matches("[abc]+"));//true
		System.out.println("aea".matches("[abc]+"));//false 出现了其他字符
		System.out.println("".matches("[abc]+"));//false
		System.out.println("aaaa".matches("[a]{2,}"));//true a出现两次以上
		System.out.println("aaaaa".matches("[a][4]"));//false a出现正好四次
		System.out.println("aaaa".matches("[a]{0,4}"));//true a出现0到四次
	}
}
