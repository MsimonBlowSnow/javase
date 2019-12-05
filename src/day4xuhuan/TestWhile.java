package day4xuhuan;

public class TestWhile {
	public static void main(String[] args) {
		int count=0;
		int ge=0;
		int shi=0;
		int bai=0;
		int he=0;
		int i=100;
		while(i<1000){
			ge=i%10;
			shi=i%100/10;
			bai=i/100;
			he=ge*ge*ge+shi*shi*shi+bai*bai*bai;
			if(he==i) {
				count++;
				System.out.println(he);
			}
			i++;
		}
		System.out.println("一共有"+count+"朵花。");
	}
}
