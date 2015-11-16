package rgb_circle_name.ru.whitemonkteam.funny_time.rgbcircle;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Андрей on 16.11.2015.
 */
public class CanvasView extends View
{
    private GameManager gameManager;

    public CanvasView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        gameManager = new GameManager();
    }



    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        gameManager.onDraw(canvas);
    }
}
