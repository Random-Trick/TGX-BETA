package p194nd;

import android.content.Context;
import be.C1389o;
import be.C1399s0;
import me.C6847b2;
import p037cb.C2057b;
import p051db.C3950k;
import p181mb.C6812c;

public class C7396a extends C6847b2 implements C3950k.AbstractC3952b {
    public static final C6812c f23350M = new C6812c(2013265919, -1);
    public boolean f23351a;
    public float f23352b;
    public C3950k f23353c;

    public C7396a(Context context) {
        super(context);
        C1399s0.m37193a0(this);
        setGravity(17);
        setSingleLine(true);
        setTypeface(C1389o.m37260i());
        setTextSize(1, 14.0f);
        setTextColor(f23350M.m18909a(0.0f));
    }

    private void setFactor(float f) {
        if (this.f23352b != f) {
            this.f23352b = f;
            setTextColor(f23350M.m18909a(f));
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
        if (this.f23353c == null) {
            float f2 = this.f23352b;
            if (f2 != f) {
                this.f23353c = new C3950k(0, this, C2057b.f7280b, 180L, f2);
            } else {
                return;
            }
        }
        this.f23353c.m29544i(f);
    }

    public final void m16551b(float f) {
        C3950k kVar = this.f23353c;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        setFactor(f);
    }

    public void m16550c(boolean z, boolean z2) {
        if (this.f23351a != z) {
            this.f23351a = z;
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
