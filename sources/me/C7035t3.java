package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import be.C1357a0;
import be.C1389o;
import be.C1410y;

public class C7035t3 extends C6847b2 {
    public C7035t3(Context context) {
        super(context);
        setTypeface(C1389o.m37258k());
        setTextColor(-1);
        setTextSize(1, 16.0f);
        setPadding(C1357a0.m37541i(10.0f), C1357a0.m37541i(10.0f), C1357a0.m37541i(10.0f), C1357a0.m37541i(10.0f));
        setGravity(17);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override
    public void onDraw(Canvas canvas) {
        RectF a0 = C1410y.m37050a0();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = C1357a0.m37541i(10.0f);
        a0.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f = i;
        canvas.drawRoundRect(a0, f, f, C1410y.m37039g(-1610612736));
        super.onDraw(canvas);
    }
}
