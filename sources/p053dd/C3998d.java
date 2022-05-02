package p053dd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import gd.C4587b;
import gd.C4618d7;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p082fd.C4403w;
import p108hb.C5064d;
import p156kd.C6246h;
import p156kd.C6257p;
import p364zd.C11524j;

public class C3998d {
    public int f13391a;
    public C4004i f13392b;
    public C4618d7 f13393c;
    public int f13394d;
    public int f13396f;
    public int f13397g;
    public String f13401k;
    public int f13402l;
    public C4587b f13403m;
    public C6246h f13404n;
    public C6257p f13405o;
    public boolean f13406p;
    public int f13407q;
    public int f13408r;
    public int f13409s;
    public int f13410t;
    public float f13411u;
    public float f13412v;
    public int f13398h = C1357a0.m37541i(7.0f);
    public int f13399i = C1357a0.m37541i(16.0f);
    public int f13400j = C1357a0.m37541i(21.0f);
    public int f13395e = this.f13399i * 2;

    public class C3999a extends AnimatorListenerAdapter {
        public C3999a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C3998d.this.f13391a &= -9;
        }
    }

    public C3998d(C4004i iVar, C4618d7 d7Var, int i) {
        this.f13392b = iVar;
        this.f13393c = d7Var;
        int i2 = C1357a0.m37541i(11.0f);
        C6246h f = d7Var.m26882f();
        this.f13404n = f;
        if (f == null) {
            this.f13403m = new C4587b(16.0f, d7Var.m26881g(), null);
        }
        this.f13401k = d7Var.m26877k();
        m29386e(i);
        this.f13394d = this.f13402l + this.f13398h + i2 + this.f13395e;
        if (this.f13404n != null) {
            this.f13405o = new C6257p(iVar, this.f13399i);
        }
    }

    public void m29373r(float f, ValueAnimator valueAnimator) {
        m29394A(f - (C2057b.m35735a(valueAnimator) * f));
    }

    public void m29372s(float f, float f2, ValueAnimator valueAnimator) {
        m29394A(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    public void m29394A(float f) {
        if (this.f13412v != f) {
            this.f13412v = f;
            C4004i iVar = this.f13392b;
            int i = this.f13396f;
            int i2 = this.f13397g;
            iVar.invalidate(i, i2, this.f13394d + i, this.f13395e + i2);
        }
    }

    public void m29393B(float f) {
        this.f13411u = f;
        if (this.f13405o != null && (this.f13391a & 4) != 0) {
            m29371t();
        }
    }

    public void m29392C(int i, int i2) {
        if ((this.f13391a & 4) != 0) {
            this.f13407q = i;
            this.f13408r = i - this.f13396f;
            this.f13409s = i2;
            this.f13410t = i2 - this.f13397g;
            return;
        }
        this.f13396f = i;
        this.f13397g = i2;
        m29371t();
    }

    public void m29391D() {
        this.f13391a |= 8;
        final float l = m29379l();
        final float f = 1.0f - l;
        ValueAnimator b = C2057b.m35734b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3998d.this.m29372s(l, f, valueAnimator);
            }
        });
        b.setInterpolator(C2057b.f7280b);
        b.setDuration(120L);
        b.start();
    }

    public final void m29386e(int i) {
        int T1 = (int) C7389v0.m16680T1(this.f13401k, this.f13392b.f13431a);
        this.f13402l = T1;
        if (T1 > i) {
            if (!this.f13406p) {
                String i2 = this.f13393c.m26879i();
                String j = this.f13393c.m26878j();
                if (i2.length() > 0 && j.length() > 0) {
                    this.f13406p = true;
                    this.f13401k = i2.charAt(0) + ". " + j;
                    m29386e(i);
                }
            }
            String str = (String) TextUtils.ellipsize(this.f13401k, this.f13392b.f13431a, i, TextUtils.TruncateAt.END);
            this.f13401k = str;
            this.f13402l = (int) C7389v0.m16680T1(str, this.f13392b.f13431a);
        }
    }

    public void m29385f() {
        final float l = m29379l();
        ValueAnimator b = C2057b.m35734b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3998d.this.m29373r(l, valueAnimator);
            }
        });
        b.setInterpolator(C2057b.f7280b);
        b.setDuration(120L);
        b.addListener(new C3999a());
        b.start();
    }

    public void m29384g() {
        this.f13391a &= -5;
        this.f13396f = this.f13407q;
        this.f13397g = this.f13409s;
        this.f13408r = 0;
        this.f13410t = 0;
        this.f13411u = 0.0f;
        m29371t();
    }

    public void m29383h() {
        this.f13391a &= -3;
    }

    public void m29382i() {
        C6257p pVar = this.f13405o;
        if (pVar != null) {
            pVar.m20819G(null);
        }
    }

    public void m29381j(Canvas canvas, View view) {
        int i;
        float f;
        int i2;
        int i3;
        float f2;
        int i4 = this.f13391a;
        boolean z = true;
        float f3 = 1.0f;
        if ((i4 & 4) != 0) {
            int i5 = this.f13396f;
            float f4 = this.f13411u;
            i2 = i5 + ((int) (this.f13408r * f4));
            i = this.f13397g + ((int) (this.f13410t * f4));
            f = 1.0f;
        } else {
            if ((i4 & 2) != 0) {
                f2 = this.f13411u;
            } else {
                f2 = (i4 & 1) != 0 ? 1.0f - this.f13411u : 1.0f;
            }
            int i6 = this.f13396f;
            i = this.f13397g;
            f = f2;
            i2 = i6;
        }
        if (C4403w.m27984G2()) {
            i2 = (view.getMeasuredWidth() - i2) - this.f13394d;
        }
        boolean z2 = f != 1.0f;
        if (z2) {
            canvas.save();
            float f5 = 1.0f - ((1.0f - f) * 0.65f);
            canvas.scale(f5, f5, i2 + (this.f13394d * 0.5f), this.f13399i + i);
        }
        float f6 = 0.0f;
        if (this.f13412v == 0.0f || (this.f13391a & 8) == 0) {
            z = false;
        }
        this.f13392b.f13431a.setColor(C5064d.m24131a(f, C5064d.m24128d(C5064d.m24129c(C11524j.m167m0(), C11524j.m163o0()), C11524j.m228N(R.id.theme_color_headerRemoveBackground), z ? this.f13412v : 0.0f)));
        RectF a0 = C1410y.m37050a0();
        a0.set(i2, i, this.f13394d + i2, this.f13395e + i);
        int i7 = this.f13399i;
        canvas.drawRoundRect(a0, i7, i7, this.f13392b.f13431a);
        float f7 = 255.0f * f;
        this.f13392b.f13431a.setColor(C5064d.m24130b((int) f7, -1));
        String str = this.f13401k;
        if (str != null) {
            canvas.drawText(str, C4403w.m27984G2() ? (((this.f13394d + i2) - this.f13395e) - this.f13398h) - this.f13402l : this.f13395e + i2 + this.f13398h, this.f13400j + i, this.f13392b.f13431a);
        }
        int i8 = C4403w.m27984G2() ? (i2 + this.f13394d) - this.f13399i : i2 + this.f13399i;
        if (this.f13405o != null) {
            m29371t();
            if (this.f13405o.mo20246c0()) {
                TextPaint textPaint = this.f13392b.f13431a;
                int c = C5064d.m24129c(C11524j.m167m0(), C11524j.m163o0());
                int N = C11524j.m228N(R.id.theme_color_headerRemoveBackgroundHighlight);
                if (z) {
                    f6 = this.f13412v;
                }
                textPaint.setColor(C5064d.m24131a(f, C5064d.m24128d(c, N, f6)));
                canvas.drawCircle(this.f13405o.mo20257I0(), this.f13405o.mo20227y0(), this.f13399i, this.f13392b.f13431a);
            } else if (z) {
                this.f13392b.f13431a.setColor(C5064d.m24131a(f, C11524j.m228N(R.id.theme_color_headerRemoveBackgroundHighlight)));
                canvas.drawCircle(this.f13405o.mo20257I0(), this.f13405o.mo20227y0(), this.f13399i, this.f13392b.f13431a);
            }
            C6257p pVar = this.f13405o;
            if (z) {
                f *= 1.0f - this.f13412v;
            }
            pVar.mo20250U(f);
            if (z) {
                canvas.save();
                canvas.rotate((C4403w.m27984G2() ? 1.0f : -1.0f) * 45.0f * this.f13412v, this.f13405o.mo20257I0(), this.f13405o.mo20227y0());
            }
            this.f13405o.draw(canvas);
            if (z) {
                canvas.restore();
            }
            this.f13405o.mo20253P();
        } else if (this.f13403m != null) {
            if (z) {
                canvas.save();
                float f8 = i8;
                canvas.rotate((C4403w.m27984G2() ? 1.0f : -1.0f) * 45.0f * this.f13412v, f8, this.f13399i + i);
                this.f13392b.f13431a.setColor(C5064d.m24131a(f, C11524j.m228N(R.id.theme_color_headerRemoveBackgroundHighlight)));
                canvas.drawCircle(f8, i + i3, this.f13399i, this.f13392b.f13431a);
            }
            this.f13403m.m27214b(canvas, i8, this.f13399i + i, f * (1.0f - this.f13412v));
            if (z) {
                canvas.restore();
            }
        }
        if (z) {
            canvas.save();
            if (!C4403w.m27984G2()) {
                f3 = -1.0f;
            }
            canvas.rotate((f3 * 45.0f * this.f13412v) + 90.0f, i8, this.f13399i + i);
            this.f13392b.f13431a.setColor(C5064d.m24130b((int) (f7 * this.f13412v), -1));
            C4004i iVar = this.f13392b;
            int i9 = iVar.f13430W;
            int i10 = this.f13399i;
            int i11 = iVar.f13429V;
            canvas.drawRect(i8 - i9, (i + i10) - i11, i9 + i8, i10 + i + i11, iVar.f13431a);
            C4004i iVar2 = this.f13392b;
            int i12 = iVar2.f13429V;
            int i13 = this.f13399i;
            int i14 = iVar2.f13430W;
            canvas.drawRect(i8 - i12, (i + i13) - i14, i8 + i12, i + i13 + i14, iVar2.f13431a);
            canvas.restore();
        }
        if (z2) {
            canvas.restore();
        }
    }

    public long m29380k() {
        return this.f13393c.m26880h();
    }

    public float m29379l() {
        return this.f13412v;
    }

    public int m29378m() {
        return this.f13395e;
    }

    public int m29377n() {
        return this.f13394d;
    }

    public int m29376o() {
        return (this.f13391a & 4) != 0 ? this.f13409s : this.f13396f;
    }

    public int m29375p() {
        return (this.f13391a & 4) != 0 ? this.f13409s : this.f13397g;
    }

    public boolean m29374q() {
        return (this.f13391a & 1) != 0;
    }

    public final void m29371t() {
        if (this.f13405o != null) {
            int i = this.f13396f;
            float f = this.f13411u;
            int i2 = i + ((int) (this.f13408r * f));
            int i3 = this.f13397g + ((int) (this.f13410t * f));
            if (C4403w.m27984G2()) {
                i2 = (this.f13392b.getMeasuredWidth() - i2) - this.f13395e;
            }
            C6257p pVar = this.f13405o;
            int i4 = this.f13395e;
            pVar.mo20256K0(i2, i3, i2 + i4, i4 + i3);
        }
    }

    public void m29370u() {
        C6257p pVar = this.f13405o;
        if (pVar != null) {
            pVar.mo20245f();
        }
    }

    public void m29369v() {
        C6257p pVar = this.f13405o;
        if (pVar != null) {
            pVar.mo20247b();
        }
    }

    public void m29368w() {
        this.f13391a |= 1;
        this.f13411u = 0.0f;
    }

    public void m29367x() {
        this.f13391a |= 4;
        this.f13411u = 0.0f;
    }

    public void m29366y() {
        this.f13391a |= 2;
    }

    public void m29365z() {
        C6257p pVar = this.f13405o;
        if (pVar != null) {
            pVar.m20819G(this.f13404n);
        }
    }
}
