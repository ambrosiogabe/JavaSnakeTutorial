import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class ML extends MouseAdapter implements MouseMotionListener {
    public boolean isPressed = false;
    public double x = 0.0, y = 0.0;

    @Override
    public void mousePressed(MouseEvent e) {
        isPressed = true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        isPressed = false;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.x = e.getX();
        this.y = e.getY();
    }

    public double getX() { return this.x; }
    public double getY() { return this.y; }

    public boolean isPressed() { return this.isPressed; }
}
