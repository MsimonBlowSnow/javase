package day25thread;

import java.io.IOException;

/* Runtime����һ��������
 * Runtime r = Runtime.getRuntime();
			//r.exec("shutdown -s -t 300");		//300���ػ�
			r.exec("shutdown-a");			//ȡ���ػ�
 * 
*/
public class Demo02Runtime {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		//Runtime �����������ģʽ����������ͬһ������
		r.exec("shutdown -s -t 60");		//60���ػ�
		r.exec("shutdown -a");			//ȡ���ػ�
	}
}
