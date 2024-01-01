import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jframe17 {
    public static void main(String[] args) {
        Xyz obj = new Xyz();
        obj.setSize(500, 500);
        obj.setVisible(true);
        obj.setLayout(new FlowLayout());
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Xyz extends JFrame {
    JButton b1;

    public Xyz() {
        b1 = new JButton("Addition");
        add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new add();
                //dispose();  // If you want to close the current frame, uncomment this line
            }
        });
    }
}

class add extends JFrame implements ActionListener {
    JTextField t1, t2;
    JButton b1;
    JLabel l1;

    public add() {
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Addition");
        l1 = new JLabel("Result");

        add(t1);
        add(t2);
        add(b1);
        add(l1);

        b1.addActionListener(this);
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int value = num1 + num2;
        l1.setText("Value: " + value);
    }
}
