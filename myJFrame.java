import java.awt.*;
import javax.swing.*;

public class myJFrame extends JFrame
{
	introScreen introScreen;
	public myJFrame ()
	{
		super ("My First Frame");
                introScreen = new introScreen();
        
		getContentPane().setLayout(new BorderLayout()); 
		getContentPane().add(introScreen, "Center");
                
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (640, 480);
		setVisible(true);
	}
}
