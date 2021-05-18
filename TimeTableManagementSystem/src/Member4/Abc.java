package Member4;

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
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.ScrollPane;
import javax.swing.table.DefaultTableModel;

import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;

import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class Abc {

	private JFrame frameManageLocation;
	private JTextField txtMLBuildingName;
	private JTextField txtMLRoomName;
	private JTextField txtMLCapacity;
	private JTextField LocID;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Abc window = new Abc();
					window.frameManageLocation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application. for me
	 */
	public Abc() {
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
					
					String query="select * from location";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		frameManageLocation.getContentPane().setBackground(new Color(21,25,28));
		frameManageLocation.setBackground(Color.YELLOW);
		frameManageLocation.setResizable(false);
		frameManageLocation.setTitle("Manage Location");
		frameManageLocation.setBounds(100, 40, 1350, 900);
		frameManageLocation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameManageLocation.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frameManageLocation.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time ");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(152, 201, 45));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 787);
		panel_1.setBackground(new Color(51, 51, 51));
		frameManageLocation.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnRefresh = new JButton("Add Location");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ex) {
				AddLocation al = new AddLocation();
				try {
					AddLocation.main(null);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frameManageLocation.setVisible(false);

			}
		});
		btnRefresh.setBounds(12, 320, 238, 50);
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRefresh.setForeground(new Color(21, 25, 28));
		btnRefresh.setBackground(new Color(152, 201, 45));
		panel_1.add(btnRefresh);
		
		JButton btnAddSessionRooms = new JButton("Add Session Rooms");
		btnAddSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSessionRooms ar = new AddSessionRooms();
				try {
					AddSessionRooms.main(null);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frameManageLocation.setVisible(false);	
			}
		});
		btnAddSessionRooms.setBounds(12, 446, 238, 50);
		btnAddSessionRooms.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAddSessionRooms.setForeground(new Color(21, 25, 28));
		btnAddSessionRooms.setBackground(new Color(152, 201, 45));
		panel_1.add(btnAddSessionRooms);
		
		JButton btnManageSessionRooms = new JButton("Manage Session Rooms");
		btnManageSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRooms msr = new ViewRooms();
				try {
					ViewRooms.main(null);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frameManageLocation.setVisible(false);
			}
		});
		btnManageSessionRooms.setBounds(10, 520, 240, 50);
		btnManageSessionRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnManageSessionRooms.setForeground(new Color(21, 25, 28));
		btnManageSessionRooms.setBackground(new Color(152, 201, 45));
		panel_1.add(btnManageSessionRooms);
		
		JButton btnManageGroups = new JButton("Manage Location");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnManageGroups.setBounds(12, 383, 252, 50);
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnManageGroups.setForeground(new Color(21, 25, 28));	
		btnManageGroups.setBackground(new Color(152, 201, 45));
		panel_1.add(btnManageGroups);

////////////////////////////////////////////////////		
		JButton btnViewGroups_1 = new JButton("<<Back");
		
		btnViewGroups_1.setBounds(12, 616, 238, 50);
		btnViewGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnViewGroups_1.setForeground(new Color(21, 25, 28));
		btnViewGroups_1.setBackground(new Color(152, 201, 45));
		panel_1.add(btnViewGroups_1);
		btnViewGroups_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		/*		
				Dashboard itm = new Dashboard();
				try {
					Dashboard.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ManageLocations.setVisible(false);
			*/	
			}
		});
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JLabel lblNewLabel_1 = new JLabel("Manage Location");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frameManageLocation.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(Color.WHITE);
		frameManageLocation.getContentPane().add(separator);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(272, 592, 1060, 260);
		panel_3.setBackground(Color.BLACK);
		frameManageLocation.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		
		JRadioButton rdbtnMLLectureHall = new JRadioButton("Lecture Hall");
		rdbtnMLLectureHall.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));                //rdbtnMLLectureHall  ,rdbtnMLLab
		rdbtnMLLectureHall.setBounds(662, 29, 149, 36);
		rdbtnMLLectureHall.setBackground(new Color(51, 51, 51));
		rdbtnMLLectureHall.setForeground(new Color(169, 224, 49));	
		panel_3.add(rdbtnMLLectureHall);
		
		JRadioButton rdbtnMLLab = new JRadioButton("Laboratory");
		rdbtnMLLab.setBackground(new Color(51, 51, 51));		rdbtnMLLab.setForeground(new Color(169, 224, 49));	

		rdbtnMLLab.setBounds(838, 28, 149, 36);
		rdbtnMLLab.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		panel_3.add(rdbtnMLLab);
		
		rdbtnMLLectureHall.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	rdbtnMLLab.setSelected(false);
			    }
		});
		
		rdbtnMLLab.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	rdbtnMLLectureHall.setSelected(false);
			    }
		});
		
		
		JLabel lblNewLabel_2 = new JLabel("Building Name");
		lblNewLabel_2.setBounds(12, 35, 164, 25);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));lblNewLabel_2.setForeground(new Color(152, 201, 45));
		
	
		
		JLabel lblNewLabel_2_1 = new JLabel("Room Name");
		lblNewLabel_2_1.setBounds(12, 109, 149, 25);
		panel_3.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));lblNewLabel_2_1.setForeground(new Color(152, 201, 45));
	
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Room Type");
		lblNewLabel_2_1_1.setBounds(523, 35, 122, 25);
		panel_3.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));lblNewLabel_2_1_1.setForeground(new Color(152, 201, 45));
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Capacity");
		lblNewLabel_2_1_2.setBounds(527, 109, 102, 25);
		panel_3.add(lblNewLabel_2_1_2);
		lblNewLabel_2_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_2_1_2.setForeground(new Color(152, 201, 45));
		
		txtMLBuildingName = new JTextField();
		txtMLBuildingName.setBounds(186, 29, 218, 36);
		txtMLBuildingName.setFont(new Font("Tahoma", Font.BOLD, 20));		
		txtMLBuildingName.setColumns(10);
		txtMLBuildingName.setForeground(Color.WHITE);
		panel_3.add(txtMLBuildingName);
		txtMLBuildingName.setColumns(10);
		txtMLBuildingName.setBackground(new Color(51, 51, 51));
		txtMLBuildingName.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		txtMLRoomName = new JTextField();
		txtMLRoomName.setBounds(186, 99, 218, 36);
		txtMLRoomName.setFont(new Font("Tahoma", Font.BOLD, 20));		
		txtMLRoomName.setForeground(Color.WHITE);
		
		panel_3.add(txtMLRoomName);
		txtMLRoomName.setColumns(10);
		txtMLRoomName.setBackground(new Color(51, 51, 51));
		txtMLRoomName.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		txtMLCapacity = new JTextField();
		txtMLCapacity.setBounds(662, 99, 197, 36);
		txtMLCapacity.setForeground(Color.WHITE);

		txtMLCapacity.setFont(new Font("Tahoma", Font.BOLD, 20));		
		panel_3.add(txtMLCapacity);
		txtMLCapacity.setColumns(10);
		txtMLCapacity.setBackground(new Color(51, 51, 51));
		txtMLCapacity.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		LocID = new JTextField();
		LocID.setEnabled(false);
		LocID.setEditable(false);
		LocID.setBackground(Color.WHITE);
		LocID.setBounds(186, 175, 96, 19);
		panel_3.add(LocID);
		LocID.setColumns(10);
		
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		/*
		 * table selected row to text boxes	
		 *1  all null check	radio
		 *2 else msg, set a flag if radio buttons not selected
		 *3 capacity check separately
		 *4 if flag ==0 update table
		 */
				
				
				
				String bName= txtMLBuildingName.getText();
				String rName= txtMLRoomName.getText();
				int cap = 0;
				//if condition is used to handle the null error when updating 
				if(txtMLCapacity.getText().equals("")) {
					//JOptionPane.showMessageDialog(null, "E");
					System.out.println("Capacity is not entered ");
				}else {
					try {
						//	capacity =  Integer.parseInt(txtCapacity.getText());
						cap =  Integer.parseInt(txtMLCapacity.getText());
												
						}catch(NumberFormatException nuEx) {
							JOptionPane.showMessageDialog(null, "Please enter a number to capacity");			
							System.out.println("Please enter a number to capacity");
							return ;
						}
					
					
				}

				//String cap = txtMLCapacity.getText();
				String type = null;
				int flag = 0;
			
				//Query to select table data
				int i=table.getSelectedRow();
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				
				if(i>=1) {
					model.setValueAt( LocID.getText() , i, 1);
				}
				else {
				//	JOptionPane.showMessageDialog(null, "Error!!!");
				}
				
				
				//1
				if(txtMLBuildingName.getText().equals("")||txtMLRoomName.getText().equals("") ||txtMLCapacity.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill the form");			
				}else {
					
					//check radio buttons
					if (rdbtnMLLectureHall.isSelected()) { 
	                	type = "LectureHall";
	                } 
	  
	                else if (rdbtnMLLab.isSelected()) { 
	                    type = "Laboratory"; 
	                } 
	                else { 
	                	JOptionPane.showMessageDialog(panel, "Please select a Type", "Warning",JOptionPane.WARNING_MESSAGE);
	                	flag =1;
	                } 	
					
					//check capacity
					if(cap > 120 ) {
						cap = 0;
						JOptionPane.showMessageDialog(null, "Maximum Capacity is 120");			
					}else if(cap< 0) {
						cap = 0;
						JOptionPane.showMessageDialog(null, "Capacity Should not be 0. Please enter a valid capacity");		
						
					}else if(flag == 0) {
						//Query to connect db
						try {
							Connection con = DBConnect.connect();

							String query="Update location set buildingName='"+txtMLBuildingName.getText()+"', roomName='"+txtMLRoomName.getText()+"',type='"+type+"',capacity='"+txtMLCapacity.getText()+"' where locationID='"+LocID.getText()+"' ";
							PreparedStatement pst=con.prepareStatement(query);
							pst.executeUpdate();
							JOptionPane.showMessageDialog(null, "Data Updated");
							pst.close();
							
						}
						catch(Exception updateTable) {
							updateTable.printStackTrace();
						}
						
					}//~check capacity
					else {
						
					}
							
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setForeground(new Color(21, 25, 28));
		btnUpdate.setBackground(new Color(152, 201, 45));		btnUpdate.setBounds(1185, 245, 139, 50);
		frameManageLocation.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = DBConnect.connect();
					String query="Delete from location where locationID='"+LocID.getText()+"'";
					PreparedStatement pst=con.prepareStatement(query);
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
					pst.close();
					
					}
					catch(Exception deleteRecord) {
						deleteRecord.printStackTrace();
						
					}
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setForeground(new Color(21, 25, 28));
		btnDelete.setBackground(new Color(152, 201, 45));			btnDelete.setBounds(1185, 304, 139, 50);
		frameManageLocation.getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMLBuildingName.setText("");
				txtMLRoomName.setText("");
				txtMLCapacity.setText("");	
				rdbtnMLLectureHall.setSelected(false);
				rdbtnMLLab.setSelected(false);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setForeground(new Color(21, 25, 28));
		btnClear.setBackground(new Color(152, 201, 45));		btnClear.setBounds(1185, 367, 139, 50);
		frameManageLocation.getContentPane().add(btnClear);
	/*	
		JButton btnRefres = new JButton("Refresh");
		btnRefres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = DBConnect.connect();
					
					String query="select * from location ";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception loadTable) {
					loadTable.printStackTrace();
				}
			}
		});
		btnRefres.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRefres.setForeground(new Color(21, 25, 28));
		btnRefres.setBackground(new Color(152, 201, 45));		btnRefres.setBounds(1185, 202, 139, 33);
		frameManageLocation.getContentPane().add(btnRefres);
		*/
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(283, 168, 878, 390);
		frameManageLocation.getContentPane().add(scrollPane);
		
		table = new JTable();
		//Table Selection
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int selectedRow=table.getSelectedRow();		
				LocID.setText(table.getValueAt(selectedRow, 0).toString());
				txtMLBuildingName.setText(table.getValueAt(selectedRow, 1).toString());
				txtMLRoomName.setText(table.getValueAt(selectedRow, 2).toString());
				txtMLCapacity.setText(table.getValueAt(selectedRow, 4).toString());
			
			}
		});
		
		
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"LocationID", "Building Name", "Room Name", "Type", "Capacity"
				}
			) {
				Class[] columnTypes = new Class[] {
					Object.class, Object.class, Object.class, Object.class, Integer.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
				boolean[] columnEditables = new boolean[] {
					 false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
		scrollPane.setViewportView(table);
	 
	    
	}
}