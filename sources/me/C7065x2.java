package me;

import android.content.Context;
import be.C1399s0;
import p037cb.C2057b;
import p051db.C3950k;

public class C7065x2 extends C6847b2 implements C3950k.AbstractC3952b {
    public C3950k f22411a;
    public CharSequence f22412b;
    public float f22413c;

    public C7065x2(Context context) {
        super(context);
    }

    private void setFactor(float f) {
        CharSequence charSequence;
        if (this.f22413c != f) {
            this.f22413c = f;
            if (f >= 0.5f && (charSequence = this.f22412b) != null) {
                C1399s0.m37178j0(this, charSequence);
                this.f22412b = null;
            }
            float f2 = f <= 0.5f ? 1.0f - (f / 0.5f) : (f - 0.5f) / 0.5f;
            float f3 = (0.4f * f2) + 0.6f;
            setScaleX(f3);
            setScaleY(f3);
            setAlpha(f2);
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        setFactor(f);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public void m17929a(CharSequence charSequence) {
        C3950k kVar = this.f22411a;
        if (kVar == null) {
            this.f22411a = new C3950k(0, this, C2057b.f7280b, 180L);
        } else {
            float f = this.f22413c;
            if (f <= 0.5f || f == 1.0f) {
                kVar.m29543l(0.0f);
            } else {
                CharSequence charSequence2 = this.f22412b;
                if (charSequence2 == null || !charSequence2.equals(charSequence)) {
                    float f2 = 1.0f - this.f22413c;
                    this.f22413c = f2;
                    this.f22411a.m29543l(f2);
                } else {
                    return;
                }
            }
        }
        this.f22412b = charSequence;
        this.f22411a.m29546i(1.0f);
    }
}
