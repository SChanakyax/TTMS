package Member3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;

public class ManageNotAvailableTime {

	private JFrame frmAddNotAvailbleTime;
	private JTable table;
	private JTextField textField_10;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_8;
	private JButton btnClear;
	private JComboBox comboBox1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;

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
					ManageNotAvailableTime window = new ManageNotAvailableTime();
					window.frmAddNotAvailbleTime.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void fillComboBox2() {
		try {
			Connection con = DBConnect.connect();
			
			String query="select * from studentGroups";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String group=rs.getString("groupID");
				String subgroup=rs.getString("subGroupID");
				
				comboBox1.addItem(group);
				comboBox_2.addItem(subgroup);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fillComboBox() {
		try {
			Connection con = DBConnect.connect();
			
			String query="select * from lecturers";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String name=rs.getString("lectureName");
				comboBox_3.addItem(name);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fillComboBox4() {
		try {
			Connection con = DBConnect.connect();
			
			String query="select * from location";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String room=rs.getString("roomName");
				comboBox_1.addItem(room);
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
	public ManageNotAvailableTime() {
		initialize();
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
					
					String query="select * from timeAlloLecture ";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		frmAddNotAvailbleTime.getContentPane().setBackground(new Color(21,25,28));
		frmAddNotAvailbleTime.setBackground(Color.YELLOW);
		frmAddNotAvailbleTime.setResizable(false);
		frmAddNotAvailbleTime.setTitle("Manage Available Time");
		frmAddNotAvailbleTime.setBounds(350, 90, 1350, 900);
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 77, 262, 794);
		panel_1.setBackground(new Color(51, 51, 51));
		frmAddNotAvailbleTime.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Not Availble Time");
		btnNewButton.setBounds(12, 320, 240, 50);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		panel_1.add(btnNewButton);
		btnNewButton.setForeground(new Color(21, 25, 28));
		btnNewButton.setBackground(new Color(152, 201, 45));
		
		JButton btnManageGroups = new JButton("Manage Not Available Time");
		btnManageGroups.setBounds(12, 383, 252, 50);
		btnManageGroups.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnManageGroups);
		btnManageGroups.setForeground(new Color(21, 25, 28));
		btnManageGroups.setBackground(new Color(152, 201, 45));
		
		JButton btnViewGroups_1 = new JButton("<<Back");
		btnViewGroups_1.setBounds(12, 724, 238, 50);
		btnViewGroups_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnViewGroups_1);
		btnViewGroups_1.setForeground(new Color(21, 25, 28));
		btnViewGroups_1.setBackground(new Color(152, 201, 45));
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png/"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JLabel lblNewLabel_1 = new JLabel("Manage Not Available Time");
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
		panel_3.setBounds(262, 722, 1082, 124);
		panel_3.setBackground(new Color(0, 0, 0));
		frmAddNotAvailbleTime.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		 btnClear = new JButton("Update");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//String group= comboBox.getSelectedItem().toString();
				
				
				try {
					Connection con = DBConnect.connect();
					
					String query="Update timeAlloLecture set lecName='"+comboBox_3.getSelectedItem()+"',Group='"+comboBox1.getSelectedItem()+"',subGroup='"+comboBox_1.getSelectedItem()+"',sessionSign='"+textField_8.getText()+"',day='"+comboBox.getSelectedItem()+"',startTime='"+textField.getText()+"',endTime='"+textField_2.getText()+"',room='"+comboBox_1.getSelectedItem()+"'where lectimeAllID='"+textField_10.getText()+"' ";
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
		btnClear.setBounds(289, 42, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnClear.setForeground(new Color(21, 25, 28));
		btnClear.setBackground(new Color(152, 201, 45));
		
		JButton btnSave = new JButton("Delete");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Connection con = DBConnect.connect();
					String query="Delete from timeAlloLecture where lectimeAllID='"+textField_10.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Deleted");
					pst.close();
					
					}
					catch(Exception e) {
						e.printStackTrace();
						
					}

			}
		});
		btnSave.setBounds(556, 42, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSave.setForeground(new Color(21, 25, 28));
		btnSave.setBackground(new Color(152, 201, 45));
		
		JButton btnClear_1 = new JButton("Clear");
		btnClear_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnClear_1.setBounds(820, 42, 238, 50);
		panel_3.add(btnClear_1);
		btnClear_1.setForeground(new Color(21, 25, 28));
		btnClear_1.setBackground(new Color(152, 201, 45));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 166, 1062, 271);
		frmAddNotAvailbleTime.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//String group= comboBox.getSelectedItem().toString();
                int selectedRow=table.getSelectedRow();
                DefaultTableModel model=(DefaultTableModel)table.getModel();
				
                textField_10.setText(table.getValueAt(selectedRow, 0).toString());
                //textField_5.setText(table.getValueAt(selectedRow, 1).toString());
                //comboBox.setName(model.getValueAt(selectedRow, 2).toString());
                
               /* String combolevel1 = table.getValueAt(selectedRow, 2).toString();
      		  for(int j=0;j<comboBox.getItemCount();j++) {
      		  
      		  if(comboBox.getItemAt(j).toString().equalsIgnoreCase(combolevel1)) {
      		  comboBox.setSelectedIndex(j); } }*/
                
               
      		  
                //textField_7.setText(table.getValueAt(selectedRow, 3).toString());
                textField_8.setText(table.getValueAt(selectedRow, 4).toString());
               // textField_9.setText(table.getValueAt(selectedRow, 5).toString());
                textField.setText(table.getValueAt(selectedRow, 6).toString());
                textField_2.setText(table.getValueAt(selectedRow, 7).toString());
                //textField_6.setText(table.getValueAt(selectedRow, 8).toString());
                
                
                String comboLevel1 = table.getValueAt(selectedRow, 2).toString();
				for(int i=0; i<comboBox1.getItemCount();i++) {
					if(comboBox1.getItemAt(i).toString().equalsIgnoreCase(comboLevel1)) {
						
						
						comboBox1.setSelectedIndex(i);
					}
				}
				
				String comboLevel2 = table.getValueAt(selectedRow, 5).toString();
				for(int i=0; i<comboBox.getItemCount();i++) {
					if(comboBox.getItemAt(i).toString().equalsIgnoreCase(comboLevel2)) {
						
						
						comboBox.setSelectedIndex(i);
					}
				}
				
				String comboLevel3 = table.getValueAt(selectedRow, 8).toString();
				for(int i=0; i<comboBox_1.getItemCount();i++) {
					if(comboBox_1.getItemAt(i).toString().equalsIgnoreCase(comboLevel3)) {
						
						
						comboBox_1.setSelectedIndex(i);
					}
				}
				
				String comboLevel4 = table.getValueAt(selectedRow, 3).toString();
				for(int i=0; i<comboBox_2.getItemCount();i++) {
					if(comboBox_2.getItemAt(i).toString().equalsIgnoreCase(comboLevel4)) {
						
						
						comboBox_2.setSelectedIndex(i);
					}
				}
				
				String comboLevel5 = table.getValueAt(selectedRow, 1).toString();
				for(int i=0; i<comboBox_3.getItemCount();i++) {
					if(comboBox_3.getItemAt(i).toString().equalsIgnoreCase(comboLevel5)) {
						
						
						comboBox_3.setSelectedIndex(i);
					}
				}
				
				
				
				/*try {
					Connection con = DBConnect.connect();
					
					String query="select * from studentGroups";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
					//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
					while(rs.next()) {
						String group=rs.getString("groupID");
						String subgroup=rs.getString("subGroupID");
						
						comboBox_2.addItem(group);
						comboBox_3.addItem(subgroup);
					}
					con.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}*/
                

			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		scrollPane.setViewportView(table);
		
		JLabel lblLectimealloid = new JLabel("LecTimeAlloID");
		lblLectimealloid.setForeground(new Color(169, 224, 49));
		lblLectimealloid.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLectimealloid.setBounds(274, 472, 167, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblLectimealloid);
		
		JLabel lblLectureName = new JLabel("Lecture Name");
		lblLectureName.setForeground(new Color(169, 224, 49));
		lblLectureName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLectureName.setBounds(272, 529, 252, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblLectureName);
		
		JLabel lblGroup = new JLabel("Group");
		lblGroup.setForeground(new Color(169, 224, 49));
		lblGroup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGroup.setBounds(272, 583, 252, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblGroup);
		
		JLabel lblSubgroup = new JLabel("SubGroup");
		lblSubgroup.setForeground(new Color(169, 224, 49));
		lblSubgroup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubgroup.setBounds(272, 637, 252, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSubgroup);
		
		JLabel lblSessionSignature = new JLabel("Session Signature");
		lblSessionSignature.setForeground(new Color(169, 224, 49));
		lblSessionSignature.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSessionSignature.setBounds(272, 687, 252, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSessionSignature);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setForeground(new Color(169, 224, 49));
		lblDay.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDay.setBounds(821, 473, 203, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblDay);
		
		JLabel lblSatrtTime = new JLabel("Start Time");
		lblSatrtTime.setForeground(new Color(169, 224, 49));
		lblSatrtTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSatrtTime.setBounds(821, 529, 203, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblSatrtTime);
		
		JLabel lblEndtime = new JLabel("EndTime");
		lblEndtime.setForeground(new Color(169, 224, 49));
		lblEndtime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEndtime.setBounds(821, 583, 203, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblEndtime);
		
		JLabel lblRoom = new JLabel("Room");
		lblRoom.setForeground(new Color(169, 224, 49));
		lblRoom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRoom.setBounds(821, 636, 203, 25);
		frmAddNotAvailbleTime.getContentPane().add(lblRoom);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setForeground(Color.WHITE);
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_10.setColumns(10);
		textField_10.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		textField_10.setBackground(new Color(51, 51, 51));
		textField_10.setBounds(525, 462, 274, 34);
		frmAddNotAvailbleTime.getContentPane().add(textField_10);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		textField.setBackground(new Color(51, 51, 51));
		textField.setBounds(1039, 517, 274, 34);
		frmAddNotAvailbleTime.getContentPane().add(textField);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		textField_2.setBackground(new Color(51, 51, 51));
		textField_2.setBounds(1039, 574, 274, 34);
		frmAddNotAvailbleTime.getContentPane().add(textField_2);
		
		textField_8 = new JTextField();
		textField_8.setForeground(Color.WHITE);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_8.setColumns(10);
		textField_8.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		textField_8.setBackground(new Color(51, 51, 51));
		textField_8.setBounds(525, 677, 274, 34);
		frmAddNotAvailbleTime.getContentPane().add(textField_8);
		
		 comboBox1 = new JComboBox();
		 //comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Y3WE", "Y3WD"}));
		comboBox1.setBounds(525, 572, 276, 36);
		frmAddNotAvailbleTime.getContentPane().add(comboBox1);
		
		 comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}));
		comboBox.setForeground(Color.WHITE);
		comboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		comboBox.setBackground(new Color(51, 51, 51));
		comboBox.setBounds(1041, 463, 272, 34);
		frmAddNotAvailbleTime.getContentPane().add(comboBox);
		
		 comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		comboBox_1.setBackground(new Color(51, 51, 51));
		comboBox_1.setBounds(1041, 634, 272, 34);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_1);
		
		 comboBox_2 = new JComboBox();
		comboBox_2.setForeground(Color.WHITE);
		comboBox_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox_2.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		comboBox_2.setBackground(new Color(51, 51, 51));
		comboBox_2.setBounds(527, 628, 272, 34);
		frmAddNotAvailbleTime.getContentPane().add(comboBox_2);
		
		 comboBox_3 = new JComboBox();
		comboBox_3.setForeground(Color.WHITE);
		comboBox_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox_3.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		comboBox_3.setBackground(new Color(51, 51, 51));
		comboBox_3.setBounds(527, 520, 272, 34);
		comboBox_3.setSelectedItem(" ");
		frmAddNotAvailbleTime.getContentPane().add(comboBox_3);
		
		
		fillComboBox2();
		fillComboBox();
		fillComboBox4();
	    
	}
}
