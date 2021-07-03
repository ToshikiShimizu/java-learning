import java.awt.FlowLayout;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("はじめてのswing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);

        // code17-2
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("Hello World!");
        frame.add(label);
        JButton button = new JButton("押してね");
        frame.add(button);

        frame.setVisible(true);
        System.out.println("フレームを表示");
    }
}