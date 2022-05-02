package me;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import be.C1410y;
import org.thunderdog.challegram.R;
import p108hb.C5064d;
import p364zd.C11524j;

public class C7008q2 extends View {
    public int f22227a = R.id.theme_color_filling;
    public float f22228b;

    public C7008q2(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        if (this.f22228b > 0.0f) {
            int N = C11524j.m228N(this.f22227a);
            canvas.drawColor(C5064d.m24132a(this.f22228b, N));
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, ((float) Math.sqrt((f * f) + (f2 * f2))) * 0.5f * this.f22228b, C1410y.m37042g(N));
        }
    }

    public void setRevealFactor(float f) {
        if (this.f22228b != f) {
            this.f22228b = f;
            invalidate();
        }
    }
}
