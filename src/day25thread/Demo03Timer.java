package day25thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*timer1 里面的schedule
 *schedule()三个参数，一个是继承了TimerTask的字类对象，一个是开始执行的date，一个是隔一段时间
*执行的参数单位为毫秒
 * 
 * */
public class Demo03Timer {
	public static void main(String[] args) throws InterruptedException {
		Timer timer1= new Timer();
		//schedule()三个参数，一个是继承了TimerTask的字类对象，一个是开始执行的date，一个是隔一段时间
		//执行的参数单位为毫秒
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
		System.out.println("起床了，太阳照屁屁了!");
	}
	
}