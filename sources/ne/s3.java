package ne;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import ce.a0;
import ce.o;
import ce.y;

public class s3 extends b2 {
    public s3(Context context) {
        super(context);
        setTypeface(o.k());
        setTextColor(-1);
        setTextSize(1, 16.0f);
        setPadding(a0.i(10.0f), a0.i(10.0f), a0.i(10.0f), a0.i(10.0f));
        setGravity(17);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override
    public void onDraw(Canvas canvas) {
        RectF a02 = y.a0();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i10 = a0.i(10.0f);
        a02.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f10 = i10;
        canvas.drawRoundRect(a02, f10, f10, y.g(-1610612736));
        super.onDraw(canvas);
    }
}
