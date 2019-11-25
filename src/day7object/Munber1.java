package day7object;

public class Munber1 {
	private int munber1;
	public Munber1() {
		munber1 = (int)(Math.random()*100)+1;
	}
	public boolean guess(int a) {
		if(this.munber1==a)
			return true;
		else
			return false;
	}
	
	public boolean bigorsmall(int a) {
		if(this.munber1<a)
			return true;
		else
			return false;
	}
	public int getNumber1() {
		return munber1;
		
	}
}
