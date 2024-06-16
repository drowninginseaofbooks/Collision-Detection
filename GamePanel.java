
import java.awt.*;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{

    Thread thread;
    Image Truck1, Truck2;
    DetectionClass detect = new DetectionClass();

    GamePanel(){
        super();
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.BLACK);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.fillRect(10 , 10, 100, 100);
        detect.paintComponent(g);
    }

    public void startGame() {
        thread = new Thread(this);
        thread.start();
    }

    public void updateGame() {
        detect.updateGame();
    }

    public void run() {
        double drawInterval = 1000000000 / 60; // 1 Frame Per Second
        double deltaTime = 0; // Change Time
        long lastPassedTime = System.nanoTime();
        long currentTime = 0;

        while (thread != null) {
            currentTime = System.nanoTime();
            deltaTime += (currentTime - lastPassedTime) / drawInterval;
            lastPassedTime = currentTime;

            if (deltaTime >= 1) {
                updateGame();
                repaint();
                deltaTime--;
            }
        }

    }

}