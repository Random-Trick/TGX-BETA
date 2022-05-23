package od;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import ce.a0;
import db.b;
import eb.f;
import eb.k;

public class m1 extends View implements k.b {
    public final Path f19742a = new Path();
    public float f19743b = -1.0f;
    public final f f19744c = new f(0, this, b.f7287b, 160);

    public m1(Context context) {
        super(context);
    }

    public void a(boolean z10, boolean z11) {
        this.f19744c.p(z10, z11);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        invalidate();
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int i10 = a0.i(12.0f);
        Path path = this.f19742a;
        float f10 = this.f19743b;
        float g10 = this.f19744c.g();
        this.f19743b = g10;
        ce.b.t(canvas, measuredWidth, measuredHeight, i10, path, f10, g10, 1.0f, -1);
    }
}
