package Member4;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;

public class Statistic {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private int gSum, gSum2, gSum23, gSum24;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args)throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					Statistic window = new Statistic();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void setData() {

		try {
			Connection con = DBConnect.connect();
	
	//Query 1	Lec	
			String query="select count (*) as allLoc from lecturers ";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			
			String sum = rs.getString("allLoc");
			gSum = Integer.parseInt(sum);	
			textField.setText(sum);

	//Qery 2	group	
			String query2="select count (*) as allLoc from studentGroups ";
			PreparedStatement pst2=con.prepareStatement(query2);
			ResultSet rs2=pst2.executeQuery();
			String su2m = rs2.getString("allLoc");
			gSum2 = Integer.parseInt(su2m);			
			textField_1.setText(su2m);
			
	//!3	Subj
			String query23="select count (*) as allLoc from subjects ";
			PreparedStatement pst23=con.prepareStatement(query23);
			ResultSet rs23=pst23.executeQuery();
			String su2m3 = rs23.getString("allLoc");
			gSum23 = Integer.parseInt(su2m3);			
			textField_2.setText(su2m3);
	
	//Q4	rooms
			String query24="select count(*) as allc from location ";
			PreparedStatement pst24=con.prepareStatement(query24);
			ResultSet rs24=pst24.executeQuery();
			String su2m4 = rs24.getString("allc");
			gSum24 = Integer.parseInt(su2m4);			
			textField_3.setText(su2m4);
	   
			con.close();
			
			System.out.println(gSum24);
		}
		catch(Exception load) {
			load.printStackTrace();
		}	
	}//~setdata

	public void setLatestData() {
		try {
		
		try {
				Connection con = DBConnect.connect();	
				//Lecturer
				String lastLec ="SELECT lectureName FROM lecturers WHERE lid = (SELECT MAX(lid) FROM lecturers)";
				
				PreparedStatement pst1 =con.prepareStatement(lastLec);
				ResultSet rs1 =pst1.executeQuery();
				String txtLastLec = rs1.getString("lectureName");				
				textField_4.setText(txtLastLec);
				con.close();
			}catch(Exception con1) {
				con1.printStackTrace();
			}
			
	/*		
			
			
			try {
			Connection consub = DBConnect.connect();	
			
				//Subject
				String lastLec2 ="SELECT subID FROM subjects WHERE subID = (SELECT MAX(subID) FROM subjects)";
				PreparedStatement pst12 =consub.prepareStatement(lastLec2);
				ResultSet rs12 =pst12.executeQuery();
				String txtLastLec2 = rs12.getString("subID");
				textField_5.setText(txtLastLec2);
			}catch(Exception con2) {
				con2.printStackTrace();
			}
		*/	
	/*			try {
			//Group
				Connection con3 = DBConnect.connect();	

				String lastLec3 ="SELECT programme FROM studentGroups WHERE stGroupID = (SELECT MAX(stGroupID) FROM studentGroups)";
				PreparedStatement pst13 =con3.prepareStatement(lastLec3);
				ResultSet rs13 =pst13.executeQuery();
				String txtLastLec3 = rs13.getString("programme");
				textField_6.setText(txtLastLec3);
			}catch(Exception con2) {
				con2.printStackTrace();
			}
	*/
		}finally{
			System.out.println("data loaded");
			//setSubjectData();
		}
	}//~setLatestData
	
	public void setSubjectData() {
		try {
			Connection consub = DBConnect.connect();	
			///				String lastLec ="SELECT lectureName FROM lecturers WHERE lid = (SELECT MAX(lid) FROM lecturers)";
			//"SELECT subID FROM subjects WHERE subID = (SELECT MAX(subID) FROM subjects)";
				//Subject
				String lastLec2 = "SELECT subName FROM subjects WHERE subID = (SELECT MAX(subID) FROM subjects)";
				PreparedStatement pst12 =consub.prepareStatement(lastLec2);
				ResultSet rs12 =pst12.executeQuery();
				String txtLastLec2 = rs12.getString("subName");
				textField_5.setText(txtLastLec2);
				
				consub.close();
				
			}catch(Exception con2) {
				con2.printStackTrace();
			}
	}//~setubjectData
	
	public void setGroupData() {
		try {
			//Group
			Connection con3 = DBConnect.connect();	

			String lastLec3 ="SELECT Programme FROM studentGroups WHERE SGroupID = (SELECT MAX(SGroupID) FROM studentGroups)";
			PreparedStatement pst13 =con3.prepareStatement(lastLec3);
			ResultSet rs13 =pst13.executeQuery();
			String txtLastLec3 = rs13.getString("Programme");
			textField_6.setText(txtLastLec3);
			
			con3.close();
	
		}catch(Exception con2) {
			con2.printStackTrace();
		}
	}//~setubjectData
	
	
/*	*/
	
	/**
	 * Create the application.
	 */
	public Statistic() {
		initialize();
	}

	/**
	 * 
	 * 
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tempus Sans ITC", Font.PLAIN, 10));
		frame.getContentPane().setBackground(new Color(21,25,28));
		frame.setBackground(Color.YELLOW);
		frame.setResizable(false);
		frame.setTitle("Statistics");
		frame.setBounds(100, 40, 1350, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
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
		panel_1.setBounds(0, 78, 262, 787);
		panel_1.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnManageSessionRooms = new JButton("Statistics");
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
		btnManageSessionRooms.setBounds(10, 304, 240, 50);
		btnManageSessionRooms.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnManageSessionRooms.setForeground(new Color(21, 25, 28));
		btnManageSessionRooms.setBackground(new Color(152, 201, 45));
		panel_1.add(btnManageSessionRooms);
///////////////////////////////////////////////////////////////////////////////////////////////		
		JButton btnViewGroups_1 = new JButton("<<Back");
		
		btnViewGroups_1.setBounds(12, 616, 238, 50);
		btnViewGroups_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
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
				Statistic.setVisible(false);
			*/	
			}
		});
		
		JLabel lbli = new JLabel("New label");
		lbli.setBounds(0, 13, 264, 256);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/tt.png"));
		lbli.setIcon(image);
		panel_1.add(lbli);
		
		JLabel lblNewLabel_1 = new JLabel("Statistics");
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
		
		JLabel lblNewLabel_2 = new JLabel("Registered Lecturers");
		lblNewLabel_2.setBounds(298, 182, 200, 50);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));lblNewLabel_2.setForeground(new Color(152, 201, 45));
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(553, 187, 50, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setBackground(new Color(51, 51, 51));
		textField.setForeground(Color.WHITE);
		textField.setBorder(new LineBorder(new Color(169, 224, 49), 3));	
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_3 = new JLabel("Registered Student Groups");
		lblNewLabel_3.setBounds(852, 182, 262, 50);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));lblNewLabel_3.setForeground(new Color(152, 201, 45));
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(1199, 191, 50, 39);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(51, 51, 51));
		textField_1.setForeground(Color.WHITE);
		textField_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));	
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_4 = new JLabel("Registered Subjects");
		lblNewLabel_4.setBounds(298, 270, 200, 50);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));lblNewLabel_4.setForeground(new Color(152, 201, 45));
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(553, 268, 50, 39);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(51, 51, 51));
		textField_2.setForeground(Color.WHITE);
		textField_2.setBorder(new LineBorder(new Color(169, 224, 49), 3));	
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
		JLabel lblNewLabel_5 = new JLabel("Registered Rooms");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 20));lblNewLabel_5.setForeground(new Color(152, 201, 45));

		lblNewLabel_5.setBounds(852, 270, 200, 50);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(1199, 270, 50, 39);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(51, 51, 51));
		textField_3.setForeground(Color.WHITE);
		textField_3.setBorder(new LineBorder(new Color(169, 224, 49), 3));	
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnStats = new JButton("Graphical Statistics");
		btnStats.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnStats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();

				 dataset.setValue(gSum , "Lecturer", "Lecturer");
				 dataset.setValue(gSum2 , "No.Of Students", "Student");
				 dataset.setValue(gSum23 , "Subjects", "Subjects");
				 dataset.setValue(gSum24 , "Rooms", "Rooms");
				// dataset.setValue(12, "Buildings", "Buildings");
				 
				 JFreeChart chart = ChartFactory.createBarChart("Statistic of the System", " ", "Total", dataset,
						 PlotOrientation.VERTICAL,false,true,false);
				 
				 chart.setBackgroundPaint(Color.white);
				 chart.getTitle().setPaint(Color.blue);
				 
				 
				 //add lec
				 CategoryPlot p = chart.getCategoryPlot();
				 p.setRangeGridlinePaint(Color.white);
				 
				 ChartFrame frame1 = new ChartFrame("Statistics", chart);
	
				frame1.setVisible(true);
				frame1.setSize(500, 700);
			
			}
		});
		btnStats.setBounds(298, 389, 193, 39);
		frame.getContentPane().add(btnStats);
		
		JLabel lblNewLabel_6 = new JLabel("Latest details");
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_6.setForeground(new Color(152, 201, 45));
		lblNewLabel_6.setBounds(298, 489, 182, 48);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Lecturer");
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_7.setForeground(new Color(152, 201, 45));
		lblNewLabel_7.setBounds(380, 581, 118, 24);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Subject");
		lblNewLabel_7_1.setForeground(new Color(152, 201, 45));
		lblNewLabel_7_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_7_1.setBounds(380, 653, 118, 24);
		frame.getContentPane().add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Group");
		lblNewLabel_7_1_1.setForeground(new Color(152, 201, 45));
		lblNewLabel_7_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_7_1_1.setBounds(380, 726, 118, 24);
		frame.getContentPane().add(lblNewLabel_7_1_1);
		
		
		textField_4 = new JTextField();
		textField_4.setBounds(537, 577, 356, 39);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(51, 51, 51));
		textField_4.setForeground(Color.WHITE);
		textField_4.setBorder(new LineBorder(new Color(169, 224, 49), 3));	
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(537, 649, 356, 39);
		frame.getContentPane().add(textField_5);
		textField_5.setBackground(new Color(51, 51, 51));
		textField_5.setForeground(Color.WHITE);
		textField_5.setBorder(new LineBorder(new Color(169, 224, 49), 3));	
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(537, 722, 356, 39);
		frame.getContentPane().add(textField_6);
		textField_6.setBackground(new Color(51, 51, 51));
		textField_6.setForeground(Color.WHITE);
		textField_6.setBorder(new LineBorder(new Color(169, 224, 49), 3));	
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		


	//	textField_4.setText("Mathematics for Computing");
	 
		setData();
		setLatestData();
		setSubjectData();
		setGroupData();
	}
}
