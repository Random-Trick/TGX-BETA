package uc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import ce.a0;
import ce.j0;
import ce.p0;
import ce.y;
import db.b;
import eb.f;
import eb.k;
import eb.l;
import ed.j;
import gb.h;
import gd.w;
import ib.d;
import ie.r;
import java.util.ArrayList;
import java.util.List;
import je.a;
import je.x0;
import ld.p;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.m2;
import ne.o2;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import ud.x2;
import zd.o6;
import zd.s1;
import zd.t1;

public class c extends FrameLayoutFix implements k.b, t1.a, ne.a, kb.c, j.d, je.k, x2.f {
    public List<r> A0;
    public j B0;
    public m2 C0;
    public f D0;
    public int M;
    public int N;
    public Drawable O;
    public CharSequence P;
    public CharSequence Q;
    public Layout R;
    public CharSequence S;
    public CharSequence T;
    public Layout U;
    public d V;
    public float W;
    public float f24005a0;
    public float f24006b0;
    public float f24007c0;
    public float f24008d0;
    public float f24009e0;
    public int f24010f0;
    public int f24011g0;
    public int f24013i0;
    public final o6 f24014j0;
    public x0 f24015k0;
    public a f24016l0;
    public p f24017m0;
    public int f24018n0;
    public int f24019o0;
    public int f24020p0;
    public boolean f24022r0;
    public int f24023s0;
    public int f24024t0;
    public int f24025u0;
    public boolean f24026v0;
    public boolean f24028x0;
    public int f24029y0;
    public je.a f24030z0;
    public int f24012h0 = R.id.theme_color_text;
    public int f24021q0 = 0;
    public final f f24027w0 = new f((View) this, (Interpolator) b.f7287b, 168L, true);

    public interface a {
        void a(Canvas canvas, Drawable drawable, int i10, int i11);
    }

    public c(Context context, o6 o6Var) {
        super(context);
        this.f24014j0 = o6Var;
        setWillNotDraw(false);
    }

    public static void I1(Canvas canvas, CharSequence charSequence, Layout layout, float f10, float f11, Paint paint, boolean z10, int i10, float f12) {
        if (layout != null) {
            canvas.save();
            if (z10) {
                f10 = (i10 - v0.P1(layout)) - f10;
            }
            canvas.translate(f10, (f11 - paint.getTextSize()) + a0.i(0.8f));
            layout.draw(canvas);
            canvas.restore();
            return;
        }
        String str = (String) charSequence;
        if (z10) {
            f10 = (i10 - f12) - f10;
        }
        canvas.drawText(str, f10, f11, paint);
    }

    public void P1(je.a aVar, boolean z10) {
        if (z10) {
            C1();
        }
        invalidate();
    }

    private int getCurrentHeight() {
        x0 x0Var = this.f24015k0;
        if (x0Var != null) {
            return Math.max(((x0Var.getHeight() + ((int) this.f24007c0)) - a0.i(13.0f)) + a0.i(12.0f) + a0.i(25.0f), a0.i(76.0f));
        }
        return a0.i(76.0f);
    }

    private void setIconInternal(Drawable drawable) {
        this.O = drawable;
        if (drawable != null && (this.N & 8) != 0 && getMeasuredHeight() != 0) {
            this.f24009e0 = (getMeasuredHeight() / 2) - (drawable.getMinimumHeight() / 2);
        }
    }

    public void A1(v4<?> v4Var) {
        if (v4Var != null) {
            d dVar = this.V;
            if (dVar != null) {
                v4Var.t8(dVar);
            }
            v4Var.t8(this);
        }
    }

    public void B1() {
        if (this.V == null) {
            d dVar = new d(getContext());
            this.V = dVar;
            dVar.n(isEnabled());
            FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(a0.i(66.0f), a0.i(48.0f), (w.G2() ? 3 : 5) | 16);
            r12.leftMargin = a0.i(4.0f);
            r12.bottomMargin = a0.i(3.0f);
            this.V.setLayoutParams(r12);
            addView(this.V);
        }
    }

    public final void C1() {
        D1(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void D1(int i10, int i11) {
        float f10;
        Drawable drawable;
        if (i10 != 0 && i11 != 0) {
            this.f24023s0 = i10;
            this.f24024t0 = i11;
            int S1 = S1();
            int i12 = a0.i(17.0f) + this.f24019o0;
            this.W = S1;
            float i13 = this.M == 3 ? (((i10 - S1) - i12) - i12) - a0.i(38.0f) : (i10 - S1) - i12;
            je.a aVar = this.f24030z0;
            if (aVar != null) {
                i13 -= aVar.j(a0.i(24.0f) + a0.i(8.0f));
            }
            if (this.M == 7) {
                this.f24005a0 = a0.i(28.0f);
            } else {
                this.f24005a0 = a0.i(34.0f);
            }
            if (this.f24022r0) {
                this.T = this.P;
                this.Q = this.S;
            } else {
                this.T = this.S;
                this.Q = this.P;
            }
            int i14 = this.M;
            float f11 = 20.0f;
            if (i14 == 1 || i14 == 7 || i14 == 5) {
                this.f24006b0 = this.W;
                float f12 = this.f24005a0;
                this.f24007c0 = f12;
                this.f24005a0 = f12 + a0.i(20.0f);
                CharSequence charSequence = this.T;
                if (charSequence != null) {
                    V1(charSequence, i13, y.j0());
                }
                x0 x0Var = this.f24015k0;
                if (x0Var != null) {
                    int i15 = (int) i13;
                    this.f24025u0 = i15;
                    x0Var.k(i15);
                } else {
                    this.f24025u0 = 0;
                }
                CharSequence charSequence2 = this.Q;
                if (charSequence2 != null) {
                    W1(charSequence2, i13, y.b0(13.0f));
                }
            } else {
                CharSequence charSequence3 = this.T;
                if (charSequence3 != null) {
                    V1(charSequence3, i13, y.j0());
                    this.f24006b0 = (i10 - i12) - this.f24011g0;
                    this.f24007c0 = this.f24005a0;
                }
                CharSequence charSequence4 = this.Q;
                if (charSequence4 != null) {
                    W1(charSequence4, i13, y.j0());
                }
            }
            if ((this.N & 8) == 0 || (drawable = this.O) == null) {
                int i16 = this.M;
                if (!(i16 == 1 || i16 == 7 || i16 == 5)) {
                    f11 = 16.0f;
                }
                f10 = a0.i(f11);
            } else {
                f10 = (i11 / 2.0f) - (drawable.getMinimumHeight() / 2.0f);
            }
            this.f24009e0 = f10;
            this.f24008d0 = a0.i(18.0f);
        }
    }

    public final void E1() {
        boolean z10 = (this.R == null && this.U == null) ? false : true;
        if (this.f24026v0 != z10) {
            this.f24026v0 = z10;
            if (z10) {
                t1.b().a(this);
            } else {
                t1.b().d(this);
            }
        }
    }

    public void G1(boolean z10) {
        d dVar = this.V;
        if (dVar != null) {
            dVar.m(z10);
        }
    }

    public void H1() {
        List<r> list = this.A0;
        if (list != null && !list.isEmpty()) {
            this.A0.clear();
        }
    }

    public ne.w K1() {
        return (ne.w) getChildAt(0);
    }

    public o2 L1() {
        return (o2) getChildAt(0);
    }

    public void O1(int i10, int i11) {
        if (this.f24018n0 != i10 || this.f24019o0 != i11) {
            this.f24018n0 = i10;
            this.f24019o0 = i11;
            C1();
        }
    }

    @Override
    public void Q2() {
        p0.m(this);
        p pVar = this.f24017m0;
        if (pVar != null) {
            pVar.b0();
        }
        if (this.f24026v0) {
            t1.b().d(this);
            this.f24026v0 = false;
        }
    }

    @Override
    public int R() {
        return je.j.d(this);
    }

    public final void R1() {
        if (this.C0 != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (w.G2()) {
                    this.C0.p(0, 0, measuredHeight, measuredHeight);
                } else {
                    this.C0.p(measuredWidth - measuredHeight, 0, measuredWidth, measuredHeight);
                }
            }
        }
    }

    public final int S1() {
        int i10 = this.f24018n0;
        if (i10 != 0) {
            return i10;
        }
        return a0.i(this.O == null ? 16.0f : 73.0f);
    }

    public void T1(int i10, boolean z10) {
        if (this.f24013i0 != i10 || z10 != ib.c.b(this.N, 32)) {
            this.f24013i0 = i10;
            this.N = ib.c.h(this.N, 32, z10);
            invalidate();
        }
    }

    @Override
    public void U0() {
        if (this.B0 == null) {
            this.B0 = new j(this, R.drawable.baseline_delete_24);
        }
        this.B0.c();
    }

    public final void V1(CharSequence charSequence, float f10, TextPaint textPaint) {
        CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f10, TextUtils.TruncateAt.END);
        this.T = ellipsize;
        if (ellipsize instanceof String) {
            this.f24011g0 = (int) v0.T1(ellipsize, textPaint);
            this.U = null;
        } else {
            Layout Q = v0.Q(ellipsize, (int) f10, textPaint);
            this.U = Q;
            this.f24011g0 = Q.getWidth();
        }
        E1();
    }

    @Override
    public long W0(boolean z10) {
        return z10 ? 2131166799L : 0L;
    }

    public final void W1(CharSequence charSequence, float f10, TextPaint textPaint) {
        CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f10, TextUtils.TruncateAt.END);
        this.Q = ellipsize;
        if (ellipsize instanceof String) {
            this.f24010f0 = (int) v0.T1(ellipsize, textPaint);
            this.R = null;
        } else {
            Layout Q = v0.Q(ellipsize, (int) f10, textPaint);
            this.R = Q;
            this.f24010f0 = Q.getWidth();
        }
        E1();
    }

    public void X1(boolean z10, boolean z11) {
        if (z11) {
            setEnabledAnimated(z10);
        } else {
            setEnabled(z10);
        }
    }

    public void Y1(boolean z10, boolean z11, boolean z12) {
        if (isEnabled() != z10) {
            super.setEnabled(z10);
            if (this.M == 3 && !z11) {
                this.V.q(!z10, z12);
            }
        }
        this.f24027w0.p(z10, z12);
    }

    public void Z1(boolean z10, boolean z11) {
        if (z10 || this.D0 != null) {
            if (this.C0 == null) {
                m2 m2Var = new m2(j0.r(getContext()), a0.i(4.5f));
                this.C0 = m2Var;
                m2Var.C(a0.i(1.5f));
                this.C0.E(new h(this));
                this.C0.o(0.0f);
                R1();
            }
            if (this.D0 == null) {
                this.D0 = new f(1, this, b.f7287b, 180L);
            }
            this.D0.p(z10, z11);
        }
    }

    @Override
    public int a1() {
        return je.j.f(this);
    }

    public void a2() {
        this.f24022r0 = true;
    }

    @Override
    public void b() {
        p0.j(this, false);
        this.N &= -65;
        p pVar = this.f24017m0;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    @Override
    public int c() {
        return d.d(ae.j.R0(), ae.j.L(this.f24012h0), this.f24027w0.g());
    }

    public void c2(int i10, boolean z10, boolean z11) {
        je.a aVar = this.f24030z0;
        if (aVar != null || i10 != 0) {
            if (aVar == null) {
                this.f24030z0 = new a.b().d(new a.c() {
                    @Override
                    public boolean d(a aVar2) {
                        return je.b.a(this, aVar2);
                    }

                    @Override
                    public final void m(a aVar2, boolean z12) {
                        c.this.P1(aVar2, z12);
                    }
                }).b();
            }
            this.f24030z0.v(i10, z10, z11);
        }
    }

    @Override
    public int d(boolean z10) {
        return je.j.b(this, z10);
    }

    @Override
    public void d1(View view, Rect rect) {
        int i10 = this.M;
        if ((i10 == 1 || i10 == 7 || (i10 == 5 && this.f24015k0 == null)) && this.S != null) {
            int i11 = (int) (this.f24007c0 - a0.i(13.0f));
            float f10 = this.f24006b0;
            rect.set((int) f10, i11, (int) (f10 + this.f24011g0), v0.E0(y.j0().getFontMetricsInt()) + i11);
        }
    }

    public void d2(boolean z10, boolean z11) {
        if (this.f24028x0) {
            this.f24027w0.p(z10, z11);
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public void draw(Canvas canvas) {
        j jVar = this.B0;
        if (jVar != null) {
            jVar.e(canvas);
        }
        super.draw(canvas);
        j jVar2 = this.B0;
        if (jVar2 != null) {
            jVar2.d(canvas);
            this.B0.b(canvas);
        }
    }

    @Override
    public void e() {
        p0.j(this, true);
        this.N |= 64;
        p pVar = this.f24017m0;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override
    public void e2() {
        invalidate();
    }

    public boolean f2() {
        return this.V.t(true);
    }

    @Override
    public int g(boolean z10) {
        return je.j.h(this, z10);
    }

    public List<r> getDrawModifiers() {
        return this.A0;
    }

    public int getForcedPaddingLeft() {
        return this.f24018n0;
    }

    public int getForcedPaddingRight() {
        return this.f24019o0;
    }

    public CharSequence getName() {
        return this.P;
    }

    public p getReceiver() {
        if (this.f24017m0 == null) {
            p pVar = new p(this, 0);
            this.f24017m0 = pVar;
            if ((this.N & 64) == 0) {
                pVar.b();
            }
        }
        return this.f24017m0;
    }

    public d getToggler() {
        return this.V;
    }

    public int getType() {
        return this.M;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 1) {
            this.C0.o(f10);
            invalidate();
        }
    }

    @Override
    public int o0(boolean z10) {
        return ae.j.S0();
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        l.a(this, i10, f10, kVar);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        int i10;
        int i11;
        Canvas canvas2;
        int i12;
        float f10;
        Canvas canvas3;
        float f11;
        float f12;
        Paint paint;
        List<r> list = this.A0;
        if (list != null) {
            for (r rVar : list) {
                rVar.a(this, canvas);
            }
        }
        boolean G2 = w.G2();
        int measuredWidth = getMeasuredWidth();
        if (this.O != null) {
            if (G2) {
                f12 = (measuredWidth - this.f24008d0) - drawable.getMinimumWidth();
            } else {
                f12 = this.f24008d0;
            }
            int i13 = (((int) f12) + (a0.i(24.0f) / 2)) - (this.O.getMinimumWidth() / 2);
            Drawable drawable2 = this.O;
            float f13 = i13;
            float f14 = this.f24009e0;
            if (this.f24020p0 == 0) {
                paint = y.j();
            } else {
                int i14 = this.f24029y0;
                paint = i14 != 0 ? y.W(ae.j.L(i14)) : y.J();
            }
            ce.c.b(canvas, drawable2, f13, f14, paint);
            if (this.f24016l0 != null) {
                canvas.save();
                canvas.translate(f13, this.f24009e0);
                a aVar = this.f24016l0;
                Drawable drawable3 = this.O;
                aVar.a(canvas, drawable3, drawable3.getMinimumWidth(), this.O.getMinimumHeight());
                canvas.restore();
            }
        }
        float f15 = this.W;
        if (this.f24021q0 != 0) {
            int i15 = a0.i(4.0f);
            f15 += a0.i(8.0f) + i15;
            if (G2) {
                f11 = (measuredWidth - this.f24006b0) - i15;
            } else {
                f11 = this.f24006b0 + i15;
            }
            float f16 = i15;
            canvas.drawCircle(f11, this.f24007c0 + a0.i(11.0f) + f16, f16, y.g(ae.j.L(this.f24021q0)));
        }
        int c10 = c();
        int i16 = this.M;
        int i17 = R.id.theme_color_textLight;
        if (i16 == 1 || i16 == 7 || (i16 == 5 && this.f24015k0 == null)) {
            i10 = measuredWidth;
            canvas2 = canvas;
            i11 = 5;
            if (this.Q != null) {
                int i18 = this.f24013i0;
                if (i18 != 0) {
                    i17 = i18;
                }
                int L = ae.j.L(i17);
                if ((this.N & 32) != 0) {
                    L = d.a(ae.j.f0(), L);
                }
                I1(canvas, this.Q, this.R, f15, this.f24005a0, y.c0(13.0f, L), G2, i10, this.f24010f0);
            }
            CharSequence charSequence = this.T;
            if (charSequence != null) {
                I1(canvas, charSequence, this.U, this.f24006b0, this.f24007c0, y.k0(c10), G2, i10, this.f24011g0);
            }
        } else if (i16 == 5) {
            if (this.Q != null) {
                int i19 = this.f24013i0;
                if (i19 != 0) {
                    i17 = i19;
                }
                int L2 = ae.j.L(i17);
                if ((this.N & 32) != 0) {
                    L2 = d.a(ae.j.f0(), L2);
                }
                f10 = 13.0f;
                I1(canvas, this.Q, this.R, f15, (((int) this.f24007c0) - a0.i(13.0f)) + this.f24015k0.getHeight() + a0.i(17.0f), y.c0(13.0f, L2), G2, measuredWidth, this.f24010f0);
            } else {
                f10 = 13.0f;
            }
            x0 x0Var = this.f24015k0;
            if (x0Var != null) {
                if (G2) {
                    float f17 = measuredWidth - f15;
                    i11 = 5;
                    i10 = measuredWidth;
                    canvas3 = canvas;
                    x0Var.h(canvas, (int) (f17 - x0Var.getWidth()), (int) f17, 0, ((int) this.f24007c0) - a0.i(f10), this, 1.0f);
                } else {
                    i10 = measuredWidth;
                    canvas3 = canvas;
                    i11 = 5;
                    x0Var.h(canvas, (int) f15, (int) (f15 + x0Var.getWidth()), 0, ((int) this.f24007c0) - a0.i(f10), this, 1.0f);
                }
                canvas2 = canvas3;
            } else {
                i10 = measuredWidth;
                i11 = 5;
                canvas2 = canvas;
            }
        } else {
            i10 = measuredWidth;
            i11 = 5;
            CharSequence charSequence2 = this.T;
            if (charSequence2 != null) {
                canvas2 = canvas;
                I1(canvas, charSequence2, this.U, this.f24006b0, this.f24007c0, y.k0(c10), G2, i10, this.f24011g0);
            } else {
                canvas2 = canvas;
            }
            CharSequence charSequence3 = this.Q;
            if (charSequence3 != null) {
                I1(canvas, charSequence3, this.R, f15, this.f24005a0, y.k0(c10), G2, i10, this.f24010f0);
            }
        }
        m2 m2Var = this.C0;
        if (m2Var != null) {
            m2Var.c(canvas2);
        }
        List<r> list2 = this.A0;
        if (list2 != null) {
            for (int size = list2.size() - 1; size >= 0; size--) {
                this.A0.get(size).b(this, canvas2);
            }
        }
        je.a aVar2 = this.f24030z0;
        if (aVar2 != null) {
            float i20 = G2 ? a0.i(24.0f) : i10 - i12;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (w.G2()) {
                i11 = 3;
            }
            aVar2.e(canvas, i20, measuredHeight, i11, 1.0f);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            C1();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.M == 5) {
            if (this.f24015k0 != null) {
                int S1 = S1();
                this.f24015k0.k((View.MeasureSpec.getSize(i10) - S1) - a0.i(17.0f));
            }
            if (!(this.f24023s0 == View.MeasureSpec.getSize(i10) && this.f24024t0 == getCurrentHeight())) {
                D1(View.MeasureSpec.getSize(i10), getCurrentHeight());
            }
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getCurrentHeight(), Log.TAG_TDLIB_OPTIONS));
        } else {
            super.onMeasure(i10, i11);
        }
        R1();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        x0 x0Var = this.f24015k0;
        return (x0Var != null && x0Var.x(this, motionEvent)) || super.onTouchEvent(motionEvent);
    }

    @Override
    public int r0(boolean z10) {
        if (z10) {
            return ae.j.T0();
        }
        return 0;
    }

    public void setColorDataId(int i10) {
        if (this.f24021q0 != i10) {
            this.f24021q0 = i10;
            invalidate();
        }
    }

    public void setData(float f10) {
        if (f10 == 1.0f) {
            setData("1.0");
        } else if (f10 == 0.0f) {
            setData("0.0");
        } else if (f10 == 0.5f) {
            setData("0.50");
        } else {
            int i10 = (int) (f10 * 100.0f);
            StringBuilder sb2 = new StringBuilder(4);
            sb2.append('0');
            sb2.append('.');
            if (i10 < 10) {
                sb2.append('0');
            }
            sb2.append(i10);
            setData(sb2.toString());
        }
    }

    public void setDataColorId(int i10) {
        T1(i10, false);
    }

    public void setDrawModifier(r rVar) {
        if (rVar == null) {
            H1();
            return;
        }
        List<r> list = this.A0;
        if (list == null) {
            this.A0 = new ArrayList();
        } else if (list.size() != 1 || this.A0.get(0) != rVar) {
            this.A0.clear();
        } else {
            return;
        }
        this.A0.add(rVar);
        invalidate();
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.f24028x0) {
            this.f24027w0.p(z10, true);
            if (this.M == 3) {
                this.V.q(!z10, false);
            }
        }
    }

    public void setEnabledAnimated(boolean z10) {
        Y1(z10, false, true);
    }

    public void setIcon(int i10) {
        if (this.f24020p0 != i10) {
            this.f24020p0 = i10;
            setIconInternal(ce.c.g(getResources(), i10));
        }
    }

    public void setIconColorId(int i10) {
        if (this.f24029y0 != i10) {
            this.f24029y0 = i10;
            if (this.O != null) {
                invalidate();
            }
        }
    }

    public void setIconOverlay(a aVar) {
        this.f24016l0 = aVar;
    }

    public void setIgnoreEnabled(boolean z10) {
        if (this.f24028x0 != z10) {
            this.f24028x0 = z10;
            if (!isEnabled()) {
                this.f24027w0.p(z10, false);
            }
        }
    }

    public void setName(CharSequence charSequence) {
        CharSequence charSequence2 = this.P;
        if (charSequence2 == null || !charSequence2.equals(charSequence)) {
            boolean z10 = this.P != null;
            if (charSequence == null || charSequence.length() == 0) {
                charSequence = null;
            }
            this.P = charSequence;
            if (z10) {
                C1();
                invalidate();
            }
        }
    }

    @Override
    public void setRemoveDx(float f10) {
        if (this.B0 == null) {
            this.B0 = new j(this, R.drawable.baseline_delete_24);
        }
        this.B0.f(f10);
    }

    public void setText(x0 x0Var) {
        x0 x0Var2 = this.f24015k0;
        if (x0Var2 != null) {
            x0Var2.c(this);
        }
        this.f24015k0 = x0Var;
        if (x0Var != null) {
            x0Var.b(this);
            int i10 = this.f24025u0;
            if (i10 != 0) {
                x0Var.k(i10);
            }
        }
        if (!(getMeasuredHeight() == getCurrentHeight() || getMeasuredHeight() == 0)) {
            requestLayout();
        }
        invalidate();
    }

    public void setTextColorId(int i10) {
        if (i10 == 0) {
            i10 = R.id.theme_color_text;
        }
        if (this.f24012h0 != i10) {
            this.f24012h0 = i10;
            invalidate();
        }
    }

    public void setType(int i10) {
        this.M = i10;
        if (i10 != 4) {
            p0.T(this);
            yd.d.g(this);
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    B1();
                    setLayoutParams(new ViewGroup.LayoutParams(-1, a0.i(55.0f)));
                    return;
                } else if (i10 != 4) {
                    if (i10 == 5) {
                        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        return;
                    } else if (i10 == 7) {
                        setLayoutParams(new ViewGroup.LayoutParams(-1, a0.i(64.0f)));
                        return;
                    } else {
                        throw new RuntimeException("Invalid SettingView type " + i10);
                    }
                }
            }
            setLayoutParams(new ViewGroup.LayoutParams(-1, a0.i(55.0f)));
            return;
        }
        setLayoutParams(new ViewGroup.LayoutParams(-1, a0.i(76.0f)));
    }

    @Override
    public int t0(boolean z10) {
        return je.j.g(this, z10);
    }

    public void setIcon(Bitmap bitmap) {
        this.f24020p0 = 0;
        setIconInternal(ce.c.a(getContext(), bitmap));
    }

    public void setName(int i10) {
        setName(w.i1(i10));
    }

    public void setData(CharSequence charSequence) {
        CharSequence charSequence2 = this.S;
        if (charSequence2 == null || charSequence == null || !charSequence2.equals(charSequence)) {
            boolean z10 = this.S != null;
            if (charSequence == null || charSequence.length() == 0) {
                charSequence = null;
            }
            this.S = charSequence;
            if (z10) {
                C1();
                invalidate();
            }
        }
    }

    public void setData(int i10) {
        setData(w.i1(i10));
    }
}
