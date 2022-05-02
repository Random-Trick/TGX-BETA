package p110hd;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import be.C1357a0;

public class C5087h extends Drawable {
    public final C5088i f17119a;

    public C5087h(C5088i iVar) {
        this.f17119a = iVar;
    }

    @Override
    public void draw(Canvas canvas) {
        C5078d.m23987z().m24002k(canvas, this.f17119a, getBounds());
    }

    @Override
    public int getIntrinsicHeight() {
        return C1357a0.m37544i(24.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return C1357a0.m37544i(24.0f);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
