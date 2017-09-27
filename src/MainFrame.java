<<<<<<< HEAD
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

=======
﻿import javax.swing.*;
>>>>>>> bdbdaff6217d0d95c35c96a44bd229a2af883611
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class MainFrame extends JFrame {
	 private JTextArea theText;
	 
	MainFrame (){
		super ("SearchStringInLog");
		 setBounds(100, 100, 700, 400); 
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         initMainPanel();
	}
	
	private void initMainPanel(){
		JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
         
        panel.add(Box.createVerticalGlue());
 
        final JLabel label = new JLabel("Выбранный файл");
        label.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(label);
 
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("������� ������:");
              
        		
        
        JTree tree = new JTree();
 
        JButton button = new JButton("Выбор каталога");
        button.setAlignmentX(CENTER_ALIGNMENT);
 
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileopen = new JFileChooser();             
                int ret = fileopen.showDialog(null, "Открыть файл");                
                if (ret == JFileChooser.APPROVE_OPTION) {
                    File file = fileopen.getSelectedFile();
                 //   label.setText(file.getPath()+"/" +file.getName());
                    DefaultMutableTreeNode path = new DefaultMutableTreeNode (file.getPath());
                    DefaultMutableTreeNode fileName = new DefaultMutableTreeNode (file.getName());
                    path.add(fileName);
                    top.add(path);
                }
            }
        });
 
        tree = new JTree(top);
      
        JScrollPane treeView = new JScrollPane(tree);
        
        panel.add(treeView);
        panel.add(button);
        panel.add(Box.createVerticalGlue());
        getContentPane().add(panel);
 
        setPreferredSize(new Dimension(260, 220));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
		
	}
	
}