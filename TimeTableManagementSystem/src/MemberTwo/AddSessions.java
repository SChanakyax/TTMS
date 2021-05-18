package MemberTwo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import dbConnect.DBConnect;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class AddSessions {

	private JFrame frmAddNotAvailbleTime;
	private JTextField textField;
	private JComboBox comboBox;
	private JComboBox comboBox_2;
	private JComboBox comboBox_1;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_4_1;
	private JSpinner spinner_1;
	private JSpinner spinner;
	

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
					AddSessions window = new AddSessions();
					window.frmAddNotAvailbleTime.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddSessions() {
		initialize();
	}
	
public void fillComboBox4() {
		
	
		
		try {
			Connection con = DBConnect.connect();
			
			String query="select * from lecturers";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String lec1=rs.getString("lectureName");
				comboBox.addItem(lec1);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}



public void fillLec2() {
	
	
	
	try {
		Connection con = DBConnect.connect();
		
		String query="select * from lecturers";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
		while(rs.next()) {
			String lec2=rs.getString("lectureName");
			comboBox_2.addItem(lec2);
		}
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}



public void fillSubject() {
	
	
	
	try {
		Connection con = DBConnect.connect();
		
		String query="select * from subjects";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
		while(rs.next()) {
			String sub=rs.getString("subName");
			comboBox_1.addItem(sub);
		}
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}


public void fillSubjectCode() {
	
	
	
	try {
		Connection con = DBConnect.connect();
		
		String query="select * from subjects";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
		while(rs.next()) {
			String subcode=rs.getString("subCode");
			comboBox_3.addItem(subcode);
		}
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}



public void fillStudentGrp() {
	
	
	
	try {
		Connection con = DBConnect.connect();
		
		String query="select * from studentGroups";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
		while(rs.next()) {
			String studentgrp=rs.getString("groupID");
			comboBox_4.addItem(studentgrp);
		}
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}



public void SubGrp() {
	
	
	
	try {
		Connection con = DBConnect.connect();
		
		String query="select * from studentGroups";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
		while(rs.next()) {
			String subgrp=rs.getString("subGroupID");
			comboBox_5.addItem(subgrp);
		}
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}




public void Tag() {
	
	
	
	try {
		Connection con = DBConnect.connect();
		
		String query="select * from tag";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
		while(rs.next()) {
			String subgrp=rs.getString("tagName");
			comboBox_4_1.addItem(subgrp);
		}
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddNotAvailbleTime = new JFrame();
		
		frmAddNotAvailbleTime.getContentPane().setBackground(new Color(21,25,28));
		frmAddNotAvailbleTime.setBackground(Color.YELLOW);
		frmAddNotAvailbleTime.setResizable(false);
		frmAddNotAvailbleTime.setTitle("Add Sessions");
		frmAddNotAvailbleTime.setBounds(350, 90, 1350, 900);
		//frmAddNotAvailbleTime.setSize(1500, 2000);
		
		frmAddNotAvailbleTime.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddNotAvailbleTime.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frmAddNotAvailbleTime.getContentPane().add(panel);
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
		frmAddNotAvailbleTime.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Sessions");
		btnNewButton.setForeground(new Color(21, 25, 28));
		btnNewButton.setBackground(new Color(152, 201, 45));
		btnNewButton.setBounds(12, 320, 240, 50);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnManageGroups = new JButton("Manage Sessions");
		btnManageGroups.setForeground(new Color(21, 25, 28));
		btnManageGroups.setBackground(new Color(152, 201, 45));
		btnManageGroups.setBounds(12, 383, 238, 50);
		btnManageGroups.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnManageGroups);
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setForeground(new Color(21, 25, 28));
		btnViewGroups_1.setBackground(new Color(152, 201, 45));
		
		btnViewGroups_1.setBounds(12, 598, 238, 50);
		btnViewGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png/"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JLabel lblNewLabel_1 = new JLabel("Add Sessions");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 152, 1082, 16);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frmAddNotAvailbleTime.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Select Lecturer 1");
		lblNewLabel_2.setBounds(272, 181, 252, 25);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 609, 1082, 74);
		panel_3.setBackground(Color.BLACK);
		frmAddNotAvailbleTime.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(new Color(21, 25, 28));
		btnClear.setBackground(new Color(152, 201, 45));
		btnClear.setBounds(264, 11, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
		JButton btnSave = new JButton("Submit");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String Lec1=(String) comboBox.getSelectedItem();
				String Lec2=(String) comboBox_2.getSelectedItem();
				String SubjectName=(String) comboBox_1.getSelectedItem();
				String SubjectCode=(String) comboBox_3.getSelectedItem();
				String StudentGrp=(String) comboBox_4.getSelectedItem();
				String SubGrp=(String) comboBox_5.getSelectedItem();
				String Tag=(String) comboBox_4_1.getSelectedItem();
				String NoOfStudents= spinner_1.getValue().toString();
				String Duration= spinner.getValue().toString();
				String SessionSignature=textField.getText();
				
				
if(textField.getText().equals("")||spinner_1.getValue().equals("")||spinner.getValue().equals("")||comboBox.getSelectedItem().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please Fill the form  First!");
				}else {
				
				try {

			
					
					
					 Connection con = DBConnect.connect();

	                    String query = "INSERT INTO session values(null, '" + Lec1 + "','" + Lec2 + "','" + SubjectName + "','" +
	                    		SubjectCode + "','" + StudentGrp + "','" + SubGrp + "','"+ Tag +"','"+ NoOfStudents +"','"+ Duration +"','"+ SessionSignature +"')";
	                  Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                   if (x == 0) {
	                        JOptionPane.showMessageDialog(btnSave, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(btnSave,"Session details successfully added!");
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                	
	                }
				}
			}
		});
		btnSave.setForeground(new Color(21, 25, 28));
		btnSave.setBackground(new Color(152, 201, 45));
		btnSave.setBounds(512, 11, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
		JButton btnGenerateSignature = new JButton("Generate Signature");
		btnGenerateSignature.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(comboBox.getSelectedItem().toString()+"(Lec1) - "+comboBox_2.getSelectedItem().toString()+"(Lec2) - "+comboBox_1.getSelectedItem().toString()+" - "+comboBox_3.getSelectedItem().toString()+" - (Group)"+comboBox_5.getSelectedItem().toString()+" - "+comboBox_4_1.getSelectedItem().toString()+" - "+spinner_1.getValue().toString()+"(Students) - "+spinner.getValue().toString()+"Hrs");
			}
		});
		btnGenerateSignature.setForeground(new Color(21, 25, 28));
		btnGenerateSignature.setBackground(new Color(152, 201, 45));
		btnGenerateSignature.setForeground(new Color(21, 25, 28));
		btnGenerateSignature.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnGenerateSignature.setBackground(new Color(152, 201, 45));
		btnGenerateSignature.setBounds(760, 11, 238, 50);
		panel_3.add(btnGenerateSignature);
		
		 comboBox = new JComboBox();
		 comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer 1"}));
		comboBox.setBounds(520, 179, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox);
		comboBox.setBackground(new Color(51, 51, 51));
		comboBox.setForeground(Color.WHITE);
		comboBox.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		 comboBox_1 = new JComboBox();
		 comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Subject"}));
		comboBox_1.setBounds(520, 242, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_1);
		comboBox_1.setBackground(new Color(51, 51, 51));
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblSelectGroup = new JLabel("Select Lecturer 2");
		lblSelectGroup.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectGroup.setBounds(849, 179, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectGroup);
		lblSelectGroup.setForeground(new Color(169, 224, 49));
		
		 comboBox_2 = new JComboBox();
		 comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer 2"}));
		comboBox_2.setBounds(1072, 179, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_2);
		comboBox_2.setBackground(new Color(51, 51, 51));
		comboBox_2.setForeground(Color.WHITE);
		comboBox_2.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblSelectSubGroup = new JLabel("Select  Subject Code");
		lblSelectSubGroup.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectSubGroup.setBounds(849, 245, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectSubGroup);
		lblSelectSubGroup.setForeground(new Color(169, 224, 49));
		
		 comboBox_3 = new JComboBox();
		 comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select Subject Code"}));
		comboBox_3.setBounds(1072, 242, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_3);
		comboBox_3.setBackground(new Color(51, 51, 51));
		comboBox_3.setForeground(Color.WHITE);
		comboBox_3.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		 comboBox_4 = new JComboBox();
		 comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Select Student Group"}));
		comboBox_4.setBounds(520, 311, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_4);
		comboBox_4.setBackground(new Color(51, 51, 51));
		comboBox_4.setForeground(Color.WHITE);
		comboBox_4.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblSelectDay = new JLabel("Select Sub Groups");
		lblSelectDay.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectDay.setBounds(849, 314, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectDay);
		lblSelectDay.setForeground(new Color(169, 224, 49));
		
		JLabel lblStartTime = new JLabel("Duration");
		lblStartTime.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblStartTime.setBounds(272, 466, 234, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblStartTime);
		lblStartTime.setForeground(new Color(169, 224, 49));
		
		 spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner.setBounds(520, 460, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(spinner);
		spinner.setBackground(new Color(51, 51, 51));
		spinner.setForeground(Color.WHITE);
		spinner.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		 spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner_1.setBounds(1072, 380, 258, 38);
		frmAddNotAvailbleTime.getContentPane().add(spinner_1);
		spinner_1.setBackground(new Color(51, 51, 51));
		spinner_1.setForeground(Color.WHITE);
		spinner_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		 comboBox_5 = new JComboBox();
		 comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Select Sub Group"}));
		comboBox_5.setBounds(1072, 311, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_5);
		comboBox_5.setBackground(new Color(51, 51, 51));
		comboBox_5.setForeground(Color.WHITE);
		comboBox_5.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblhours = new JLabel("(Hours)");
		lblhours.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblhours.setBounds(367, 465, 96, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblhours);
		lblhours.setForeground(new Color(169, 224, 49));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Select Subject");
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(272, 245, 241, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setForeground(new Color(169, 224, 49));
		
		JLabel lblSelectStudentGroup = new JLabel("Select Student Group");
		lblSelectStudentGroup.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectStudentGroup.setBounds(272, 314, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectStudentGroup);
		lblSelectStudentGroup.setForeground(new Color(169, 224, 49));
		
		JLabel lblSelectRoom_1 = new JLabel("Select Tag");
		lblSelectRoom_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectRoom_1.setBounds(272, 386, 234, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectRoom_1);
		lblSelectRoom_1.setForeground(new Color(169, 224, 49));
		
		JLabel lblSelectDay_1 = new JLabel("No Of Students");
		lblSelectDay_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectDay_1.setBounds(849, 386, 216, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSelectDay_1);
		lblSelectDay_1.setForeground(new Color(169, 224, 49));
		
		 comboBox_4_1 = new JComboBox();
		 comboBox_4_1.setModel(new DefaultComboBoxModel(new String[] {"Select Tag"}));
		comboBox_4_1.setBounds(520, 383, 262, 38);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_4_1);
		comboBox_4_1.setBackground(new Color(51, 51, 51));
		comboBox_4_1.setForeground(Color.WHITE);
		comboBox_4_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblGenerateSessionSignature = new JLabel("Generate Session Signature");
		lblGenerateSessionSignature.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblGenerateSessionSignature.setBounds(272, 534, 234, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblGenerateSessionSignature);
		lblGenerateSessionSignature.setForeground(new Color(169, 224, 49));
		
		textField = new JTextField();
		textField.setBounds(516, 524, 810, 48);
		textField.setBackground(new Color(51, 51, 51));
		textField.setForeground(Color.WHITE);
		textField.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		frmAddNotAvailbleTime.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		fillComboBox4();
		fillLec2();
		fillSubject();
		fillSubjectCode();
		fillStudentGrp();
		SubGrp();
		Tag();
	 
	    
	}
}
