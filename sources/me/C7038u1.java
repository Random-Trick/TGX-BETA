package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import be.C1357a0;
import be.C1359b;
import be.C1362c;
import be.C1410y;
import org.thunderdog.challegram.R;
import p139jb.AbstractC5911c;

public class C7038u1 extends View implements AbstractC5911c {
    public Drawable f22333a = C1362c.m37485g(getResources(), R.drawable.baseline_location_on_48);
    public long f22334b;

    public C7038u1(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, C1357a0.m37544i(132.0f)));
    }

    @Override
    public void mo4501a3() {
        if (this.f22333a != null) {
            this.f22333a = null;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f22333a != null) {
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            Drawable drawable = this.f22333a;
            C1362c.m37490b(canvas, drawable, measuredWidth - (drawable.getMinimumWidth() / 2), measuredHeight - (this.f22333a.getMinimumHeight() / 2), C1410y.m37058W(-1));
            long B = C1359b.m37525B(canvas, measuredWidth, measuredHeight - C1357a0.m37544i(4.0f), -1, true, this.f22334b);
            if (B != -1) {
                this.f22334b = SystemClock.uptimeMillis() + B;
                postInvalidateDelayed(B);
            }
        }
    }
}
