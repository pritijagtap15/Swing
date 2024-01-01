
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
//import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


public class mouseLis {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.setSize(500,500);
        obj.setVisible(true);
        obj.setLayout(new FlowLayout());
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
}
class abc extends JFrame
{
   
    
    public abc()
    {
    addMouseListener(new MouseAdapter() {
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println(x + " " + y);
    }
});
       
        
        
    }
    
    
}