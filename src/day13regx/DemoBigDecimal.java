package day13regx;

import java.math.BigDecimal;

/* A:BigDecimal�ĸ���
* �����������ʱ��float���ͺ�double�����׶�ʧ���ȣ���ʾ������
* ���ԣ�Ϊ���ܾ�ȷ�ı�ʾ�����㸡������Java�ṩ��BigDecimal

* ���ɱ�ġ����⾫�ȵ��з���ʮ��������
* B:���췽��
* public BigDecimal(String val)
* C:��Ա����
* public BigDecimal add(BigDecimal augend)
* public BigDecimal subtract(BigDecimal subtrahend)
* public BigDecimal multiply(BigDecimal multiplicand)
* public BigDecimal divide(BigDecimal divisor)
* D:������ʾ
* BigDecimal��Ĺ��췽���ͳ�Ա����ʹ��*/

public class DemoBigDecimal {
	public static void main(String[] args) {
		System.out.println(2.3-1.1);//1.1999999 ���������
		BigDecimal a=new BigDecimal(2.3);
		BigDecimal c=new BigDecimal(1.1);
		System.out.println(a.subtract(c));//����ȷ
		
		BigDecimal a1=BigDecimal.valueOf(2.3);
		BigDecimal c1=BigDecimal.valueOf(1.1);
		System.out.println(a1.subtract(c1));//��ȷ
		
		BigDecimal a2=new BigDecimal("2.3");
		BigDecimal c2=new BigDecimal("1.1");
		System.out.println(a1.subtract(c1));//��ȷ
		
	}
}
