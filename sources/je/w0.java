package je;

import android.text.TextPaint;
import ce.a0;
import ce.o;
import he.i;

public class w0 implements i.g {
    public final TextPaint f15513a = null;
    public float f15514b;
    public boolean f15515c;
    public o.a f15516d;
    public float f15517e;

    public w0(o.a aVar) {
        this.f15516d = aVar;
    }

    public static void b(int i10, int i11, TextPaint... textPaintArr) {
        for (TextPaint textPaint : textPaintArr) {
            if (!(textPaint == null || textPaint.getTextSize() == i10)) {
                textPaint.setTextSize(i11);
            }
        }
    }

    @Override
    public void a(float f10) {
        n(f10, true);
    }

    public int c(float f10) {
        if (!this.f15515c || !i.c2().A2()) {
            return a0.i(f10);
        }
        return a0.C(f10);
    }

    public TextPaint d() {
        o.a aVar = this.f15516d;
        return k(aVar != null ? aVar.b() : this.f15513a);
    }

    public TextPaint e() {
        o.a aVar = this.f15516d;
        return k(aVar != null ? aVar.c() : this.f15513a);
    }

    public TextPaint f() {
        o.a aVar = this.f15516d;
        return k(aVar != null ? aVar.f() : this.f15513a);
    }

    public o.a g() {
        return this.f15516d;
    }

    public float h() {
        return this.f15514b;
    }

    public float i() {
        if (!this.f15515c || !i.c2().A2()) {
            return this.f15514b;
        }
        return (int) ((a0.C(this.f15514b) / a0.h()) - 0.5f);
    }

    public int j() {
        return c(this.f15514b);
    }

    public final TextPaint k(TextPaint textPaint) {
        float f10 = this.f15514b;
        if (f10 != 0.0f) {
            textPaint.setTextSize(c(f10));
        }
        return textPaint;
    }

    public w0 l(boolean z10) {
        this.f15515c = z10;
        return this;
    }

    public w0 m(float f10) {
        return n(f10, false);
    }

    public final w0 n(float f10, boolean z10) {
        float f11 = f10 + this.f15517e;
        if (z10 || this.f15514b != f11) {
            float f12 = this.f15514b;
            this.f15514b = f11;
            if (f12 != 0.0f) {
                b(c(f12), c(f11), this.f15513a);
            }
        }
        return this;
    }

    public w0 o(float f10) {
        this.f15517e = f10;
        return this;
    }
}
