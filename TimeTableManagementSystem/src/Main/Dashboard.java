package Main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import Member3.AddNotAvailableTime;
import Member3.ManageWorkingDays;
import MemberTwo.AddLecture;
import MemberTwo.ManageLectures;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.DefaultComboBoxModel;

public class Dashboard {

	private JFrame frmAddNotAvailbleTime;
	private JButton btnSessionRooms;
	private JLabel lblNewLabel_1;
	private JLabel lbli;
	private JLabel label_10;

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
					Dashboard window = new Dashboard();
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
					
					label_10.setText("Time - "+hour+":"+minute+":"+second+"  Date - "+year+"/"+month+"/"+day);
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
	public Dashboard() {
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
		frmAddNotAvailbleTime.setTitle("Dashboard");
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
		
		JLabel label_8 = new JLabel("");
		label_8.setForeground(new Color(169, 224, 49));
		label_8.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_8.setBounds(387, 652, 35, 53);
		panel_1.add(label_8);
		label_8.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/working (1).png")));
		
		JLabel label_7 = new JLabel("");
		label_7.setForeground(new Color(169, 224, 49));
		label_7.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_7.setBounds(47, 652, 35, 53);
		panel_1.add(label_7);
		label_7.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/backend (1).png")));
		
		JLabel label_6 = new JLabel("");
		label_6.setForeground(new Color(169, 224, 49));
		label_6.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_6.setBounds(387, 537, 35, 53);
		panel_1.add(label_6);
		label_6.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/employee (1).png")));
		
		JLabel label_5 = new JLabel("");
		label_5.setForeground(new Color(169, 224, 49));
		label_5.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_5.setBounds(47, 537, 35, 53);
		panel_1.add(label_5);
		label_5.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/tag (1).png")));
		
		JLabel label_4 = new JLabel("");
		label_4.setForeground(new Color(169, 224, 49));
		label_4.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_4.setBounds(387, 418, 35, 53);
		panel_1.add(label_4);
		label_4.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/book (1).png")));
		
		JLabel label_3 = new JLabel("");
		label_3.setForeground(new Color(169, 224, 49));
		label_3.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_3.setBounds(47, 418, 35, 53);
		panel_1.add(label_3);
		label_3.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/class (1).png")));
		
		JLabel label_2 = new JLabel("");
		label_2.setForeground(new Color(169, 224, 49));
		label_2.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_2.setBounds(387, 293, 35, 53);
		panel_1.add(label_2);
		//lblNewLabel_2.add(lblNewLabel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 45));
		label_2.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/conference (1).png")));
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(new Color(169, 224, 49));
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label_1.setBounds(47, 293, 35, 53);
		panel_1.add(label_1);
		label_1.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/session (1).png")));
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(169, 224, 49));
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		label.setBounds(387, 169, 35, 53);
		panel_1.add(label);
		label.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/map (1).png")));
		
		JButton btnLocations = new JButton("Locations");
		btnLocations.setForeground(new Color(21, 25, 28));
		btnLocations.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnLocations.setFocusPainted(false);
		btnLocations.setBackground(new Color(152, 201, 45));
		btnLocations.setBounds(371, 162, 288, 72);
		panel_1.add(btnLocations);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(47, 169, 35, 53);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
		lblNewLabel_2.setForeground(new java.awt.Color(169, 224, 49));
		lblNewLabel_2.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/speech (2).png"))); // NOI18N
		
		JButton btnLecturer = new JButton("Lecturer");
		btnLecturer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageLectures abc =new ManageLectures();
				try {
					ManageLectures.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}
		});
		btnLecturer.setForeground(new Color(21, 25, 28));
		btnLecturer.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnLecturer.setFocusPainted(false);
		btnLecturer.setBackground(new Color(152, 201, 45));
		btnLecturer.setBounds(27, 162, 288, 72);
		panel_1.add(btnLecturer);
		
		btnSessionRooms = new JButton("Session Rooms");
		btnSessionRooms.setForeground(new Color(21, 25, 28));
		btnSessionRooms.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSessionRooms.setFocusPainted(false);
		btnSessionRooms.setBackground(new Color(152, 201, 45));
		btnSessionRooms.setBounds(371, 285, 288, 72);
		panel_1.add(btnSessionRooms);
		
		btnSessionRooms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		
		
		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setForeground(Color.WHITE);
		lblDashboard.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblDashboard.setBounds(234, 24, 212, 61);
		panel_1.add(lblDashboard);
		
		JButton btnSessions = new JButton("Sessions");
		btnSessions.setForeground(new Color(21, 25, 28));
		btnSessions.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSessions.setFocusPainted(false);
		btnSessions.setBackground(new Color(152, 201, 45));
		btnSessions.setBounds(27, 285, 288, 72);
		panel_1.add(btnSessions);
		
		JButton btnStudentsGroups = new JButton("  Students Groups");
		btnStudentsGroups.setForeground(new Color(21, 25, 28));
		btnStudentsGroups.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnStudentsGroups.setFocusPainted(false);
		btnStudentsGroups.setBackground(new Color(152, 201, 45));
		btnStudentsGroups.setBounds(27, 408, 288, 72);
		panel_1.add(btnStudentsGroups);
		
		JButton btnSubjects = new JButton("Subjects\r\n");
		btnSubjects.setForeground(new Color(21, 25, 28));
		btnSubjects.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSubjects.setFocusPainted(false);
		btnSubjects.setBackground(new Color(152, 201, 45));
		btnSubjects.setBounds(371, 408, 288, 72);
		panel_1.add(btnSubjects);
		
		JButton btnTag = new JButton("Tag");
		btnTag.setForeground(new Color(21, 25, 28));
		btnTag.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnTag.setFocusPainted(false);
		btnTag.setBackground(new Color(152, 201, 45));
		btnTag.setBounds(27, 529, 288, 72);
		panel_1.add(btnTag);
		
		JButton btnWorkigDetails = new JButton("Workig Details");
		btnWorkigDetails.setForeground(new Color(21, 25, 28));
		btnWorkigDetails.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnWorkigDetails.setFocusPainted(false);
		btnWorkigDetails.setBackground(new Color(152, 201, 45));
		btnWorkigDetails.setBounds(371, 529, 288, 72);
		panel_1.add(btnWorkigDetails);
		
		JButton btnSessionCategories = new JButton("   Session Categories");
		btnSessionCategories.setForeground(new Color(21, 25, 28));
		btnSessionCategories.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSessionCategories.setFocusPainted(false);
		btnSessionCategories.setBackground(new Color(152, 201, 45));
		btnSessionCategories.setBounds(27, 645, 288, 72);
		panel_1.add(btnSessionCategories);
		
		JButton btnNotAvailableTimes = new JButton("    Not Available Times");
		btnNotAvailableTimes.setForeground(new Color(21, 25, 28));
		btnNotAvailableTimes.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNotAvailableTimes.setFocusPainted(false);
		btnNotAvailableTimes.setBackground(new Color(152, 201, 45));
		btnNotAvailableTimes.setBounds(371, 645, 288, 72);
		panel_1.add(btnNotAvailableTimes);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(688, 78, 666, 787);
		panel_3.setBackground(new Color(31,36,42));
		frmAddNotAvailbleTime.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		 
		 JLabel label_9 = new JLabel("");
		 label_9.setForeground(new Color(169, 224, 49));
		 label_9.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		 label_9.setBounds(205, 667, 35, 53);
		 panel_3.add(label_9);
		 label_9.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/analytics (1).png")));
		
		
		 lbli = new JLabel("");
		lbli.setBounds(205, 38, 264, 256);
		panel_3.add(lbli);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png/"));
		lbli.setIcon(image);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a Timetable Type..", "Lecturer", "Student", "Location"}));
		comboBox.setBounds(75, 535, 347, 59);
		panel_3.add(comboBox);
		
		JButton btnNewButton = new JButton("GO");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.setBounds(488, 536, 89, 57);
		panel_3.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("What's New .....");
		lblNewLabel_3.setForeground(new Color(152, 201, 45));
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_3.setBounds(275, 680, 160, 29);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblPleaseSelectA = new JLabel("Please Select A Timetable Type :");
		lblPleaseSelectA.setForeground(new Color(152, 201, 45));
		lblPleaseSelectA.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblPleaseSelectA.setBounds(75, 486, 347, 29);
		panel_3.add(lblPleaseSelectA);
		
		 label_10 = new JLabel("Clock");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		label_10.setBounds(87, 316, 490, 157);
		panel_3.add(label_10);
		
		
		
		
		
	    
	}
}
