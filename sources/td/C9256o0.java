package td;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import gd.C4587b;
import ie.C5375a;
import ie.C5380b;
import ie.C5428t;
import ie.RunnableC5390g;
import me.AbstractC6828a;
import me.C6918i3;
import me.View$OnClickListenerC6902i;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p156kd.C6246h;
import p156kd.C6257p;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p364zd.C11524j;

public class C9256o0 extends View$OnClickListenerC6902i implements C3950k.AbstractC3952b, AbstractC6828a, AbstractC5911c, C11052v1.AbstractC11053a {
    public int f29889k0;
    public int f29890l0;
    public Drawable f29891m0;
    public String f29892n0;
    public RunnableC5390g f29893o0;
    public int f29894p0;
    public float f29895q0;
    public C3940f f29896r0;
    public C6257p f29897s0;
    public C5375a f29898t0;
    public float f29899u0;
    public C4587b f29900v0;
    public C6246h f29901w0;
    public int f29902x0;
    public boolean f29903y0;

    public C9256o0(Context context, C10930q6 q6Var) {
        super(context, q6Var);
        C11052v1.m1768b().m1769a(this);
    }

    public void m9791O0(C5375a aVar, boolean z) {
        if (z) {
            m9781o1(false);
        }
        invalidate();
    }

    public void m9790Q0(C5375a aVar, boolean z) {
        if (z) {
            m9781o1(false);
        }
        invalidate();
    }

    public void m9794F0() {
        this.f29897s0 = new C6257p(this, C1357a0.m37541i(40.0f) / 2);
        m9789U0();
        this.f29898t0 = new C5375a.C5377b().m23020c(this).m23021b();
    }

    public boolean m9793J0() {
        return this.f29897s0 != null;
    }

    public final boolean m9792M0() {
        C3940f fVar = this.f29896r0;
        return fVar != null && fVar.m29583h();
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0 && this.f29895q0 != f) {
            this.f29895q0 = f;
            invalidate();
        }
    }

    public final void m9789U0() {
        if (this.f29897s0 != null) {
            int i = C1357a0.m37541i(12.0f);
            int i2 = C1357a0.m37541i(6.0f);
            int i3 = C1357a0.m37541i(40.0f);
            if (C4403w.m27984G2()) {
                int measuredWidth = getMeasuredWidth() - i;
                this.f29897s0.mo20256K0(measuredWidth - i3, i2, measuredWidth, i3 + i2);
                return;
            }
            this.f29897s0.mo20256K0(i, i2, i + i3, i3 + i2);
        }
    }

    public void m9788W0(C4587b.C4588a aVar, C6246h hVar) {
        if (aVar != null) {
            this.f29900v0 = new C4587b(20.0f, aVar, null);
        } else {
            this.f29900v0 = null;
        }
        C6257p pVar = this.f29897s0;
        this.f29901w0 = hVar;
        pVar.m20819G(hVar);
        invalidate();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    @Override
    public void mo4501a3() {
        C6257p pVar = this.f29897s0;
        if (pVar != null) {
            pVar.mo20249Z();
        }
        C11052v1.m1768b().m1766d(this);
    }

    @Override
    public void mo8229b() {
        C6257p pVar = this.f29897s0;
        if (pVar != null) {
            pVar.mo20247b();
        }
    }

    public void m9787c1(boolean z, boolean z2) {
        if (z != m9792M0()) {
            if (this.f29896r0 == null) {
                this.f29896r0 = new C3940f(0, this, C2057b.f7280b, 180L);
            }
            this.f29896r0.m29575p(z, z2);
        }
    }

    public void m9786d1(boolean z, int i, boolean z2) {
        if (i != 0) {
            m9785e1(i, z2);
            return;
        }
        boolean z3 = false;
        if (z) {
            int i2 = C10930q6.f34957B2;
            C5375a aVar = this.f29898t0;
            if (aVar != null && aVar.m23030p()) {
                z3 = true;
            }
            m9783i1(i2, z3, z2);
        } else if (this.f29902x0 != 0) {
            m9785e1(0, z2);
        } else {
            m9783i1(0, false, z2);
        }
    }

    public void m9785e1(int i, boolean z) {
        C5375a aVar;
        if (this.f29902x0 != i) {
            this.f29902x0 = i;
            if (i != 0) {
                C5375a b = new C5375a.C5377b().m23017f(i, 14.0f, 0.0f, C4403w.m27984G2() ? 3 : 5).m23019d(new C5375a.AbstractC5378c() {
                    @Override
                    public boolean mo8363d(C5375a aVar2) {
                        return C5380b.m23012a(this, aVar2);
                    }

                    @Override
                    public final void mo8362j(C5375a aVar2, boolean z2) {
                        C9256o0.this.m9791O0(aVar2, z2);
                    }
                }).m23021b();
                this.f29898t0 = b;
                b.m23027t(C10930q6.f34957B2, z);
            } else if (!z || (aVar = this.f29898t0) == null) {
                this.f29898t0 = null;
            } else {
                aVar.m23032n(true);
            }
        }
    }

    @Override
    public void mo8225f() {
        C6257p pVar = this.f29897s0;
        if (pVar != null) {
            pVar.mo20245f();
        }
    }

    public void m9784g1(int i, int i2, int i3) {
        this.f29889k0 = i;
        this.f29890l0 = i2;
        this.f29891m0 = i3 == 0 ? null : C1362c.m37482g(getResources(), i3);
    }

    @Override
    public void mo452g2() {
        invalidate();
    }

    public void m9783i1(int i, boolean z, boolean z2) {
        if (i != 0 || this.f29898t0 != null || this.f29902x0 != 0) {
            if (this.f29898t0 == null || this.f29902x0 != 0) {
                this.f29898t0 = new C5375a.C5377b().m23019d(new C5375a.AbstractC5378c() {
                    @Override
                    public boolean mo8363d(C5375a aVar) {
                        return C5380b.m23012a(this, aVar);
                    }

                    @Override
                    public final void mo8362j(C5375a aVar, boolean z3) {
                        C9256o0.this.m9790Q0(aVar, z3);
                    }
                }).m23021b();
            }
            this.f29898t0.m23026u(i, z, z2);
        }
    }

    public boolean m9782n1(boolean z) {
        boolean z2 = !m9792M0();
        m9787c1(z2, z);
        return z2;
    }

    public final void m9781o1(boolean z) {
        String str = this.f29892n0;
        if (str == null || C5070i.m24061i(str)) {
            this.f29893o0 = null;
            return;
        }
        int measuredWidth = getMeasuredWidth() - this.f29894p0;
        C5375a aVar = this.f29898t0;
        if (aVar != null) {
            measuredWidth = (int) (measuredWidth - aVar.m23035j(C1357a0.m37541i(24.0f) + C1357a0.m37541i(8.0f)));
        }
        if (measuredWidth <= 0) {
            this.f29893o0 = null;
        } else if (z || this.f29899u0 != measuredWidth) {
            this.f29899u0 = measuredWidth;
            this.f29893o0 = new RunnableC5390g.C5392b(this.f29892n0, measuredWidth, C1410y.m37083A0(15.0f), C5428t.AbstractC5441d.f17872C).m22868v().m22888b().m22884f();
        }
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean G2 = C4403w.m27984G2();
        int measuredWidth = getMeasuredWidth();
        m9789U0();
        if (this.f29903y0) {
            canvas.drawColor(C5064d.m24131a(0.85f, C11524j.m148w()));
        }
        Drawable drawable = this.f29891m0;
        if (drawable != null) {
            int i = this.f29889k0;
            if (G2) {
                i = (measuredWidth - i) - drawable.getMinimumWidth();
            }
            C1362c.m37487b(canvas, drawable, i, this.f29890l0, C1410y.m37068J());
        }
        RunnableC5390g gVar = this.f29893o0;
        if (gVar != null) {
            int i2 = this.f29894p0;
            gVar.m22901u(canvas, i2, i2 + gVar.getWidth(), 0, C1357a0.m37541i(17.0f));
        }
        if (this.f29897s0 != null) {
            int i3 = C1357a0.m37541i(40.0f) / 2;
            if (this.f29901w0 != null) {
                if (this.f29897s0.mo20246c0()) {
                    this.f29897s0.mo20228u0(canvas, i3);
                }
                this.f29897s0.draw(canvas);
            } else {
                C4587b bVar = this.f29900v0;
                if (bVar != null) {
                    bVar.m27215a(canvas, this.f29897s0.mo20257I0(), this.f29897s0.mo20227y0());
                }
            }
            if (this.f29895q0 > 0.0f) {
                double radians = Math.toRadians(G2 ? 315.0d : 45.0d);
                int I0 = this.f29897s0.mo20257I0() + ((int) ((this.f29897s0.getWidth() / 2.0f) * Math.sin(radians)));
                int y0 = this.f29897s0.mo20227y0() + ((int) ((this.f29897s0.getHeight() / 2.0f) * Math.cos(radians)));
                C6918i3.m18466b(canvas, I0, y0, this.f29895q0, null);
                RectF a0 = C1410y.m37050a0();
                int i4 = C1357a0.m37541i(11.0f);
                a0.set(I0 - i4, y0 - i4, I0 + i4, y0 + i4);
                canvas.drawArc(a0, G2 ? ((1.0f - this.f29895q0) * 170.0f) + 225.0f : 135.0f, this.f29895q0 * 170.0f, false, C1410y.m37060R(C11524j.m148w()));
            }
        }
        C5375a aVar = this.f29898t0;
        if (aVar != null) {
            int i5 = C1357a0.m37541i(24.0f);
            aVar.m23038f(canvas, G2 ? i5 : measuredWidth - i5, getMeasuredHeight() / 2.0f, C4403w.m27984G2() ? 3 : 5, 1.0f, this, R.id.theme_color_badgeFailedText);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m9781o1(false);
        m9789U0();
    }

    public void setIsDragging(boolean z) {
        if (this.f29903y0 != z) {
            this.f29903y0 = z;
            invalidate();
        }
    }

    public void setItemHeight(int i) {
        setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    public void setText(String str) {
        String str2 = this.f29892n0;
        if (str2 == null || !C5070i.m24067c(str2, str)) {
            this.f29894p0 = C1357a0.m37541i(72.0f);
            this.f29892n0 = str;
            m9781o1(true);
            invalidate();
        }
    }
}
