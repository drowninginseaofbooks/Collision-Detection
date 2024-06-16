
import javax.swing.*;

public class MainClass extends JFrame{
    MainClass() {
        GamePanel pan = new GamePanel();
        add(pan);

        setSize(500, 500);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MainClass();
    }
}