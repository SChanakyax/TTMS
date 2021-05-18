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
import javax.swing.border.LineBorder;

import dbConnect.DBConnect;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddLocation {

	private JFrame frameAddLocation;
	
	private JTextField txtBuildingName;
	private JTextField txtRoomName;
	private JTextField txtCapacity;

	/**
	 * 
	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	
	public static void main(String[] args)throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");//theme
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddLocation window = new AddLocation();
					window.frameAddLocation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddLocation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameAddLocation = new JFrame();
	//	frameAddLocation.getContentPane().setBackground(new Color(21,25,28));
		frameAddLocation.getContentPane().setBackground(new Color(21,25,28));
		frameAddLocation.setBackground(Color.YELLOW);


		//frameAddLocation.setBackground(Color.YELLOW);
		frameAddLocation.setResizable(false);
		//frameAddLocation.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		//frameAddLocation.setBackground(new Color(102, 51, 102));
		frameAddLocation.setTitle("Add Location");		

		frameAddLocation.setBounds(100, 40, 1350, 900);
		frameAddLocation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAddLocation.getContentPane().setLayout(null);
				
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frameAddLocation.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(169, 224, 49));		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 757);
		panel_1.setBackground(new Color(51, 51, 51));
		frameAddLocation.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAddLocation = new JButton("Add Location");
		btnAddLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddLocation.setBounds(12, 320, 252, 50);
		btnAddLocation.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnAddLocation.setForeground(new Color(21, 25, 28));
		btnAddLocation.setBackground(new Color(152, 201, 45));	
		panel_1.add(btnAddLocation);
		
		JButton btnManageLocation = new JButton("Manage Location");
		btnManageLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageLocations ml = new ManageLocations();
				try {
					ManageLocations.main(null);
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
				frameAddLocation.setVisible(false);	
			}
		});
		btnManageLocation.setBounds(12, 383, 238, 50);
		btnManageLocation.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnManageLocation.setForeground(new Color(21, 25, 28));
		btnManageLocation.setBackground(new Color(152, 201, 45));		panel_1.add(btnManageLocation);
		
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
				frameAddLocation.setVisible(false);	
			}
		});
		btnAddSessionRooms.setBounds(12, 446, 238, 50);
		btnAddSessionRooms.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
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
				frameAddLocation.setVisible(false);
			}
		});
		btnManageSessionRooms.setBounds(10, 520, 240, 50);
		btnManageSessionRooms.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnManageSessionRooms.setForeground(new Color(21, 25, 28));
		btnManageSessionRooms.setBackground(new Color(152, 201, 45));		
		panel_1.add(btnManageSessionRooms);

///////////////////////////////////////////////////////////////////////		
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
				frameAddLocation.setVisible(false);
				*/
			}
		});
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		
		JLabel lblNewLabel_1 = new JLabel("Add Location");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frameAddLocation.getContentPane().add(lblNewLabel_1);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(Color.WHITE);
		frameAddLocation.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Building Name");
		lblNewLabel_2.setBounds(274, 268, 252, 25);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_2.setBackground(new Color(51, 51, 51));
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		frameAddLocation.getContentPane().add(lblNewLabel_2);
		
		txtBuildingName = new JTextField();	
		txtBuildingName.setForeground(Color.WHITE);
		txtBuildingName.setBackground(new Color(51, 51, 51));
		txtBuildingName.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		txtBuildingName.setBounds(538, 261, 262, 40);
		txtBuildingName.setFont(new Font("Tahoma", Font.BOLD, 20));		
		frameAddLocation.getContentPane().add(txtBuildingName);
		txtBuildingName.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Room Name");
		lblNewLabel_2_1.setBounds(274, 354, 252, 25);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_2_1.setBackground(new Color(51, 51, 51));
		lblNewLabel_2_1.setForeground(new Color(169, 224, 49));			frameAddLocation.getContentPane().add(lblNewLabel_2_1);
		
		txtRoomName = new JTextField();
		txtRoomName.setBackground(new Color(51, 51, 51));
		txtRoomName.setForeground(Color.WHITE);
		txtRoomName.setBorder(new LineBorder(new Color(169, 224, 49), 3));		txtRoomName.setBounds(538, 347, 262, 40);
		txtRoomName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtRoomName.setColumns(10);
		frameAddLocation.getContentPane().add(txtRoomName);
		
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Room Type");
		lblNewLabel_2_1_1.setBounds(274, 455, 281, 25);
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBackground(new Color(51, 51, 51));
		lblNewLabel_2_1_1.setForeground(new Color(169, 224, 49));		frameAddLocation.getContentPane().add(lblNewLabel_2_1);
				frameAddLocation.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Capacity");
		lblNewLabel_2_1_2.setBounds(274, 554, 281, 25);
		lblNewLabel_2_1_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_2_1_2.setBackground(new Color(51, 51, 51));
		lblNewLabel_2_1_2.setForeground(new Color(169, 224, 49));			frameAddLocation.getContentPane().add(lblNewLabel_2_1_2);
	
		JPanel panel_3 = new JPanel();	
		panel_3.setBounds(262, 658, 1082, 124);
		panel_3.setBackground(new Color(0, 0, 0));
		frameAddLocation.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		
	/*
		 *	
		 *txtCapacity = new JTextField();
		txtCapacity.setForeground(Color.WHITE);
		txtCapacity.setBackground(new Color(51, 51, 51));
		txtCapacity.setBorder(new LineBorder(new Color(169, 224, 49), 3));			txtCapacity.setBounds(538, 547, 258, 40);		
		txtCapacity.setFont(new Font("Tahoma", Font.BOLD, 20));		
		txtCapacity.setColumns(10);
		frameAddLocation.getContentPane().add(txtCapacity);
 */
		
		
		 txtCapacity = new JTextField();
		txtCapacity.setBackground(new Color(51, 51, 51));
		txtCapacity.setForeground(Color.WHITE);
		txtCapacity.setBorder(new LineBorder(new Color(169, 224, 49), 3));		txtCapacity.setBounds(538, 547, 258, 40);		
		txtCapacity.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtCapacity.setColumns(10);
		frameAddLocation.getContentPane().add(txtCapacity);
		
		JRadioButton rdbtnLectureHall = new JRadioButton("Lecture Hall");
		rdbtnLectureHall.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		rdbtnLectureHall.setBackground(new Color(51, 51, 51));
		rdbtnLectureHall.setForeground(new Color(169, 224, 49));		rdbtnLectureHall.setBounds(538, 436, 290, 33);
		frameAddLocation.getContentPane().add(rdbtnLectureHall);
			
		JRadioButton rdbtnLab = new JRadioButton("Laboratory");
		rdbtnLab.setBounds(538, 482, 290, 40);
		rdbtnLab.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		rdbtnLab.setBackground(new Color(51, 51, 51));
		rdbtnLab.setForeground(new Color(169, 224, 49));		frameAddLocation.getContentPane().add(rdbtnLab);
		
		rdbtnLectureHall.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	rdbtnLab.setSelected(false);
			    }
		});
		
		rdbtnLab.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	rdbtnLectureHall.setSelected(false);
			    }
		});
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBuildingName.setText("");
				txtRoomName.setText("");
				txtCapacity.setText("");		
			}
		});
		btnClear.setBounds(268, 42, 238, 50);
		btnClear.setForeground(new Color(21, 25, 28));
		btnClear.setBackground(new Color(152, 201, 45));
		
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//validations
	
				String bName= txtBuildingName.getText();
				String rName= txtRoomName.getText();
				String cap = txtCapacity.getText();
			//check for null all 
			//check for capacity
			//check for radiobutton
			//run query
				if(txtBuildingName.getText().equals("")||txtRoomName.getText().equals("") ||txtCapacity.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill the form");			
				}else {
					//Values to variables
				
					String buildingName = txtBuildingName.getText();
					String roomName = txtRoomName.getText();
					String type = null;
					int capacity =  0;
					
					try {
						capacity =Integer.parseInt(txtCapacity.getText());
					}catch(NumberFormatException ex) {
						//ex.printStackTrace();
						JOptionPane.showMessageDialog(null, "Enter only numbers to capacity");			

					}

					if(capacity > 120 ) {
						capacity = 0;
						JOptionPane.showMessageDialog(null, "Maximum Capacity is 120");			
					}else if(capacity<=0) {
						capacity = 0;
						JOptionPane.showMessageDialog(null, "Capacity Should not be 0. Please enter a valid capacity");		
						
					}else {
						try {
						//	int capacityCheck =  Integer.parseInt(txtCapacity.getText());
												
						}catch(NumberFormatException nuEx) {
							JOptionPane.showMessageDialog(null, "Please enter a number to capacity");			
							System.out.println("Please enter a number to capacity");
							return;
						}
					
						
						//Query to connect db
						try {
							
							 // If condition to check if jRadioButton2 is selected. 
			                if (rdbtnLectureHall.isSelected()) { 
			                	type = "LectureHall";
			                	rdbtnLab.setSelected(false);
			    		    	//rdbtnLectureHall.setSelected(false);
			    				Connection con = DBConnect.connect();


			                    String query = "INSERT INTO location values(null,'" +buildingName + "','" + roomName + "','" + type + "','"+ capacity +"')";
			                    Statement sta = con.createStatement();
			                    sta.executeUpdate(query);
								JOptionPane.showMessageDialog(null, "Data inserted Successfully");		
			                    con.close();
			                } 
			  
			                else if (rdbtnLab.isSelected()) { 
			                    type = "Laboratory"; 
			                    rdbtnLectureHall.setSelected(false);
			                    
			    				Connection con = DBConnect.connect();


			                    String query = "INSERT INTO location values(null,'" +buildingName + "','" + roomName + "','" + type + "','"+ capacity +"')";
			                    Statement sta = con.createStatement();
			                    sta.executeUpdate(query);
								JOptionPane.showMessageDialog(null, "Data inserted Successfully");		
			                    con.close();
			                } 
			                else { 
			                	JOptionPane.showMessageDialog(panel, "Please select a Type", "Warning",JOptionPane.WARNING_MESSAGE);
			                	return;
			                } 
							
			
		                    
						}catch(Exception insertDB) {
							insertDB.printStackTrace();
						}
						
					}			
				}
				
			}
		});
		btnSave.setBounds(518, 42, 238, 50);
		btnSave.setForeground(new Color(21, 25, 28));
		btnSave.setBackground(new Color(152, 201, 45));
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		
		
	}	
}