import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleProgressBar {
    private int progressValue = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleProgressBar().createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Progress Bar Example");
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton addButton = new JButton("Add Form");
        JProgressBar progressBar = new JProgressBar(0, 100);

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (progressValue < 100) {
                    progressValue++;
                    progressBar.setValue(progressValue);
                } else {
                    // Task completed, stop the timer
                    ((Timer) e.getSource()).stop();
                    new Addition();
                    frame.dispose();
                }
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Start the timer when the button is clicked
                timer.start();
            }
        });

        frame.add(addButton);
        frame.add(progressBar);
        frame.setVisible(true);
    }

    // Dummy class to represent the "Addition" task completion
    private static class Addition {
        Addition() {
            // Simulate some task completion
            System.out.println("Task 'Addition' completed!");
        }
    }
}
