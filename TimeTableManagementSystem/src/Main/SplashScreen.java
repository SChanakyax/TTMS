package Main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JProgressBar;

public class SplashScreen extends javax.swing.JFrame {

	private JFrame frame;
	private JLabel lblNewLabel_1;
	public javax.swing.JLabel  lblNewLabel_5;
	public JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
	}

	/**
	 * Create the application.
	 */
	public SplashScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBackground(Color.YELLOW);
		frame.setResizable(false);
		frame.setTitle("Login");
		frame.setBounds(350, 90, 1350, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1344, 80);
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Time Table Management System");
		lblNewLabel.setBackground(new Color(0, 102, 102));
		lblNewLabel.setBounds(261, 5, 822, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(152, 201, 45));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 1344, 787);
		panel_1.setBackground(new Color(21,25,28));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        pack();
	        setLocationRelativeTo(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(24, 11, 49, 48);
		panel_1.add(btnNewButton_1);
		
		btnNewButton_1.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Twitter_32px_2.png"))); // NOI18N
       // jButton2.setToolTipText("Twitter");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setRolloverIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Twitter_32px.png"))); // NOI18N
		
		JButton button = new JButton("");
		button.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Facebook_32px_7.png")));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(94, 11, 49, 48);
		panel_1.add(button);
		button.setRolloverIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Facebook_32px_2.png")));
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Instagram_32px_3.png")));
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(174, 11, 49, 48);
		panel_1.add(button_1);
		button_1.setRolloverIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Instagram_32px.png")));
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Secured_Letter_32px_2.png")));
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBorder(null);
		button_2.setBounds(252, 11, 49, 48);
		panel_1.add(button_2);
		button_2.setRolloverIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_Secured_Letter_32px.png")));
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_YouTube_32px_1.png")));
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBorder(null);
		button_3.setBounds(328, 11, 49, 48);
		panel_1.add(button_3);
		button_3.setRolloverIcon(new javax.swing.ImageIcon(this.getClass().getResource("/icons8_YouTube_32px.png")));
		
		JLabel lblNewLabel_4 = new JLabel("Connect With Us On ");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_4.setForeground(new java.awt.Color(169, 224, 49));
		lblNewLabel_4.setBounds(34, 63, 192, 28);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("TimeTable Management System");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 45));
		lblNewLabel_2.setForeground(new Color(169, 224, 49));
		lblNewLabel_2.setBounds(341, 359, 660, 88);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(549, 177, 203, 171);
		panel_1.add(lblNewLabel_3);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/logo.img.gif/"));
		lblNewLabel_3.setIcon(image);
		
		 progressBar = new JProgressBar();
		progressBar.setBounds(0, 736, 1344, 51);
		progressBar.setBorderPainted(false);
		progressBar.setFocusable(false);
		progressBar.setRequestFocusEnabled(false);
		progressBar.setVerifyInputWhenFocusTarget(false);
		panel_1.add(progressBar);
		
		 lblNewLabel_5 = new JLabel("99%");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", 1, 24));
		lblNewLabel_5.setForeground(new Color(169, 224, 49));
		lblNewLabel_5.setBounds(636, 660, 60, 48);
		panel_1.add(lblNewLabel_5);
		
		 
		
	}

	

	

	

	
}
