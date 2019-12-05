package day26net;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import com.sun.jdi.event.Event;

public class GUI extends Frame{
	Button sendButton;
	Button shakeButton;
	TextField  tf;
	Button logButton;
	Button clearButton;
	TextArea viewArea;
	TextArea sendTextArea;
	public GUI(){
		Init();
		south();
		centerPanel();
		event();
	}
	
	private void event() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		sendButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String messageString=sendTextArea.getText();
				String ip=tf.getText();
				try {
					InetAddress sendip=InetAddress.getByName(ip);
					DatagramSocket aSendSocket= new DatagramSocket();
					DatagramPacket senDatagramPacket=new DatagramPacket(messageString.getBytes(),
						messageString.getBytes().length,sendip,6666);
					aSendSocket.send(senDatagramPacket);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	
	}

	private void centerPanel() {
		Panel centerPanel=new Panel();
		viewArea = new TextArea();
		sendTextArea=new TextArea(5,1);
		centerPanel.setLayout(new BorderLayout());
		centerPanel.add(sendTextArea,BorderLayout.SOUTH);
		centerPanel.add(viewArea,BorderLayout.CENTER);
		viewArea.setEditable(false);
		viewArea.setBackground(Color.white);
		sendTextArea.setFont(new Font("xxx",Font.PLAIN,15));
		viewArea.setFont(new Font("xxx",Font.PLAIN,15));
		this.add(centerPanel,BorderLayout.CENTER);
	}
	public void south() {
		Panel southPanel =new Panel();
		tf=new  TextField(15);
		clearButton=new Button("清屏");
		sendButton =new Button("发送");
		shakeButton =new Button("振动");
		logButton=new Button("记录"); 
		southPanel.add(tf);
		southPanel.add(sendButton);
		southPanel.add(logButton);
		southPanel.add(shakeButton);
		southPanel.add(clearButton);
		this.add(southPanel,BorderLayout.SOUTH);	
	}
	private void Init() {
		this.setLocation(150,150);
		this.setSize(400,600);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new GUI();
	}
}
