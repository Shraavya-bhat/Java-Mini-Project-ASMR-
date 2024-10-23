package classess;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AppFrame extends JFrame{
	
     private titleBar title;
     private list List;
     private ButtonPannel btnPannel;

	private JButton addTask;
	private JButton clear;
	

	AppFrame()
	{
    	 this.setSize(400,700);
    	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 this.setVisible(true);
    	 
    	 title = new titleBar();
    	 List = new list();
    	 btnPannel = new ButtonPannel();
    	 this.add(title,BorderLayout.NORTH);
    	 this.add(btnPannel, BorderLayout.SOUTH);

	 this.add(list,BorderLayout.CENTER);
		
	 addTask = btnPanel.getAddTask();
         clear = btnPanel.getClear();

	 addListeners();	
    	 
     }
	public void addListeners()
	{
		addTsk.addMouseListener(new MouseAdapter())
		{
			@override
			public void mousePressed(MouseEvent e)
			{
				Task task = new Task();
			        list.add(task);
			revalidate():
			}
	}};
}
