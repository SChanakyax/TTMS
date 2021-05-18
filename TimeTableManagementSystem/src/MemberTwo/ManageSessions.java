package MemberTwo;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;

public class ManageSessions {

	private JFrame frmAddNotAvailbleTime;
	private JTable table;
	private JTextField textField;
	private JTable table_1;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JComboBox comboBox_2;
	private JComboBox comboBox_1;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_1_1_1;
	private JComboBox comboBox_1_1;
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
					ManageSessions window = new ManageSessions();
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
	public ManageSessions() {
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
			comboBox_1_1.addItem(studentgrp);
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
			comboBox_4.addItem(subgrp);
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
			comboBox_1_1_1.addItem(subgrp);
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
		frmAddNotAvailbleTime.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				try {
					Connection con = DBConnect.connect();
					
					String query="select * from session ";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		frmAddNotAvailbleTime.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmAddNotAvailbleTime.getContentPane().setBackground(new Color(21, 25, 28));
		frmAddNotAvailbleTime.setBackground(Color.YELLOW);
		frmAddNotAvailbleTime.setResizable(false);
		frmAddNotAvailbleTime.setTitle("Manage Sessions");
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
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(169, 224, 49));
		//lblNewLabel.setForeground(Color.YELLOW);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 657);
		panel_1.setBackground(new Color(51, 51, 51));
		//panel_1.setBackground(Color.BLACK);
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
		btnManageGroups.setBounds(12, 383, 240, 50);
		btnManageGroups.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnManageGroups);
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setForeground(new Color(21, 25, 28));
		btnViewGroups_1.setBackground(new Color(152, 201, 45));
		btnViewGroups_1.setBounds(12, 585, 238, 50);
		btnViewGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png/"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JLabel lblNewLabel_1 = new JLabel("Manage Sessions");
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(272, 409, 1063, 326);
		panel_3.setBackground(Color.BLACK);
		frmAddNotAvailbleTime.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Select Lecturer 1");
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2.setBounds(274, 268, 252, 25);
		lblNewLabel_2.setBounds(12, 35, 252, 25);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 20, 252, 25);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Select Subject");
		lblNewLabel_2_1_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_1.setBounds(274, 268, 252, 25);
		lblNewLabel_2_1_1.setBounds(12, 35, 252, 25);
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(10, 72, 241, 25);
		panel_3.add(lblNewLabel_2_1_1);
		
		JLabel lblSelectStudentGroup = new JLabel("Select Student Group");
		lblSelectStudentGroup.setForeground(new Color(169, 224, 49));
		lblSelectStudentGroup.setBounds(274, 268, 252, 25);
		lblSelectStudentGroup.setBounds(12, 35, 252, 25);
		lblSelectStudentGroup.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectStudentGroup.setBounds(10, 121, 216, 25);
		panel_3.add(lblSelectStudentGroup);
		
		JLabel lblSelectRoom_1 = new JLabel("Select Tag");
		lblSelectRoom_1.setForeground(new Color(169, 224, 49));
		lblSelectRoom_1.setBounds(274, 268, 252, 25);
		lblSelectRoom_1.setBounds(12, 35, 252, 25);
		lblSelectRoom_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectRoom_1.setBounds(10, 181, 234, 25);
		panel_3.add(lblSelectRoom_1);
		
		JLabel lblStartTime = new JLabel("Duration");
		lblStartTime.setForeground(new Color(169, 224, 49));
		lblStartTime.setBounds(274, 268, 252, 25);
		lblStartTime.setBounds(12, 35, 252, 25);
		lblStartTime.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblStartTime.setBounds(10, 230, 234, 25);
		panel_3.add(lblStartTime);
		
		/*JLabel lblGenerateSessionSignature = new JLabel("Generate Session Signature");
		lblGenerateSessionSignature.setForeground(new Color(169, 224, 49));
		lblGenerateSessionSignature.setBounds(274, 268, 252, 25);
		lblGenerateSessionSignature.setBounds(12, 35, 252, 25);
		lblGenerateSessionSignature.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblGenerateSessionSignature.setBounds(10, 284, 234, 25);
		panel_3.add(lblGenerateSessionSignature);
		
		JButton btnGenerateSignature = new JButton("Generate Signature");
		btnGenerateSignature.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(comboBox.getSelectedItem().toString()+"(Lec1) - "+comboBox_2.getSelectedItem().toString()+"(Lec2) - "+comboBox_1.getSelectedItem().toString()+" - "+comboBox_3.getSelectedItem().toString()+" - (Group)"+comboBox_4.getSelectedItem().toString()+" - "+comboBox_1_1_1.getSelectedItem().toString()+" - "+spinner_1.getValue().toString()+"(Students) - "+spinner.getValue().toString()+"Hrs");
			}
		});
		*/
		
		 comboBox = new JComboBox();
		 comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer 1"}));
		comboBox.setBackground(new Color(51, 51, 51));
		comboBox.setForeground(Color.WHITE);
		comboBox.setSelectedItem(" ");
		comboBox.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		comboBox.setBounds(254, 17, 262, 28);
		panel_3.add(comboBox);
		
		 comboBox_1 = new JComboBox();
		 comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Subject"}));
		comboBox_1.setBackground(new Color(51, 51, 51));
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		comboBox_1.setBounds(254, 76, 262, 25);
		panel_3.add(comboBox_1);
		
		 comboBox_1_1 = new JComboBox();
		 comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select Student Group"}));
		comboBox_1_1.setBackground(new Color(51, 51, 51));
		comboBox_1_1.setSelectedItem(" ");
		comboBox_1_1.setForeground(Color.WHITE);
		comboBox_1_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		comboBox_1_1.setBounds(254, 123, 262, 28);
		panel_3.add(comboBox_1_1);
		
		 comboBox_1_1_1 = new JComboBox();
		 comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select Tag"}));
		comboBox_1_1_1.setBackground(new Color(51, 51, 51));
		comboBox_1_1_1.setForeground(Color.WHITE);
		comboBox_1_1_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		comboBox_1_1_1.setBounds(254, 177, 262, 28);
		panel_3.add(comboBox_1_1_1);
		
		 spinner = new JSpinner();
		spinner.setBackground(new Color(51, 51, 51));
		spinner.setForeground(Color.WHITE);
		spinner.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		spinner.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner.setBounds(254, 224, 262, 28);
		panel_3.add(spinner);
		
		JLabel lblSelectGroup = new JLabel("Select Lecturer 2");
		lblSelectGroup.setForeground(new Color(169, 224, 49));
		lblSelectGroup.setBounds(274, 268, 252, 25);
		lblSelectGroup.setBounds(12, 35, 252, 25);
		lblSelectGroup.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectGroup.setBounds(587, 20, 216, 25);
		panel_3.add(lblSelectGroup);
		
		JLabel lblSelectSubGroup = new JLabel("Select  Subject Code");
		lblSelectSubGroup.setForeground(new Color(169, 224, 49));
		lblSelectSubGroup.setBounds(274, 268, 252, 25);
		lblSelectSubGroup.setBounds(12, 35, 252, 25);
		lblSelectSubGroup.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblSelectSubGroup.setBounds(587, 72, 194, 25);
		panel_3.add(lblSelectSubGroup);
		
		JLabel lblSelectDay = new JLabel("Select Sub Groups");
		lblSelectDay.setForeground(new Color(169, 224, 49));
		lblSelectDay.setBounds(274, 268, 252, 25);
		lblSelectDay.setBounds(12, 35, 252, 25);
		lblSelectDay.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectDay.setBounds(587, 121, 216, 25);
		panel_3.add(lblSelectDay);
		
		JLabel lblSelectDay_1 = new JLabel("No Of Students");
		lblSelectDay_1.setForeground(new Color(169, 224, 49));
		lblSelectDay_1.setBounds(274, 268, 252, 25);
		lblSelectDay_1.setBounds(12, 35, 252, 25);
		lblSelectDay_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectDay_1.setBounds(587, 181, 216, 25);
		panel_3.add(lblSelectDay_1);
		
		 comboBox_2 = new JComboBox();
		 comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer 2"}));
		comboBox_2.setBounds(791, 17, 262, 28);
		panel_3.add(comboBox_2);
		comboBox_2.setBackground(new Color(51, 51, 51));
		comboBox_2.setForeground(Color.WHITE);
		comboBox_2.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		 comboBox_3 = new JComboBox();
		 comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select Subject Code"}));
		comboBox_3.setBounds(791, 72, 262, 28);
		panel_3.add(comboBox_3);
		comboBox_3.setBackground(new Color(51, 51, 51));
		comboBox_3.setForeground(Color.WHITE);
		comboBox_3.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		 comboBox_4 = new JComboBox();
		 comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Select Sub Group"}));
		comboBox_4.setBounds(791, 121, 262, 28);
		panel_3.add(comboBox_4);
		comboBox_4.setBackground(new Color(51, 51, 51));
		comboBox_4.setForeground(Color.WHITE);
		comboBox_4.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		 spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner_1.setBounds(791, 178, 262, 28);
		panel_3.add(spinner_1);
		spinner_1.setBackground(new Color(51, 51, 51));
		spinner_1.setForeground(Color.WHITE);
		spinner_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		textField = new JTextField();
		textField.setBackground(new Color(51, 51, 51));
		textField.setForeground(Color.WHITE);
		textField.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		textField.setColumns(10);
		textField.setBounds(253, 281, 800, 34);
		panel_3.add(textField);
		textField.setBackground(new Color(51, 51, 51));
		textField.setForeground(Color.WHITE);
		textField.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblSelectDay_1_1 = new JLabel("SessionID");
		lblSelectDay_1_1.setForeground(Color.BLACK);
		lblSelectDay_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblSelectDay_1_1.setBounds(587, 238, 216, 25);
		panel_3.add(lblSelectDay_1_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(Color.BLACK, 3));
		textField_1.setBackground(Color.BLACK);
		textField_1.setBounds(791, 228, 262, 34);
		panel_3.add(textField_1);
		
		JButton btnGenerateRank = new JButton("Generate Signature");
		btnGenerateRank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(comboBox.getSelectedItem().toString()+"(Lec1) - "+comboBox_2.getSelectedItem().toString()+"(Lec2) - "+comboBox_1.getSelectedItem().toString()+" - "+comboBox_3.getSelectedItem().toString()+" - (Group)"+comboBox_4.getSelectedItem().toString()+" - "+comboBox_1_1_1.getSelectedItem().toString()+" - "+spinner_1.getValue().toString()+"(Students) - "+spinner.getValue().toString()+"Hrs");
			}
		});
		btnGenerateRank.setForeground(new Color(21, 25, 28));
		btnGenerateRank.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnGenerateRank.setBackground(new Color(152, 201, 45));
		btnGenerateRank.setBounds(20, 275, 139, 40);
		panel_3.add(btnGenerateRank);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 166, 894, 229);
		frmAddNotAvailbleTime.getContentPane().add(scrollPane);
		
		
		//scrollPane.setViewportView(table);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int selectedRow=table_1.getSelectedRow();
				
				textField.setText(table_1.getValueAt(selectedRow, 10).toString());
				textField_1.setText(table_1.getValueAt(selectedRow, 0).toString());
				
				
				String comboLec1 = table_1.getValueAt(selectedRow, 1).toString();
				for(int i=0; i<comboBox.getItemCount();i++) {
					if(comboBox.getItemAt(i).toString().equalsIgnoreCase(comboLec1)) {
						comboBox.setSelectedIndex(i);
					}
				}
				
				
				String comboLec2 = table_1.getValueAt(selectedRow, 2).toString();
				for(int i=0; i<comboBox_2.getItemCount();i++) {
					if(comboBox_2.getItemAt(i).toString().equalsIgnoreCase(comboLec2)) {
						comboBox_2.setSelectedIndex(i);
					}
				}
				
				
				String comboSubjectName = table_1.getValueAt(selectedRow, 3).toString();
				for(int i=0; i<comboBox_1.getItemCount();i++) {
					if(comboBox_1.getItemAt(i).toString().equalsIgnoreCase(comboSubjectName)) {
						comboBox_1.setSelectedIndex(i);
					}
				}
				
				
				String comboSubjectCode = table_1.getValueAt(selectedRow, 4).toString();
				for(int i=0; i<comboBox_3.getItemCount();i++) {
					if(comboBox_3.getItemAt(i).toString().equalsIgnoreCase(comboSubjectCode)) {
						comboBox_3.setSelectedIndex(i);
					}
				}
				
				
				String comboStudentGrp = table_1.getValueAt(selectedRow, 5).toString();
				for(int i=0; i<comboBox_1_1.getItemCount();i++) {
					if(comboBox_1_1.getItemAt(i).toString().equalsIgnoreCase(comboStudentGrp)) {
						comboBox_1_1.setSelectedIndex(i);
					}
				}
				
				String comboStudentSubGrp = table_1.getValueAt(selectedRow, 6).toString();
				for(int i=0; i<comboBox_4.getItemCount();i++) {
					if(comboBox_4.getItemAt(i).toString().equalsIgnoreCase(comboStudentSubGrp)) {
						comboBox_4.setSelectedIndex(i);
					}
				}
				
				String comboTag = table_1.getValueAt(selectedRow, 7).toString();
				for(int i=0; i<comboBox_1_1_1.getItemCount();i++) {
					if(comboBox_1_1_1.getItemAt(i).toString().equalsIgnoreCase(comboTag)) {
						comboBox_1_1_1.setSelectedIndex(i);
					}
				}
				
				spinner_1.setValue((Integer)table_1.getValueAt(selectedRow, 8));
				spinner.setValue((Integer)table_1.getValueAt(selectedRow, 9));
				
				
				
			}
		});
		
		scrollPane.setViewportView(table_1);
		
		JButton btnNewButton_1 = new JButton("Refresh");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*try {
					Connection con = DBConnect.connect();
					
					String query="select * from session ";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}*/
			}
		});
		btnNewButton_1.setForeground(new Color(21, 25, 28));
		btnNewButton_1.setBackground(new Color(152, 201, 45));
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton_1.setBounds(1176, 166, 157, 51);
		frmAddNotAvailbleTime.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Update");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textField.getText().equals("")||spinner_1.getValue().equals("")||spinner.getValue().equals("")||comboBox.getSelectedItem().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please Fill the form  First!");
				}else {
				
				
				try {
					Connection con = DBConnect.connect();
					
					String query="Update session set lec1Name ='"+comboBox.getSelectedItem()+"',lec2Name	='"+comboBox_2.getSelectedItem()+"',subName		='"+comboBox_1.getSelectedItem()+"',subCode	='"+comboBox_3.getSelectedItem()+"',studentGroup ='"+comboBox_1_1.getSelectedItem()+"',subGroupID ='"+comboBox_4.getSelectedItem()+"',tag	='"+comboBox_1_1_1.getSelectedItem()+"',NoOfStudents='"+spinner_1.getValue()+"',duration	='"+spinner.getValue()+"',sessionSignature	='"+textField.getText()+"' where sessionID	='"+textField_1.getText()+"' ";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Session Data Updated");
					pst.close();
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}}
		});
		btnNewButton_1_1.setForeground(new Color(21, 25, 28));
		btnNewButton_1_1.setBackground(new Color(152, 201, 45));
		btnNewButton_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(1176, 228, 157, 49);
		frmAddNotAvailbleTime.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Delete");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con = DBConnect.connect();
					String query="Delete from session where sessionID='"+textField_1.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Deleted");
					pst.close();
					
					}
					catch(Exception ex) {
						ex.printStackTrace();
						
					}
			}
		});
		btnNewButton_1_2.setForeground(new Color(21, 25, 28));
		btnNewButton_1_2.setBackground(new Color(152, 201, 45));
		btnNewButton_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton_1_2.setBounds(1176, 288, 157, 48);
		frmAddNotAvailbleTime.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Clear");
		btnNewButton_1_3.setForeground(new Color(21, 25, 28));
		btnNewButton_1_3.setBackground(new Color(152, 201, 45));
		btnNewButton_1_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton_1_3.setBounds(1176, 347, 157, 48);
		frmAddNotAvailbleTime.getContentPane().add(btnNewButton_1_3);
		
		fillComboBox4();
		fillLec2();
		fillSubject();
		fillSubjectCode();
		fillStudentGrp();
		SubGrp();
		Tag();
	 
	    
	}
}
