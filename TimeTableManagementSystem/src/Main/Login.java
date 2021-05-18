package Main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import dbConnect.DBConnect;

public class Login {

	private JFrame frmAddNotAvailbleTime;
	private JLabel lblNewLabel_1;
	private JLabel lbli;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		//UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmAddNotAvailbleTime.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	public void clock() {
		
		Thread clock=new Thread() {
			public void run() {
				try {
					for(;;) {
					Calendar cal=new GregorianCalendar();
					int day=cal.get(Calendar.DAY_OF_MONTH);
					int month=cal.get(Calendar.MONTH);
					int year=cal.get(Calendar.YEAR);
					
					int second=cal.get(Calendar.SECOND);
					int minute=cal.get(Calendar.MINUTE);
					int hour=cal.get(Calendar.HOUR);
					
					lblNewLabel_5.setText("Time - "+hour+":"+minute+":"+second+"  Date - "+year+"/"+month+"/"+day);
					sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		clock.start();
	}
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		clock();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddNotAvailbleTime = new JFrame();
		frmAddNotAvailbleTime.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmAddNotAvailbleTime.setBackground(Color.YELLOW);
		frmAddNotAvailbleTime.setResizable(false);
		frmAddNotAvailbleTime.setTitle("Login");
		frmAddNotAvailbleTime.setBounds(350, 90, 1350, 900);
		frmAddNotAvailbleTime.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddNotAvailbleTime.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frmAddNotAvailbleTime.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBackground(new Color(0, 102, 102));
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(152, 201, 45));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 693, 787);
		panel_1.setBackground(new Color(21,25,28));
		frmAddNotAvailbleTime.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(24, 11, 49, 48);
		panel_1.add(btnNewButton_1);
		
		btnNewButton_1.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Twitter_32px_2.png"))); // NOI18N
       // jButton2.setToolTipText("Twitter");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setRolloverIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Twitter_32px.png"))); // NOI18N
		
		JButton button = new JButton("");
		button.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Facebook_32px_7.png")));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(94, 11, 49, 48);
		panel_1.add(button);
		button.setRolloverIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Facebook_32px_2.png")));
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Instagram_32px_3.png")));
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(174, 11, 49, 48);
		panel_1.add(button_1);
		button_1.setRolloverIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Instagram_32px.png")));
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Secured_Letter_32px_2.png")));
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBorder(null);
		button_2.setBounds(252, 11, 49, 48);
		panel_1.add(button_2);
		button_2.setRolloverIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Secured_Letter_32px.png")));
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_YouTube_32px_1.png")));
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBorder(null);
		button_3.setBounds(328, 11, 49, 48);
		panel_1.add(button_3);
		button_3.setRolloverIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_YouTube_32px.png")));
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(267, 124, 118, 131);
		lblNewLabel_2.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/user.png")));
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		textField.setForeground(Color.WHITE);
		textField.setBackground(new Color(51, 51, 51));
		textField.setBounds(174, 327, 312, 48);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		textField_1.setForeground(Color.WHITE);
		textField_1.setBackground(new Color(51, 51, 51));
		textField_1.setColumns(10);
		textField_1.setBounds(174, 462, 312, 48);
		panel_1.add(textField_1);
		
		JButton btnNewButton_2 = new JButton("Sign In");
		btnNewButton_2.setBackground(new Color(152, 201, 45));
		btnNewButton_2.setForeground(new Color(51, 51, 51));
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton_2.setBounds(174, 585, 312, 48);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("Connect With Us On ");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_4.setForeground(new java.awt.Color(169, 224, 49));
		lblNewLabel_4.setBounds(34, 63, 192, 28);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setForeground(new Color(169, 224, 49));
		lblUserName.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblUserName.setBounds(267, 284, 155, 28);
		panel_1.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(169, 224, 49));
		lblPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblPassword.setBounds(275, 423, 147, 28);
		panel_1.add(lblPassword);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Male_User_35px.png"))); 
		lblNewLabel_3.setBounds(121, 337, 43, 35);
		panel_1.add(lblNewLabel_3);
		
		JLabel label = new JLabel("New label");
		label.setBounds(121, 472, 43, 35);
		label.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Lock_35px.png")));
		panel_1.add(label);
        
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(688, 78, 666, 787);
		panel_3.setBackground(new Color(31,36,42));
		frmAddNotAvailbleTime.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		
		 lbli = new JLabel("");
		lbli.setBounds(205, 38, 264, 256);
		panel_3.add(lbli);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png/"));
		lbli.setIcon(image);
		
		lblNewLabel_5 = new JLabel("Clock");
		lblNewLabel_5.setForeground(new Color(169, 224, 49));
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_5.setBounds(93, 382, 490, 157);
		panel_3.add(lblNewLabel_5);
		
		
		
		
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	
}
