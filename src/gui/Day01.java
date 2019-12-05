package gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*Graphical User Interface(图形用户接口)。
* 
		Frame  f = new Frame(“my window”);
		
		f.setSize(500,400);
		f.setLocation(300,200);
		f.setIconImage(Toolkit.getDefaultToolkit().createImage("qq.png"));
		f.setVisible(true);
*/

/* FlowLayout（流式布局管理器）
* 从左到右的顺序排列。
* Panel默认的布局管理器。
* BorderLayout（边界布局管理器）
* 东，南，西，北，中
* Frame默认的布局管理器。
* GridLayout（网格布局管理器）
* 规则的矩阵
* CardLayout（卡片布局管理器）
* 选项卡
* GridBagLayout（网格包布局管理器）
* 非规则的矩阵*/
public class Day01 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setSize(500, 500);    //设置窗体大小
		frame.setLocation(200,200); //设置窗体出现在屏幕的位置
		Button butoButton=new Button("开始游戏");
		Button butoButton2=new Button("退出");
		frame.add(butoButton);
		frame.setIconImage(Toolkit.getDefaultToolkit().createImage("src/gui/qq.png"));
		frame.setLayout(new FlowLayout());//设置布局管理器
		//添加窗体监控事件，windowAdapter是一个实现了windowLister接口的抽象内
		//(抽象类不能创建实例对象)，使用户使用更加方便
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//鼠标监听器和窗体监听器差不多，都有一个实现监听器接口的Adapter类
		butoButton.addMouseListener(new MouseAdapter() {
			/*
			 * @Override public void mouseClicked(MouseEvent e) { 
			 * // TODO Auto-generated
			 * System.exit(0);
			 *  }
			 */
			@Override
			public void mouseReleased(MouseEvent e) {
				System.exit(0);
			}
		});
		
		butoButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				/*
				 * if(e.getKeyCode()==32)//空格键 System.exit(0);
				 */
				if(e.getKeyCode()==KeyEvent.VK_SPACE)
					System.exit(0);
			}
		});
		//ActionListener接口就一个方法，不需要adapter
		
		butoButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);;
			}
		});
		frame.setVisible(true);
	}
}
