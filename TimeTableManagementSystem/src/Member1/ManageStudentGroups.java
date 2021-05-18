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

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ManageStudentGroups {

	private JFrame frmAddStudentGroups;
	private JSpinner spi1;
	private JTable table;
	private JComboBox comboBox;
	private JSpinner spi1_1;
	private JTextPane abc;
	private JComboBox comboBox_1;
	private JTextField textField;
	

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
					ManageStudentGroups window = new ManageStudentGroups();
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
	public ManageStudentGroups() {
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
					
					String query="select * from studentGroups ";
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
		frmAddStudentGroups.setTitle("Manage Student Groups");
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
		
		JButton btnNewButton = new JButton("Add Groups");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				AddStudentGroups itm = new AddStudentGroups();
				try {
					AddStudentGroups.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frmAddStudentGroups.setVisible(false);
			}
		});
		btnNewButton.setBounds(12, 320, 238, 50);
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
				
				
				
			}
		});
		btnManageGroups.setBounds(12, 383, 252, 50);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("Manage Student Groups");
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 469, 1082, 402);
		panel_3.setBackground(new Color(0, 0, 0));
		frmAddStudentGroups.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Academic Year Semester");
		lblNewLabel_2.setBounds(12, 172, 252, 25);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2.setBackground(new Color(0, 204, 51));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_1 = new JLabel("programme");
		lblNewLabel_2_1.setBounds(12, 226, 252, 25);
		panel_3.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1.setBackground(new Color(0, 204, 51));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Group Number");
		lblNewLabel_2_1_1.setBounds(12, 290, 252, 25);
		panel_3.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBackground(new Color(0, 204, 51));
		
		spi1_1 = new JSpinner();
		spi1_1.setBounds(296, 277, 262, 38);
		panel_3.add(spi1_1);
		spi1_1.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spi1_1.setForeground(Color.WHITE);
		spi1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		spi1_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		spi1_1.setBackground(new Color(31, 36, 42));
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Sub Group Number");
		lblNewLabel_2_1_2.setBounds(12, 343, 252, 25);
		panel_3.add(lblNewLabel_2_1_2);
		lblNewLabel_2_1_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_2.setBackground(new Color(0, 204, 51));
		
		spi1 = new JSpinner();
		spi1.setBounds(296, 336, 262, 38);
		panel_3.add(spi1);
		spi1.setForeground(new Color(255, 255, 255));
		spi1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		spi1.setBackground(new Color(31, 36, 42));
		spi1.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spi1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(589, 107, 481, 266);
		panel_3.add(panel_2);
		panel_2.setBackground(SystemColor.controlDkShadow);
		panel_2.setForeground(Color.GREEN);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Sub Group ID");
		lblNewLabel_2_2_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_2_1.setBackground(new Color(0, 204, 51));
		lblNewLabel_2_2_1.setBounds(12, 135, 215, 25);
		panel_2.add(lblNewLabel_2_2_1);
		
		JTextPane textPane_2_1 = new JTextPane();
		textPane_2_1.setEditable(false);
		textPane_2_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		textPane_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textPane_2_1.setBounds(190, 122, 262, 38);
		panel_2.add(textPane_2_1);
		
		JButton btnGenerateId = new JButton("Generate IDs");
		btnGenerateId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				abc.setText(comboBox.getSelectedItem().toString()+"."+comboBox_1.getSelectedItem().toString()+"."+ spi1_1.getValue().toString());
				
				textPane_2_1.setText(comboBox.getSelectedItem().toString()+"."+comboBox_1.getSelectedItem().toString()+"."+ spi1_1.getValue().toString()+"."+spi1.getValue().toString());
			}
		});
		btnGenerateId.setForeground(new Color(21, 25, 28));
		btnGenerateId.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnGenerateId.setFocusPainted(false);
		btnGenerateId.setBorder(UIManager.getBorder("Button.border"));
		btnGenerateId.setBackground(new Color(152, 201, 45));
		btnGenerateId.setBounds(128, 203, 238, 50);
		panel_2.add(btnGenerateId);
		
		JLabel lblNewLabel_2_2 = new JLabel("Group ID");
		lblNewLabel_2_2.setBounds(12, 23, 158, 25);
		panel_2.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_2.setBackground(new Color(0, 204, 51));
		
		abc = new JTextPane();
		abc.setEditable(false);
		abc.setBounds(190, 13, 262, 38);
		panel_2.add(abc);
		abc.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		abc.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"IT", "BS", "ENG", "HS", "QA", "LLB"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1.setBounds(296, 217, 262, 41);
		panel_3.add(comboBox_1);
		
		comboBox = new JComboBox();
		comboBox.setBounds(296, 163, 262, 41);
		panel_3.add(comboBox);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Y1.S1", "Y1.S2", "Y2.S1", "Y2.S2", "Y3.S1", "Y3.S2", "Y4.S1", "Y4.S2"}));
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Group ID");
		lblNewLabel_2_1_3.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_3.setBackground(new Color(0, 204, 51));
		lblNewLabel_2_1_3.setBounds(12, 125, 252, 25);
		panel_3.add(lblNewLabel_2_1_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(296, 107, 262, 43);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JButton btnAddGroup = new JButton("Update");
		btnAddGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection con = DBConnect.connect();					
					String query="Update studentGroups set AcademicYearSemester='"+comboBox.getSelectedItem()+"',Programme='"+comboBox_1.getSelectedItem()+"',GroupNo='"+spi1_1.getValue()+"',SubGroupNo='"+spi1.getValue()+"',GroupID='"+abc.getText()+"',SubGroupID='"+textPane_2_1.getText()+"' where SGroupID='"+textField.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Updated");
					pst.close();
					
				}
				catch(Exception ea) {
					ea.printStackTrace();
				}
				
				
			}
		});
		btnAddGroup.setBounds(1188, 265, 144, 50);
		frmAddStudentGroups.getContentPane().add(btnAddGroup);
		btnAddGroup.setForeground(new Color(21, 25, 28));
		btnAddGroup.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnAddGroup.setFocusPainted(false);
		btnAddGroup.setBorder(UIManager.getBorder("Button.border"));
		btnAddGroup.setBackground(new Color(152, 201, 45));
		
		JButton btnAddGroup_1 = new JButton("Delete");
		btnAddGroup_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					Connection con = DBConnect.connect();
					String query="Delete from studentGroups where SGroupID='"+textField.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Deleted");
					pst.close();
					
					}
					catch(Exception en) {
						en.printStackTrace();
						
					}
				
				
				
			}
		});
		btnAddGroup_1.setForeground(new Color(21, 25, 28));
		btnAddGroup_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnAddGroup_1.setFocusPainted(false);
		btnAddGroup_1.setBorder(UIManager.getBorder("Button.border"));
		btnAddGroup_1.setBackground(new Color(152, 201, 45));
		btnAddGroup_1.setBounds(1188, 328, 144, 50);
		frmAddStudentGroups.getContentPane().add(btnAddGroup_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		scrollPane.setBounds(274, 162, 902, 294);
		frmAddStudentGroups.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				int selectedRow=table.getSelectedRow();
			    
				abc.setText(table.getValueAt(selectedRow, 5).toString());
				textPane_2_1.setText(table.getValueAt(selectedRow, 6).toString());
				textField.setText(table.getValueAt(selectedRow, 0).toString());
				
				
			    
				
			    String comboLevel = table.getValueAt(selectedRow, 1).toString();
				for(int i=0; i<comboBox.getItemCount();i++) {
					if(comboBox.getItemAt(i).toString().equalsIgnoreCase(comboLevel)) {
						comboBox.setSelectedIndex(i);
					}
				}
				
				
				String comboLevel1 = table.getValueAt(selectedRow, 2).toString();
				for(int i=0; i<comboBox_1.getItemCount();i++) {
					if(comboBox_1.getItemAt(i).toString().equalsIgnoreCase(comboLevel1)) {
						comboBox_1.setSelectedIndex(i);
					}
				}
				
				
				spi1_1.setValue((Integer)table.getValueAt(selectedRow, 3));
				spi1.setValue((Integer)table.getValueAt(selectedRow, 4));
				
			}
		});
		scrollPane.setViewportView(table);
	 
	    
	}
}
