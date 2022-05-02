package p194nd;

import android.content.Context;
import be.C1389o;
import be.C1399s0;
import me.C6847b2;
import p037cb.C2057b;
import p051db.C3950k;
import p181mb.C6812c;

public class C7396a extends C6847b2 implements C3950k.AbstractC3952b {
    public static final C6812c f23353M = new C6812c(2013265919, -1);
    public boolean f23354a;
    public float f23355b;
    public C3950k f23356c;

    public C7396a(Context context) {
        super(context);
        C1399s0.m37196a0(this);
        setGravity(17);
        setSingleLine(true);
        setTypeface(C1389o.m37263i());
        setTextSize(1, 14.0f);
        setTextColor(f23353M.m18910a(0.0f));
    }

    private void setFactor(float f) {
        if (this.f23355b != f) {
            this.f23355b = f;
            setTextColor(f23353M.m18910a(f));
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        setFactor(f);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final void m16552a(float f) {
        if (this.f23356c == null) {
            float f2 = this.f23355b;
            if (f2 != f) {
                this.f23356c = new C3950k(0, this, C2057b.f7280b, 180L, f2);
            } else {
                return;
            }
        }
        this.f23356c.m29546i(f);
    }

    public final void m16551b(float f) {
        C3950k kVar = this.f23356c;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        setFactor(f);
    }

    public void m16550c(boolean z, boolean z2) {
        if (this.f23354a != z) {
            this.f23354a = z;
            float f = 1.0f;
            if (z2) {
                if (!z) {
                    f = 0.0f;
                }
                m16552a(f);
                return;
            }
            if (!z) {
                f = 0.0f;
            }
            m16551b(f);
        }
    }
}
