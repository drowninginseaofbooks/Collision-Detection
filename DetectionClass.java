
import java.awt.Color;
import java.awt.Graphics;

public class DetectionClass {

    int x1 = 0; //Rect1
    int y1 = 0;

    int x2 = 500; //Rect2
    int y2 = 0;

    public DetectionClass() {
        super();
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.red);
        g.fillRect(x1 , y1, 100, 100);
        g.setColor(Color.blue);
        g.fillRect(x2 , y2, 100, 100);
    }

    public void updateGame(){
        x1 += 1;
        x2 -= 1;
    }
}
