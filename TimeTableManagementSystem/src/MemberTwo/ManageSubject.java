package MemberTwo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
import net.proteanit.sql.DbUtils;

import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ManageSubject {


	private JFrame frameManageLocation;
	private JTextField txtMLBuildingName;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField_2;

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
					ManageSubject window = new ManageSubject();
					window.frameManageLocation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManageSubject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameManageLocation = new JFrame();
		frameManageLocation.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				try {
					Connection con = DBConnect.connect();
					
					String query="select * from subjects ";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table_2.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		frameManageLocation.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frameManageLocation.getContentPane().setBackground(new Color(21, 25, 28));
		frameManageLocation.setBackground(Color.YELLOW);
		frameManageLocation.setResizable(false);
		frameManageLocation.setTitle("Manage Subjects");
		frameManageLocation.setBounds(350, 90, 1350, 900);
		//frameManageLocation.setSize(1500, 2000);
		frameManageLocation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameManageLocation.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frameManageLocation.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(169, 224, 49));
		//lblNewLabel.setForeground(Color.YELLOW);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 681);
		panel_1.setBackground(new Color(51, 51, 51));
		//panel_1.setBackground(Color.BLACK);
		frameManageLocation.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Subjects");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBounds(12, 320, 238, 50);
		btnNewButton.setForeground(new Color(21, 25, 28));
		btnNewButton.setBackground(new Color(152, 201, 45));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnManageGroups = new JButton("Manage Subjects");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnManageGroups.setBounds(12, 383, 240, 50);
		btnManageGroups.setForeground(new Color(21, 25, 28));
		btnManageGroups.setBackground(new Color(152, 201, 45));
		btnManageGroups.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnManageGroups);
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setForeground(new Color(21, 25, 28));
		btnViewGroups_1.setBackground(new Color(152, 201, 45));
		btnViewGroups_1.setBounds(12, 599, 238, 50);
		btnViewGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JLabel lblNewLabel_1 = new JLabel("Manage Subjects");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		frameManageLocation.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frameManageLocation.getContentPane().add(separator);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(272, 452, 1082, 296);
		panel_3.setBackground(Color.BLACK);
		frameManageLocation.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Offered Year");
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2.setBounds(12, 35, 164, 25);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
	
		
		JLabel lblNewLabel_2_1 = new JLabel("Offered Semester");
		lblNewLabel_2_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1.setBounds(12, 93, 187, 25);
		panel_3.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
	
		
		JLabel lblNewLabel_2_1_1 = new JLabel("No Of Lecture Hours");
		lblNewLabel_2_1_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_1.setBounds(523, 35, 233, 25);
		panel_3.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
		txtMLBuildingName = new JTextField();
		txtMLBuildingName.setBounds(205, 30, 218, 36);
		txtMLBuildingName.setFont(new Font("Tahoma", Font.BOLD, 20));		
		txtMLBuildingName.setColumns(10);
		panel_3.add(txtMLBuildingName);
		txtMLBuildingName.setColumns(10);
		txtMLBuildingName.setBackground(new Color(51, 51, 51));
		txtMLBuildingName.setForeground(Color.WHITE);
		txtMLBuildingName.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Subject Name");
		lblNewLabel_2_1_3.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_3.setBounds(12, 159, 149, 25);
		panel_3.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Subject Code");
		lblNewLabel_2_1_4.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_4.setBounds(12, 232, 149, 25);
		panel_3.add(lblNewLabel_2_1_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(205, 154, 218, 36);
		panel_3.add(textField);
		textField.setBackground(new Color(51, 51, 51));
		textField.setForeground(Color.WHITE);
		textField.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(205, 227, 218, 36);
		panel_3.add(textField_1);
		textField_1.setBackground(new Color(51, 51, 51));
		textField_1.setForeground(Color.WHITE);
		textField_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1st Semester");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton.setBounds(205, 91, 109, 36);
		panel_3.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(51, 51, 51));
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2nd Semester");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1.setBounds(314, 91, 109, 36);
		panel_3.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBackground(new Color(51, 51, 51));
		rdbtnNewRadioButton_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("No Of Tutorial Hours");
		lblNewLabel_2_1_1_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBounds(523, 93, 233, 25);
		panel_3.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("No Of LabHours");
		lblNewLabel_2_1_1_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_1_2.setBounds(523, 159, 233, 25);
		panel_3.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("No Of Evaluation Hours");
		lblNewLabel_2_1_1_3.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_1_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_1_3.setBounds(523, 232, 233, 25);
		panel_3.add(lblNewLabel_2_1_1_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(864, 31, 109, 35);
		panel_3.add(spinner);
		spinner.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		spinner.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(864, 92, 109, 35);
		panel_3.add(spinner_1);
		spinner_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		spinner_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(864, 158, 109, 35);
		panel_3.add(spinner_2);
		spinner_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		spinner_2.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(864, 231, 109, 35);
		panel_3.add(spinner_3);
		spinner_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		spinner_3.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(Color.BLACK);
		textField_2.setBounds(441, 138, 64, 25);
		panel_3.add(textField_2);
		
	
		
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = DBConnect.connect();
					String query="Delete from subjects where subID='"+textField_2.getText()+"'";
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
		btnDelete.setForeground(new Color(21, 25, 28));
		btnDelete.setBackground(new Color(152, 201, 45));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(1185, 304, 139, 50);
		frameManageLocation.getContentPane().add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con = DBConnect.connect();
					
					String Semester=null;
					//check radio buttons
					 if (rdbtnNewRadioButton.isSelected()) { 
		                	Semester = "1st semester";
		                } 
		  
		                else if (rdbtnNewRadioButton_1.isSelected()) { 
		                	Semester = "2nd semester"; 
		                } 
		                else { 
		                	JOptionPane.showMessageDialog(panel, "Please select a Type", "Warning",JOptionPane.WARNING_MESSAGE);
		                } 
					
					String query="Update subjects set year='"+txtMLBuildingName.getText()+"',semester='"+Semester+"',subName='"+textField.getText()+"',subCode='"+textField_1.getText()+"',lectureHours='"+spinner.getValue()+"',tuteHours='"+spinner_1.getValue()+"',labHours='"+spinner_2.getValue()+"',evaluationHours='"+spinner_3.getValue()+"' where subID='"+textField_2.getText()+"' ";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Updated");
					pst.close();
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnUpdate.setForeground(new Color(21, 25, 28));
		btnUpdate.setBackground(new Color(152, 201, 45));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBounds(1183, 243, 139, 50);
		frameManageLocation.getContentPane().add(btnUpdate);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*try {
					Connection con = DBConnect.connect();
					
					String query1="select * from subjects ";
					PreparedStatement pst=con.prepareStatement(query1);
					ResultSet rs1=pst.executeQuery();
					table_2.setModel(DbUtils.resultSetToTableModel(rs1));
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}*/
			}
		});
		btnRefresh.setForeground(new Color(21, 25, 28));
		btnRefresh.setBackground(new Color(152, 201, 45));
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRefresh.setBounds(1183, 181, 139, 50);
		frameManageLocation.getContentPane().add(btnRefresh);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(new Color(21, 25, 28));
		btnClear.setBackground(new Color(152, 201, 45));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(1185, 365, 139, 50);
		frameManageLocation.getContentPane().add(btnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 164, 903, 274);
		frameManageLocation.getContentPane().add(scrollPane);
		
		table_2 = new JTable();
		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int selectedRow=table_2.getSelectedRow();		
				textField_2.setText(table_2.getValueAt(selectedRow, 0).toString());
				txtMLBuildingName.setText(table_2.getValueAt(selectedRow, 1).toString());
				//textField.setText(table_2.getValueAt(selectedRow, 2).toString());
				
				String sem = table_2.getValueAt(selectedRow, 2).toString(); 
				if(sem.equals("1st semester"))
				{
					rdbtnNewRadioButton.setSelected(true);
					rdbtnNewRadioButton_1.setSelected(false);
				}
				else {
					rdbtnNewRadioButton_1.setSelected(true);
					rdbtnNewRadioButton.setSelected(false);
				}
				textField.setText(table_2.getValueAt(selectedRow, 3).toString());
				textField_1.setText(table_2.getValueAt(selectedRow, 4).toString());
				
				spinner.setValue((Integer)table_2.getValueAt(selectedRow, 5));
				spinner_1.setValue((Integer)table_2.getValueAt(selectedRow, 6));
				spinner_2.setValue((Integer)table_2.getValueAt(selectedRow, 7));
				spinner_3.setValue((Integer)table_2.getValueAt(selectedRow, 8));
		
			}	});
		
		scrollPane.setViewportView(table_2);
	 
	    
	}
}
