/*************************************
*	All classes are handle by this class
*
*************************************/
import java.awt.EventQueue;

public class Main {
	
	public static TacTicToe t = new TacTicToe();
	public static boolean state = true;
	public static int count = 0;
	public static boolean winone=false;
	public static boolean wintwo=false;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {		
		try {
			
			if(t.isVisible()==false)
				t.setVisible(true);
			t.contentPane.repaint();
		
		} catch (Exception e) {}
		
	}
});
		
	}

}
