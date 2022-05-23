package ee;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import ce.a0;
import ce.y;
import eb.k;
import ib.d;
import me.vkryl.android.widget.FrameLayoutFix;

public class b extends View implements k.b {
    public float f11608a;
    public k f11609b;

    public b(Context context) {
        super(context);
        setLayoutParams(FrameLayoutFix.q1(a0.i(100.0f), a0.i(100.0f)));
    }

    public void a() {
        k kVar = this.f11609b;
        if (kVar == null) {
            this.f11609b = new k(0, this, db.b.f7287b, 400L);
        } else {
            kVar.l(0.0f);
        }
        this.f11609b.i(1.0f);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            invalidate();
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0) {
            this.f11609b.l(0.0f);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2;
        float measuredHeight = getMeasuredHeight() / 2;
        float i10 = a0.i((this.f11608a * 10.0f) + 40.0f);
        canvas.drawCircle(measuredWidth, measuredHeight, i10, y.g(1894443754));
        k kVar = this.f11609b;
        if (kVar != null) {
            float o10 = kVar.o();
            if (o10 != 0.0f) {
                float f10 = 1.0f;
                if (o10 != 1.0f) {
                    float f11 = o10 < 0.5f ? o10 / 0.5f : 1.0f;
                    if (o10 >= 0.4f) {
                        f10 = 1.0f - ((o10 - 0.4f) / 0.6f);
                    }
                    if (f10 != 0.0f) {
                        canvas.drawCircle(measuredWidth, measuredHeight, i10 * f11, y.g(d.a(f10, 1894443754)));
                    }
                }
            }
        }
    }

    public void setExpandFactor(float f10) {
        if (this.f11608a != f10) {
            this.f11608a = f10;
            invalidate();
        }
    }
}
