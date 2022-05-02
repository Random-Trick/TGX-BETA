package me;

import android.content.Context;
import be.C1399s0;
import p037cb.C2057b;
import p051db.C3950k;

public class C7065x2 extends C6847b2 implements C3950k.AbstractC3952b {
    public C3950k f22408a;
    public CharSequence f22409b;
    public float f22410c;

    public C7065x2(Context context) {
        super(context);
    }

    private void setFactor(float f) {
        CharSequence charSequence;
        if (this.f22410c != f) {
            this.f22410c = f;
            if (f >= 0.5f && (charSequence = this.f22409b) != null) {
                C1399s0.m37175j0(this, charSequence);
                this.f22409b = null;
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
        C3950k kVar = this.f22408a;
        if (kVar == null) {
            this.f22408a = new C3950k(0, this, C2057b.f7280b, 180L);
        } else {
            float f = this.f22410c;
            if (f <= 0.5f || f == 1.0f) {
                kVar.m29541l(0.0f);
            } else {
                CharSequence charSequence2 = this.f22409b;
                if (charSequence2 == null || !charSequence2.equals(charSequence)) {
                    float f2 = 1.0f - this.f22410c;
                    this.f22410c = f2;
                    this.f22408a.m29541l(f2);
                } else {
                    return;
                }
            }
        }
        this.f22409b = charSequence;
        this.f22408a.m29544i(1.0f);
    }
}
