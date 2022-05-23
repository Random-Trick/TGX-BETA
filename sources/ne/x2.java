package ne;

import android.content.Context;
import ce.p0;
import db.b;
import eb.k;

public class x2 extends b2 implements k.b {
    public k f18425a;
    public CharSequence f18426b;
    public float f18427c;

    public x2(Context context) {
        super(context);
    }

    private void setFactor(float f10) {
        CharSequence charSequence;
        if (this.f18427c != f10) {
            this.f18427c = f10;
            if (f10 >= 0.5f && (charSequence = this.f18426b) != null) {
                p0.c0(this, charSequence);
                this.f18426b = null;
            }
            float f11 = f10 <= 0.5f ? 1.0f - (f10 / 0.5f) : (f10 - 0.5f) / 0.5f;
            float f12 = (0.4f * f11) + 0.6f;
            setScaleX(f12);
            setScaleY(f12);
            setAlpha(f11);
        }
    }

    public void a(CharSequence charSequence) {
        k kVar = this.f18425a;
        if (kVar == null) {
            this.f18425a = new k(0, this, b.f7287b, 180L);
        } else {
            float f10 = this.f18427c;
            if (f10 <= 0.5f || f10 == 1.0f) {
                kVar.l(0.0f);
            } else {
                CharSequence charSequence2 = this.f18426b;
                if (charSequence2 == null || !charSequence2.equals(charSequence)) {
                    float f11 = 1.0f - this.f18427c;
                    this.f18427c = f11;
                    this.f18425a.l(f11);
                } else {
                    return;
                }
            }
        }
        this.f18426b = charSequence;
        this.f18425a.i(1.0f);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        setFactor(f10);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }
}
