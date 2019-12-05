package day13regx;

import java.math.BigDecimal;

/* A:BigDecimal的概述
* 由于在运算的时候，float类型和double很容易丢失精度，演示案例。
* 所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal

* 不可变的、任意精度的有符号十进制数。
* B:构造方法
* public BigDecimal(String val)
* C:成员方法
* public BigDecimal add(BigDecimal augend)
* public BigDecimal subtract(BigDecimal subtrahend)
* public BigDecimal multiply(BigDecimal multiplicand)
* public BigDecimal divide(BigDecimal divisor)
* D:案例演示
* BigDecimal类的构造方法和成员方法使用*/

public class DemoBigDecimal {
	public static void main(String[] args) {
		System.out.println(2.3-1.1);//1.1999999 不方便计算
		BigDecimal a=new BigDecimal(2.3);
		BigDecimal c=new BigDecimal(1.1);
		System.out.println(a.subtract(c));//不精确
		
		BigDecimal a1=BigDecimal.valueOf(2.3);
		BigDecimal c1=BigDecimal.valueOf(1.1);
		System.out.println(a1.subtract(c1));//精确
		
		BigDecimal a2=new BigDecimal("2.3");
		BigDecimal c2=new BigDecimal("1.1");
		System.out.println(a1.subtract(c1));//精确
		
	}
}
