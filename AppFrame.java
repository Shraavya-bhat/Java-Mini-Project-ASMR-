package classess;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class AppFrame extends JFrame{
     private titleBar title;
     private list List;
     private ButtonPannel btnPannel;
	

	AppFrame(){
    	 this.setSize(400,700);
    	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 this.setVisible(true);
    	 
    	 title = new titleBar();
    	 list = new list();
    	 btnPannel = new ButtonPannel();
    	 this.add(title,BorderLayout.NORTH);
    	 this.add(btnPannel, BorderLayout.SOUTH);
    	 
     }
}
