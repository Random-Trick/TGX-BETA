package ed;

import ae.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import ce.a0;
import ce.y;
import gd.w;
import hd.b;
import hd.d7;
import ld.h;
import ld.p;
import oc.v0;
import org.thunderdog.challegram.R;

public class d {
    public int f11537a;
    public i f11538b;
    public d7 f11539c;
    public int f11540d;
    public int f11542f;
    public int f11543g;
    public String f11547k;
    public int f11548l;
    public b f11549m;
    public h f11550n;
    public p f11551o;
    public boolean f11552p;
    public int f11553q;
    public int f11554r;
    public int f11555s;
    public int f11556t;
    public float f11557u;
    public float f11558v;
    public int f11544h = a0.i(7.0f);
    public int f11545i = a0.i(16.0f);
    public int f11546j = a0.i(21.0f);
    public int f11541e = this.f11545i * 2;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            d.this.f11537a &= -9;
        }
    }

    public d(i iVar, d7 d7Var, int i10) {
        this.f11538b = iVar;
        this.f11539c = d7Var;
        int i11 = a0.i(11.0f);
        h f10 = d7Var.f();
        this.f11550n = f10;
        if (f10 == null) {
            this.f11549m = new b(16.0f, d7Var.g(), null);
        }
        this.f11547k = d7Var.k();
        e(i10);
        this.f11540d = this.f11548l + this.f11544h + i11 + this.f11541e;
        if (this.f11550n != null) {
            this.f11551o = new p(iVar, this.f11545i);
        }
    }

    public void r(float f10, ValueAnimator valueAnimator) {
        A(f10 - (db.b.a(valueAnimator) * f10));
    }

    public void s(float f10, float f11, ValueAnimator valueAnimator) {
        A(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public void A(float f10) {
        if (this.f11558v != f10) {
            this.f11558v = f10;
            i iVar = this.f11538b;
            int i10 = this.f11542f;
            int i11 = this.f11543g;
            iVar.invalidate(i10, i11, this.f11540d + i10, this.f11541e + i11);
        }
    }

    public void B(float f10) {
        this.f11557u = f10;
        if (this.f11551o != null && (this.f11537a & 4) != 0) {
            t();
        }
    }

    public void C(int i10, int i11) {
        if ((this.f11537a & 4) != 0) {
            this.f11553q = i10;
            this.f11554r = i10 - this.f11542f;
            this.f11555s = i11;
            this.f11556t = i11 - this.f11543g;
            return;
        }
        this.f11542f = i10;
        this.f11543g = i11;
        t();
    }

    public void D() {
        this.f11537a |= 8;
        final float l10 = l();
        final float f10 = 1.0f - l10;
        ValueAnimator b10 = db.b.b();
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                d.this.s(l10, f10, valueAnimator);
            }
        });
        b10.setInterpolator(db.b.f7287b);
        b10.setDuration(120L);
        b10.start();
    }

    public final void e(int i10) {
        int T1 = (int) v0.T1(this.f11547k, this.f11538b.f11566a);
        this.f11548l = T1;
        if (T1 > i10) {
            if (!this.f11552p) {
                String i11 = this.f11539c.i();
                String j10 = this.f11539c.j();
                if (i11.length() > 0 && j10.length() > 0) {
                    this.f11552p = true;
                    this.f11547k = i11.charAt(0) + ". " + j10;
                    e(i10);
                }
            }
            String str = (String) TextUtils.ellipsize(this.f11547k, this.f11538b.f11566a, i10, TextUtils.TruncateAt.END);
            this.f11547k = str;
            this.f11548l = (int) v0.T1(str, this.f11538b.f11566a);
        }
    }

    public void f() {
        final float l10 = l();
        ValueAnimator b10 = db.b.b();
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                d.this.r(l10, valueAnimator);
            }
        });
        b10.setInterpolator(db.b.f7287b);
        b10.setDuration(120L);
        b10.addListener(new a());
        b10.start();
    }

    public void g() {
        this.f11537a &= -5;
        this.f11542f = this.f11553q;
        this.f11543g = this.f11555s;
        this.f11554r = 0;
        this.f11556t = 0;
        this.f11557u = 0.0f;
        t();
    }

    public void h() {
        this.f11537a &= -3;
    }

    public void i() {
        p pVar = this.f11551o;
        if (pVar != null) {
            pVar.G(null);
        }
    }

    public void j(Canvas canvas, View view) {
        int i10;
        float f10;
        int i11;
        int i12;
        float f11;
        int i13 = this.f11537a;
        boolean z10 = true;
        float f12 = 1.0f;
        if ((i13 & 4) != 0) {
            int i14 = this.f11542f;
            float f13 = this.f11557u;
            i11 = i14 + ((int) (this.f11554r * f13));
            i10 = this.f11543g + ((int) (this.f11556t * f13));
            f10 = 1.0f;
        } else {
            if ((i13 & 2) != 0) {
                f11 = this.f11557u;
            } else {
                f11 = (i13 & 1) != 0 ? 1.0f - this.f11557u : 1.0f;
            }
            int i15 = this.f11542f;
            i10 = this.f11543g;
            f10 = f11;
            i11 = i15;
        }
        if (w.G2()) {
            i11 = (view.getMeasuredWidth() - i11) - this.f11540d;
        }
        boolean z11 = f10 != 1.0f;
        if (z11) {
            canvas.save();
            float f14 = 1.0f - ((1.0f - f10) * 0.65f);
            canvas.scale(f14, f14, i11 + (this.f11540d * 0.5f), this.f11545i + i10);
        }
        float f15 = 0.0f;
        if (this.f11558v == 0.0f || (this.f11537a & 8) == 0) {
            z10 = false;
        }
        this.f11538b.f11566a.setColor(ib.d.a(f10, ib.d.d(ib.d.c(j.k0(), j.m0()), j.L(R.id.theme_color_headerRemoveBackground), z10 ? this.f11558v : 0.0f)));
        RectF a02 = y.a0();
        a02.set(i11, i10, this.f11540d + i11, this.f11541e + i10);
        int i16 = this.f11545i;
        canvas.drawRoundRect(a02, i16, i16, this.f11538b.f11566a);
        float f16 = 255.0f * f10;
        this.f11538b.f11566a.setColor(ib.d.b((int) f16, -1));
        String str = this.f11547k;
        if (str != null) {
            canvas.drawText(str, w.G2() ? (((this.f11540d + i11) - this.f11541e) - this.f11544h) - this.f11548l : this.f11541e + i11 + this.f11544h, this.f11546j + i10, this.f11538b.f11566a);
        }
        int i17 = w.G2() ? (i11 + this.f11540d) - this.f11545i : i11 + this.f11545i;
        if (this.f11551o != null) {
            t();
            if (this.f11551o.e0()) {
                TextPaint textPaint = this.f11538b.f11566a;
                int c10 = ib.d.c(j.k0(), j.m0());
                int L = j.L(R.id.theme_color_headerRemoveBackgroundHighlight);
                if (z10) {
                    f15 = this.f11558v;
                }
                textPaint.setColor(ib.d.a(f10, ib.d.d(c10, L, f15)));
                canvas.drawCircle(this.f11551o.J0(), this.f11551o.x0(), this.f11545i, this.f11538b.f11566a);
            } else if (z10) {
                this.f11538b.f11566a.setColor(ib.d.a(f10, j.L(R.id.theme_color_headerRemoveBackgroundHighlight)));
                canvas.drawCircle(this.f11551o.J0(), this.f11551o.x0(), this.f11545i, this.f11538b.f11566a);
            }
            p pVar = this.f11551o;
            if (z10) {
                f10 *= 1.0f - this.f11558v;
            }
            pVar.V(f10);
            if (z10) {
                canvas.save();
                canvas.rotate((w.G2() ? 1.0f : -1.0f) * 45.0f * this.f11558v, this.f11551o.J0(), this.f11551o.x0());
            }
            this.f11551o.draw(canvas);
            if (z10) {
                canvas.restore();
            }
            this.f11551o.Q();
        } else if (this.f11549m != null) {
            if (z10) {
                canvas.save();
                float f17 = i17;
                canvas.rotate((w.G2() ? 1.0f : -1.0f) * 45.0f * this.f11558v, f17, this.f11545i + i10);
                this.f11538b.f11566a.setColor(ib.d.a(f10, j.L(R.id.theme_color_headerRemoveBackgroundHighlight)));
                canvas.drawCircle(f17, i10 + i12, this.f11545i, this.f11538b.f11566a);
            }
            this.f11549m.b(canvas, i17, this.f11545i + i10, f10 * (1.0f - this.f11558v));
            if (z10) {
                canvas.restore();
            }
        }
        if (z10) {
            canvas.save();
            if (!w.G2()) {
                f12 = -1.0f;
            }
            canvas.rotate((f12 * 45.0f * this.f11558v) + 90.0f, i17, this.f11545i + i10);
            this.f11538b.f11566a.setColor(ib.d.b((int) (f16 * this.f11558v), -1));
            i iVar = this.f11538b;
            int i18 = iVar.W;
            int i19 = this.f11545i;
            int i20 = iVar.V;
            canvas.drawRect(i17 - i18, (i10 + i19) - i20, i18 + i17, i19 + i10 + i20, iVar.f11566a);
            i iVar2 = this.f11538b;
            int i21 = iVar2.V;
            int i22 = this.f11545i;
            int i23 = iVar2.W;
            canvas.drawRect(i17 - i21, (i10 + i22) - i23, i17 + i21, i10 + i22 + i23, iVar2.f11566a);
            canvas.restore();
        }
        if (z11) {
            canvas.restore();
        }
    }

    public long k() {
        return this.f11539c.h();
    }

    public float l() {
        return this.f11558v;
    }

    public int m() {
        return this.f11541e;
    }

    public int n() {
        return this.f11540d;
    }

    public int o() {
        return (this.f11537a & 4) != 0 ? this.f11555s : this.f11542f;
    }

    public int p() {
        return (this.f11537a & 4) != 0 ? this.f11555s : this.f11543g;
    }

    public boolean q() {
        return (this.f11537a & 1) != 0;
    }

    public final void t() {
        if (this.f11551o != null) {
            int i10 = this.f11542f;
            float f10 = this.f11557u;
            int i11 = i10 + ((int) (this.f11554r * f10));
            int i12 = this.f11543g + ((int) (this.f11556t * f10));
            if (w.G2()) {
                i11 = (this.f11538b.getMeasuredWidth() - i11) - this.f11541e;
            }
            p pVar = this.f11551o;
            int i13 = this.f11541e;
            pVar.K0(i11, i12, i11 + i13, i13 + i12);
        }
    }

    public void u() {
        p pVar = this.f11551o;
        if (pVar != null) {
            pVar.e();
        }
    }

    public void v() {
        p pVar = this.f11551o;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void w() {
        this.f11537a |= 1;
        this.f11557u = 0.0f;
    }

    public void x() {
        this.f11537a |= 4;
        this.f11557u = 0.0f;
    }

    public void y() {
        this.f11537a |= 2;
    }

    public void z() {
        p pVar = this.f11551o;
        if (pVar != null) {
            pVar.G(this.f11550n);
        }
    }
}
