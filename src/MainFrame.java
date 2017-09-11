import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainFrame extends JFrame {
	 private JTextArea theText;
	 
	MainFrame (){
		super ("SearchStringInLog");
		 setBounds(100, 100, 700, 400); 
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         initMainPanel();
	}
	
	private void initMainPanel(){
		JPanel panel = new JPanel(new BorderLayout());
	    theText = new JTextArea();
	    panel.add(new JScrollPane(theText), BorderLayout.NORTH);
		getContentPane().add(panel);
		
	}
	
}
