package day4xuhuan;

public class TestFor {
	public static void main(String[] args) {
		/*���Ӧ100-1000�����ˮ�ɻ�
		 * 153=1*1*1+5*5*5+3*3*3
		 * 
		 * */
		int count=0;
		int ge=0;
		int shi=0;
		int bai=0;
		int he=0;
		for(int i=100;i<1000;i++) {
			ge=i%10;
			shi=i%100/10;
			bai=i/100;
			he=ge*ge*ge+shi*shi*shi+bai*bai*bai;
			if(he==i) {
				count++;
				System.out.println(he);
			}
		}
		System.out.println("һ����"+count+"�仨��");
	}
}
