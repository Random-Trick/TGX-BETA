package p194nd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import be.C1357a0;
import be.C1359b;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;

public class C7465m1 extends View implements C3950k.AbstractC3952b {
    public final Path f23798a = new Path();
    public float f23799b = -1.0f;
    public final C3940f f23800c = new C3940f(0, this, C2057b.f7280b, 160);

    public C7465m1(Context context) {
        super(context);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        invalidate();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public void m15979a(boolean z, boolean z2) {
        this.f23800c.m29575p(z, z2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int i = C1357a0.m37541i(12.0f);
        Path path = this.f23798a;
        float f = this.f23799b;
        float g = this.f23800c.m29584g();
        this.f23799b = g;
        C1359b.m37499t(canvas, measuredWidth, measuredHeight, i, path, f, g, 1.0f, -1);
    }
}