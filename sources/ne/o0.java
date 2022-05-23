package ne;

import android.content.Context;
import android.widget.FrameLayout;
import ce.a0;
import db.b;
import eb.k;
import gd.w;
import ib.h;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;

public class o0 extends c0 {
    public final k.b f18294q0;
    public float f18295r0 = 1.0f;
    public boolean f18296s0;
    public float f18297t0;
    public k f18298u0;

    public class a implements k.b {
        public a() {
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            if (i10 == 0) {
                o0.this.setVisibilityFactor(f10);
            }
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
        }
    }

    public o0(Context context) {
        super(context);
        d(R.drawable.baseline_check_24, 56.0f, 4.0f, R.id.theme_color_circleButtonRegular, R.id.theme_color_circleButtonRegularIcon);
        int i10 = a0.i(4.0f);
        int i11 = i10 * 2;
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(a0.i(56.0f) + i11, a0.i(56.0f) + i11, (w.G2() ? 3 : 5) | 80);
        int i12 = a0.i(16.0f) - i10;
        r12.bottomMargin = i12;
        r12.rightMargin = i12;
        setLayoutParams(r12);
        setAlpha(0.0f);
        setScaleX(0.6f);
        setScaleY(0.6f);
        this.f18294q0 = new a();
    }

    public boolean getIsVisible() {
        return this.f18296s0;
    }

    public void p(boolean z10, boolean z11) {
        if (this.f18296s0 != z10) {
            this.f18296s0 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (!z11 || this.f18295r0 <= 0.0f) {
                k kVar = this.f18298u0;
                if (kVar != null) {
                    kVar.l(f10);
                }
                setVisibilityFactor(f10);
                return;
            }
            if (this.f18298u0 == null) {
                this.f18298u0 = new k(0, this.f18294q0, b.f7291f, 210L, this.f18297t0);
            }
            if (f10 == 1.0f && this.f18297t0 == 0.0f) {
                this.f18298u0.B(b.f7291f);
                this.f18298u0.y(210L);
            } else {
                this.f18298u0.B(b.f7287b);
                this.f18298u0.y(100L);
            }
            this.f18298u0.i(f10);
        }
    }

    public final void q() {
        setAlpha(h.d(this.f18297t0) * h.d(this.f18295r0));
    }

    public void setMaximumAlpha(float f10) {
        if (this.f18295r0 != f10) {
            this.f18295r0 = f10;
            q();
        }
    }

    public void setVisibilityFactor(float f10) {
        if (this.f18297t0 != f10) {
            this.f18297t0 = f10;
            float f11 = (f10 * 0.4f) + 0.6f;
            setScaleX(f11);
            setScaleY(f11);
            q();
        }
    }
}
