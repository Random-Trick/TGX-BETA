package ud;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import ce.a0;
import ce.y;
import eb.f;
import eb.k;
import gd.w;
import hd.b;
import ib.d;
import je.a;
import je.g;
import je.t;
import kb.c;
import ld.h;
import ld.p;
import ne.a;
import ne.i;
import ne.i3;
import org.thunderdog.challegram.R;
import zd.o6;
import zd.s1;
import zd.t1;

public class o0 extends i implements k.b, a, c, t1.a {
    public int f24320k0;
    public int f24321l0;
    public Drawable f24322m0;
    public String f24323n0;
    public g f24324o0;
    public int f24325p0;
    public float f24326q0;
    public f f24327r0;
    public p f24328s0;
    public je.a f24329t0;
    public float f24330u0;
    public b f24331v0;
    public h f24332w0;
    public int f24333x0;
    public boolean f24334y0;

    public o0(Context context, o6 o6Var) {
        super(context, o6Var);
        t1.b().a(this);
    }

    public void Q0(je.a aVar, boolean z10) {
        if (z10) {
            p1(false);
        }
        invalidate();
    }

    public void V0(je.a aVar, boolean z10) {
        if (z10) {
            p1(false);
        }
        invalidate();
    }

    public void G0() {
        this.f24328s0 = new p(this, a0.i(40.0f) / 2);
        Y0();
        this.f24329t0 = new a.b().c(this).b();
    }

    public boolean L0() {
        return this.f24328s0 != null;
    }

    public final boolean P0() {
        f fVar = this.f24327r0;
        return fVar != null && fVar.h();
    }

    @Override
    public void Q2() {
        p pVar = this.f24328s0;
        if (pVar != null) {
            pVar.b0();
        }
        t1.b().d(this);
    }

    public final void Y0() {
        if (this.f24328s0 != null) {
            int i10 = a0.i(12.0f);
            int i11 = a0.i(6.0f);
            int i12 = a0.i(40.0f);
            if (w.G2()) {
                int measuredWidth = getMeasuredWidth() - i10;
                this.f24328s0.K0(measuredWidth - i12, i11, measuredWidth, i12 + i11);
                return;
            }
            this.f24328s0.K0(i10, i11, i10 + i12, i12 + i11);
        }
    }

    @Override
    public void b() {
        p pVar = this.f24328s0;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void b1(b.a aVar, h hVar) {
        if (aVar != null) {
            this.f24331v0 = new b(20.0f, aVar, null);
        } else {
            this.f24331v0 = null;
        }
        p pVar = this.f24328s0;
        this.f24332w0 = hVar;
        pVar.G(hVar);
        invalidate();
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    @Override
    public void e() {
        p pVar = this.f24328s0;
        if (pVar != null) {
            pVar.e();
        }
    }

    public void e1(boolean z10, boolean z11) {
        if (z10 != P0()) {
            if (this.f24327r0 == null) {
                this.f24327r0 = new f(0, this, db.b.f7287b, 180L);
            }
            this.f24327r0.p(z10, z11);
        }
    }

    @Override
    public void e2() {
        invalidate();
    }

    public void f1(boolean z10, int i10, boolean z11) {
        if (i10 != 0) {
            l1(i10, z11);
            return;
        }
        boolean z12 = false;
        if (z10) {
            int i11 = o6.B2;
            je.a aVar = this.f24329t0;
            if (aVar != null && aVar.p()) {
                z12 = true;
            }
            n1(i11, z12, z11);
        } else if (this.f24333x0 != 0) {
            l1(0, z11);
        } else {
            n1(0, false, z11);
        }
    }

    public void l1(int i10, boolean z10) {
        je.a aVar;
        if (this.f24333x0 != i10) {
            this.f24333x0 = i10;
            if (i10 != 0) {
                je.a b10 = new a.b().f(i10, 14.0f, 0.0f, w.G2() ? 3 : 5).d(new a.c() {
                    @Override
                    public boolean d(je.a aVar2) {
                        return je.b.a(this, aVar2);
                    }

                    @Override
                    public final void m(je.a aVar2, boolean z11) {
                        o0.this.Q0(aVar2, z11);
                    }
                }).b();
                this.f24329t0 = b10;
                b10.u(o6.B2, z10);
            } else if (!z10 || (aVar = this.f24329t0) == null) {
                this.f24329t0 = null;
            } else {
                aVar.n(true);
            }
        }
    }

    public void m1(int i10, int i11, int i12) {
        this.f24320k0 = i10;
        this.f24321l0 = i11;
        this.f24322m0 = i12 == 0 ? null : ce.c.g(getResources(), i12);
    }

    public void n1(int i10, boolean z10, boolean z11) {
        if (i10 != 0 || this.f24329t0 != null || this.f24333x0 != 0) {
            if (this.f24329t0 == null || this.f24333x0 != 0) {
                this.f24329t0 = new a.b().d(new a.c() {
                    @Override
                    public boolean d(je.a aVar) {
                        return je.b.a(this, aVar);
                    }

                    @Override
                    public final void m(je.a aVar, boolean z12) {
                        o0.this.V0(aVar, z12);
                    }
                }).b();
            }
            this.f24329t0.v(i10, z10, z11);
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0 && this.f24326q0 != f10) {
            this.f24326q0 = f10;
            invalidate();
        }
    }

    public boolean o1(boolean z10) {
        boolean z11 = !P0();
        e1(z11, z10);
        return z11;
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean G2 = w.G2();
        int measuredWidth = getMeasuredWidth();
        Y0();
        if (this.f24334y0) {
            canvas.drawColor(d.a(0.85f, j.u()));
        }
        Drawable drawable = this.f24322m0;
        if (drawable != null) {
            int i10 = this.f24320k0;
            if (G2) {
                i10 = (measuredWidth - i10) - drawable.getMinimumWidth();
            }
            ce.c.b(canvas, drawable, i10, this.f24321l0, y.J());
        }
        g gVar = this.f24324o0;
        if (gVar != null) {
            int i11 = this.f24325p0;
            gVar.u(canvas, i11, i11 + gVar.getWidth(), 0, a0.i(17.0f));
        }
        if (this.f24328s0 != null) {
            int i12 = a0.i(40.0f) / 2;
            if (this.f24332w0 != null) {
                if (this.f24328s0.e0()) {
                    this.f24328s0.u0(canvas, i12);
                }
                this.f24328s0.draw(canvas);
            } else {
                b bVar = this.f24331v0;
                if (bVar != null) {
                    bVar.a(canvas, this.f24328s0.J0(), this.f24328s0.x0());
                }
            }
            if (this.f24326q0 > 0.0f) {
                double radians = Math.toRadians(G2 ? 315.0d : 45.0d);
                int J0 = this.f24328s0.J0() + ((int) ((this.f24328s0.getWidth() / 2.0f) * Math.sin(radians)));
                int x02 = this.f24328s0.x0() + ((int) ((this.f24328s0.getHeight() / 2.0f) * Math.cos(radians)));
                i3.b(canvas, J0, x02, this.f24326q0, null);
                RectF a02 = y.a0();
                int i13 = a0.i(11.0f);
                a02.set(J0 - i13, x02 - i13, J0 + i13, x02 + i13);
                canvas.drawArc(a02, G2 ? ((1.0f - this.f24326q0) * 170.0f) + 225.0f : 135.0f, this.f24326q0 * 170.0f, false, y.R(j.u()));
            }
        }
        je.a aVar = this.f24329t0;
        if (aVar != null) {
            int i14 = a0.i(24.0f);
            aVar.f(canvas, G2 ? i14 : measuredWidth - i14, getMeasuredHeight() / 2.0f, w.G2() ? 3 : 5, 1.0f, this, R.id.theme_color_badgeFailedText);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        p1(false);
        Y0();
    }

    public final void p1(boolean z10) {
        String str = this.f24323n0;
        if (str == null || ib.i.i(str)) {
            this.f24324o0 = null;
            return;
        }
        int measuredWidth = getMeasuredWidth() - this.f24325p0;
        je.a aVar = this.f24329t0;
        if (aVar != null) {
            measuredWidth = (int) (measuredWidth - aVar.j(a0.i(24.0f) + a0.i(8.0f)));
        }
        if (measuredWidth <= 0) {
            this.f24324o0 = null;
        } else if (z10 || this.f24330u0 != measuredWidth) {
            this.f24330u0 = measuredWidth;
            this.f24324o0 = new g.b(this.f24323n0, measuredWidth, y.A0(15.0f), t.d.C).v().b().f();
        }
    }

    public void setIsDragging(boolean z10) {
        if (this.f24334y0 != z10) {
            this.f24334y0 = z10;
            invalidate();
        }
    }

    public void setItemHeight(int i10) {
        setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    public void setText(String str) {
        String str2 = this.f24323n0;
        if (str2 == null || !ib.i.c(str2, str)) {
            this.f24325p0 = a0.i(72.0f);
            this.f24323n0 = str;
            p1(true);
            invalidate();
        }
    }
}
