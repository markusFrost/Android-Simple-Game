package rgb_circle_name.ru.whitemonkteam.funny_time.rgbcircle;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by ������ on 16.11.2015.
 */
public class GameManager
{
    private Paint paint;
    private MainCircle mainCircle;

    public GameManager()
    {
        initPaint(); //
        initMainCircle();
    }

    public void onDraw(Canvas canvas)
    {
        canvas.drawCircle(mainCircle.getX(), mainCircle.getY(), mainCircle.getRadius(), paint);
    }

    private void initMainCircle()
    {
        mainCircle = new MainCircle(300, 500);
    }

    private void initPaint()
    {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }
}
