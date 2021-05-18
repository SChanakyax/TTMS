package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dbConnect.DBConnect;
import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class LecturerTimeTable {

	private JFrame frame;
	private JTable table;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LecturerTimeTable window = new LecturerTimeTable();
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
	public LecturerTimeTable() {
		initialize();
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
				comboBox.addItem(name);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(350, 90, 1350, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(96, 81, 1136, 573);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"08:30-09:30", null, null, null, null, null, null, null},
			},
			new String[] {
				"Time Slot", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Genarate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con = DBConnect.connect();
					
					String query="select * from timeAlloLecture  ";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					//table.setModel();
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(814, 22, 105, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(966, 22, 105, 38);
		frame.getContentPane().add(btnPrint);
		
		 comboBox = new JComboBox();
		comboBox.setBounds(523, 28, 245, 27);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Select Lecturer");
		lblNewLabel.setBounds(308, 34, 144, 21);
		frame.getContentPane().add(lblNewLabel);
		
		fillComboBox();
		
	}
	
}
