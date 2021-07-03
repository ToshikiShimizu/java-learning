import java.awt.FlowLayout;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("はじめてのswing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);

        // code17-3
        frame.setLayout(null);
        JLabel label = new JLabel("Hello World!");
        label.setLocation(10, 10);
        label.setSize(200, 20);
        frame.add(label);
        JButton button = new JButton("押してね");
        button.setLocation(250, 100);
        button.setSize(100,20);
        frame.add(button);

        frame.setVisible(true);
        System.out.println("フレームを表示");
    }
}