import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class checkbos {
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
    JCheckBox c1,c2,c3,c4;
    
    public checkbox()
    {
        
        t1 =new JTextField(10);
        b1 = new JButton("OK");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        l1 = new JLabel("Creating");
        c1 = new JCheckBox("Dancing");
        c2 = new JCheckBox("Singing");
        c3 = new JCheckBox("Playing");
        c4 = new JCheckBox("Teaching");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(t1);
       
        add(r1);
        add(r2);
        add(b1);
        add(l1);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
         add(b1);
        add(l1);

        //for checkbox your event is itomlistner

       c1.addItemListener(new ItemListener() {
    public void itemStateChanged(ItemEvent e) {
        System.out.println("Dancer");
    }
});


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

                if(c1.isSelected())
                {
                    name = name + " Dancer ";
                }
                if(c2.isSelected())
                {
                    name = name + " Singer ";
                }
                if(c3.isSelected())
                {
                    name = name + " Player ";
                }
                if(c4.isSelected())
                {
                    name = name + " Teacher ";
                }
                l1.setText(name);
            }
        });
    }
    
    
}