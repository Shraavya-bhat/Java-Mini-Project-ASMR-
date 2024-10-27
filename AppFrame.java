package classess;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

	 this.add(List,BorderLayout.CENTER);
		
	 addTask = btnPannel.getAddTask();
         clear = btnPannel.getClear();

	 addListeners();	
    	 
     }
	public void addListeners()
	{
		addTask.addMouseMotionListener(new MouseAdapter()
		{
			@Override
			public void mousePressed(MouseEvent e)
			{
				Task task = new Task();
			        List.add(task);
			        List.updateNumbers();
			        task.getDone().addMouseListener(new MouseAdapter()
			        {
			        	@Override
			        	public void mousePressed(MouseEvent e)
			        	{
			        		task.changeState();
			        		revalidate();
			        	}
			        });       
			revalidate();
			}
	});
	};
}
