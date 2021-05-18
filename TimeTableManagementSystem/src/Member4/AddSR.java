package Member4;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import dbConnect.DBConnect;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class AddSR {

	private JFrame frame;
	private JRadioButton rdbtnConsecutive; 
	private JRadioButton rdbtnParallelSessions;
	private JRadioButton rdbtnNonOverlapping;
	private JComboBox rooms_1;
	private JComboBox rooms;
	private JTextArea textArea;

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
					AddSR window = new AddSR();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	//method to fill comboBox sessions ********
	public void fillComboBox1() {

		try {
					
			
			Connection con = DBConnect.connect();
			
			String query="select * from consecutiveSession";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String group=rs.getString("ConSessionSignature");
			//	String subgroup=rs.getString("subGroupID");
				
				rooms_1.addItem(group);
			//	comboBox_3.addItem(subgroup);
				

				
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//method
	
	public void fillComboBox2() {

		try {
					
			
			Connection con = DBConnect.connect();
			
			String query="select * from parallel";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String group=rs.getString("parallelSessionSignature");
			//	String subgroup=rs.getString("subGroupID");
				
				rooms_1.addItem(group);
			//	comboBox_3.addItem(subgroup);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//method
	
	public void fillComboBox3() {

		try {
					
			
			Connection con = DBConnect.connect();
			
			String query="select * from nonOverlapping";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String group=rs.getString("nonOverlappingSignature");
			//	String subgroup=rs.getString("subGroupID");
				
				rooms_1.addItem(group);
			//	comboBox_3.addItem(subgroup);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//method

	
	//method to fill comboCox rooms **********
	public void fillRoom() {

		try {
			Connection con = DBConnect.connect();
			
			String query="select * from location";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
			while(rs.next()) {
				String group=rs.getString("roomName");
			//	String subgroup=rs.getString("subGroupID");
				
				rooms.addItem(group);
			//	comboBox_3.addItem(subgroup);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}/**/
	}//method
	
	
	public AddSR() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(21,25,28));
		frame.setBackground(Color.YELLOW);
		frame.setTitle("Add Session Rooms");		
		// frame.setSize(1400, 2200);
		frame.setBounds(100, 40, 1350, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);	
	//	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		
			
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(152, 201, 45));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 262, 757);
		panel_1.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAddLocation = new JButton("Add Session Rooms");
		btnAddLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				frame.setVisible(false);

			}
		});
		btnAddLocation.setBounds(12, 320, 238, 50);
		btnAddLocation.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnAddLocation);
		btnAddLocation.setForeground(new Color(21, 25, 28));
		btnAddLocation.setBackground(new Color(152, 201, 45));
		
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
				frame.setVisible(false);	
			}
		});
		btnManageLocation.setBounds(12, 383, 238, 50);
		btnManageLocation.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnManageLocation);
		btnManageLocation.setForeground(new Color(21, 25, 28));
		btnManageLocation.setBackground(new Color(152, 201, 45));
		
		JButton btnAddSessionRooms = new JButton("Add Session Rooms");
		btnAddSessionRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddSessionRooms.setBounds(12, 446, 252, 50);
		btnAddSessionRooms.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnAddSessionRooms);
		btnAddSessionRooms.setForeground(new Color(21, 25, 28));
		btnAddSessionRooms.setBackground(new Color(152, 201, 45));
		
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
				frame.setVisible(false);
			}
		});
		btnManageSessionRooms.setBounds(10, 520, 240, 50);
		btnManageSessionRooms.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel_1.add(btnManageSessionRooms);
		btnManageSessionRooms.setForeground(new Color(21, 25, 28));
		btnManageSessionRooms.setBackground(new Color(152, 201, 45));
	
//////////////////////////////////////////////////////////////////////		
		JButton btnViewGroups_1 = new JButton("<<Back");
		
		btnViewGroups_1.setBounds(12, 616, 238, 50);
		btnViewGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnViewGroups_1.setForeground(new Color(21, 25, 28));
		btnViewGroups_1.setBackground(new Color(152, 201, 45));
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
				AddSessionRooms.setVisible(false);
			*/	
			}
		});
		
		panel_1.add(btnViewGroups_1);
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
	
		JLabel lblNewLabel_1 = new JLabel("Add Session for Rooms");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(Color.WHITE);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Select Session");
		lblNewLabel_2.setBounds(280, 319, 163, 25);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(152, 201, 45));
		
		JLabel lblNewLabel_2_1 = new JLabel("Select Room");
		lblNewLabel_2_1.setBounds(280, 521, 134, 25);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(new Color(152, 201, 45));

		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 658, 1082, 124);
		panel_3.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Select Session");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_3.setBounds(280, 400, 156, 33);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(152, 201, 45));
	//ComboBox 1	
		rooms_1 = new JComboBox();
		rooms_1.setBounds(282, 443, 1062, 37);
		rooms_1.setModel(new DefaultComboBoxModel(new String[] {"Select Session.."}));
		
		rooms_1.setForeground(Color.WHITE);
		rooms_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));	
		rooms_1.setBackground(new Color(51, 51, 51));
		rooms_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		frame.getContentPane().add(rooms_1);
		
		/*
		 * comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setBackground(new Color(51, 51, 51));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Room..."}));
		comboBox_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		comboBox_1.setBounds(520, 383, 262, 38);
		 */
		
		
	//ComboBox 2	
		rooms = new JComboBox();
		/**/
		rooms.setModel(new DefaultComboBoxModel(new String[] {"Select a Room.."}));
		
		rooms.setForeground(Color.WHITE);
		rooms.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));	
		rooms.setBackground(new Color(51, 51, 51));
		rooms.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		 
		rooms.setBackground(new Color(51, 51, 51));
		rooms.setBounds(449, 518, 255, 33);
		frame.getContentPane().add(rooms);
		
		
		rdbtnConsecutive = new JRadioButton("Consecutive Sessions");
		rdbtnConsecutive.setBackground(new Color(51, 51, 51));
		rdbtnConsecutive.setBounds(447, 321, 273, 33);
		rdbtnConsecutive.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(rdbtnConsecutive);
		rdbtnConsecutive.setForeground(new Color(152, 201, 45));
		rdbtnConsecutive.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		rdbtnParallelSessions = new JRadioButton("Parrallel Sessions");
		rdbtnParallelSessions.setBackground(new Color(51, 51, 51));
		rdbtnParallelSessions.setBounds(739, 321, 255, 33);
		rdbtnParallelSessions.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(rdbtnParallelSessions);
		rdbtnParallelSessions.setForeground(new Color(152, 201, 45));
		rdbtnParallelSessions.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		
		rdbtnNonOverlapping = new JRadioButton("Non Overlapping");			
		rdbtnNonOverlapping.setBackground(new Color(51, 51, 51));
		rdbtnNonOverlapping.setBounds(1021, 319, 207, 37);
		rdbtnNonOverlapping.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(rdbtnNonOverlapping);
		rdbtnNonOverlapping.setForeground(new Color(152, 201, 45));
		rdbtnNonOverlapping.setBorder(new LineBorder(new Color(169, 224, 49), 3));

		//disabling radio buttons 
		rdbtnParallelSessions.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				rdbtnConsecutive.setSelected(false);
				rdbtnNonOverlapping.setSelected(false);
				System.out.println("Combo2 selexted");
				rooms_1.removeAllItems();
				
				fillComboBox2();
				

				
			//	rooms_1.setSelectedIndex(0);
		    
			    }
		});
		
		rdbtnNonOverlapping.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				rdbtnConsecutive.setSelected(false);
		    	rdbtnParallelSessions.setSelected(false);
		    	System.out.println("Combo3 selexted");
				rooms_1.removeAllItems();

				fillComboBox3();
		    }
		});
		
		rdbtnConsecutive.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	rdbtnParallelSessions.setSelected(false);
		    	rdbtnNonOverlapping.setSelected(false);
				System.out.println("Combo1 selexted");
				rooms_1.removeAllItems();

				
				fillComboBox1();
	/*
	 * 			rdbtnConsecutive.addItemListener(evt -> {
	
				    rooms_1.setEnabled(evt.getStateChange() == ItemEvent.SELECTED);
				    
				    try {
						
						
						Connection con = DBConnect.connect();
						
						String query="select * from location";
						PreparedStatement pst=con.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						//comboBox.setModel(DbUtils.resultSetToNestedList(rs));
						//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Lecturer..."}))
						while(rs.next()) {
							String group=rs.getString("buildingName");
						//	String subgroup=rs.getString("subGroupID");
							
							rooms_1.addItem(group);
						//	comboBox_3.addItem(subgroup);
						}
						con.close();
					}
					catch(Exception el) {
						el.printStackTrace();
					}
				    
				}); */
		    }
		});
		//~disabling radio buttons ***
/**/	
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1 select session type check
				 * 2 load data from relevant table to session
				 * 3 select all rooms from session table >>>>. foreign key should be there to select relevant room for a consec, or parallel or non overl.
				 * 4 insert to table room sessions
				 */
			
				String sessionType = null;
				String session = null;
				String room = null;
				String Combosession = rooms_1.getSelectedItem().toString();
				String Comboroom = rooms.getSelectedItem().toString();
				String sessionSign = Combosession +" " + Comboroom;
				
				System.out.println(sessionSign);
				if(rooms_1.getSelectedItem().toString().equals("") || rooms.getSelectedItem().toString().equals("") || rooms_1.getSelectedItem().toString().equals("Select Session..") ||  rooms.getSelectedItem().toString().equals("Select a Room..") ) {
					JOptionPane.showMessageDialog(null, "Please fill the Data you want to save");			
				}else {
					
					
					 // If condition to check if jRadioButton2 is selected. 
	                if (rdbtnConsecutive.isSelected()) { 
	                	sessionType = "Consecutive";
	                	System.out.println("Session type" + sessionType);
	     
	                	//set the combo box rooms
	                	//check for the no of students in session with room capacity***************
	                	
	                }else if (rdbtnParallelSessions.isSelected()) { 
	                	sessionType = "Parallel"; 
	                
	                	//set the combo box values
	                	//set the combo box rooms
	                	//check for the no of students in session with room capacity***************
	                	
	                } else if (rdbtnNonOverlapping.isSelected()) { 
	                	sessionType = "Non overlapping"; 
	                	
	                	//set the combo box rooms
	                	//check for the no of students in session with room capacity***************
	                } else { 
	                	JOptionPane.showMessageDialog(panel, "Please select a Type", "Warning Select a Session ",JOptionPane.WARNING_MESSAGE);
	                } 
	                
	                //Query
	   /*   */            try {
						 Connection con = DBConnect.connect();
	
		                    String query = "INSERT INTO roomSession values(null, '" + Combosession + "','" + Comboroom + "','"+ sessionSign +"')";
	
		                    Statement sta = con.createStatement();
		                    int x = sta.executeUpdate(query);
		                    if (x == 0) {
		                        JOptionPane.showMessageDialog(btnSave, "This is alredy exist");
		                    } else {
		                        JOptionPane.showMessageDialog(btnSave,
		                            "Successfully added!!!");
		                    }
		                    con.close();
		                } catch (Exception exception) {
		                    exception.printStackTrace();
		                	
		                }     
		
				}//end of check if else
				//check for null combo boxes
                //insert into table use a flag
			
			}//event closure
		});
		btnSave.setBounds(268, 42, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSave.setForeground(new Color(21, 25, 28));
		btnSave.setBackground(new Color(152, 201, 45));
		
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rooms_1.removeAllItems();
				rooms_1.setModel(new DefaultComboBoxModel(new String[] {"Select Session.."}));
				rdbtnConsecutive.setSelected(false);
				rdbtnNonOverlapping.setSelected(false);
        		rdbtnParallelSessions.setSelected(false);

				rooms.setSelectedIndex(0);				
			}
		});
		btnClear.setBounds(518, 42, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnClear.setForeground(new Color(21, 25, 28));
		btnClear.setBackground(new Color(152, 201, 45));
		
		JTextPane txtpnInHereGive = new JTextPane();
		txtpnInHereGive.setEditable(false);
		txtpnInHereGive.setForeground(Color.WHITE);
		txtpnInHereGive.setBackground(new Color(0, 0, 0));
		txtpnInHereGive.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		txtpnInHereGive.setText("Give seperate rooms for each type of sessions such as concecutive, parallel and non overlapping.First select any type of session, then\r\nthe session signatures of that selected session type will be in the below combo box. Allocate room for relevent signature.");
		txtpnInHereGive.setBounds(274, 176, 1062, 48);
		txtpnInHereGive.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		frame.getContentPane().add(txtpnInHereGive);
		
		
	
		//combo box loading
		//fillComboBox();
		
		//combo box loading room
		fillRoom();
		// (String)cb1.getSelectedItem();
		
		String text = rooms_1.getSelectedItem().toString();


	}	
}