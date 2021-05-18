package Member1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;

import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsecutiveSessions {

	private JFrame frmAddStudentGroups;
	private JTextField textField_2;
	private JTable table;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
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
					ConsecutiveSessions window = new ConsecutiveSessions();
					window.frmAddStudentGroups.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void fillComboBox() {
	try {
		Connection con = DBConnect.connect();
		
		String query="select * from session";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
		while(rs.next()) {
			String name=rs.getString("sessionSignature");
			comboBox.addItem(name);
		}
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	}
	
	
	public void fillComboBox1() {
		try {
			Connection con = DBConnect.connect();
			
			String query="select * from session";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String name=rs.getString("sessionSignature");
				comboBox_1.addItem(name);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		}
	
	

	/**
	 * Create the application.
	 */
	public ConsecutiveSessions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentGroups = new JFrame();
		frmAddStudentGroups.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {

				try {
					Connection con = DBConnect.connect();
					
					String query="select * from session ";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
				
				
				
			}
		});
		
		
		
		
		
		
		
		frmAddStudentGroups.getContentPane().setBackground(new Color(21,25,28));
		frmAddStudentGroups.setBackground(Color.YELLOW);
		frmAddStudentGroups.setResizable(false);
		frmAddStudentGroups.setTitle("Make Consecutive Sessions");
		//frmAddStudentGroups.setSize(1400, 860);
		frmAddStudentGroups.setBounds(350, 90, 1350, 900);
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 793);
		panel_1.setBackground(new Color(51, 51, 51));
		frmAddStudentGroups.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Consecutive ");
		btnNewButton.setBounds(12, 320, 252, 50);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		btnNewButton.setForeground(new Color(21, 25, 28));
		btnNewButton.setBackground(new Color(152, 201, 45));
		
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.setBorder(UIManager.getBorder("Button.border"));
		btnNewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton.setFocusPainted(false);
		
		JButton btnManageGroups = new JButton("Parallel");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				ParallelSession itm = new ParallelSession();
				try {
					ParallelSession.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frmAddStudentGroups.setVisible(false);
				
			}
		});
		btnManageGroups.setBounds(12, 383, 238, 50);
		
		panel_1.add(btnManageGroups);
		btnManageGroups.setForeground(new Color(21, 25, 28));
		btnManageGroups.setBackground(new Color(152, 201, 45));
		
		btnManageGroups.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnManageGroups.setBorder(UIManager.getBorder("Button.border"));
		btnManageGroups.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnManageGroups.setFocusPainted(false);
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setBounds(12, 724, 238, 50);
		btnViewGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		btnViewGroups_1.setForeground(new Color(21, 25, 28));
		btnViewGroups_1.setBackground(new Color(152, 201, 45));
		
		
		btnViewGroups_1.setBorder(UIManager.getBorder("Button.border"));
		btnViewGroups_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnViewGroups_1.setFocusPainted(false);
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png/"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JButton btnManageGroups_1 = new JButton("NonOverlapping");
		btnManageGroups_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				NonOverlappingSession itm = new NonOverlappingSession();
				try {
					NonOverlappingSession.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frmAddStudentGroups.setVisible(false);
				
				
				
			}
		});
		btnManageGroups_1.setForeground(new Color(21, 25, 28));
		btnManageGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnManageGroups_1.setFocusPainted(false);
		btnManageGroups_1.setBorder(UIManager.getBorder("Button.border"));
		btnManageGroups_1.setBackground(new Color(152, 201, 45));
		btnManageGroups_1.setBounds(12, 444, 238, 50);
		panel_1.add(btnManageGroups_1);
		
		table = new JTable();
		table.setBounds(197, 620, 1, 1);
		panel_1.add(table);
		
		JLabel lblNewLabel_1 = new JLabel("Make Consecutive Sessions");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 18);
		separator.setForeground(Color.WHITE);
		separator.setBackground(Color.WHITE);
		frmAddStudentGroups.getContentPane().add(separator);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(274, 238, 1060, 241);
		panel_3.setBackground(new Color(0, 0, 0));
		frmAddStudentGroups.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Select Lecture");
		lblNewLabel_2_1.setBounds(441, 6, 152, 25);
		panel_3.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1.setBackground(new Color(0, 204, 51));
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setBounds(66, 60, 940, 40);
		panel_3.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1.setBounds(66, 161, 940, 40);
		panel_3.add(comboBox_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Select Tutorial");
		lblNewLabel_2_1_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBackground(new Color(0, 204, 51));
		lblNewLabel_2_1_1.setBounds(441, 123, 152, 25);
		panel_3.add(lblNewLabel_2_1_1);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBackground(Color.BLACK);
		panel_3_1_1.setBounds(274, 571, 1060, 154);
		frmAddStudentGroups.getContentPane().add(panel_3_1_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(12, 38, 1036, 34);
		panel_3_1_1.add(textField_2);
		
		JButton btnMakeSession = new JButton("Genarate Session");
		btnMakeSession.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField_2.setText("Consecutive Session:("+comboBox.getSelectedItem().toString()+")+("+comboBox_1.getSelectedItem().toString()+")");
				
			}
		});
		btnMakeSession.setForeground(new Color(21, 25, 28));
		btnMakeSession.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnMakeSession.setFocusPainted(false);
		btnMakeSession.setBorder(UIManager.getBorder("Button.border"));
		btnMakeSession.setBackground(new Color(152, 201, 45));
		btnMakeSession.setBounds(451, 97, 195, 34);
		panel_3_1_1.add(btnMakeSession);
		
		JButton btnManageGroups_2_1 = new JButton("Add Session");
		btnManageGroups_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String session= textField_2.getText();
				
				
				
				
				 try {
					 Connection con = DBConnect.connect();

	                    String query = "INSERT INTO consecutiveSession values(null, null, null,'" + session + "')";

	                    Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                        JOptionPane.showMessageDialog(btnManageGroups_2_1, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(btnManageGroups_2_1,
	                            "Session is Successfully added!");
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                	
	                }
				
				
				
			}
			
			
			
			
			
			
			
		});
		btnManageGroups_2_1.setBounds(1136, 804, 196, 48);
		frmAddStudentGroups.getContentPane().add(btnManageGroups_2_1);
		btnManageGroups_2_1.setForeground(new Color(21, 25, 28));
		btnManageGroups_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnManageGroups_2_1.setFocusPainted(false);
		btnManageGroups_2_1.setBorder(UIManager.getBorder("Button.border"));
		btnManageGroups_2_1.setBackground(new Color(152, 201, 45));
	 
	 fillComboBox();
	 fillComboBox1();
	    
	}
}
