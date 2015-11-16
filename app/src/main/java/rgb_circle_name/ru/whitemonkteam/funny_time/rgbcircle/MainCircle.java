package rgb_circle_name.ru.whitemonkteam.funny_time.rgbcircle;

/**
 * Created by Андрей on 16.11.2015.
 */
public class MainCircle
{
    protected int x;
    protected int y;
    protected int radius;

    public MainCircle ( int x, int y)
    {
        this.x = x;
        this.y = y;
        this.radius = 100;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
