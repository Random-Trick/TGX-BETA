package vc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import kb.c;
import md.m;
import ne.a;

public class g3 extends View implements a, c {
    public final m f24960a = new m(this);

    public g3(Context context) {
        super(context);
    }

    @Override
    public void Q2() {
        this.f24960a.b0();
    }

    public m a() {
        return this.f24960a;
    }

    @Override
    public void b() {
        this.f24960a.b();
    }

    @Override
    public void e() {
        this.f24960a.e();
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.f24960a.draw(canvas);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f24960a.K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
