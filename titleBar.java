package classess;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class titleBar extends JPanel{
   titleBar(){
	   this.setPreferredSize(new Dimension(400,50));
	   this.setBackground(new Color(0, 100, 0));
	   JLabel titleText=new JLabel("ASMR TO DO LIST");
	   titleText.setPreferredSize(new Dimension(200,40));
	   titleText.setFont(new Font("Sane-serif",Font.ITALIC,20));
	   titleText.setHorizontalAlignment(JLabel.CENTER);
	   this.add(titleText);
   }
}
