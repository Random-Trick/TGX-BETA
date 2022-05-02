package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import be.C1357a0;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p364zd.C11524j;

public class C6862d3 extends View {
    public float f21563M;
    public int f21565O;
    public int f21566P;
    public boolean f21568R;
    public boolean f21569S;
    public boolean f21570T;
    public final Paint f21571a;
    public float f21572b;
    public float f21573c;
    public int f21567Q = R.id.theme_color_separator;
    public int f21564N = Math.max(C1357a0.m37541i(0.5f), 1);

    public C6862d3(Context context) {
        super(context);
        Paint paint = new Paint(5);
        this.f21571a = paint;
        paint.setColor(C11524j.m228N(this.f21567Q));
        paint.setStyle(Paint.Style.FILL);
    }

    public static C6862d3 m18733e(Context context, ViewGroup.LayoutParams layoutParams, boolean z) {
        C6862d3 d3Var = new C6862d3(context);
        d3Var.setSeparatorHeight(Math.max(1, C1357a0.m37541i(0.5f)));
        if (z) {
            d3Var.m18736b();
            d3Var.m18734d();
        }
        layoutParams.width = -1;
        layoutParams.height = C1357a0.m37541i(1.0f);
        d3Var.setLayoutParams(layoutParams);
        return d3Var;
    }

    public void m18737a() {
        this.f21570T = true;
    }

    public void m18736b() {
        this.f21568R = true;
    }

    public void m18735c(float f, float f2) {
        this.f21572b = f;
        this.f21573c = f2;
    }

    public void m18734d() {
        this.f21569S = true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        if (this.f21569S) {
            int i = this.f21565O;
            if (i == 0) {
                i = C11524j.m148w();
            }
            canvas.drawColor(i);
        }
        int i2 = this.f21566P;
        if (i2 == 0) {
            this.f21571a.setColor(C11524j.m228N(this.f21567Q));
        } else {
            this.f21571a.setColor(i2);
        }
        if (this.f21572b == 0.0f && this.f21573c == 0.0f) {
            float f = this.f21563M;
            canvas.drawRect(0.0f, f, measuredWidth, f + this.f21564N, this.f21571a);
        } else if (C4403w.m27984G2()) {
            float f2 = this.f21573c;
            float f3 = this.f21563M;
            canvas.drawRect(f2, f3, measuredWidth - this.f21572b, f3 + this.f21564N, this.f21571a);
        } else {
            float f4 = this.f21572b;
            float f5 = this.f21563M;
            canvas.drawRect(f4, f5, measuredWidth - this.f21573c, f5 + this.f21564N, this.f21571a);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f21563M = this.f21570T ? getMeasuredHeight() - this.f21564N : this.f21568R ? 0.0f : getMeasuredHeight() / 2.0f;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setColorId(int i) {
        if (this.f21567Q != i) {
            this.f21567Q = i;
            this.f21571a.setColor(C11524j.m228N(i));
        }
    }

    public void setSeparatorHeight(int i) {
        this.f21564N = i;
    }
}
