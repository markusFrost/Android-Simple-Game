package rgb_circle_name.ru.whitemonkteam.funny_time.rgbcircle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Андрей on 16.11.2015.
 */
public class CanvasView extends View
{
    private Paint paint;
    public CanvasView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        initPaint(); // проинициализировать кисточку для рисвоания
    }

    private void initPaint()
    {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawCircle( 100, 100, 300, paint);
    }
}
