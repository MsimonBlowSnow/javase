package day13regx;

import java.math.BigInteger;
import java.util.Arrays;

/* A:BigInteger�ĸ���
* �����ó���Integer��Χ�ڵ����ݽ�������
* B:���췽��
* public BigInteger(String val)
* C:��Ա����
* public BigInteger add(BigInteger val)
* public BigInteger subtract(BigInteger val)
* public BigInteger multiply(BigInteger val)
* public BigInteger divide(BigInteger val)
* public BigInteger[] divideAndRemainder(BigInteger val)
*
*BigInteger ��long��int���ܴ����ô��������ǣ�������BigInteger�ܴ������
*/


public class DemoBigInteger {
	public static void main(String[] args) {
		BigInteger a=new BigInteger("100");
		BigInteger b=new BigInteger("50");
		System.out.println(a.add(b));//�ӷ�
		System.out.println(a.subtract(b));//����
		System.out.println(a.multiply(b));//�˷�
		System.out.println(a.divide(b));//����
		BigInteger[] c=a.divideAndRemainder(b);
		System.out.println(Arrays.toString(c));
	}
}
