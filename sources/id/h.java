package id;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import ce.a0;

public class h extends Drawable {
    public final i f14211a;

    public h(i iVar) {
        this.f14211a = iVar;
    }

    @Override
    public void draw(Canvas canvas) {
        d.z().k(canvas, this.f14211a, getBounds());
    }

    @Override
    public int getIntrinsicHeight() {
        return a0.i(24.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return a0.i(24.0f);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i10) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
