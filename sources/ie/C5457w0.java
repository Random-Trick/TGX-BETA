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

    public static void m22666b(int i, int i2, TextPaint... textPaintArr) {
        for (TextPaint textPaint : textPaintArr) {
            if (!(textPaint == null || textPaint.getTextSize() == i)) {
                textPaint.setTextSize(i2);
            }
        }
    }

    @Override
    public void mo22667a(float f) {
        m22654n(f, true);
    }

    public int m22665c(float f) {
        if (!this.f17906c || !C4868i.m24726c2().m24924A2()) {
            return C1357a0.m37541i(f);
        }
        return C1357a0.m37552C(f);
    }

    public TextPaint m22664d() {
        C1389o.C1390a aVar = this.f17907d;
        return m22657k(aVar != null ? aVar.m37243b() : this.f17904a);
    }

    public TextPaint m22663e() {
        C1389o.C1390a aVar = this.f17907d;
        return m22657k(aVar != null ? aVar.m37242c() : this.f17904a);
    }

    public TextPaint m22662f() {
        C1389o.C1390a aVar = this.f17907d;
        return m22657k(aVar != null ? aVar.m37239f() : this.f17904a);
    }

    public C1389o.C1390a m22661g() {
        return this.f17907d;
    }

    public float m22660h() {
        return this.f17905b;
    }

    public float m22659i() {
        if (!this.f17906c || !C4868i.m24726c2().m24924A2()) {
            return this.f17905b;
        }
        return (int) ((C1357a0.m37552C(this.f17905b) / C1357a0.m37542h()) - 0.5f);
    }

    public int m22658j() {
        return m22665c(this.f17905b);
    }

    public final TextPaint m22657k(TextPaint textPaint) {
        float f = this.f17905b;
        if (f != 0.0f) {
            textPaint.setTextSize(m22665c(f));
        }
        return textPaint;
    }

    public C5457w0 m22656l(boolean z) {
        this.f17906c = z;
        return this;
    }

    public C5457w0 m22655m(float f) {
        return m22654n(f, false);
    }

    public final C5457w0 m22654n(float f, boolean z) {
        float f2 = f + this.f17908e;
        if (z || this.f17905b != f2) {
            float f3 = this.f17905b;
            this.f17905b = f2;
            if (f3 != 0.0f) {
                m22666b(m22665c(f3), m22665c(f2), this.f17904a);
            }
        }
        return this;
    }

    public C5457w0 m22653o(float f) {
        this.f17908e = f;
        return this;
    }
}
