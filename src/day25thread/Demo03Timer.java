package day25thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*timer1 �����schedule
 *schedule()����������һ���Ǽ̳���TimerTask���������һ���ǿ�ʼִ�е�date��һ���Ǹ�һ��ʱ��
*ִ�еĲ�����λΪ����
 * 
 * */
public class Demo03Timer {
	public static void main(String[] args) throws InterruptedException {
		Timer timer1= new Timer();
		//schedule()����������һ���Ǽ̳���TimerTask���������һ���ǿ�ʼִ�е�date��һ���Ǹ�һ��ʱ��
		//ִ�еĲ�����λΪ����
		timer1.schedule(new Demo03(), new Date(119,8,11,16,04,0),3000);
		while(true) {
			System.out.println(new Date()); 
			Thread.sleep(1000); 
		}
		 
	}
}

class Demo03 extends TimerTask{

	@Override
	public void run() {
		System.out.println("���ˣ�̫����ƨƨ��!");
	}
	
}