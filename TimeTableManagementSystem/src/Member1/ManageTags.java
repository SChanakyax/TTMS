package Member1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTree;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ManageTags {

private JFrame frmAddStudentGroups;
private JTable table;
private JTextField TagID;
private JTextField TagCode;
private JComboBox comboBox;
private JTextField TagName;
	

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
					ManageTags window = new ManageTags();
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
	public ManageTags() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 */
	
	
	private void initialize() {
		frmAddStudentGroups = new JFrame();
		frmAddStudentGroups.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				try {
					Connection con = DBConnect.connect();
					
					String query="select * from tag ";
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
		frmAddStudentGroups.setTitle("Manage Tags");
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
		
		JButton btnNewButton = new JButton("Add Tags");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddTags itm = new AddTags();
				try {
					AddTags.main(null);
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
		
		JButton btnManageGroups = new JButton("Manage Tags");
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
		
		JLabel lblNewLabel_1 = new JLabel("Manage Tags");
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frmAddStudentGroups.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(Color.WHITE);
		separator.setBackground(Color.WHITE);
		frmAddStudentGroups.getContentPane().add(separator);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 647, 1082, 224);
		panel_3.setBackground(new Color(0, 0, 0));
		frmAddStudentGroups.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Tag Name");
		lblNewLabel_2.setBounds(36, 126, 252, 25);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2.setBackground(new Color(0, 204, 51));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_1 = new JLabel("Tag Code");
		lblNewLabel_2_1.setBounds(539, 25, 252, 25);
		panel_3.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1.setBackground(new Color(0, 204, 51));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Related Tag");
		lblNewLabel_2_1_1.setBounds(539, 126, 252, 25);
		panel_3.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBackground(new Color(0, 204, 51));
		
		TagID = new JTextField();
		TagID.setEnabled(false);
		TagID.setEditable(false);
		TagID.setFont(new Font("Tahoma", Font.BOLD, 20));
		TagID.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		TagID.setBounds(268, 13, 230, 47);
		panel_3.add(TagID);
		TagID.setColumns(10);
		
		TagCode = new JTextField();
		TagCode.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		TagCode.setFont(new Font("Tahoma", Font.BOLD, 20));
		TagCode.setColumns(10);
		TagCode.setBounds(806, 13, 230, 47);
		panel_3.add(TagCode);
		
		JComboBox Rtag = new JComboBox();
		Rtag.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		Rtag.setFont(new Font("Tahoma", Font.BOLD, 20));
		Rtag.setModel(new DefaultComboBoxModel(new String[] {"Lecture", "Tutorial", "Lab"}));
		Rtag.setBounds(806, 114, 230, 47);
		panel_3.add(Rtag);
		
		TagName = new JTextField();
		TagName.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		TagName.setFont(new Font("Tahoma", Font.BOLD, 20));
		TagName.setColumns(10);
		TagName.setBounds(268, 114, 230, 47);
		panel_3.add(TagName);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Tag ID");
		lblNewLabel_2_1_1_1.setForeground(new Color(169, 224, 49));
		lblNewLabel_2_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBackground(new Color(0, 204, 51));
		lblNewLabel_2_1_1_1.setBounds(36, 25, 252, 25);
		panel_3.add(lblNewLabel_2_1_1_1);
		
		JButton btnClear = new JButton("Update");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
if(TagName.getText().equals("")||TagCode.getText().equals("")|| Rtag.getSelectedItem().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please fill the form");
				}else {
				try {
					Connection con = DBConnect.connect();					
					String query="Update tag set TAGNAME='"+TagName.getText()+"',TAGCODE='"+TagCode.getText()+"',RELATEDTAG='"+Rtag.getSelectedItem()+"' where TAGID='"+TagID.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Updated");
					pst.close();
					
				}
				catch(Exception ea) {
					ea.printStackTrace();
				}
				}
				
				
				
			}
		});
		btnClear.setBounds(1184, 311, 148, 50);
		frmAddStudentGroups.getContentPane().add(btnClear);
		btnClear.setForeground(new Color(21, 25, 28));
		btnClear.setBackground(new Color(152, 201, 45));
		
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnClear.setBorder(UIManager.getBorder("Button.border"));
		btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnClear.setFocusPainted(false);
		
		
		//where ID='"+id.getText()+"'";
		
		JButton btnAddGroup = new JButton("Delete");
		btnAddGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					Connection con = DBConnect.connect();
					String query="Delete from tag where TAGID='"+TagID.getText()+"'";
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
		btnAddGroup.setBounds(1184, 368, 148, 50);
		frmAddStudentGroups.getContentPane().add(btnAddGroup);
		btnAddGroup.setForeground(new Color(21, 25, 28));
		btnAddGroup.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnAddGroup.setFocusPainted(false);
		btnAddGroup.setBorder(UIManager.getBorder("Button.border"));
		btnAddGroup.setBackground(new Color(152, 201, 45));
		
		JButton btnClear_1 = new JButton("Clear");
		btnClear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TagName.setText(null);
				TagCode.setText(null);
				Rtag.setSelectedItem(null);
				
			}
		});
		btnClear_1.setBounds(1184, 431, 148, 50);
		btnClear_1.setForeground(new Color(21, 25, 28));
		btnClear_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnClear_1.setFocusPainted(false);
		btnClear_1.setBorder(UIManager.getBorder("Button.border"));
		btnClear_1.setBackground(new Color(152, 201, 45));
		frmAddStudentGroups.getContentPane().add(btnClear_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		scrollPane.setBounds(274, 168, 898, 469);
		frmAddStudentGroups.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 20));
		table.setBackground(Color.WHITE);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int selectedRow=table.getSelectedRow();
			    TagID.setText(table.getValueAt(selectedRow, 0).toString());
			    TagName.setText(table.getValueAt(selectedRow, 1).toString());
			    TagCode.setText(table.getValueAt(selectedRow, 2).toString());
				
			    String comboLevel = table.getValueAt(selectedRow, 3).toString();
				
			    
			    for(int i=0; i<Rtag.getItemCount();i++) {
					if(Rtag.getItemAt(i).toString().equalsIgnoreCase(comboLevel)) {
						Rtag.setSelectedIndex(i);
					}
				}
					 
					 
			}
		});
		scrollPane.setViewportView(table);
	 
	    
	}
}
