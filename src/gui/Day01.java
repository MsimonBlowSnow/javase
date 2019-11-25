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

/*Graphical User Interface(ͼ���û��ӿ�)��
* 
		Frame  f = new Frame(��my window��);
		
		f.setSize(500,400);
		f.setLocation(300,200);
		f.setIconImage(Toolkit.getDefaultToolkit().createImage("qq.png"));
		f.setVisible(true);
*/

/* FlowLayout����ʽ���ֹ�������
* �����ҵ�˳�����С�
* PanelĬ�ϵĲ��ֹ�������
* BorderLayout���߽粼�ֹ�������
* �����ϣ�����������
* FrameĬ�ϵĲ��ֹ�������
* GridLayout�����񲼾ֹ�������
* ����ľ���
* CardLayout����Ƭ���ֹ�������
* ѡ�
* GridBagLayout����������ֹ�������
* �ǹ���ľ���*/
public class Day01 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setSize(500, 500);    //���ô����С
		frame.setLocation(200,200); //���ô����������Ļ��λ��
		Button butoButton=new Button("��ʼ��Ϸ");
		Button butoButton2=new Button("�˳�");
		frame.add(butoButton);
		frame.setIconImage(Toolkit.getDefaultToolkit().createImage("src/gui/qq.png"));
		frame.setLayout(new FlowLayout());//���ò��ֹ�����
		//��Ӵ������¼���windowAdapter��һ��ʵ����windowLister�ӿڵĳ�����
		//(�����಻�ܴ���ʵ������)��ʹ�û�ʹ�ø��ӷ���
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//���������ʹ����������࣬����һ��ʵ�ּ������ӿڵ�Adapter��
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
				 * if(e.getKeyCode()==32)//�ո�� System.exit(0);
				 */
				if(e.getKeyCode()==KeyEvent.VK_SPACE)
					System.exit(0);
			}
		});
		//ActionListener�ӿھ�һ������������Ҫadapter
		
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
