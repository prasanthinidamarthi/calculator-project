import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.GridLayout;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class Calci {

	private JFrame frame;
	private JTextField textfield;
double first;
double second;
double result;
String operation;
String answer;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci window = new Calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 386, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textfield = new JTextField();
		textfield.setFont(new Font("Tahoma", Font.BOLD, 35));
		textfield.setBounds(10, 10, 355, 51);
		frame.getContentPane().add(textfield);
		textfield.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(131, 0, 130, 95);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(261, 0, 130, 95);
		frame.getContentPane().add(label_1);
		
		JButton btnB = new JButton("\uF0E7");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace =null;
				if(textfield.getText().length()>0) {
					StringBuilder str =new StringBuilder(textfield.getText());
					str.deleteCharAt(textfield.getText().length()-1);
					backspace =str.toString();
					textfield.setText(backspace);
				}
			}
		});
		btnB.setFont(new Font("Wingdings", Font.PLAIN, 29));
		btnB.setBounds(1, 71, 94, 95);
		frame.getContentPane().add(btnB);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number =textfield.getText()+btn00.getText();
				 textfield.setText(number);
			}});
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn00.setBounds(94, 71, 94, 95);
		frame.getContentPane().add(btn00);
		
		JButton btnmodulo = new JButton("%");
		btnmodulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first = Double.parseDouble(textfield.getText());
				textfield.setText("");
				operation ="%";
			}
		});
		btnmodulo.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnmodulo.setBounds(186, 71, 94, 95);
		frame.getContentPane().add(btnmodulo);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first = Double.parseDouble(textfield.getText());
				textfield.setText("");
				operation ="/";			
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btndivide.setBounds(271, 71, 94, 95);
		frame.getContentPane().add(btndivide);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String number =textfield.getText()+btn7.getText();
				 textfield.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btn7.setBounds(1, 163, 94, 95);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String number =textfield.getText()+btn8.getText();
				 textfield.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btn8.setBounds(94, 163, 94, 95);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String number =textfield.getText()+btn9.getText();
				 textfield.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btn9.setBounds(186, 163, 94, 95);
		frame.getContentPane().add(btn9);
		
		JButton btnmulti = new JButton("*");
		btnmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first = Double.parseDouble(textfield.getText());
				textfield.setText("");
				operation ="*";			
			}
		});
		btnmulti.setFont(new Font("Tahoma", Font.PLAIN, 31));
		btnmulti.setBounds(271, 163, 94, 95);
		frame.getContentPane().add(btnmulti);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String number =textfield.getText()+btn4.getText();
				 textfield.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btn4.setBounds(1, 256, 94, 95);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String number =textfield.getText()+btn5.getText();
				 textfield.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btn5.setBounds(94, 256, 94, 95);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String number =textfield.getText()+btn6.getText();
				 textfield.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btn6.setBounds(186, 256, 94, 95);
		frame.getContentPane().add(btn6);
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first = Double.parseDouble(textfield.getText());
				textfield.setText("");
				operation ="-";	
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.PLAIN, 31));
		btnsub.setBounds(271, 256, 94, 95);
		frame.getContentPane().add(btnsub);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		 String number =textfield.getText()+btn1.getText();
		 textfield.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btn1.setBounds(1, 349, 94, 95);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String number =textfield.getText()+btn2.getText();
				 textfield.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btn2.setBounds(94, 349, 94, 95);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
			String number =textfield.getText()+btn3.getText();
			 textfield.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btn3.setBounds(186, 349, 94, 95);
		frame.getContentPane().add(btn3);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first = Double.parseDouble(textfield.getText());
				textfield.setText("");
				operation ="+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnplus.setBounds(271, 349, 94, 95);
		frame.getContentPane().add(btnplus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String number =textfield.getText()+btn0.getText();
				 textfield.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btn0.setBounds(1, 442, 94, 95);
		frame.getContentPane().add(btn0);
		
		JButton btnfullstop = new JButton(".");
		btnfullstop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number =textfield.getText()+btnfullstop.getText();
				 textfield.setText(number);
			}
		});
		btnfullstop.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnfullstop.setBounds(94, 442, 94, 95);
		frame.getContentPane().add(btnfullstop);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String answer;
			second =Double.parseDouble(textfield.getText());
			if(operation =="+") {
				result =first+second;
				answer=String.format("%.2f",result);
				textfield.setText(answer);
			}
			else if(operation =="-") {
				result =first-second;
				answer=String.format("%.2f",result);
				textfield.setText(answer);
			}
			if(operation =="*") {
				result =first*second;
				answer=String.format("%.2f",result);
				textfield.setText(answer);
			}
			if(operation =="/") {
				result =first/second;
				answer=String.format("%.2f",result);
				textfield.setText(answer);
			}
			if(operation =="%") {
				result =first%second;
				answer=String.format("%.2f",result);
				textfield.setText(answer);
			}				
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnequal.setBounds(186, 442, 94, 95);
		frame.getContentPane().add(btnequal);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textfield.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnC.setBounds(271, 442, 94, 95);
		frame.getContentPane().add(btnC);
	}

	protected static String getFormattedText(double first2) {
		// TODO Auto-generated method stub
		return null;
	}
}
