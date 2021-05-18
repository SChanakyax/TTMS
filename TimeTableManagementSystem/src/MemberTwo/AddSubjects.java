package MemberTwo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import dbConnect.DBConnect;

import javax.swing.JSpinner;

public class AddSubjects {


	private JFrame frameAddLocation;
	
	private JTextField Offeredyear;
	private JTextField subcode;
	private JTextField subjectname;
	private JSpinner LecHrs;
	private JSpinner TuteHrs;
	private JSpinner LabHrs;
	private JSpinner EveHrs;
	
	

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSubjects window = new AddSubjects();
					window.frameAddLocation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddSubjects() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameAddLocation = new JFrame();
		frameAddLocation.setResizable(false);
		frameAddLocation.getContentPane().setBackground(new Color(21,25,28));
		frameAddLocation.setBackground(Color.YELLOW);
		frameAddLocation.setTitle("Add Subject");		

		frameAddLocation.setBounds(350, 90, 1350, 900);
		//frameAddLocation.setSize(1500, 2000);
		frameAddLocation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAddLocation.getContentPane().setLayout(null);
		
	
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frameAddLocation.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(169, 224, 49));
		//lblNewLabel.setForeground(Color.YELLOW);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 658);
		panel_1.setBackground(new Color(51, 51, 51));
		frameAddLocation.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAddLocation = new JButton("Add Subject");
		btnAddLocation.setForeground(new Color(21, 25, 28));
		btnAddLocation.setBackground(new Color(152, 201, 45));
		btnAddLocation.setBounds(12, 320, 240, 50);
		btnAddLocation.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnAddLocation);
		
		JButton btnManageSubject = new JButton("Manage Subject");
		btnManageSubject.setForeground(new Color(21, 25, 28));
		btnManageSubject.setBackground(new Color(152, 201, 45));
		btnManageSubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ManageSubject itm = new ManageSubject();
				try {
					ManageSubject.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btnManageSubject.setBounds(12, 383, 238, 50);
		btnManageSubject.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnManageSubject);
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setForeground(new Color(21, 25, 28));
		btnViewGroups_1.setBackground(new Color(152, 201, 45));
		btnViewGroups_1.setBounds(12, 598, 238, 50);
		btnViewGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JButton btnAddLocation_1 = new JButton("Add Lecturers");
		btnAddLocation_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddLecture itm = new AddLecture();
				try {
					AddLecture.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAddLocation_1.setForeground(new Color(21, 25, 28));
		btnAddLocation_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnAddLocation_1.setBackground(new Color(152, 201, 45));
		btnAddLocation_1.setBounds(12, 444, 240, 50);
		panel_1.add(btnAddLocation_1);
		
		JButton btnManageSubject_1 = new JButton("Manage Lecturers");
		btnManageSubject_1.setForeground(new Color(21, 25, 28));
		btnManageSubject_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnManageSubject_1.setBackground(new Color(152, 201, 45));
		btnManageSubject_1.setBounds(14, 505, 238, 50);
		panel_1.add(btnManageSubject_1);
		
	
		JLabel lblNewLabel_1 = new JLabel("Add Subject");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frameAddLocation.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frameAddLocation.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Offered Year");
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2.setBounds(274, 268, 252, 25);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frameAddLocation.getContentPane().add(lblNewLabel_2);
		
		Offeredyear = new JTextField();
		Offeredyear.setBounds(538, 261, 262, 40);
		Offeredyear.setFont(new Font("Tahoma", Font.BOLD, 20));		
		frameAddLocation.getContentPane().add(Offeredyear);
		Offeredyear.setColumns(10);
		Offeredyear.setBackground(new Color(51, 51, 51));
		Offeredyear.setForeground(Color.WHITE);
		Offeredyear.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblNewLabel_2_1 = new JLabel("Offered Semester");
		lblNewLabel_2_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1.setBounds(274, 354, 252, 25);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frameAddLocation.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Subject Name");
		lblNewLabel_2_1_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_1.setBounds(274, 455, 281, 25);
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frameAddLocation.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Subject Code");
		lblNewLabel_2_1_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_2.setBounds(274, 554, 281, 25);
		lblNewLabel_2_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frameAddLocation.getContentPane().add(lblNewLabel_2_1_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 620, 1082, 71);
		panel_3.setBackground(Color.BLACK);
		frameAddLocation.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton first = new JRadioButton("1st Semester");
		first.setBackground(new Color(51, 51, 51));
		first.setForeground(Color.WHITE);
		first.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		first.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  /**************************************/
							}
		});
		first.setFont(new Font("Tahoma", Font.BOLD, 14));
		first.setBounds(538, 350, 122, 33);
		frameAddLocation.getContentPane().add(first);
		
		JRadioButton second = new JRadioButton("2nd Semester");
		second.setBackground(new Color(51, 51, 51));
		second.setForeground(Color.WHITE);
		second.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		second.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {/****************************************/
			
			}
		});
		second.setBounds(662, 350, 138, 33);
		second.setFont(new Font("Tahoma", Font.BOLD, 14));
		frameAddLocation.getContentPane().add(second);
		
		JButton btnNewButton = new JButton("Save");//*********************************************************************************
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 String Semester=null;
				
				String Year=Offeredyear.getText();
				String SubName=subjectname.getText();
				String SubCode=subcode.getText();
				
				String LectureHours= LecHrs.getValue().toString();
				String TutorialHours= TuteHrs.getValue().toString();
				String LabHours= LabHrs.getValue().toString();
				String EvaluationHours= EveHrs.getValue().toString();
			
				// If condition to check if jRadioButton2 is selected. 
		                if (first.isSelected()) { 
		                	Semester = "1st semester";
		                } 
		  
		                else if (second.isSelected()) { 
		                	Semester = "2nd semester"; 
		                } 
		                else { 
		                	JOptionPane.showMessageDialog(panel, "Please select a Type", "Warning",JOptionPane.WARNING_MESSAGE);
		                } 
		             
		                
		                if(Offeredyear.getText().equals("")||subjectname.getText().equals("")||subcode.getText().equals("")) {
							
							JOptionPane.showMessageDialog(null, "Please Fill the form  First!");
						}else {
			
				
				try {
					 Connection con = DBConnect.connect();

	                    String query = "INSERT INTO subjects values(null, '" + Year + "','" + Semester + "','" + SubName + "','" +
	                    		SubCode + "','" + LectureHours + "','" + TutorialHours + "','"+ LabHours +"','"+ EvaluationHours +"')";

	                  Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                   if (x == 0) {
	                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(btnNewButton,"Subject details successfully added!");
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                	
	                }
			}}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(216, 11, 250, 49);
		btnNewButton.setForeground(new Color(21, 25, 28));
		btnNewButton.setBackground(new Color(152, 201, 45));
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setForeground(new Color(21, 25, 28));
		btnNewButton_1.setBackground(new Color(152, 201, 45));
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		///btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(492, 11, 250, 49);
		panel_3.add(btnNewButton_1);
		
	
				
				
		
	
		
		subcode = new JTextField();
		subcode.setFont(new Font("Tahoma", Font.BOLD, 20));
		subcode.setBounds(538, 540, 258, 40);
		frameAddLocation.getContentPane().add(subcode);
		subcode.setColumns(10);
		subcode.setBackground(new Color(51, 51, 51));
		subcode.setForeground(Color.WHITE);
		subcode.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		
		
		JLabel lblNewLabel_2_2 = new JLabel("Number Of Lecture Hours");
		lblNewLabel_2_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(875, 261, 281, 25);
		frameAddLocation.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Number Of Tutorial Hours");
		lblNewLabel_2_3.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_3.setBounds(875, 354, 281, 25);
		frameAddLocation.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Number Of Lab Hours");
		lblNewLabel_2_4.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_4.setBounds(875, 455, 252, 25);
		frameAddLocation.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Number Of Evaluation Hours");
		lblNewLabel_2_5.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_5.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_5.setBounds(875, 554, 296, 25);
		frameAddLocation.getContentPane().add(lblNewLabel_2_5);
		
		LecHrs = new JSpinner();
		LecHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		LecHrs.setBounds(1194, 261, 112, 37);
		frameAddLocation.getContentPane().add(LecHrs);
		LecHrs.setBackground(new Color(51, 51, 51));
		LecHrs.setForeground(Color.WHITE);
		LecHrs.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		TuteHrs = new JSpinner();
		TuteHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		TuteHrs.setBounds(1194, 352, 112, 37);
		frameAddLocation.getContentPane().add(TuteHrs);
		TuteHrs.setBackground(new Color(51, 51, 51));
		TuteHrs.setForeground(Color.WHITE);
		TuteHrs.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		LabHrs = new JSpinner();
		LabHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		LabHrs.setBounds(1194, 453, 112, 37);
		frameAddLocation.getContentPane().add(LabHrs);
		LabHrs.setBackground(new Color(51, 51, 51));
		LabHrs.setForeground(Color.WHITE);
		LabHrs.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		EveHrs = new JSpinner();
		EveHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		EveHrs.setBounds(1194, 552, 112, 37);
		frameAddLocation.getContentPane().add(EveHrs);
		EveHrs.setBackground(new Color(51, 51, 51));
		EveHrs.setForeground(Color.WHITE);
		EveHrs.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		subjectname = new JTextField();
		subjectname.setFont(new Font("Tahoma", Font.BOLD, 20));
		subjectname.setColumns(10);
		subjectname.setBounds(538, 440, 258, 40);
		frameAddLocation.getContentPane().add(subjectname);
		subjectname.setBackground(new Color(51, 51, 51));
		subjectname.setForeground(Color.WHITE);
		subjectname.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		
	}	
}
