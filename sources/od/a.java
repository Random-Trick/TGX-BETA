package od;

import android.content.Context;
import ce.o;
import ce.p0;
import db.b;
import eb.k;
import nb.c;
import ne.b2;

public class a extends b2 implements k.b {
    public static final c M = new c(2013265919, -1);
    public boolean f19461a;
    public float f19462b;
    public k f19463c;

    public a(Context context) {
        super(context);
        p0.T(this);
        setGravity(17);
        setSingleLine(true);
        setTypeface(o.i());
        setTextSize(1, 14.0f);
        setTextColor(M.a(0.0f));
    }

    private void setFactor(float f10) {
        if (this.f19462b != f10) {
            this.f19462b = f10;
            setTextColor(M.a(f10));
        }
    }

    public final void a(float f10) {
        if (this.f19463c == null) {
            float f11 = this.f19462b;
            if (f11 != f10) {
                this.f19463c = new k(0, this, b.f7287b, 180L, f11);
            } else {
                return;
            }
        }
        this.f19463c.i(f10);
    }

    public final void b(float f10) {
        k kVar = this.f19463c;
        if (kVar != null) {
            kVar.l(f10);
        }
        setFactor(f10);
    }

    public void c(boolean z10, boolean z11) {
        if (this.f19461a != z10) {
            this.f19461a = z10;
            float f10 = 1.0f;
            if (z11) {
                if (!z10) {
                    f10 = 0.0f;
                }
                a(f10);
                return;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            b(f10);
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        setFactor(f10);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }
}
