/**************************************
*	This class done GUI part and event handling part
*
***************************************/
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TacTicToe extends JFrame  {

	/**
	 * 
	 */
	

	public JPanel contentPane;

	public  Check c = new Check();
	/**
	 *GUI is created with help of eclips
	 */
	public TacTicToe() {  // constractor initilize the main User interface
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 361);
		contentPane = new JPanel();
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.getVal(0, 0)==2 ){
					if(Main.state==true){
					c.putVal(1, 0, 0);
					btnNewButton.setText("X");
					btnNewButton.setBackground(new Color(255, 145, 255));
					Main.count++;
					Main.state=!Main.state;
				}
				else{
					c.putVal(0, 0, 0);
					btnNewButton.setText("o");
					btnNewButton.setBackground(new Color(153, 255, 51));
					Main.count++;
					Main.state=!Main.state;
				}
					
				}
				
				if(Main.count>= 5){  // Threre should be atleat 5 clicks to Win some one
					if(c.checkWin()==1){
						Main.winone=true;
						Main.wintwo=false;
						JOptionPane.showMessageDialog(null,"Player one Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(c.checkWin()==2){
						Main.wintwo=true;
						Main.winone=false;
						JOptionPane.showMessageDialog(null,"Player two Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(Main.count==9 && c.checkWin()==0){
						JOptionPane.showMessageDialog(null,"No one Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				System.out.println("0 : 0 --- "+c.mat[0][0]);
			}
		});
		btnNewButton.setBackground(new Color(51, 204, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton.setBounds(50, 90, 80, 80);
		contentPane.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.getVal(0, 1)==2 ){
					if(Main.state==true){
					c.putVal(1, 0, 1);
					btnNewButton_1.setText("X");
					btnNewButton_1.setBackground(new Color(255, 145, 255));
					Main.count++;
					Main.state=!Main.state;
				}
				else{
					c.putVal(0, 0, 1);
					btnNewButton_1.setText("o");
					btnNewButton_1.setBackground(new Color(153, 255, 51));
					Main.count++;
					Main.state=!Main.state;
				}
				
				}
				if(Main.count>= 5){
					if(c.checkWin()==1){
						Main.winone=true;
						Main.wintwo=false;
						JOptionPane.showMessageDialog(null,"Player one Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(c.checkWin()==2){
						Main.wintwo=true;
						Main.winone=false;
						JOptionPane.showMessageDialog(null,"Player two Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(Main.count==9 && c.checkWin()==0){
						JOptionPane.showMessageDialog(null,"No one wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				System.out.println("0 : 1 --- "+c.mat[0][1]);
			}
		});
		
		
		final JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.getVal(0, 2)==2 ){
					if(Main.state==true){
					c.putVal(1, 0, 2);
					btnNewButton_3.setText("X");
					btnNewButton_3.setBackground(new Color(255, 145, 255));
					Main.count++;
					Main.state=!Main.state;
				}
				else {
					c.putVal(0, 0, 2);
					btnNewButton_3.setText("o");
					btnNewButton_3.setBackground(new Color(153, 255, 51));
					Main.count++;
					Main.state=!Main.state;
				}
				}
				
				if(Main.count>= 5){
					if(c.checkWin()==1){
						Main.winone=true;
						Main.wintwo=false;
						JOptionPane.showMessageDialog(null,"Player one Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(c.checkWin()==2){
						Main.wintwo=true;
						Main.winone=false;
						JOptionPane.showMessageDialog(null,"Player two Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(Main.count==9 && c.checkWin()==0){
						JOptionPane.showMessageDialog(null,"No one wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				System.out.println("0 : 2 --- "+c.mat[0][2]);
			}
		});
		btnNewButton_3.setBackground(new Color(51, 204, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_3.setBounds(230, 90, 80, 80);
		contentPane.add(btnNewButton_3);
		
		final JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.getVal(1, 0)==2 ){
					if(Main.state==true){
					c.putVal(1, 1, 0);
					btnNewButton_4.setText("X");
					btnNewButton_4.setBackground(new Color(255, 145, 255));
					Main.count++;
					Main.state=!Main.state;
				}
				else {
					c.putVal(0, 1, 0);
					btnNewButton_4.setText("o");
					btnNewButton_4.setBackground(new Color(153, 255, 51));
					Main.count++;
					Main.state=!Main.state;
				}
				}
				
				if(Main.count>= 5){
					if(c.checkWin()==1){
						Main.winone=true;
						Main.wintwo=false;
						JOptionPane.showMessageDialog(null,"Player one Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(c.checkWin()==2){
						Main.wintwo=true;
						Main.winone=false;
						JOptionPane.showMessageDialog(null,"Player two Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(Main.count==9 && c.checkWin()==0){
						JOptionPane.showMessageDialog(null,"No one wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				System.out.println("1 : 0 --- "+c.mat[1][0]);
			}
		});
		btnNewButton_4.setBackground(new Color(51, 204, 255));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_4.setBounds(50, 180, 80, 80);
		contentPane.add(btnNewButton_4);
		
		final JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.getVal(1, 1)==2 ){
					if(Main.state==true){
					c.putVal(1, 1, 1);
					btnNewButton_5.setText("X");
					btnNewButton_5.setBackground(new Color(255, 145, 255));
					Main.count++;
					Main.state=!Main.state;
				}
				else{
					c.putVal(0, 1, 1);
					btnNewButton_5.setText("o");
					btnNewButton_5.setBackground(new Color(153, 255, 51));
					Main.count++;
					Main.state=!Main.state;
				}
				
				}
				if(Main.count>= 5){
					if(c.checkWin()==1){
						Main.winone=true;
						Main.wintwo=false;
						JOptionPane.showMessageDialog(null,"Player one Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(c.checkWin()==2){
						Main.wintwo=true;
						Main.winone=false;
						JOptionPane.showMessageDialog(null,"Player two Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(Main.count==9 && c.checkWin()==0){
						JOptionPane.showMessageDialog(null,"No one wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				System.out.println("1 : 1 --- "+c.mat[1][1]);
			}
		});
		btnNewButton_5.setBackground(new Color(51, 204, 255));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_5.setBounds(140, 180, 80, 80);
		contentPane.add(btnNewButton_5);
		
		final JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.getVal(1, 2)==2 ){
					if(Main.state==true){
					c.putVal(1, 1, 2);
					btnNewButton_6.setText("X");
					btnNewButton_6.setBackground(new Color(255, 145, 255));
					Main.count++;
					Main.state=!Main.state;
				}
				else {
					c.putVal(0, 1, 2);
					btnNewButton_6.setText("o");
					btnNewButton_6.setBackground(new Color(153, 255, 51));
					Main.count++;
					Main.state=!Main.state;
				}
				}
				
				if(Main.count>= 5){
					if(c.checkWin()==1){
						Main.winone=true;
						Main.wintwo=false;
						JOptionPane.showMessageDialog(null,"Player one Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(c.checkWin()==2){
						Main.wintwo=true;
						Main.winone=false;
						JOptionPane.showMessageDialog(null,"Player two Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(Main.count==9 && c.checkWin()==0){
						JOptionPane.showMessageDialog(null,"No one wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				System.out.println("1 : 2 --- "+c.mat[1][2]);
			}
		});
		btnNewButton_6.setBackground(new Color(51, 204, 255));
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_6.setBounds(230, 180, 80, 80);
		contentPane.add(btnNewButton_6);
		
		final JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.getVal(2, 0)==2 ){
					if(Main.state==true){
					c.putVal(1, 2, 0);
					btnNewButton_7.setText("X");
					btnNewButton_7.setBackground(new Color(255, 145, 255));
					Main.count++;
					Main.state=!Main.state;
				}
				else {
					c.putVal(0, 2, 0);
					btnNewButton_7.setText("o");
					btnNewButton_7.setBackground(new Color(153, 255, 51));
					Main.count++;
					Main.state=!Main.state;
				}
				}
				
				if(Main.count>= 5){
					if(c.checkWin()==1){
						Main.winone=true;
						Main.wintwo=false;
						JOptionPane.showMessageDialog(null,"Player one Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(c.checkWin()==2){
						Main.wintwo=true;
						Main.winone=false;
						JOptionPane.showMessageDialog(null,"Player two Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(Main.count==9 && c.checkWin()==0){
						JOptionPane.showMessageDialog(null,"No one wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				System.out.println("2 : 0 --- "+c.mat[2][0]);
			}
		});
		btnNewButton_7.setBackground(new Color(51, 204, 255));
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_7.setBounds(50, 270, 80, 80);
		contentPane.add(btnNewButton_7);
		
		final JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.getVal(2, 1)==2 ){
					if(Main.state==true){
					c.putVal(1, 2, 1);
					btnNewButton_8.setText("X");
					btnNewButton_8.setBackground(new Color(255, 145, 255));
					Main.count++;
					Main.state=!Main.state;
				}
				else {
					c.putVal(0, 2, 1);
					btnNewButton_8.setText("o");
					btnNewButton_8.setBackground(new Color(153, 255, 51));
					Main.count++;
					Main.state=!Main.state;
				}
				}
				
				if(Main.count>= 5){
					if(c.checkWin()==1){
						Main.winone=true;
						Main.wintwo=false;
						JOptionPane.showMessageDialog(null,"Player one Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(c.checkWin()==2){
						Main.wintwo=true;
						Main.winone=false;
						JOptionPane.showMessageDialog(null,"Player two Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(Main.count==9 && c.checkWin()==0){
						JOptionPane.showMessageDialog(null,"No one wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				System.out.println("2 : 1 --- "+c.mat[2][1]);
			}
		});
		btnNewButton_8.setBackground(new Color(51, 204, 255));
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_8.setBounds(140, 270, 80, 80);
		contentPane.add(btnNewButton_8);
		
		final JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.getVal(2, 2)==2 ){
					if(Main.state==true){
					c.putVal(1, 2, 2);
					btnNewButton_9.setText("X");
					btnNewButton_9.setBackground(new Color(255, 145, 255));
					Main.count++;
					Main.state=!Main.state;
				}
				else {
					c.putVal(0, 2, 2);
					btnNewButton_9.setText("o");
					btnNewButton_9.setBackground(new Color(153, 255, 51));
					Main.count++;
					Main.state=!Main.state;
				}
				}
				
				if(Main.count>= 5){
					if(c.checkWin()==1){
						Main.winone=true;
						Main.wintwo=false;
						JOptionPane.showMessageDialog(null,"Player one Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(c.checkWin()==2){
						Main.wintwo=true;
						Main.winone=false;
						JOptionPane.showMessageDialog(null,"Player two Wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
					if(Main.count==9 && c.checkWin()==0){
						JOptionPane.showMessageDialog(null,"No one wins","Whos Win",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				System.out.println("2 :2 --- "+c.mat[2][2]);
			}
		});
		btnNewButton_9.setBackground(new Color(51, 204, 255));
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_9.setBounds(230, 270, 80, 80);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_1.setBackground(new Color(51, 204, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_1.setBounds(140, 90, 80, 80);
		contentPane.add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("Restart");  // To reset every thing
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(e.getSource()==btnNewButton_2){
					 c = new Check();
					 btnNewButton_1.setBackground(new Color(51, 204, 255));
					 btnNewButton.setBackground(new Color(51, 204, 255));
					 btnNewButton_3.setBackground(new Color(51, 204, 255));
					 btnNewButton_4.setBackground(new Color(51, 204, 255));
					 btnNewButton_5.setBackground(new Color(51, 204, 255));
					 btnNewButton_6.setBackground(new Color(51, 204, 255));
					 btnNewButton_7.setBackground(new Color(51, 204, 255));
					 btnNewButton_8.setBackground(new Color(51, 204, 255));
					 btnNewButton_9.setBackground(new Color(51, 204, 255));
					 btnNewButton.setText("");
					 btnNewButton_1.setText("");
					 btnNewButton_3.setText("");
					 btnNewButton_4.setText("");
					 btnNewButton_5.setText("");
					 btnNewButton_6.setText("");
					 btnNewButton_7.setText("");
					 btnNewButton_8.setText("");
					 btnNewButton_9.setText("");
					 Main.count=0;
					 Main.state=true;
				 }
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(324, 180, 100, 70);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("tic tac toe.jpg"));
		lblNewLabel_1.setBounds(10, 11, 340, 60);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("curves-orange-and-white.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 361);
		contentPane.add(lblNewLabel);
	}
	
}
