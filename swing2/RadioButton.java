
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RadioButton {
    public static void main(String[] args) {
        checkbox obj = new checkbox();
        obj.setSize(500,500);
        obj.setVisible(true);
        obj.setLayout(new FlowLayout());
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
}
class checkbox extends JFrame
{
    JTextField t1;
    JButton b1;
    JRadioButton r1,r2;
    JLabel l1;
    
    
    public checkbox()
    {
        
        t1 =new JTextField(10);
        b1 = new JButton("OK");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        l1 = new JLabel("Creating");
        

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(t1);
       
        add(r1);
        add(r2);
        add(b1);
        add(l1);
        
         add(b1);
        add(l1);

        //for checkbox your event is itomlistner
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String name = t1.getText();

                if(r1.isSelected())
                {
                    name = "Mr.  " + name;
                }
                else{
                    name = "Ms.  " + name;
                }

               
                l1.setText(name);
            }
        });
    }
    
    
}