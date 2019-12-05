package day13regx;

import java.math.BigInteger;
import java.util.Arrays;

/* A:BigInteger的概述
* 可以让超过Integer范围内的数据进行运算
* B:构造方法
* public BigInteger(String val)
* C:成员方法
* public BigInteger add(BigInteger val)
* public BigInteger subtract(BigInteger val)
* public BigInteger multiply(BigInteger val)
* public BigInteger divide(BigInteger val)
* public BigInteger[] divideAndRemainder(BigInteger val)
*
*BigInteger 当long和int不能存放这么多的数字是，可以用BigInteger很大的数字
*/


public class DemoBigInteger {
	public static void main(String[] args) {
		BigInteger a=new BigInteger("100");
		BigInteger b=new BigInteger("50");
		System.out.println(a.add(b));//加法
		System.out.println(a.subtract(b));//减法
		System.out.println(a.multiply(b));//乘法
		System.out.println(a.divide(b));//除法
		BigInteger[] c=a.divideAndRemainder(b);
		System.out.println(Arrays.toString(c));
	}
}
