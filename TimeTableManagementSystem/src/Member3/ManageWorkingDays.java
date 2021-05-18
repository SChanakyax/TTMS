package Member3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

import dbConnect.DBConnect;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class ManageWorkingDays {
	public String Mon ,Tu ,We,Th,Fr,Sat,Sun;

	private JFrame frmManageWork;
	private JTable table;
	private JTextField textField_3;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox  chckbxTuesday;;
	private JCheckBox chckbxWednesday;
	private JCheckBox chckbxThursday;
	private JCheckBox chckbxFriday;
	private JCheckBox chckbxSaturday;
	private JCheckBox chckbxSunday;
	//private JSpinner spi1;

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
					
					ManageWorkingDays window = new ManageWorkingDays();
					window.frmManageWork.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManageWorkingDays() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmManageWork = new JFrame();
		frmManageWork.getContentPane().setBackground(new Color(21,25,28));
		frmManageWork.setBackground(Color.YELLOW);
		frmManageWork.setResizable(false);
		frmManageWork.setTitle("Manage Working Days And Hours");
		frmManageWork.setBounds(350, 90, 1350, 900);
		frmManageWork.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmManageWork.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frmManageWork.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(169, 224, 49));
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 79, 262, 799);
		panel_1.setBackground(new Color(51, 51, 51));
		frmManageWork.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Working Days");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddWorkDays abc =new AddWorkDays();
				try {
					AddWorkDays.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(12, 320, 240, 50);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		btnNewButton.setForeground(new Color(21, 25, 28));
		btnNewButton.setBackground(new Color(152, 201, 45));
		
		JButton btnManageGroups = new JButton("Manage Working Days");
		btnManageGroups.setBounds(12, 383, 252, 50);
		btnManageGroups.setFont(new Font("Tahoma", Font.BOLD, 20));
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
		
		JLabel lblNewLabel_1 = new JLabel("Manage Working Days And Hours");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(262, 93, 1082, 48);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frmManageWork.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 154, 1082, 48);
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.controlText);
		frmManageWork.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("No. of Working Days");
		lblNewLabel_2.setBounds(277, 342, 252, 25);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmManageWork.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		
		JLabel lblNewLabel_2_1 = new JLabel("Working Days");
		lblNewLabel_2_1.setBounds(277, 402, 252, 25);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmManageWork.getContentPane().add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(new Color(169, 224, 49));
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Working Time Per Day");
		lblNewLabel_2_1_2.setBounds(274, 554, 281, 25);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmManageWork.getContentPane().add(lblNewLabel_2_1_2);
		lblNewLabel_2_1_2.setForeground(new Color(169, 224, 49));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(262, 658, 1082, 124);
		panel_3.setBackground(new Color(0, 0, 0));
		frmManageWork.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 7, 1));
		spinner.setForeground(Color.WHITE);
		spinner.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		spinner.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		spinner.setBackground(new Color(31, 36, 42));
		spinner.setBounds(539, 336, 262, 38);
		frmManageWork.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 23, 1));
		spinner_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		spinner_1.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		spinner_1.setBounds(539, 548, 135, 38);
		frmManageWork.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 30, 30));
		spinner_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		spinner_2.setBorder(new LineBorder(new Color(169, 224, 49), 3));
		spinner_2.setBounds(841, 548, 135, 38);
		frmManageWork.getContentPane().add(spinner_2);
		
		
		JButton btnClear = new JButton("Update");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox.isSelected()) {
					Mon=chckbxNewCheckBox.getText().toString();
				}
				else{
					Mon = " - ";
				}
				
				
				if(chckbxTuesday.isSelected()) {
					Tu=chckbxTuesday.getText().toString();
				}
				else{
					Tu = " - ";
				}
				
				if(chckbxWednesday.isSelected()) {
					We=chckbxWednesday.getText().toString();
				}
				else{
					We = " - ";
				}
				
				if(chckbxThursday.isSelected()) {
					Th=chckbxThursday.getText().toString();
				}
				else{
					Th = " - ";
				}
				
				
				if(chckbxFriday.isSelected()) {
					Fr=chckbxFriday.getText().toString();
				}
				
				else{
					Fr = " - ";
				}
				
				if(chckbxSaturday.isSelected()) {
					Sat=chckbxSaturday.getText().toString();
				}
				
				else{
					Sat = " - ";
				}
				
				if(chckbxSunday.isSelected()) {
					Sun=chckbxSunday.getText().toString();
				}
				else{
					Sun = " - ";
				}
				
				if(spinner.getValue().equals(0)&& spinner_1.getValue().equals(0)&& spinner_2.getValue().equals(0)) {
					JOptionPane.showMessageDialog(null, "Please Select Number of working Hours and Days!!!");
				}
				 else if(spinner.getValue().equals(0)) {
						JOptionPane.showMessageDialog(null, "Please Select Number of working days!!!");
					}
				 
				 else if(spinner_1.getValue().equals(0)&& spinner_2.getValue().equals(0)) {
						JOptionPane.showMessageDialog(null, "Please Select Number of working hours and minutes!!!");
					}
				 else {
				
				try {
					Connection con = DBConnect.connect();
					
					String query="Update main set noOfWorkingDays='"+spinner.getValue()+"',monday='"+Mon+"',tuesday='"+Tu+"',wednesday='"+We+"',thursday='"+Th+"',friday='"+Fr+"',saturday='"+Sat+"',sunday='"+Sun+"',hours='"+spinner_1.getValue()+"',minutes='"+spinner_2.getValue()+"' where mid='"+textField_3.getText()+"' ";
					PreparedStatement pst=con.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Updated");
					pst.close();
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			}
		});
		btnClear.setBounds(423, 42, 238, 50);
		panel_3.add(btnClear);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setForeground(new Color(21, 25, 28));
		btnClear.setBackground(new Color(152, 201, 45));
		
		JButton btnSave = new JButton("Delete");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Connection con = DBConnect.connect();
					String query="Delete from main where mid='"+textField_3.getText()+"'";
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
		btnSave.setBounds(746, 42, 238, 50);
		panel_3.add(btnSave);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSave.setForeground(new Color(21, 25, 28));
		btnSave.setBackground(new Color(152, 201, 45));
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con = DBConnect.connect();
					
					String query="select * from main ";
					PreparedStatement pst=con.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRefresh.setForeground(new Color(21, 25, 28));
		btnRefresh.setBackground(new Color(152, 201, 45));
		btnRefresh.setBounds(108, 42, 238, 50);
		panel_3.add(btnRefresh);
		
		 chckbxNewCheckBox = new JCheckBox("Monday");
		 chckbxNewCheckBox.setBackground(new Color(51, 51, 51));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox.setBounds(539, 402, 125, 25);
		frmManageWork.getContentPane().add(chckbxNewCheckBox);
		chckbxNewCheckBox.setForeground(new Color(169, 224, 49));
		
		 chckbxTuesday = new JCheckBox("Tuesday");
		 chckbxTuesday.setBackground(new Color(51, 51, 51));
		chckbxTuesday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxTuesday.setBounds(704, 402, 125, 25);
		frmManageWork.getContentPane().add(chckbxTuesday);
		chckbxTuesday.setForeground(new Color(169, 224, 49));
		
		 chckbxWednesday = new JCheckBox("Wednesday");
		 chckbxWednesday.setBackground(new Color(51, 51, 51));
		chckbxWednesday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxWednesday.setBounds(855, 402, 135, 25);
		frmManageWork.getContentPane().add(chckbxWednesday);
		chckbxWednesday.setForeground(new Color(169, 224, 49));
		
		 chckbxThursday = new JCheckBox("Thursday");
		 chckbxThursday.setBackground(new Color(51, 51, 51));
		chckbxThursday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxThursday.setBounds(1035, 402, 125, 25);
		frmManageWork.getContentPane().add(chckbxThursday);
		chckbxThursday.setForeground(new Color(169, 224, 49));
		
		 chckbxFriday = new JCheckBox("Friday");
		 chckbxFriday.setBackground(new Color(51, 51, 51));
		chckbxFriday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxFriday.setBounds(1186, 402, 125, 25);
		frmManageWork.getContentPane().add(chckbxFriday);
		chckbxFriday.setForeground(new Color(169, 224, 49));
		
		 chckbxSaturday = new JCheckBox("Saturday");
		 chckbxSaturday.setBackground(new Color(51, 51, 51));
		chckbxSaturday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxSaturday.setBounds(539, 475, 125, 25);
		frmManageWork.getContentPane().add(chckbxSaturday);
		chckbxSaturday.setForeground(new Color(169, 224, 49));
		
		 chckbxSunday = new JCheckBox("Sunday");
		 chckbxSunday.setBackground(new Color(51, 51, 51));
		chckbxSunday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxSunday.setBounds(704, 475, 125, 25);
		frmManageWork.getContentPane().add(chckbxSunday);
		chckbxSunday.setForeground(new Color(169, 224, 49));
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHours.setBounds(701, 554, 96, 25);
		frmManageWork.getContentPane().add(lblHours);
		lblHours.setForeground(new Color(169, 224, 49));
		
		JLabel lblMinutes = new JLabel("Minutes");
		lblMinutes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMinutes.setBounds(1014, 554, 96, 25);
		frmManageWork.getContentPane().add(lblMinutes);
		lblMinutes.setForeground(new Color(169, 224, 49));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 166, 1039, 91);
		frmManageWork.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int selectedRow=table.getSelectedRow();
				
				
				//textField.setText(table.getValueAt(selectedRow, 1).toString());
				//textField_1.setText(table.getValueAt(selectedRow, 9).toString());
				//textField_2.setText(table.getValueAt(selectedRow, 10).toString());
				textField_3.setText(table.getValueAt(selectedRow, 0).toString());
				//spi1.setValue((Integer)table.getValueAt(selectedRow, 1));
				
				
				//spi1.setValue((Integer)table.getValueAt(selectedRow, 1));
				String checkdaymon=table.getValueAt(selectedRow, 2).toString();
				String checkdaytues=table.getValueAt(selectedRow, 3).toString();
				String checkdayWed=table.getValueAt(selectedRow, 4).toString();
				String checkdayThur=table.getValueAt(selectedRow, 5).toString();
				String checkdayFri=table.getValueAt(selectedRow, 6).toString();
				String checkdaySat=table.getValueAt(selectedRow, 7).toString();
				
				String checkdaySun=table.getValueAt(selectedRow, 8).toString();
				
				
				
				if(checkdaymon.equals("Monday")) {
					chckbxNewCheckBox.setSelected(true);
				}
				else{
					chckbxNewCheckBox.setSelected(false);
				}
				
				
				if(checkdaytues.equals("Tuesday")) {
					chckbxTuesday.setSelected(true);
				}
				else{
					chckbxTuesday.setSelected(false);
				}
				
				if(checkdayWed.equals("Wednesday")) {
					chckbxWednesday.setSelected(true);
				}
				else{
					chckbxWednesday.setSelected(false);
				}
				
				if(checkdayThur.equals("Thursday")) {
					chckbxThursday.setSelected(true);
				}
				else{
					chckbxThursday.setSelected(false);
				}
				
				
				if(checkdayFri.equals("Friday")) {
					chckbxFriday.setSelected(true);
				}
				else{
					chckbxFriday.setSelected(false);
				}
				
				if(checkdaySat.equals("Saturday")) {
					chckbxSaturday.setSelected(true);
				}
				else{
					chckbxSaturday.setSelected(false);
				}
				
				if(checkdaySun.equals("Sunday")) {
					chckbxSunday.setSelected(true);
				}
				else{
					chckbxSunday.setSelected(false);
				}
				spinner.setValue((Integer)table.getValueAt(selectedRow, 1));
				spinner_1.setValue((Integer)table.getValueAt(selectedRow, 9));
				spinner_2.setValue((Integer)table.getValueAt(selectedRow, 10));
				
				
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblId.setBounds(277, 283, 252, 25);
		frmManageWork.getContentPane().add(lblId);
		lblId.setForeground(new Color(21,25,28));
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(21,25,28));
		textField_3.setBackground(new Color(21,25,28));
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setBorder(null);
		textField_3.setColumns(10);
		textField_3.setBounds(539, 270, 135, 38);
		frmManageWork.getContentPane().add(textField_3);
		
		
		
		
		
		
	    
	}
}
