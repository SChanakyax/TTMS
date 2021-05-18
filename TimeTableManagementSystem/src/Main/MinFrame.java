package Main;

public class MinFrame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpalshScreen screen = new SpalshScreen();
	        Login sign = new Login();
	        screen.setVisible(true);
	        try {
	            for (int row = 0; row <=100; row++) {
	                Thread.sleep(100);
	                screen.loadingnumber(Integer.toString(row)+"%");
	                screen.loadingprogress.setValue(row);
	                if (row == 100) {
	                    
	                    screen.setVisible(false);
	                    sign.setVisible(true);
	                }
	            }
	        } catch (Exception e) {
	        }

	}

}
