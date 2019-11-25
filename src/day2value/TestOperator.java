package day2value;

public class TestOperator {
	public static void main(String[] args) {
		System.out.println("第一题:");
		int a = 10;
		int b = 10;
		int c = 10;
	
		a = b++;					//a = 10 ,b = 11
		c = --a;					//a = 9, c = 9			
		b = ++a;					//a = 10, b = 10	
		a = c--;					//a = 9, c = 8			
		
		System.out.println("a = " + a + ",b = " + b + ",c = " + c);

		System.out.println("第二题");
		int x = 4;
		//		4	+	6+	60
		int y = (x++)+(++x)+(x*10);//70

		System.out.println("x = " + x + ",y = " +  y);

		System.out.println("第三题问哪句会报错,为什么 ");
		byte u= 10;
		u++;					//b = (byte)(b + 1)
		//u = u + 1;				//当byte与int进行混合运算的时候,会提升为int类型,两个int相加的结果还是int,赋值给byte会损失精度
		System.out.println("b = " + b);
		
		System.out.println("面试题:看下面的程序是否有问题，如果有问题，请指出并说明理由");
				//short s=1;s = s+1;			//当short与int进行运算的时候,会提升为int类型,两个int类型相加的结果也是int类型
				short s=1;s+=1;					//s = (short)(s + 1);

				System.out.println(s);
	}
}
