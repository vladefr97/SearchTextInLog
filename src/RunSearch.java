import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
 
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class RunSearch {

	public static void main(String[] args) {
		//System.out.println ("���������");
		
		 javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                JFrame.setDefaultLookAndFeelDecorated(true);
	                JDialog.setDefaultLookAndFeelDecorated(true);
	                new MainFrame();
	            }
	        });
	}

}
