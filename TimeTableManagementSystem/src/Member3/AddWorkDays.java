package Member3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

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

public class AddWorkDays {

	private JFrame frmAddStudentGroups;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxTuesday;
	private JCheckBox chckbxWednesday;
	private JCheckBox chckbxThursday;
	private JCheckBox chckbxFriday;
	private JCheckBox chckbxSaturday;
	private JCheckBox chckbxSunday;
	private JSpinner spi1;
	private JSpinner spi2;
	private JSpinner spi3;
	

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");//theme
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddWorkDays window = new AddWorkDays();
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
	public AddWorkDays() {
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
		frmAddStudentGroups.setTitle("Add Working Days And Hours");
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
		
		JButton btnNewButton = new JButton("Add Working Days");
		btnNewButton.setBounds(12, 320, 252, 50);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		btnNewButton.setForeground(new Color(21, 25, 28));
		btnNewButton.setBackground(new Color(152, 201, 45));
		
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.setBorder(UIManager.getBorder("Button.border"));
		btnNewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton.setFocusPainted(false);
		
		JButton btnManageGroups = new JButton("Manage Working Days");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManageWorkingDays abc =new ManageWorkingDays();
				try {
					ManageWorkingDays.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
		
		JLabel lblNewLabel_1 = new JLabel("Add Working Days And Hours");
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
		
		JLabel lblNewLabel_2 = new JLabel("No. of Working Days");
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2.setBackground(new Color(0, 204, 51));
		lblNewLabel_2.setBounds(274, 268, 252, 25);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Working Days");
		lblNewLabel_2_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1.setBounds(274, 354, 252, 25);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Working Time Per Day");
		lblNewLabel_2_1_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_2.setBounds(274, 554, 281, 25);
		lblNewLabel_2_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_2_1_2);
		
		spi1 = new JSpinner();
		spi1.setForeground(new Color(255, 255, 255));
		spi1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		spi1.setBackground(new Color(31, 36, 42));
		spi1.setBounds(536, 262, 262, 38);
		spi1.setModel(new SpinnerNumberModel(0, 0, 7, 1));
		spi1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frmAddStudentGroups.getContentPane().add(spi1);
		
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
		
		JButton btnSave = new JButton("Submit");
		btnSave.setForeground(new Color(21, 25, 28));
		btnSave.setBackground(new Color(152, 201, 45));
		btnSave.setBorder(UIManager.getBorder("Button.border"));
		btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnSave.setFocusPainted(false);
		btnSave.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				String NoOfWorkingDays= spi1.getValue().toString();
				String hours= spi2.getValue().toString();
				String minutes= spi3.getValue().toString();
				
				String monday="-";
				String tuesday="-";
				String wednesday="-";
				String thursday="-";
				String friday="-";
				String saturday="-";
				String sunday="-";
				
				
				if(chckbxNewCheckBox.isSelected()) {
					monday="Monday";
				}
				if(chckbxTuesday.isSelected()) {
					tuesday="Tuesday";
				}
				if(chckbxWednesday.isSelected()) {
					wednesday="Wednesday";
				}
				if(chckbxThursday.isSelected()) {
					thursday="Thursday";
				}
				if(chckbxFriday.isSelected()) {
					friday="Friday";
				}
				if(chckbxSaturday.isSelected()) {
					saturday="Saturday";
				}
				if(chckbxSunday.isSelected()) {
					sunday="Sunday";
				}
				
				 if(spi1.getValue().equals(0)&& spi2.getValue().equals(0)&& spi3.getValue().equals(0)) {
					JOptionPane.showMessageDialog(null, "Please Select Number of working Hours and Days!!!");
				}
				 else if(spi1.getValue().equals(0)) {
						JOptionPane.showMessageDialog(null, "Please Select Number of working days!!!");
					}
				 
				 else if(spi2.getValue().equals(0)&& spi3.getValue().equals(0)) {
						JOptionPane.showMessageDialog(null, "Please Select Number of working hours and minutes!!!");
					}
				 else {
				 try {
					 Connection con = DBConnect.connect();

	                    String query = "INSERT INTO main values(1, '" + NoOfWorkingDays + "','" + monday + "','" + tuesday + "','" +
	                    		wednesday + "','" + thursday + "','" + friday + "','"+ saturday +"','"+ sunday +"','"+ hours +"','"+ minutes +"')";

	                    Statement sta = con.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                        JOptionPane.showMessageDialog(btnSave, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(btnSave,
	                            "Data Successfully Added!!!");
	                    }
	                    con.close();
	                } catch (Exception exception) {
	                    //exception.printStackTrace();
	                	JOptionPane.showMessageDialog(btnSave, "This is alredy exist");
	                }
			}
			}
		});
		btnSave.setBounds(518, 42, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
		chckbxNewCheckBox = new JCheckBox("Monday");
		chckbxNewCheckBox.setForeground(new Color(169, 224, 49));
		chckbxNewCheckBox.setBackground(new Color(51, 51, 51));
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		chckbxNewCheckBox.setBounds(536, 354, 125, 25);
		frmAddStudentGroups.getContentPane().add(chckbxNewCheckBox);
		
		chckbxTuesday = new JCheckBox("Tuesday");
		chckbxTuesday.setBackground(new Color(51, 51, 51));
		chckbxTuesday.setForeground(new Color(169, 224, 49));
		chckbxTuesday.setSelected(true);
		chckbxTuesday.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		chckbxTuesday.setBounds(701, 354, 125, 25);
		frmAddStudentGroups.getContentPane().add(chckbxTuesday);
		
		 chckbxWednesday = new JCheckBox("Wednesday");
		 chckbxWednesday.setBackground(new Color(51, 51, 51));
		 chckbxWednesday.setForeground(new Color(169, 224, 49));
		chckbxWednesday.setSelected(true);
		chckbxWednesday.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		chckbxWednesday.setBounds(852, 354, 135, 25);
		frmAddStudentGroups.getContentPane().add(chckbxWednesday);
		
		 chckbxThursday = new JCheckBox("Thursday");
		 chckbxThursday.setBackground(new Color(51, 51, 51));
		 chckbxThursday.setForeground(new Color(169, 224, 49));
		chckbxThursday.setSelected(true);
		chckbxThursday.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		chckbxThursday.setBounds(1032, 354, 125, 25);
		frmAddStudentGroups.getContentPane().add(chckbxThursday);
		
		 chckbxFriday = new JCheckBox("Friday");
		 chckbxFriday.setBackground(new Color(51, 51, 51));
		 chckbxFriday.setForeground(new Color(169, 224, 49));
		chckbxFriday.setSelected(true);
		chckbxFriday.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		chckbxFriday.setBounds(1183, 354, 125, 25);
		frmAddStudentGroups.getContentPane().add(chckbxFriday);
		
		 chckbxSaturday = new JCheckBox("Saturday");
		 chckbxSaturday.setBackground(new Color(51, 51, 51));
		 chckbxSaturday.setForeground(new Color(169, 224, 49));
		chckbxSaturday.setSelected(true);
		chckbxSaturday.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		chckbxSaturday.setBounds(536, 427, 125, 25);
		frmAddStudentGroups.getContentPane().add(chckbxSaturday);
		
		 chckbxSunday = new JCheckBox("Sunday");
		 chckbxSunday.setBackground(new Color(51, 51, 51));
		 chckbxSunday.setForeground(new Color(169, 224, 49));
		chckbxSunday.setSelected(true);
		chckbxSunday.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		chckbxSunday.setBounds(701, 427, 125, 25);
		frmAddStudentGroups.getContentPane().add(chckbxSunday);
		
		
		spi2 = new JSpinner();
		spi2.setModel(new SpinnerNumberModel(0, 0, 23, 1));
		spi2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		spi2.setBounds(536, 541, 135, 38);
		frmAddStudentGroups.getContentPane().add(spi2);
		spi2.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setForeground(new Color(169, 224, 49));
		lblHours.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblHours.setBounds(701, 554, 96, 25);
		frmAddStudentGroups.getContentPane().add(lblHours);
		
		spi3 = new JSpinner();
		spi3.setModel(new SpinnerNumberModel(0, 0, 30, 30));
		spi3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		spi3.setBounds(849, 541, 135, 38);
		frmAddStudentGroups.getContentPane().add(spi3);
		spi3.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		JLabel lblMinutes = new JLabel("Minutes");
		lblMinutes.setForeground(new Color(169, 224, 49));
		lblMinutes.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblMinutes.setBounds(1014, 554, 96, 25);
		frmAddStudentGroups.getContentPane().add(lblMinutes);
	 
	    
	}
}
