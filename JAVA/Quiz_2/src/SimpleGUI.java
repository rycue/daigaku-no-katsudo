import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Hello clanker");
        JButton button = new JButton("Click me");

        button.addActionListener(e -> label.setText("Button clicked"));

        frame.add(label);
        frame.add(button);

        frame.setVisible(true);
    }
}
