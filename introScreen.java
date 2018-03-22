/**
 * 
 * @author RobotRock3.0
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class introScreen extends JPanel implements ActionListener
{
    JButton instructions, designers, etc, campus;    
    
    public introScreen()
    {
        super();
        setBackground(Color.white);
        //setlayout(null);
        //Create buttons > add action listeners > add button
        instructions = new JButton("instructions");
        instructions.addActionListener(this);
        //when positioning the first intro button, leaving a gap for back button
        instructions.setBounds(new Rectangle(200,0,100,100));
        add(instructions);
        designers = new JButton("designers");
        designers.addActionListener(this);
        designers.setBounds(new Rectangle(300,0,100,100));
        add(designers);
        etc = new JButton("etc");
        etc.addActionListener(this);
        add(etc);
        campus = new JButton("campus");
        campus.addActionListener(this);
        add(campus);
    }
    public void actionPerformed(ActionEvent click)
    {
        Object obj1 = click.getSource();
        String choice = click.getActionCommand();
        if (obj1 == instructions)
        {
            System.out.println("User clicked instructions!");
            
        }
        if (obj1 == designers)
        {
            System.out.println("User clicked designers!");
        }
    }
    
}
