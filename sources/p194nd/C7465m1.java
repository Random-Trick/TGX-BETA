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
    public final Path f23801a = new Path();
    public float f23802b = -1.0f;
    public final C3940f f23803c = new C3940f(0, this, C2057b.f7280b, 160);

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
        this.f23803c.m29577p(z, z2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int i = C1357a0.m37544i(12.0f);
        Path path = this.f23801a;
        float f = this.f23802b;
        float g = this.f23803c.m29586g();
        this.f23802b = g;
        C1359b.m37502t(canvas, measuredWidth, measuredHeight, i, path, f, g, 1.0f, -1);
    }
}
