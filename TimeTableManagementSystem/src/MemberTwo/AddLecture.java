package MemberTwo;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import dbConnect.DBConnect;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class AddLecture {

	JFrame frmAddStudentGroups;
	private JTextField textField;
	private JTextField empIdbox;
	private JTextField rankbox;
	private JTextField textField_3;
	private JComboBox facultyNames;
	private JComboBox depname;
	private JComboBox center;
	private JComboBox Level;
	private JComboBox building;

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
					AddLecture window = new AddLecture();
					window.frmAddStudentGroups.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddLecture() {
		initialize();
		
	
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentGroups = new JFrame();
		frmAddStudentGroups.getContentPane().setBackground(new Color(21,25,28));
		frmAddStudentGroups.setBackground(Color.YELLOW);
		frmAddStudentGroups.setResizable(false);
		frmAddStudentGroups.setTitle("Add Lecturer");
		frmAddStudentGroups.setBounds(350, 90, 1350, 900);
		
		//frmAddStudentGroups.setSize(1500, 2000);
		 
		
		
		frmAddStudentGroups.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentGroups.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frmAddStudentGroups.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(169, 224, 49));
		//lblNewLabel.setForeground(Color.YELLOW);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 659);
		panel_1.setBackground(new Color(51, 51, 51));
		frmAddStudentGroups.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Lecturer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(12, 320, 240, 50);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		btnNewButton.setForeground(new Color(21, 25, 28));
		btnNewButton.setBackground(new Color(152, 201, 45));
		
		JButton btnManageGroups = new JButton("Manage Lecturer\r\n");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ManageLectures itm = new ManageLectures();
				try {
					ManageLectures.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frmAddStudentGroups.setVisible(false);
			}
		});
		btnManageGroups.setBounds(12, 381, 238, 50);
		btnManageGroups.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnManageGroups);
		btnManageGroups.setForeground(new Color(21, 25, 28));
		btnManageGroups.setBackground(new Color(152, 201, 45));
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setBounds(12, 598, 238, 50);
		btnViewGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		btnViewGroups_1.setForeground(new Color(21, 25, 28));
		btnViewGroups_1.setBackground(new Color(152, 201, 45));
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JButton btnNewButton_1 = new JButton("Add Subjects");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddSubjects itm = new AddSubjects();
				try {
					AddSubjects.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setForeground(new Color(21, 25, 28));
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(152, 201, 45));
		btnNewButton_1.setBounds(12, 442, 240, 50);
		panel_1.add(btnNewButton_1);
		
		JButton btnManageGroups_1 = new JButton("Manage Subjects\r\n");
		btnManageGroups_1.addActionListener(new ActionListener() {
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
		btnManageGroups_1.setForeground(new Color(21, 25, 28));
		btnManageGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnManageGroups_1.setBackground(new Color(152, 201, 45));
		btnManageGroups_1.setBounds(12, 505, 238, 50);
		panel_1.add(btnManageGroups_1);
		
		JLabel lblNewLabel_1 = new JLabel("Add Lecturer");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_1);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frmAddStudentGroups.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Lecturer Name");
		lblNewLabel_2.setBounds(274, 268, 252, 25);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		
		textField = new JTextField();
		textField.setBackground(new Color(51, 51, 51));
		textField.setForeground(Color.WHITE);
		textField.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		textField.setBounds(538, 261, 262, 40);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_2_1 = new JLabel("Employee ID");
		lblNewLabel_2_1.setBounds(272, 340, 252, 25);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(new Color(169, 224, 49));
		
		empIdbox = new JTextField();
		empIdbox.setForeground(Color.WHITE);
		empIdbox.setBackground(new Color(51, 51, 51));
		empIdbox.setBounds(538, 332, 262, 40);
		empIdbox.setFont(new Font("Tahoma", Font.BOLD, 20));
		empIdbox.setColumns(10);
		frmAddStudentGroups.getContentPane().add(empIdbox);
		empIdbox.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Faculty");
		lblNewLabel_2_1_1.setBounds(272, 411, 281, 25);
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setForeground(new Color(169, 224, 49));
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Department");
		lblNewLabel_2_1_2.setBounds(272, 484, 281, 25);
		lblNewLabel_2_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_2);
		lblNewLabel_2_1_2.setForeground(new Color(169, 224, 49));
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Center");
		lblNewLabel_2_1_3.setBounds(845, 268, 128, 25);
		lblNewLabel_2_1_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_3);
		lblNewLabel_2_1_3.setForeground(new Color(169, 224, 49));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 623, 1082, 69);
		panel_3.setBackground(new Color(0, 0, 0));
		frmAddStudentGroups.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(new Color(21, 25, 28));
		btnClear.setBackground(new Color(152, 201, 45));
		btnClear.setBounds(264, 11, 238, 40);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String lectureName=textField.getText();
				String EmpID=empIdbox.getText();
				String ActiveHours=textField_3.getText();
				String Rank=rankbox.getText();
				
				String Faculty=(String) facultyNames.getSelectedItem();
				String Department=(String) depname.getSelectedItem();
				String Center=(String) center.getSelectedItem();
				String Building=(String) building.getSelectedItem();
				String level=(String) Level.getSelectedItem();
				
				
if(textField.getText().equals("")||empIdbox.getText().equals("")||textField_3.getText().equals("")||rankbox.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please Fill the form  First!");
				}else {
				
				try {

			
					
					
					 Connection con = DBConnect.connect();

	                    String query = "INSERT INTO lecturers values(null, '" + lectureName + "','" + EmpID + "','" + Faculty + "','" +
	                    		Department + "','" + Center + "','" + Building + "','"+ level +"','"+ Rank +"','"+ ActiveHours +"')";
	                  Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                   if (x == 0) {
	                        JOptionPane.showMessageDialog(btnSave, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(btnSave,"Lecturer details successfully added!");
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                	
	                }
				}
			}
		});
		btnSave.setBounds(512, 11, 238, 40);
		btnSave.setForeground(new Color(21, 25, 28));
		btnSave.setBackground(new Color(152, 201, 45));
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
		JButton btnGenerateRank = new JButton("Generate Rank");
		btnGenerateRank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				rankbox.setText(Level.getSelectedItem().toString()+"."+empIdbox.getText().toString());	
			}
		});
		btnGenerateRank.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnGenerateRank.setForeground(new Color(21, 25, 28));
		btnGenerateRank.setBackground(new Color(152, 201, 45));
		btnGenerateRank.setBounds(760, 11, 238, 40);
		panel_3.add(btnGenerateRank);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Building");
		lblNewLabel_2_1_4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_4.setBounds(845, 340, 252, 25);
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_4);
		lblNewLabel_2_1_4.setForeground(new Color(169, 224, 49));
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Level");
		lblNewLabel_2_1_5.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_5.setBounds(845, 411, 252, 25);
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_5);
		lblNewLabel_2_1_5.setForeground(new Color(169, 224, 49));
		
		JLabel lblNewLabel_2_1_6 = new JLabel("Rank\r\n");
		lblNewLabel_2_1_6.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_6.setBounds(845, 484, 252, 25);
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_6);
		lblNewLabel_2_1_6.setForeground(new Color(169, 224, 49));
		
		 facultyNames = new JComboBox();
		 facultyNames.setForeground(Color.WHITE);
		facultyNames.setFont(new Font("Tahoma", Font.BOLD, 16));
		facultyNames.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		facultyNames.setBackground(new Color(51, 51, 51));
		facultyNames.setBounds(538, 404, 260, 40);
		frmAddStudentGroups.getContentPane().add(facultyNames);
			facultyNames.addItem("Select Faculty");
			facultyNames.addItem("Faculty of Computing");
			facultyNames.addItem("Faculty of Business");
			facultyNames.addItem("Faculty of Engineering");
			facultyNames.addItem("Faculty of Humanities & Sciences ");
		
		 depname = new JComboBox();
		 depname.setForeground(Color.WHITE);
		depname.setBounds(538, 477, 260, 40);
		depname.setBackground(new Color(51, 51, 51));
		depname.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		depname.setFont(new Font("Tahoma", Font.BOLD, 16));
		frmAddStudentGroups.getContentPane().add(depname);
			depname.addItem("Select Department");
			depname.addItem("Department of Information Technology");
			depname.addItem("Department of Computer Systems Engineering");
			depname.addItem("Department of Computer Science & Software Engineering");
			depname.addItem("Department of Business IT ");
		
		 center = new JComboBox();
		 center.setForeground(Color.WHITE);
		center.setBounds(1007, 261, 260, 40);
		center.setBackground(new Color(51, 51, 51));
		center.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		center.setFont(new Font("Tahoma", Font.BOLD, 16));
		frmAddStudentGroups.getContentPane().add(center);
			center.addItem("Select Center");
			center.addItem("Malabe");
			center.addItem("Kandy");
			center.addItem("Kurunegala");
			center.addItem("Mathara ");
		
		
		 Level = new JComboBox();
		 Level.setForeground(Color.WHITE);
		 Level.setFont(new Font("Tahoma", Font.BOLD, 16));
		 Level.setBackground(new Color(51, 51, 51));
		 Level.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		Level.setBounds(1007, 404, 260, 40);
		frmAddStudentGroups.getContentPane().add(Level);
		Level.addItem("Select Level");
		Level.addItem("1");
		Level.addItem("2");
		Level.addItem("3");
		Level.addItem("4");
		Level.addItem("5");
		Level.addItem("6");
		
		
		rankbox = new JTextField();
		rankbox.setEditable(false);
		rankbox.setForeground(Color.WHITE);
		rankbox.setFont(new Font("Tahoma", Font.BOLD, 20));
		rankbox.setColumns(10);
		rankbox.setBounds(1007, 476, 262, 40);
		frmAddStudentGroups.getContentPane().add(rankbox);
		rankbox.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		rankbox.setBackground(new Color(51, 51, 51));
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Active Hours");
		lblNewLabel_2_1_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_2_1.setBounds(272, 555, 281, 25);
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_2_1);
		lblNewLabel_2_1_2_1.setForeground(new Color(169, 224, 49));
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(538, 554, 262, 40);
		frmAddStudentGroups.getContentPane().add(textField_3);
		textField_3.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		textField_3.setBackground(new Color(51, 51, 51));
		
        building = new JComboBox();
		building.setModel(new DefaultComboBoxModel(new String[] {"Select a Building", "Main Building", "New Building"}));
		building.setForeground(Color.WHITE);
		building.setFont(new Font("Tahoma", Font.BOLD, 16));
		building.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		building.setBackground(new Color(51, 51, 51));
		building.setBounds(1007, 340, 260, 40);
		frmAddStudentGroups.getContentPane().add(building);
	 
	    
	}
}
