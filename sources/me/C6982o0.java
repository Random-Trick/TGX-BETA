package me;

import android.content.Context;
import android.widget.FrameLayout;
import be.C1357a0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5069h;

public class C6982o0 extends C6851c0 {
    public final C3950k.AbstractC3952b f22131q0;
    public float f22132r0 = 1.0f;
    public boolean f22133s0;
    public float f22134t0;
    public C3950k f22135u0;

    public class C6983a implements C3950k.AbstractC3952b {
        public C6983a() {
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            if (i == 0) {
                C6982o0.this.setVisibilityFactor(f);
            }
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }
    }

    public C6982o0(Context context) {
        super(context);
        m18789d(R.drawable.baseline_check_24, 56.0f, 4.0f, R.id.theme_color_circleButtonRegular, R.id.theme_color_circleButtonRegularIcon);
        int i = C1357a0.m37541i(4.0f);
        int i2 = i * 2;
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37541i(56.0f) + i2, C1357a0.m37541i(56.0f) + i2, (C4403w.m27984G2() ? 3 : 5) | 80);
        int i3 = C1357a0.m37541i(16.0f) - i;
        t1.bottomMargin = i3;
        t1.rightMargin = i3;
        setLayoutParams(t1);
        setAlpha(0.0f);
        setScaleX(0.6f);
        setScaleY(0.6f);
        this.f22131q0 = new C6983a();
    }

    public boolean getIsVisible() {
        return this.f22133s0;
    }

    public void m18184p(boolean z, boolean z2) {
        if (this.f22133s0 != z) {
            this.f22133s0 = z;
            float f = z ? 1.0f : 0.0f;
            if (!z2 || this.f22132r0 <= 0.0f) {
                C3950k kVar = this.f22135u0;
                if (kVar != null) {
                    kVar.m29541l(f);
                }
                setVisibilityFactor(f);
                return;
            }
            if (this.f22135u0 == null) {
                this.f22135u0 = new C3950k(0, this.f22131q0, C2057b.f7284f, 210L, this.f22134t0);
            }
            if (f == 1.0f && this.f22134t0 == 0.0f) {
                this.f22135u0.m29557B(C2057b.f7284f);
                this.f22135u0.m29528y(210L);
            } else {
                this.f22135u0.m29557B(C2057b.f7280b);
                this.f22135u0.m29528y(100L);
            }
            this.f22135u0.m29544i(f);
        }
    }

    public final void m18183q() {
        setAlpha(C5069h.m24089d(this.f22134t0) * C5069h.m24089d(this.f22132r0));
    }

    public void setMaximumAlpha(float f) {
        if (this.f22132r0 != f) {
            this.f22132r0 = f;
            m18183q();
        }
    }

    public void setVisibilityFactor(float f) {
        if (this.f22134t0 != f) {
            this.f22134t0 = f;
            float f2 = (f * 0.4f) + 0.6f;
            setScaleX(f2);
            setScaleY(f2);
            m18183q();
        }
    }
}
