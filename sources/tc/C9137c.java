package tc;

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
import be.C1357a0;
import be.C1362c;
import be.C1379j0;
import be.C1399s0;
import be.C1410y;
import ie.AbstractC5408k;
import ie.C5375a;
import ie.C5380b;
import ie.C5406j;
import ie.C5459x0;
import java.util.ArrayList;
import java.util.List;
import me.AbstractC6828a;
import me.C6985o2;
import me.C7057w;
import me.RunnableC6969m2;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p053dd.C4007j;
import p080fb.C4343h;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5064d;
import p111he.AbstractC5139r;
import p139jb.AbstractC5911c;
import p156kd.C6257p;
import p335xd.C10189d;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p364zd.C11524j;
import td.AbstractC9323v4;
import td.C9357x2;

public class C9137c extends FrameLayoutFix implements C3950k.AbstractC3952b, C11052v1.AbstractC11053a, AbstractC6828a, AbstractC5911c, C4007j.AbstractC4011d, AbstractC5408k, C9357x2.AbstractC9363f {
    public List<AbstractC5139r> f29422A0;
    public C4007j f29423B0;
    public RunnableC6969m2 f29424C0;
    public C3940f f29425D0;
    public int f29426M;
    public int f29427N;
    public Drawable f29428O;
    public CharSequence f29429P;
    public CharSequence f29430Q;
    public Layout f29431R;
    public CharSequence f29432S;
    public CharSequence f29433T;
    public Layout f29434U;
    public C9139d f29435V;
    public float f29436W;
    public float f29437a0;
    public float f29438b0;
    public float f29439c0;
    public float f29440d0;
    public float f29441e0;
    public int f29442f0;
    public int f29443g0;
    public int f29445i0;
    public final C10930q6 f29446j0;
    public C5459x0 f29447k0;
    public AbstractC9138a f29448l0;
    public C6257p f29449m0;
    public int f29450n0;
    public int f29451o0;
    public int f29452p0;
    public boolean f29454r0;
    public int f29455s0;
    public int f29456t0;
    public int f29457u0;
    public boolean f29458v0;
    public boolean f29460x0;
    public int f29461y0;
    public C5375a f29462z0;
    public int f29444h0 = R.id.theme_color_text;
    public int f29453q0 = 0;
    public final C3940f f29459w0 = new C3940f((View) this, (Interpolator) C2057b.f7280b, 168L, true);

    public interface AbstractC9138a {
        void m10201a(Canvas canvas, Drawable drawable, int i, int i2);
    }

    public C9137c(Context context, C10930q6 q6Var) {
        super(context);
        this.f29446j0 = q6Var;
        setWillNotDraw(false);
    }

    public static void m10218M1(Canvas canvas, CharSequence charSequence, Layout layout, float f, float f2, Paint paint, boolean z, int i, float f3) {
        if (layout != null) {
            canvas.save();
            if (z) {
                f = (i - C7389v0.m16696P1(layout)) - f;
            }
            canvas.translate(f, (f2 - paint.getTextSize()) + C1357a0.m37541i(0.8f));
            layout.draw(canvas);
            canvas.restore();
            return;
        }
        String str = (String) charSequence;
        if (z) {
            f = (i - f3) - f;
        }
        canvas.drawText(str, f, f2, paint);
    }

    public void m10214S1(C5375a aVar, boolean z) {
        if (z) {
            m10223F1();
        }
        invalidate();
    }

    private int getCurrentHeight() {
        C5459x0 x0Var = this.f29447k0;
        if (x0Var != null) {
            return Math.max(((x0Var.getHeight() + ((int) this.f29439c0)) - C1357a0.m37541i(13.0f)) + C1357a0.m37541i(12.0f) + C1357a0.m37541i(25.0f), C1357a0.m37541i(76.0f));
        }
        return C1357a0.m37541i(76.0f);
    }

    private void setIconInternal(Drawable drawable) {
        this.f29428O = drawable;
        if (drawable != null && (this.f29427N & 8) != 0 && getMeasuredHeight() != 0) {
            this.f29441e0 = (getMeasuredHeight() / 2) - (drawable.getMinimumHeight() / 2);
        }
    }

    public void m10225D1(AbstractC9323v4<?> v4Var) {
        if (v4Var != null) {
            C9139d dVar = this.f29435V;
            if (dVar != null) {
                v4Var.m9163t8(dVar);
            }
            v4Var.m9163t8(this);
        }
    }

    public void m10224E1() {
        if (this.f29435V == null) {
            C9139d dVar = new C9139d(getContext());
            this.f29435V = dVar;
            dVar.m10190n(isEnabled());
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37541i(66.0f), C1357a0.m37541i(48.0f), (C4403w.m27984G2() ? 3 : 5) | 16);
            t1.leftMargin = C1357a0.m37541i(4.0f);
            t1.bottomMargin = C1357a0.m37541i(3.0f);
            this.f29435V.setLayoutParams(t1);
            addView(this.f29435V);
        }
    }

    public final void m10223F1() {
        m10222G1(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void m10222G1(int i, int i2) {
        float f;
        Drawable drawable;
        if (i != 0 && i2 != 0) {
            this.f29455s0 = i;
            this.f29456t0 = i2;
            int U1 = m10212U1();
            int i3 = C1357a0.m37541i(17.0f) + this.f29451o0;
            this.f29436W = U1;
            float i4 = this.f29426M == 3 ? (((i - U1) - i3) - i3) - C1357a0.m37541i(38.0f) : (i - U1) - i3;
            C5375a aVar = this.f29462z0;
            if (aVar != null) {
                i4 -= aVar.m23035j(C1357a0.m37541i(24.0f) + C1357a0.m37541i(8.0f));
            }
            if (this.f29426M == 7) {
                this.f29437a0 = C1357a0.m37541i(28.0f);
            } else {
                this.f29437a0 = C1357a0.m37541i(34.0f);
            }
            if (this.f29454r0) {
                this.f29433T = this.f29429P;
                this.f29430Q = this.f29432S;
            } else {
                this.f29433T = this.f29432S;
                this.f29430Q = this.f29429P;
            }
            int i5 = this.f29426M;
            float f2 = 20.0f;
            if (i5 == 1 || i5 == 7 || i5 == 5) {
                this.f29438b0 = this.f29436W;
                float f3 = this.f29437a0;
                this.f29439c0 = f3;
                this.f29437a0 = f3 + C1357a0.m37541i(20.0f);
                CharSequence charSequence = this.f29433T;
                if (charSequence != null) {
                    m10210W1(charSequence, i4, C1410y.m37032j0());
                }
                C5459x0 x0Var = this.f29447k0;
                if (x0Var != null) {
                    int i6 = (int) i4;
                    this.f29457u0 = i6;
                    x0Var.m22627k(i6);
                } else {
                    this.f29457u0 = 0;
                }
                CharSequence charSequence2 = this.f29430Q;
                if (charSequence2 != null) {
                    m10209X1(charSequence2, i4, C1410y.m37048b0(13.0f));
                }
            } else {
                CharSequence charSequence3 = this.f29433T;
                if (charSequence3 != null) {
                    m10210W1(charSequence3, i4, C1410y.m37032j0());
                    this.f29438b0 = (i - i3) - this.f29443g0;
                    this.f29439c0 = this.f29437a0;
                }
                CharSequence charSequence4 = this.f29430Q;
                if (charSequence4 != null) {
                    m10209X1(charSequence4, i4, C1410y.m37032j0());
                }
            }
            if ((this.f29427N & 8) == 0 || (drawable = this.f29428O) == null) {
                int i7 = this.f29426M;
                if (!(i7 == 1 || i7 == 7 || i7 == 5)) {
                    f2 = 16.0f;
                }
                f = C1357a0.m37541i(f2);
            } else {
                f = (i2 / 2.0f) - (drawable.getMinimumHeight() / 2.0f);
            }
            this.f29441e0 = f;
            this.f29440d0 = C1357a0.m37541i(18.0f);
        }
    }

    public final void m10221I1() {
        boolean z = (this.f29431R == null && this.f29434U == null) ? false : true;
        if (this.f29458v0 != z) {
            this.f29458v0 = z;
            if (z) {
                C11052v1.m1768b().m1769a(this);
            } else {
                C11052v1.m1768b().m1766d(this);
            }
        }
    }

    public void m10220J1(boolean z) {
        C9139d dVar = this.f29435V;
        if (dVar != null) {
            dVar.m10191m(z);
        }
    }

    public void m10219L1() {
        List<AbstractC5139r> list = this.f29422A0;
        if (list != null && !list.isEmpty()) {
            this.f29422A0.clear();
        }
    }

    public C7057w m10217N1() {
        return (C7057w) getChildAt(0);
    }

    public C6985o2 m10216O1() {
        return (C6985o2) getChildAt(0);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 1) {
            this.f29424C0.m18275o(f);
            invalidate();
        }
    }

    @Override
    public int mo7858Q() {
        return C5406j.m22807d(this);
    }

    public void m10215Q1(int i, int i2) {
        if (this.f29450n0 != i || this.f29451o0 != i2) {
            this.f29450n0 = i;
            this.f29451o0 = i2;
            m10223F1();
        }
    }

    public final void m10213T1() {
        if (this.f29424C0 != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (C4403w.m27984G2()) {
                    this.f29424C0.m18274p(0, 0, measuredHeight, measuredHeight);
                } else {
                    this.f29424C0.m18274p(measuredWidth - measuredHeight, 0, measuredWidth, measuredHeight);
                }
            }
        }
    }

    public final int m10212U1() {
        int i = this.f29450n0;
        if (i != 0) {
            return i;
        }
        return C1357a0.m37541i(this.f29428O == null ? 16.0f : 73.0f);
    }

    @Override
    public void mo5812V0() {
        if (this.f29423B0 == null) {
            this.f29423B0 = new C4007j(this, R.drawable.baseline_delete_24);
        }
        this.f29423B0.m29340c();
    }

    public void m10211V1(int i, boolean z) {
        if (this.f29445i0 != i || z != C5063c.m24144b(this.f29427N, 32)) {
            this.f29445i0 = i;
            this.f29427N = C5063c.m24138h(this.f29427N, 32, z);
            invalidate();
        }
    }

    public final void m10210W1(CharSequence charSequence, float f, TextPaint textPaint) {
        CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f, TextUtils.TruncateAt.END);
        this.f29433T = ellipsize;
        if (ellipsize instanceof String) {
            this.f29443g0 = (int) C7389v0.m16680T1(ellipsize, textPaint);
            this.f29434U = null;
        } else {
            Layout Q = C7389v0.m16694Q(ellipsize, (int) f, textPaint);
            this.f29434U = Q;
            this.f29443g0 = Q.getWidth();
        }
        m10221I1();
    }

    @Override
    public long mo7857X0(boolean z) {
        return z ? 2131166797L : 0L;
    }

    public final void m10209X1(CharSequence charSequence, float f, TextPaint textPaint) {
        CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f, TextUtils.TruncateAt.END);
        this.f29430Q = ellipsize;
        if (ellipsize instanceof String) {
            this.f29442f0 = (int) C7389v0.m16680T1(ellipsize, textPaint);
            this.f29431R = null;
        } else {
            Layout Q = C7389v0.m16694Q(ellipsize, (int) f, textPaint);
            this.f29431R = Q;
            this.f29442f0 = Q.getWidth();
        }
        m10221I1();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        C3953l.m29526a(this, i, f, kVar);
    }

    public void m10208Y1(boolean z, boolean z2) {
        if (z2) {
            setEnabledAnimated(z);
        } else {
            setEnabled(z);
        }
    }

    public void m10207Z1(boolean z, boolean z2, boolean z3) {
        if (isEnabled() != z) {
            super.setEnabled(z);
            if (this.f29426M == 3 && !z2) {
                this.f29435V.m10187q(!z, z3);
            }
        }
        this.f29459w0.m29575p(z, z3);
    }

    public void m10206a2(boolean z, boolean z2) {
        if (z || this.f29425D0 != null) {
            if (this.f29424C0 == null) {
                RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37307r(getContext()), C1357a0.m37541i(4.5f));
                this.f29424C0 = m2Var;
                m2Var.m18293C(C1357a0.m37541i(1.5f));
                this.f29424C0.m18291E(new C4343h(this));
                this.f29424C0.m18275o(0.0f);
                m10213T1();
            }
            if (this.f29425D0 == null) {
                this.f29425D0 = new C3940f(1, this, C2057b.f7280b, 180L);
            }
            this.f29425D0.m29575p(z, z2);
        }
    }

    @Override
    public void mo4501a3() {
        C1399s0.m37164p(this);
        C6257p pVar = this.f29449m0;
        if (pVar != null) {
            pVar.mo20249Z();
        }
        if (this.f29458v0) {
            C11052v1.m1768b().m1766d(this);
            this.f29458v0 = false;
        }
    }

    @Override
    public void mo8229b() {
        C1399s0.m37170m(this, false);
        this.f29427N &= -65;
        C6257p pVar = this.f29449m0;
        if (pVar != null) {
            pVar.mo20247b();
        }
    }

    @Override
    public int mo7856b1() {
        return C5406j.m22805f(this);
    }

    public void m10205b2() {
        this.f29454r0 = true;
    }

    @Override
    public int mo7855c() {
        return C5064d.m24128d(C11524j.m213U0(), C11524j.m228N(this.f29444h0), this.f29459w0.m29584g());
    }

    public void m10204d2(int i, boolean z, boolean z2) {
        C5375a aVar = this.f29462z0;
        if (aVar != null || i != 0) {
            if (aVar == null) {
                this.f29462z0 = new C5375a.C5377b().m23019d(new C5375a.AbstractC5378c() {
                    @Override
                    public boolean mo8363d(C5375a aVar2) {
                        return C5380b.m23012a(this, aVar2);
                    }

                    @Override
                    public final void mo8362j(C5375a aVar2, boolean z3) {
                        C9137c.this.m10214S1(aVar2, z3);
                    }
                }).m23021b();
            }
            this.f29462z0.m23026u(i, z, z2);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        C4007j jVar = this.f29423B0;
        if (jVar != null) {
            jVar.m29338e(canvas);
        }
        super.draw(canvas);
        C4007j jVar2 = this.f29423B0;
        if (jVar2 != null) {
            jVar2.m29339d(canvas);
            this.f29423B0.m29341b(canvas);
        }
    }

    @Override
    public int mo7854e(boolean z) {
        return C5406j.m22809b(this, z);
    }

    @Override
    public void mo8225f() {
        C1399s0.m37170m(this, true);
        this.f29427N |= 64;
        C6257p pVar = this.f29449m0;
        if (pVar != null) {
            pVar.mo20245f();
        }
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        int i = this.f29426M;
        if ((i == 1 || i == 7 || (i == 5 && this.f29447k0 == null)) && this.f29432S != null) {
            int i2 = (int) (this.f29439c0 - C1357a0.m37541i(13.0f));
            float f = this.f29438b0;
            rect.set((int) f, i2, (int) (f + this.f29443g0), C7389v0.m16741E0(C1410y.m37032j0().getFontMetricsInt()) + i2);
        }
    }

    public void m10203f2(boolean z, boolean z2) {
        if (this.f29460x0) {
            this.f29459w0.m29575p(z, z2);
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public int mo7853g(boolean z) {
        return C5406j.m22803h(this, z);
    }

    @Override
    public void mo452g2() {
        invalidate();
    }

    public List<AbstractC5139r> getDrawModifiers() {
        return this.f29422A0;
    }

    public int getForcedPaddingLeft() {
        return this.f29450n0;
    }

    public int getForcedPaddingRight() {
        return this.f29451o0;
    }

    public CharSequence getName() {
        return this.f29429P;
    }

    public C6257p getReceiver() {
        if (this.f29449m0 == null) {
            C6257p pVar = new C6257p(this, 0);
            this.f29449m0 = pVar;
            if ((this.f29427N & 64) == 0) {
                pVar.mo20247b();
            }
        }
        return this.f29449m0;
    }

    public C9139d getToggler() {
        return this.f29435V;
    }

    public int getType() {
        return this.f29426M;
    }

    public boolean m10202h2() {
        return this.f29435V.m10184t(true);
    }

    @Override
    public int mo7852o0(boolean z) {
        return C11524j.m211V0();
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        int i;
        int i2;
        Canvas canvas2;
        int i3;
        float f;
        Canvas canvas3;
        float f2;
        float f3;
        Paint paint;
        List<AbstractC5139r> list = this.f29422A0;
        if (list != null) {
            for (AbstractC5139r rVar : list) {
                rVar.mo23818a(this, canvas);
            }
        }
        boolean G2 = C4403w.m27984G2();
        int measuredWidth = getMeasuredWidth();
        if (this.f29428O != null) {
            if (G2) {
                f3 = (measuredWidth - this.f29440d0) - drawable.getMinimumWidth();
            } else {
                f3 = this.f29440d0;
            }
            int i4 = (((int) f3) + (C1357a0.m37541i(24.0f) / 2)) - (this.f29428O.getMinimumWidth() / 2);
            Drawable drawable2 = this.f29428O;
            float f4 = i4;
            float f5 = this.f29441e0;
            if (this.f29452p0 == 0) {
                paint = C1410y.m37033j();
            } else {
                int i5 = this.f29461y0;
                paint = i5 != 0 ? C1410y.m37055W(C11524j.m228N(i5)) : C1410y.m37068J();
            }
            C1362c.m37487b(canvas, drawable2, f4, f5, paint);
            if (this.f29448l0 != null) {
                canvas.save();
                canvas.translate(f4, this.f29441e0);
                AbstractC9138a aVar = this.f29448l0;
                Drawable drawable3 = this.f29428O;
                aVar.m10201a(canvas, drawable3, drawable3.getMinimumWidth(), this.f29428O.getMinimumHeight());
                canvas.restore();
            }
        }
        float f6 = this.f29436W;
        if (this.f29453q0 != 0) {
            int i6 = C1357a0.m37541i(4.0f);
            f6 += C1357a0.m37541i(8.0f) + i6;
            if (G2) {
                f2 = (measuredWidth - this.f29438b0) - i6;
            } else {
                f2 = this.f29438b0 + i6;
            }
            float f7 = i6;
            canvas.drawCircle(f2, this.f29439c0 + C1357a0.m37541i(11.0f) + f7, f7, C1410y.m37039g(C11524j.m228N(this.f29453q0)));
        }
        int c = mo7855c();
        int i7 = this.f29426M;
        int i8 = R.id.theme_color_textLight;
        if (i7 == 1 || i7 == 7 || (i7 == 5 && this.f29447k0 == null)) {
            i = measuredWidth;
            canvas2 = canvas;
            i2 = 5;
            if (this.f29430Q != null) {
                int i9 = this.f29445i0;
                if (i9 != 0) {
                    i8 = i9;
                }
                int N = C11524j.m228N(i8);
                if ((this.f29427N & 32) != 0) {
                    N = C5064d.m24131a(C11524j.m180h0(), N);
                }
                m10218M1(canvas, this.f29430Q, this.f29431R, f6, this.f29437a0, C1410y.m37046c0(13.0f, N), G2, i, this.f29442f0);
            }
            CharSequence charSequence = this.f29433T;
            if (charSequence != null) {
                m10218M1(canvas, charSequence, this.f29434U, this.f29438b0, this.f29439c0, C1410y.m37030k0(c), G2, i, this.f29443g0);
            }
        } else if (i7 == 5) {
            if (this.f29430Q != null) {
                int i10 = this.f29445i0;
                if (i10 != 0) {
                    i8 = i10;
                }
                int N2 = C11524j.m228N(i8);
                if ((this.f29427N & 32) != 0) {
                    N2 = C5064d.m24131a(C11524j.m180h0(), N2);
                }
                f = 13.0f;
                m10218M1(canvas, this.f29430Q, this.f29431R, f6, (((int) this.f29439c0) - C1357a0.m37541i(13.0f)) + this.f29447k0.getHeight() + C1357a0.m37541i(17.0f), C1410y.m37046c0(13.0f, N2), G2, measuredWidth, this.f29442f0);
            } else {
                f = 13.0f;
            }
            C5459x0 x0Var = this.f29447k0;
            if (x0Var != null) {
                if (G2) {
                    float f8 = measuredWidth - f6;
                    i2 = 5;
                    i = measuredWidth;
                    canvas3 = canvas;
                    x0Var.m22630h(canvas, (int) (f8 - x0Var.getWidth()), (int) f8, 0, ((int) this.f29439c0) - C1357a0.m37541i(f), this, 1.0f);
                } else {
                    i = measuredWidth;
                    canvas3 = canvas;
                    i2 = 5;
                    x0Var.m22630h(canvas, (int) f6, (int) (f6 + x0Var.getWidth()), 0, ((int) this.f29439c0) - C1357a0.m37541i(f), this, 1.0f);
                }
                canvas2 = canvas3;
            } else {
                i = measuredWidth;
                i2 = 5;
                canvas2 = canvas;
            }
        } else {
            i = measuredWidth;
            i2 = 5;
            CharSequence charSequence2 = this.f29433T;
            if (charSequence2 != null) {
                canvas2 = canvas;
                m10218M1(canvas, charSequence2, this.f29434U, this.f29438b0, this.f29439c0, C1410y.m37030k0(c), G2, i, this.f29443g0);
            } else {
                canvas2 = canvas;
            }
            CharSequence charSequence3 = this.f29430Q;
            if (charSequence3 != null) {
                m10218M1(canvas, charSequence3, this.f29431R, f6, this.f29437a0, C1410y.m37030k0(c), G2, i, this.f29442f0);
            }
        }
        RunnableC6969m2 m2Var = this.f29424C0;
        if (m2Var != null) {
            m2Var.m18287c(canvas2);
        }
        List<AbstractC5139r> list2 = this.f29422A0;
        if (list2 != null) {
            for (int size = list2.size() - 1; size >= 0; size--) {
                this.f29422A0.get(size).mo23817b(this, canvas2);
            }
        }
        C5375a aVar2 = this.f29462z0;
        if (aVar2 != null) {
            float i11 = G2 ? C1357a0.m37541i(24.0f) : i - i3;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (C4403w.m27984G2()) {
                i2 = 3;
            }
            aVar2.m23039d(canvas, i11, measuredHeight, i2, 1.0f);
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m10223F1();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (this.f29426M == 5) {
            if (this.f29447k0 != null) {
                int U1 = m10212U1();
                this.f29447k0.m22627k((View.MeasureSpec.getSize(i) - U1) - C1357a0.m37541i(17.0f));
            }
            if (!(this.f29455s0 == View.MeasureSpec.getSize(i) && this.f29456t0 == getCurrentHeight())) {
                m10222G1(View.MeasureSpec.getSize(i), getCurrentHeight());
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getCurrentHeight(), Log.TAG_TDLIB_OPTIONS));
        } else {
            super.onMeasure(i, i2);
        }
        m10213T1();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C5459x0 x0Var = this.f29447k0;
        return (x0Var != null && x0Var.m22614x(this, motionEvent)) || super.onTouchEvent(motionEvent);
    }

    @Override
    public int mo7851p0(boolean z) {
        if (z) {
            return C11524j.m209W0();
        }
        return 0;
    }

    @Override
    public int mo7850r0(boolean z) {
        return C5406j.m22804g(this, z);
    }

    public void setColorDataId(int i) {
        if (this.f29453q0 != i) {
            this.f29453q0 = i;
            invalidate();
        }
    }

    public void setData(float f) {
        if (f == 1.0f) {
            setData("1.0");
        } else if (f == 0.0f) {
            setData("0.0");
        } else if (f == 0.5f) {
            setData("0.50");
        } else {
            int i = (int) (f * 100.0f);
            StringBuilder sb2 = new StringBuilder(4);
            sb2.append('0');
            sb2.append('.');
            if (i < 10) {
                sb2.append('0');
            }
            sb2.append(i);
            setData(sb2.toString());
        }
    }

    public void setDataColorId(int i) {
        m10211V1(i, false);
    }

    public void setDrawModifier(AbstractC5139r rVar) {
        if (rVar == null) {
            m10219L1();
            return;
        }
        List<AbstractC5139r> list = this.f29422A0;
        if (list == null) {
            this.f29422A0 = new ArrayList();
        } else if (list.size() != 1 || this.f29422A0.get(0) != rVar) {
            this.f29422A0.clear();
        } else {
            return;
        }
        this.f29422A0.add(rVar);
        invalidate();
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f29460x0) {
            this.f29459w0.m29575p(z, true);
            if (this.f29426M == 3) {
                this.f29435V.m10187q(!z, false);
            }
        }
    }

    public void setEnabledAnimated(boolean z) {
        m10207Z1(z, false, true);
    }

    public void setIcon(int i) {
        if (this.f29452p0 != i) {
            this.f29452p0 = i;
            setIconInternal(C1362c.m37482g(getResources(), i));
        }
    }

    public void setIconColorId(int i) {
        if (this.f29461y0 != i) {
            this.f29461y0 = i;
            if (this.f29428O != null) {
                invalidate();
            }
        }
    }

    public void setIconOverlay(AbstractC9138a aVar) {
        this.f29448l0 = aVar;
    }

    public void setIgnoreEnabled(boolean z) {
        if (this.f29460x0 != z) {
            this.f29460x0 = z;
            if (!isEnabled()) {
                this.f29459w0.m29575p(z, false);
            }
        }
    }

    public void setName(CharSequence charSequence) {
        CharSequence charSequence2 = this.f29429P;
        if (charSequence2 == null || !charSequence2.equals(charSequence)) {
            boolean z = this.f29429P != null;
            if (charSequence == null || charSequence.length() == 0) {
                charSequence = null;
            }
            this.f29429P = charSequence;
            if (z) {
                m10223F1();
                invalidate();
            }
        }
    }

    @Override
    public void setRemoveDx(float f) {
        if (this.f29423B0 == null) {
            this.f29423B0 = new C4007j(this, R.drawable.baseline_delete_24);
        }
        this.f29423B0.m29337f(f);
    }

    public void setText(C5459x0 x0Var) {
        C5459x0 x0Var2 = this.f29447k0;
        if (x0Var2 != null) {
            x0Var2.m22633c(this);
        }
        this.f29447k0 = x0Var;
        if (x0Var != null) {
            x0Var.m22634b(this);
            int i = this.f29457u0;
            if (i != 0) {
                x0Var.m22627k(i);
            }
        }
        if (!(getMeasuredHeight() == getCurrentHeight() || getMeasuredHeight() == 0)) {
            requestLayout();
        }
        invalidate();
    }

    public void setTextColorId(int i) {
        if (i == 0) {
            i = R.id.theme_color_text;
        }
        if (this.f29444h0 != i) {
            this.f29444h0 = i;
            invalidate();
        }
    }

    public void setType(int i) {
        this.f29426M = i;
        if (i != 4) {
            C1399s0.m37193a0(this);
            C10189d.m5797g(this);
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m10224E1();
                    setLayoutParams(new ViewGroup.LayoutParams(-1, C1357a0.m37541i(55.0f)));
                    return;
                } else if (i != 4) {
                    if (i == 5) {
                        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        return;
                    } else if (i == 7) {
                        setLayoutParams(new ViewGroup.LayoutParams(-1, C1357a0.m37541i(64.0f)));
                        return;
                    } else {
                        throw new RuntimeException("Invalid SettingView type " + i);
                    }
                }
            }
            setLayoutParams(new ViewGroup.LayoutParams(-1, C1357a0.m37541i(55.0f)));
            return;
        }
        setLayoutParams(new ViewGroup.LayoutParams(-1, C1357a0.m37541i(76.0f)));
    }

    public void setIcon(Bitmap bitmap) {
        this.f29452p0 = 0;
        setIconInternal(C1362c.m37488a(getContext(), bitmap));
    }

    public void setName(int i) {
        setName(C4403w.m27869i1(i));
    }

    public void setData(CharSequence charSequence) {
        CharSequence charSequence2 = this.f29432S;
        if (charSequence2 == null || charSequence == null || !charSequence2.equals(charSequence)) {
            boolean z = this.f29432S != null;
            if (charSequence == null || charSequence.length() == 0) {
                charSequence = null;
            }
            this.f29432S = charSequence;
            if (z) {
                m10223F1();
                invalidate();
            }
        }
    }

    public void setData(int i) {
        setData(C4403w.m27869i1(i));
    }
}
