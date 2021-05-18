
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

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

public class AddTags {

	private JFrame frmAddStudentGroups;
	private JTextField TagName;
	private JTextField TagCode;
	private JComboBox Rtag;
	
	

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
					AddTags window = new AddTags();
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
	public AddTags() {
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
		frmAddStudentGroups.setTitle("Add Tags");
		frmAddStudentGroups.setSize(1400, 860);
		//frmAddStudentGroups.setBounds(350, 90, 1350, 900);
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
		
		JButton btnNewButton = new JButton("Add Tags");
		btnNewButton.setBounds(12, 320, 252, 50);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		btnNewButton.setForeground(new Color(21, 25, 28));
		btnNewButton.setBackground(new Color(152, 201, 45));
		
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.setBorder(UIManager.getBorder("Button.border"));
		btnNewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton.setFocusPainted(false);
		
		JButton btnManageGroups = new JButton("Manage Tags");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ManageTags itm = new ManageTags();
				try {
					ManageTags.main(null);
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
		
		JLabel lblNewLabel_1 = new JLabel("Add Tags");
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
		
		JLabel lblNewLabel_2 = new JLabel("Tag Name");
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2.setBackground(new Color(0, 204, 51));
		lblNewLabel_2.setBounds(299, 267, 252, 25);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 658, 1082, 124);
		panel_3.setBackground(new Color(0, 0, 0));
		frmAddStudentGroups.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(268, 42, 238, 50);
		panel_3.add(btnClear);
		btnClear.setForeground(new Color(21, 25, 28));
		btnClear.setBackground(new Color(152, 201, 45));
		
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnClear.setBorder(UIManager.getBorder("Button.border"));
		btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnClear.setFocusPainted(false);
		
		JButton btnAddGroup = new JButton("Add Tag");
		btnAddGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tagname= TagName.getText();
				String tagcode= TagCode.getText();
				String rtag = Rtag.getSelectedItem().toString();
				
if(TagName.getText().equals("")||TagCode.getText().equals("")|| Rtag.getSelectedItem().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please fill the form");
				}else {
				
				
				 try {
					 Connection con = DBConnect.connect();

	                    String query = "INSERT INTO tag values(null, '" + tagname + "','" + tagcode + "','" + rtag + "')";

	                    Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                        JOptionPane.showMessageDialog(btnAddGroup, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(btnAddGroup,
	                            "Tag is sucessfully Added!");
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
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
		
		JLabel lblNewLabel_2_1 = new JLabel("Tag Code");
		lblNewLabel_2_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1.setBackground(new Color(0, 204, 51));
		lblNewLabel_2_1.setBounds(299, 405, 252, 25);
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Related Tag");
		lblNewLabel_2_1_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBackground(new Color(0, 204, 51));
		lblNewLabel_2_1_1.setBounds(299, 538, 252, 25);
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_1);
		
		TagName = new JTextField();
		TagName.setFont(new Font("Tahoma", Font.BOLD, 20));
		TagName.setBounds(569, 244, 548, 48);
		frmAddStudentGroups.getContentPane().add(TagName);
		TagName.setColumns(10);
		
		TagCode = new JTextField();
		TagCode.setFont(new Font("Tahoma", Font.BOLD, 20));
		TagCode.setColumns(10);
		TagCode.setBounds(569, 382, 548, 48);
		frmAddStudentGroups.getContentPane().add(TagCode);
		
		 Rtag = new JComboBox();
		 Rtag.setFont(new Font("Tahoma", Font.BOLD, 20));
		 Rtag.setModel(new DefaultComboBoxModel(new String[] {"Lecture", "Tutorial", "Lab"}));
		Rtag.setBounds(569, 518, 548, 45);
		
		frmAddStudentGroups.getContentPane().add(Rtag);
	 
	    
	}
}
