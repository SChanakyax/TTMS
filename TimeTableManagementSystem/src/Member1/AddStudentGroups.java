package Member1;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import dbConnect.DBConnect;

import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AddStudentGroups {

	private JFrame frmAddStudentGroups;
	private JSpinner SubGroupNumber;
	private JSpinner GroupNumber;
	private JTextPane GroupID;
	private JTextPane SubGroupID;
	private JComboBox AYS;
	private JComboBox Programme;
	private JTextField GID;
	private JLabel lbl;
	
	
	
	

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
					AddStudentGroups window = new AddStudentGroups();
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
	public AddStudentGroups() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentGroups = new JFrame();
		frmAddStudentGroups.setTitle("Add Student Groups");
		frmAddStudentGroups.getContentPane().setBackground(new Color(21,25,28));
		frmAddStudentGroups.setBackground(Color.YELLOW);
		frmAddStudentGroups.setResizable(false);
		//frmAddStudentGroups.setSize(1400, 860);
		//frmAddStudentGroups.setBounds(350, 90, 1350, 900);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frmAddStudentGroups.pack();
		frmAddStudentGroups.setSize(screenSize.width,screenSize.height);
		
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
		
		JButton btnNewButton = new JButton("Add Groups");
		btnNewButton.setBounds(12, 320, 252, 50);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		btnNewButton.setForeground(new Color(21, 25, 28));
		btnNewButton.setBackground(new Color(152, 201, 45));
		
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.setBorder(UIManager.getBorder("Button.border"));
		btnNewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton.setFocusPainted(false);
		
		JButton btnManageGroups = new JButton("Manage Groups");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ManageStudentGroups itm = new ManageStudentGroups();
				try {
					ManageStudentGroups.main(null);
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
		
		JLabel lblNewLabel_1 = new JLabel("Add Student Groups");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(Color.WHITE);
		separator.setBackground(Color.WHITE);
		frmAddStudentGroups.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Academic Year Semester");
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2.setBackground(new Color(0, 204, 51));
		lblNewLabel_2.setBounds(274, 254, 252, 25);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2);
		
		SubGroupNumber = new JSpinner();
		SubGroupNumber.setForeground(new Color(255, 255, 255));
		SubGroupNumber.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		SubGroupNumber.setBackground(new Color(31, 36, 42));
		SubGroupNumber.setBounds(524, 562, 262, 38);
		SubGroupNumber.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		SubGroupNumber.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(SubGroupNumber);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 658, 1082, 124);
		panel_3.setBackground(new Color(0, 0, 0));
		frmAddStudentGroups.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				GID.setText(null);
				SubGroupID.setText(null);
				
			}
		});
		btnClear.setBounds(268, 42, 238, 50);
		panel_3.add(btnClear);
		btnClear.setForeground(new Color(21, 25, 28));
		btnClear.setBackground(new Color(152, 201, 45));
		
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnClear.setBorder(UIManager.getBorder("Button.border"));
		btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnClear.setFocusPainted(false);
		
		JButton btnAddGroup = new JButton("Add Group");
		btnAddGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				String ays= AYS.getSelectedItem().toString();
				String program= Programme.getSelectedItem().toString();
				String groupnumber= GroupNumber.getValue().toString();
				String subgroupnumber= SubGroupNumber.getValue().toString();
				String groupid = GID.getText();
				String subgroupid = SubGroupID.getText();
				
				
				
				
				if(GID.getText().equals("")||SubGroupID.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please Genarate IDs First!");
				}else {
				
				try {
					 Connection con = DBConnect.connect();

	                    String query = "INSERT INTO studentGroups values(null, '" + ays + "','" + program + "','" + groupnumber + "', '" + subgroupnumber + "', '" + groupid + "', '" + subgroupid + "')";

	                    Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                        JOptionPane.showMessageDialog(btnAddGroup, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(btnAddGroup,
	                            "Student Group is sucessfully Added!");
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
	                	
	                }
				
				}
				
				
				
				
			}
		});
		btnAddGroup.setForeground(new Color(21, 25, 28));
		btnAddGroup.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnAddGroup.setFocusPainted(false);
		btnAddGroup.setBorder(UIManager.getBorder("Button.border"));
		btnAddGroup.setBackground(new Color(152, 201, 45));
		btnAddGroup.setBounds(533, 42, 238, 50);
		panel_3.add(btnAddGroup);
		
		JLabel lblNewLabel_2_1 = new JLabel("programme");
		lblNewLabel_2_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1.setBackground(new Color(0, 204, 51));
		lblNewLabel_2_1.setBounds(274, 364, 252, 25);
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Group Number");
		lblNewLabel_2_1_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBackground(new Color(0, 204, 51));
		lblNewLabel_2_1_1.setBounds(274, 471, 252, 25);
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Sub Group Number");
		lblNewLabel_2_1_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_2.setBackground(new Color(0, 204, 51));
		lblNewLabel_2_1_2.setBounds(274, 575, 252, 25);
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_2);
		
		GroupNumber = new JSpinner();
		GroupNumber.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		GroupNumber.setForeground(Color.WHITE);
		GroupNumber.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		GroupNumber.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		GroupNumber.setBackground(new Color(31, 36, 42));
		GroupNumber.setBounds(524, 458, 262, 38);
		frmAddStudentGroups.getContentPane().add(GroupNumber);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.controlDkShadow);
		panel_2.setForeground(Color.GREEN);
		panel_2.setBounds(851, 238, 481, 275);
		frmAddStudentGroups.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Sub Group ID");
		lblNewLabel_2_2_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_2_1.setBackground(new Color(0, 204, 51));
		lblNewLabel_2_2_1.setBounds(12, 104, 215, 25);
		panel_2.add(lblNewLabel_2_2_1);
		
		SubGroupID = new JTextPane();
		SubGroupID.setEditable(false);
		SubGroupID.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		SubGroupID.setFont(new Font("Tahoma", Font.BOLD, 20));
		SubGroupID.setBounds(181, 107, 288, 38);
		panel_2.add(SubGroupID);
		
		JButton btnGenerateId = new JButton("Generate IDs");
		btnGenerateId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			
			
			
			
		GID.setText(AYS.getSelectedItem().toString()+"."+Programme.getSelectedItem().toString()+"."+ GroupNumber.getValue().toString());
		
		SubGroupID.setText(AYS.getSelectedItem().toString()+"."+Programme.getSelectedItem().toString()+"."+ GroupNumber.getValue().toString()+"."+SubGroupNumber.getValue().toString());
			
				
				
			}
		});
		btnGenerateId.setForeground(new Color(21, 25, 28));
		btnGenerateId.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnGenerateId.setFocusPainted(false);
		btnGenerateId.setBorder(UIManager.getBorder("Button.border"));
		btnGenerateId.setBackground(new Color(152, 201, 45));
		btnGenerateId.setBounds(138, 199, 238, 50);
		panel_2.add(btnGenerateId);
		
		JLabel lblNewLabel_2_2 = new JLabel("Group ID");
		lblNewLabel_2_2.setBounds(12, 34, 215, 25);
		panel_2.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_2.setBackground(new Color(0, 204, 51));
		
		GID = new JTextField();
		GID.setEditable(false);
		GID.setFont(new Font("Tahoma", Font.BOLD, 20));
		GID.setBounds(181, 37, 288, 38);
		panel_2.add(GID);
		GID.setColumns(10);
		
		AYS = new JComboBox();
		AYS.setModel(new DefaultComboBoxModel(new String[] {"Y1.S1", "Y1.S2", "Y2.S1", "Y2.S2", "Y3.S1", "Y3.S2", "Y4.S1", "Y4.S2"}));
		AYS.setFont(new Font("Tahoma", Font.BOLD, 20));
		AYS.setBounds(524, 238, 262, 41);
		frmAddStudentGroups.getContentPane().add(AYS);
		
		Programme = new JComboBox();
		Programme.setModel(new DefaultComboBoxModel(new String[] {"IT", "BS", "ENG", "HS", "QA", "LLB"}));
		Programme.setFont(new Font("Tahoma", Font.BOLD, 20));
		Programme.setBounds(524, 348, 262, 41);
		frmAddStudentGroups.getContentPane().add(Programme);
	 
	    
	}
}
