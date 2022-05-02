package ie;

import android.text.TextPaint;
import be.C1357a0;
import be.C1389o;
import ge.C4868i;

public class C5457w0 implements C4868i.AbstractC4875g {
    public final TextPaint f17904a = null;
    public float f17905b;
    public boolean f17906c;
    public C1389o.C1390a f17907d;
    public float f17908e;

    public C5457w0(C1389o.C1390a aVar) {
        this.f17907d = aVar;
    }

    public static void m22667b(int i, int i2, TextPaint... textPaintArr) {
        for (TextPaint textPaint : textPaintArr) {
            if (!(textPaint == null || textPaint.getTextSize() == i)) {
                textPaint.setTextSize(i2);
            }
        }
    }

    @Override
    public void mo22668a(float f) {
        m22655n(f, true);
    }

    public int m22666c(float f) {
        if (!this.f17906c || !C4868i.m24727c2().m24925A2()) {
            return C1357a0.m37544i(f);
        }
        return C1357a0.m37555C(f);
    }

    public TextPaint m22665d() {
        C1389o.C1390a aVar = this.f17907d;
        return m22658k(aVar != null ? aVar.m37246b() : this.f17904a);
    }

    public TextPaint m22664e() {
        C1389o.C1390a aVar = this.f17907d;
        return m22658k(aVar != null ? aVar.m37245c() : this.f17904a);
    }

    public TextPaint m22663f() {
        C1389o.C1390a aVar = this.f17907d;
        return m22658k(aVar != null ? aVar.m37242f() : this.f17904a);
    }

    public C1389o.C1390a m22662g() {
        return this.f17907d;
    }

    public float m22661h() {
        return this.f17905b;
    }

    public float m22660i() {
        if (!this.f17906c || !C4868i.m24727c2().m24925A2()) {
            return this.f17905b;
        }
        return (int) ((C1357a0.m37555C(this.f17905b) / C1357a0.m37545h()) - 0.5f);
    }

    public int m22659j() {
        return m22666c(this.f17905b);
    }

    public final TextPaint m22658k(TextPaint textPaint) {
        float f = this.f17905b;
        if (f != 0.0f) {
            textPaint.setTextSize(m22666c(f));
        }
        return textPaint;
    }

    public C5457w0 m22657l(boolean z) {
        this.f17906c = z;
        return this;
    }

    public C5457w0 m22656m(float f) {
        return m22655n(f, false);
    }

    public final C5457w0 m22655n(float f, boolean z) {
        float f2 = f + this.f17908e;
        if (z || this.f17905b != f2) {
            float f3 = this.f17905b;
            this.f17905b = f2;
            if (f3 != 0.0f) {
                m22667b(m22666c(f3), m22666c(f2), this.f17904a);
            }
        }
        return this;
    }

    public C5457w0 m22654o(float f) {
        this.f17908e = f;
        return this;
    }
}
