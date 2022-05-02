package de;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import me.vkryl.android.widget.FrameLayoutFix;
import p037cb.C2057b;
import p051db.C3950k;
import p108hb.C5064d;

public class C4025b extends View implements C3950k.AbstractC3952b {
    public float f13504a;
    public C3950k f13505b;

    public C4025b(Context context) {
        super(context);
        setLayoutParams(FrameLayoutFix.m18008s1(C1357a0.m37544i(100.0f), C1357a0.m37544i(100.0f)));
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            invalidate();
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0) {
            this.f13505b.m29543l(0.0f);
        }
    }

    public void m29277a() {
        C3950k kVar = this.f13505b;
        if (kVar == null) {
            this.f13505b = new C3950k(0, this, C2057b.f7280b, 400L);
        } else {
            kVar.m29543l(0.0f);
        }
        this.f13505b.m29546i(1.0f);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2;
        float measuredHeight = getMeasuredHeight() / 2;
        float i = C1357a0.m37544i((this.f13504a * 10.0f) + 40.0f);
        canvas.drawCircle(measuredWidth, measuredHeight, i, C1410y.m37042g(1894443754));
        C3950k kVar = this.f13505b;
        if (kVar != null) {
            float o = kVar.m29540o();
            if (o != 0.0f) {
                float f = 1.0f;
                if (o != 1.0f) {
                    float f2 = o < 0.5f ? o / 0.5f : 1.0f;
                    if (o >= 0.4f) {
                        f = 1.0f - ((o - 0.4f) / 0.6f);
                    }
                    if (f != 0.0f) {
                        canvas.drawCircle(measuredWidth, measuredHeight, i * f2, C1410y.m37042g(C5064d.m24132a(f, 1894443754)));
                    }
                }
            }
        }
    }

    public void setExpandFactor(float f) {
        if (this.f13504a != f) {
            this.f13504a = f;
            invalidate();
        }
    }
}
