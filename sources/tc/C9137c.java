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
    public List<AbstractC5139r> f29425A0;
    public C4007j f29426B0;
    public RunnableC6969m2 f29427C0;
    public C3940f f29428D0;
    public int f29429M;
    public int f29430N;
    public Drawable f29431O;
    public CharSequence f29432P;
    public CharSequence f29433Q;
    public Layout f29434R;
    public CharSequence f29435S;
    public CharSequence f29436T;
    public Layout f29437U;
    public C9139d f29438V;
    public float f29439W;
    public float f29440a0;
    public float f29441b0;
    public float f29442c0;
    public float f29443d0;
    public float f29444e0;
    public int f29445f0;
    public int f29446g0;
    public int f29448i0;
    public final C10930q6 f29449j0;
    public C5459x0 f29450k0;
    public AbstractC9138a f29451l0;
    public C6257p f29452m0;
    public int f29453n0;
    public int f29454o0;
    public int f29455p0;
    public boolean f29457r0;
    public int f29458s0;
    public int f29459t0;
    public int f29460u0;
    public boolean f29461v0;
    public boolean f29463x0;
    public int f29464y0;
    public C5375a f29465z0;
    public int f29447h0 = R.id.theme_color_text;
    public int f29456q0 = 0;
    public final C3940f f29462w0 = new C3940f((View) this, (Interpolator) C2057b.f7280b, 168L, true);

    public interface AbstractC9138a {
        void m10200a(Canvas canvas, Drawable drawable, int i, int i2);
    }

    public C9137c(Context context, C10930q6 q6Var) {
        super(context);
        this.f29449j0 = q6Var;
        setWillNotDraw(false);
    }

    public static void m10217M1(Canvas canvas, CharSequence charSequence, Layout layout, float f, float f2, Paint paint, boolean z, int i, float f3) {
        if (layout != null) {
            canvas.save();
            if (z) {
                f = (i - C7389v0.m16696P1(layout)) - f;
            }
            canvas.translate(f, (f2 - paint.getTextSize()) + C1357a0.m37544i(0.8f));
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

    public void m10213S1(C5375a aVar, boolean z) {
        if (z) {
            m10222F1();
        }
        invalidate();
    }

    private int getCurrentHeight() {
        C5459x0 x0Var = this.f29450k0;
        if (x0Var != null) {
            return Math.max(((x0Var.getHeight() + ((int) this.f29442c0)) - C1357a0.m37544i(13.0f)) + C1357a0.m37544i(12.0f) + C1357a0.m37544i(25.0f), C1357a0.m37544i(76.0f));
        }
        return C1357a0.m37544i(76.0f);
    }

    private void setIconInternal(Drawable drawable) {
        this.f29431O = drawable;
        if (drawable != null && (this.f29430N & 8) != 0 && getMeasuredHeight() != 0) {
            this.f29444e0 = (getMeasuredHeight() / 2) - (drawable.getMinimumHeight() / 2);
        }
    }

    public void m10224D1(AbstractC9323v4<?> v4Var) {
        if (v4Var != null) {
            C9139d dVar = this.f29438V;
            if (dVar != null) {
                v4Var.m9163t8(dVar);
            }
            v4Var.m9163t8(this);
        }
    }

    public void m10223E1() {
        if (this.f29438V == null) {
            C9139d dVar = new C9139d(getContext());
            this.f29438V = dVar;
            dVar.m10189n(isEnabled());
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37544i(66.0f), C1357a0.m37544i(48.0f), (C4403w.m27986G2() ? 3 : 5) | 16);
            t1.leftMargin = C1357a0.m37544i(4.0f);
            t1.bottomMargin = C1357a0.m37544i(3.0f);
            this.f29438V.setLayoutParams(t1);
            addView(this.f29438V);
        }
    }

    public final void m10222F1() {
        m10221G1(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void m10221G1(int i, int i2) {
        float f;
        Drawable drawable;
        if (i != 0 && i2 != 0) {
            this.f29458s0 = i;
            this.f29459t0 = i2;
            int U1 = m10211U1();
            int i3 = C1357a0.m37544i(17.0f) + this.f29454o0;
            this.f29439W = U1;
            float i4 = this.f29429M == 3 ? (((i - U1) - i3) - i3) - C1357a0.m37544i(38.0f) : (i - U1) - i3;
            C5375a aVar = this.f29465z0;
            if (aVar != null) {
                i4 -= aVar.m23036j(C1357a0.m37544i(24.0f) + C1357a0.m37544i(8.0f));
            }
            if (this.f29429M == 7) {
                this.f29440a0 = C1357a0.m37544i(28.0f);
            } else {
                this.f29440a0 = C1357a0.m37544i(34.0f);
            }
            if (this.f29457r0) {
                this.f29436T = this.f29432P;
                this.f29433Q = this.f29435S;
            } else {
                this.f29436T = this.f29435S;
                this.f29433Q = this.f29432P;
            }
            int i5 = this.f29429M;
            float f2 = 20.0f;
            if (i5 == 1 || i5 == 7 || i5 == 5) {
                this.f29441b0 = this.f29439W;
                float f3 = this.f29440a0;
                this.f29442c0 = f3;
                this.f29440a0 = f3 + C1357a0.m37544i(20.0f);
                CharSequence charSequence = this.f29436T;
                if (charSequence != null) {
                    m10209W1(charSequence, i4, C1410y.m37035j0());
                }
                C5459x0 x0Var = this.f29450k0;
                if (x0Var != null) {
                    int i6 = (int) i4;
                    this.f29460u0 = i6;
                    x0Var.m22628k(i6);
                } else {
                    this.f29460u0 = 0;
                }
                CharSequence charSequence2 = this.f29433Q;
                if (charSequence2 != null) {
                    m10208X1(charSequence2, i4, C1410y.m37051b0(13.0f));
                }
            } else {
                CharSequence charSequence3 = this.f29436T;
                if (charSequence3 != null) {
                    m10209W1(charSequence3, i4, C1410y.m37035j0());
                    this.f29441b0 = (i - i3) - this.f29446g0;
                    this.f29442c0 = this.f29440a0;
                }
                CharSequence charSequence4 = this.f29433Q;
                if (charSequence4 != null) {
                    m10208X1(charSequence4, i4, C1410y.m37035j0());
                }
            }
            if ((this.f29430N & 8) == 0 || (drawable = this.f29431O) == null) {
                int i7 = this.f29429M;
                if (!(i7 == 1 || i7 == 7 || i7 == 5)) {
                    f2 = 16.0f;
                }
                f = C1357a0.m37544i(f2);
            } else {
                f = (i2 / 2.0f) - (drawable.getMinimumHeight() / 2.0f);
            }
            this.f29444e0 = f;
            this.f29443d0 = C1357a0.m37544i(18.0f);
        }
    }

    public final void m10220I1() {
        boolean z = (this.f29434R == null && this.f29437U == null) ? false : true;
        if (this.f29461v0 != z) {
            this.f29461v0 = z;
            if (z) {
                C11052v1.m1768b().m1769a(this);
            } else {
                C11052v1.m1768b().m1766d(this);
            }
        }
    }

    public void m10219J1(boolean z) {
        C9139d dVar = this.f29438V;
        if (dVar != null) {
            dVar.m10190m(z);
        }
    }

    public void m10218L1() {
        List<AbstractC5139r> list = this.f29425A0;
        if (list != null && !list.isEmpty()) {
            this.f29425A0.clear();
        }
    }

    public C7057w m10216N1() {
        return (C7057w) getChildAt(0);
    }

    public C6985o2 m10215O1() {
        return (C6985o2) getChildAt(0);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 1) {
            this.f29427C0.m18275o(f);
            invalidate();
        }
    }

    @Override
    public int mo7858Q() {
        return C5406j.m22808d(this);
    }

    public void m10214Q1(int i, int i2) {
        if (this.f29453n0 != i || this.f29454o0 != i2) {
            this.f29453n0 = i;
            this.f29454o0 = i2;
            m10222F1();
        }
    }

    public final void m10212T1() {
        if (this.f29427C0 != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (C4403w.m27986G2()) {
                    this.f29427C0.m18274p(0, 0, measuredHeight, measuredHeight);
                } else {
                    this.f29427C0.m18274p(measuredWidth - measuredHeight, 0, measuredWidth, measuredHeight);
                }
            }
        }
    }

    public final int m10211U1() {
        int i = this.f29453n0;
        if (i != 0) {
            return i;
        }
        return C1357a0.m37544i(this.f29431O == null ? 16.0f : 73.0f);
    }

    @Override
    public void mo5812V0() {
        if (this.f29426B0 == null) {
            this.f29426B0 = new C4007j(this, R.drawable.baseline_delete_24);
        }
        this.f29426B0.m29342c();
    }

    public void m10210V1(int i, boolean z) {
        if (this.f29448i0 != i || z != C5063c.m24145b(this.f29430N, 32)) {
            this.f29448i0 = i;
            this.f29430N = C5063c.m24139h(this.f29430N, 32, z);
            invalidate();
        }
    }

    public final void m10209W1(CharSequence charSequence, float f, TextPaint textPaint) {
        CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f, TextUtils.TruncateAt.END);
        this.f29436T = ellipsize;
        if (ellipsize instanceof String) {
            this.f29446g0 = (int) C7389v0.m16680T1(ellipsize, textPaint);
            this.f29437U = null;
        } else {
            Layout Q = C7389v0.m16694Q(ellipsize, (int) f, textPaint);
            this.f29437U = Q;
            this.f29446g0 = Q.getWidth();
        }
        m10220I1();
    }

    @Override
    public long mo7857X0(boolean z) {
        return z ? 2131166797L : 0L;
    }

    public final void m10208X1(CharSequence charSequence, float f, TextPaint textPaint) {
        CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f, TextUtils.TruncateAt.END);
        this.f29433Q = ellipsize;
        if (ellipsize instanceof String) {
            this.f29445f0 = (int) C7389v0.m16680T1(ellipsize, textPaint);
            this.f29434R = null;
        } else {
            Layout Q = C7389v0.m16694Q(ellipsize, (int) f, textPaint);
            this.f29434R = Q;
            this.f29445f0 = Q.getWidth();
        }
        m10220I1();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        C3953l.m29528a(this, i, f, kVar);
    }

    public void m10207Y1(boolean z, boolean z2) {
        if (z2) {
            setEnabledAnimated(z);
        } else {
            setEnabled(z);
        }
    }

    public void m10206Z1(boolean z, boolean z2, boolean z3) {
        if (isEnabled() != z) {
            super.setEnabled(z);
            if (this.f29429M == 3 && !z2) {
                this.f29438V.m10186q(!z, z3);
            }
        }
        this.f29462w0.m29577p(z, z3);
    }

    public void m10205a2(boolean z, boolean z2) {
        if (z || this.f29428D0 != null) {
            if (this.f29427C0 == null) {
                RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37310r(getContext()), C1357a0.m37544i(4.5f));
                this.f29427C0 = m2Var;
                m2Var.m18293C(C1357a0.m37544i(1.5f));
                this.f29427C0.m18291E(new C4343h(this));
                this.f29427C0.m18275o(0.0f);
                m10212T1();
            }
            if (this.f29428D0 == null) {
                this.f29428D0 = new C3940f(1, this, C2057b.f7280b, 180L);
            }
            this.f29428D0.m29577p(z, z2);
        }
    }

    @Override
    public void mo4501a3() {
        C1399s0.m37167p(this);
        C6257p pVar = this.f29452m0;
        if (pVar != null) {
            pVar.mo20250Z();
        }
        if (this.f29461v0) {
            C11052v1.m1768b().m1766d(this);
            this.f29461v0 = false;
        }
    }

    @Override
    public void mo8229b() {
        C1399s0.m37173m(this, false);
        this.f29430N &= -65;
        C6257p pVar = this.f29452m0;
        if (pVar != null) {
            pVar.mo20248b();
        }
    }

    @Override
    public int mo7856b1() {
        return C5406j.m22806f(this);
    }

    public void m10204b2() {
        this.f29457r0 = true;
    }

    @Override
    public int mo7855c() {
        return C5064d.m24129d(C11524j.m213U0(), C11524j.m228N(this.f29447h0), this.f29462w0.m29586g());
    }

    public void m10203d2(int i, boolean z, boolean z2) {
        C5375a aVar = this.f29465z0;
        if (aVar != null || i != 0) {
            if (aVar == null) {
                this.f29465z0 = new C5375a.C5377b().m23020d(new C5375a.AbstractC5378c() {
                    @Override
                    public boolean mo8363d(C5375a aVar2) {
                        return C5380b.m23013a(this, aVar2);
                    }

                    @Override
                    public final void mo8362j(C5375a aVar2, boolean z3) {
                        C9137c.this.m10213S1(aVar2, z3);
                    }
                }).m23022b();
            }
            this.f29465z0.m23027u(i, z, z2);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        C4007j jVar = this.f29426B0;
        if (jVar != null) {
            jVar.m29340e(canvas);
        }
        super.draw(canvas);
        C4007j jVar2 = this.f29426B0;
        if (jVar2 != null) {
            jVar2.m29341d(canvas);
            this.f29426B0.m29343b(canvas);
        }
    }

    @Override
    public int mo7854e(boolean z) {
        return C5406j.m22810b(this, z);
    }

    @Override
    public void mo8225f() {
        C1399s0.m37173m(this, true);
        this.f29430N |= 64;
        C6257p pVar = this.f29452m0;
        if (pVar != null) {
            pVar.mo20246f();
        }
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        int i = this.f29429M;
        if ((i == 1 || i == 7 || (i == 5 && this.f29450k0 == null)) && this.f29435S != null) {
            int i2 = (int) (this.f29442c0 - C1357a0.m37544i(13.0f));
            float f = this.f29441b0;
            rect.set((int) f, i2, (int) (f + this.f29446g0), C7389v0.m16741E0(C1410y.m37035j0().getFontMetricsInt()) + i2);
        }
    }

    public void m10202f2(boolean z, boolean z2) {
        if (this.f29463x0) {
            this.f29462w0.m29577p(z, z2);
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public int mo7853g(boolean z) {
        return C5406j.m22804h(this, z);
    }

    @Override
    public void mo452g2() {
        invalidate();
    }

    public List<AbstractC5139r> getDrawModifiers() {
        return this.f29425A0;
    }

    public int getForcedPaddingLeft() {
        return this.f29453n0;
    }

    public int getForcedPaddingRight() {
        return this.f29454o0;
    }

    public CharSequence getName() {
        return this.f29432P;
    }

    public C6257p getReceiver() {
        if (this.f29452m0 == null) {
            C6257p pVar = new C6257p(this, 0);
            this.f29452m0 = pVar;
            if ((this.f29430N & 64) == 0) {
                pVar.mo20248b();
            }
        }
        return this.f29452m0;
    }

    public C9139d getToggler() {
        return this.f29438V;
    }

    public int getType() {
        return this.f29429M;
    }

    public boolean m10201h2() {
        return this.f29438V.m10183t(true);
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
        List<AbstractC5139r> list = this.f29425A0;
        if (list != null) {
            for (AbstractC5139r rVar : list) {
                rVar.mo23819a(this, canvas);
            }
        }
        boolean G2 = C4403w.m27986G2();
        int measuredWidth = getMeasuredWidth();
        if (this.f29431O != null) {
            if (G2) {
                f3 = (measuredWidth - this.f29443d0) - drawable.getMinimumWidth();
            } else {
                f3 = this.f29443d0;
            }
            int i4 = (((int) f3) + (C1357a0.m37544i(24.0f) / 2)) - (this.f29431O.getMinimumWidth() / 2);
            Drawable drawable2 = this.f29431O;
            float f4 = i4;
            float f5 = this.f29444e0;
            if (this.f29455p0 == 0) {
                paint = C1410y.m37036j();
            } else {
                int i5 = this.f29464y0;
                paint = i5 != 0 ? C1410y.m37058W(C11524j.m228N(i5)) : C1410y.m37071J();
            }
            C1362c.m37490b(canvas, drawable2, f4, f5, paint);
            if (this.f29451l0 != null) {
                canvas.save();
                canvas.translate(f4, this.f29444e0);
                AbstractC9138a aVar = this.f29451l0;
                Drawable drawable3 = this.f29431O;
                aVar.m10200a(canvas, drawable3, drawable3.getMinimumWidth(), this.f29431O.getMinimumHeight());
                canvas.restore();
            }
        }
        float f6 = this.f29439W;
        if (this.f29456q0 != 0) {
            int i6 = C1357a0.m37544i(4.0f);
            f6 += C1357a0.m37544i(8.0f) + i6;
            if (G2) {
                f2 = (measuredWidth - this.f29441b0) - i6;
            } else {
                f2 = this.f29441b0 + i6;
            }
            float f7 = i6;
            canvas.drawCircle(f2, this.f29442c0 + C1357a0.m37544i(11.0f) + f7, f7, C1410y.m37042g(C11524j.m228N(this.f29456q0)));
        }
        int c = mo7855c();
        int i7 = this.f29429M;
        int i8 = R.id.theme_color_textLight;
        if (i7 == 1 || i7 == 7 || (i7 == 5 && this.f29450k0 == null)) {
            i = measuredWidth;
            canvas2 = canvas;
            i2 = 5;
            if (this.f29433Q != null) {
                int i9 = this.f29448i0;
                if (i9 != 0) {
                    i8 = i9;
                }
                int N = C11524j.m228N(i8);
                if ((this.f29430N & 32) != 0) {
                    N = C5064d.m24132a(C11524j.m180h0(), N);
                }
                m10217M1(canvas, this.f29433Q, this.f29434R, f6, this.f29440a0, C1410y.m37049c0(13.0f, N), G2, i, this.f29445f0);
            }
            CharSequence charSequence = this.f29436T;
            if (charSequence != null) {
                m10217M1(canvas, charSequence, this.f29437U, this.f29441b0, this.f29442c0, C1410y.m37033k0(c), G2, i, this.f29446g0);
            }
        } else if (i7 == 5) {
            if (this.f29433Q != null) {
                int i10 = this.f29448i0;
                if (i10 != 0) {
                    i8 = i10;
                }
                int N2 = C11524j.m228N(i8);
                if ((this.f29430N & 32) != 0) {
                    N2 = C5064d.m24132a(C11524j.m180h0(), N2);
                }
                f = 13.0f;
                m10217M1(canvas, this.f29433Q, this.f29434R, f6, (((int) this.f29442c0) - C1357a0.m37544i(13.0f)) + this.f29450k0.getHeight() + C1357a0.m37544i(17.0f), C1410y.m37049c0(13.0f, N2), G2, measuredWidth, this.f29445f0);
            } else {
                f = 13.0f;
            }
            C5459x0 x0Var = this.f29450k0;
            if (x0Var != null) {
                if (G2) {
                    float f8 = measuredWidth - f6;
                    i2 = 5;
                    i = measuredWidth;
                    canvas3 = canvas;
                    x0Var.m22631h(canvas, (int) (f8 - x0Var.getWidth()), (int) f8, 0, ((int) this.f29442c0) - C1357a0.m37544i(f), this, 1.0f);
                } else {
                    i = measuredWidth;
                    canvas3 = canvas;
                    i2 = 5;
                    x0Var.m22631h(canvas, (int) f6, (int) (f6 + x0Var.getWidth()), 0, ((int) this.f29442c0) - C1357a0.m37544i(f), this, 1.0f);
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
            CharSequence charSequence2 = this.f29436T;
            if (charSequence2 != null) {
                canvas2 = canvas;
                m10217M1(canvas, charSequence2, this.f29437U, this.f29441b0, this.f29442c0, C1410y.m37033k0(c), G2, i, this.f29446g0);
            } else {
                canvas2 = canvas;
            }
            CharSequence charSequence3 = this.f29433Q;
            if (charSequence3 != null) {
                m10217M1(canvas, charSequence3, this.f29434R, f6, this.f29440a0, C1410y.m37033k0(c), G2, i, this.f29445f0);
            }
        }
        RunnableC6969m2 m2Var = this.f29427C0;
        if (m2Var != null) {
            m2Var.m18287c(canvas2);
        }
        List<AbstractC5139r> list2 = this.f29425A0;
        if (list2 != null) {
            for (int size = list2.size() - 1; size >= 0; size--) {
                this.f29425A0.get(size).mo23818b(this, canvas2);
            }
        }
        C5375a aVar2 = this.f29465z0;
        if (aVar2 != null) {
            float i11 = G2 ? C1357a0.m37544i(24.0f) : i - i3;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (C4403w.m27986G2()) {
                i2 = 3;
            }
            aVar2.m23040d(canvas, i11, measuredHeight, i2, 1.0f);
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m10222F1();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (this.f29429M == 5) {
            if (this.f29450k0 != null) {
                int U1 = m10211U1();
                this.f29450k0.m22628k((View.MeasureSpec.getSize(i) - U1) - C1357a0.m37544i(17.0f));
            }
            if (!(this.f29458s0 == View.MeasureSpec.getSize(i) && this.f29459t0 == getCurrentHeight())) {
                m10221G1(View.MeasureSpec.getSize(i), getCurrentHeight());
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getCurrentHeight(), Log.TAG_TDLIB_OPTIONS));
        } else {
            super.onMeasure(i, i2);
        }
        m10212T1();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C5459x0 x0Var = this.f29450k0;
        return (x0Var != null && x0Var.m22615x(this, motionEvent)) || super.onTouchEvent(motionEvent);
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
        return C5406j.m22805g(this, z);
    }

    public void setColorDataId(int i) {
        if (this.f29456q0 != i) {
            this.f29456q0 = i;
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
        m10210V1(i, false);
    }

    public void setDrawModifier(AbstractC5139r rVar) {
        if (rVar == null) {
            m10218L1();
            return;
        }
        List<AbstractC5139r> list = this.f29425A0;
        if (list == null) {
            this.f29425A0 = new ArrayList();
        } else if (list.size() != 1 || this.f29425A0.get(0) != rVar) {
            this.f29425A0.clear();
        } else {
            return;
        }
        this.f29425A0.add(rVar);
        invalidate();
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f29463x0) {
            this.f29462w0.m29577p(z, true);
            if (this.f29429M == 3) {
                this.f29438V.m10186q(!z, false);
            }
        }
    }

    public void setEnabledAnimated(boolean z) {
        m10206Z1(z, false, true);
    }

    public void setIcon(int i) {
        if (this.f29455p0 != i) {
            this.f29455p0 = i;
            setIconInternal(C1362c.m37485g(getResources(), i));
        }
    }

    public void setIconColorId(int i) {
        if (this.f29464y0 != i) {
            this.f29464y0 = i;
            if (this.f29431O != null) {
                invalidate();
            }
        }
    }

    public void setIconOverlay(AbstractC9138a aVar) {
        this.f29451l0 = aVar;
    }

    public void setIgnoreEnabled(boolean z) {
        if (this.f29463x0 != z) {
            this.f29463x0 = z;
            if (!isEnabled()) {
                this.f29462w0.m29577p(z, false);
            }
        }
    }

    public void setName(CharSequence charSequence) {
        CharSequence charSequence2 = this.f29432P;
        if (charSequence2 == null || !charSequence2.equals(charSequence)) {
            boolean z = this.f29432P != null;
            if (charSequence == null || charSequence.length() == 0) {
                charSequence = null;
            }
            this.f29432P = charSequence;
            if (z) {
                m10222F1();
                invalidate();
            }
        }
    }

    @Override
    public void setRemoveDx(float f) {
        if (this.f29426B0 == null) {
            this.f29426B0 = new C4007j(this, R.drawable.baseline_delete_24);
        }
        this.f29426B0.m29339f(f);
    }

    public void setText(C5459x0 x0Var) {
        C5459x0 x0Var2 = this.f29450k0;
        if (x0Var2 != null) {
            x0Var2.m22634c(this);
        }
        this.f29450k0 = x0Var;
        if (x0Var != null) {
            x0Var.m22635b(this);
            int i = this.f29460u0;
            if (i != 0) {
                x0Var.m22628k(i);
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
        if (this.f29447h0 != i) {
            this.f29447h0 = i;
            invalidate();
        }
    }

    public void setType(int i) {
        this.f29429M = i;
        if (i != 4) {
            C1399s0.m37196a0(this);
            C10189d.m5797g(this);
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m10223E1();
                    setLayoutParams(new ViewGroup.LayoutParams(-1, C1357a0.m37544i(55.0f)));
                    return;
                } else if (i != 4) {
                    if (i == 5) {
                        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        return;
                    } else if (i == 7) {
                        setLayoutParams(new ViewGroup.LayoutParams(-1, C1357a0.m37544i(64.0f)));
                        return;
                    } else {
                        throw new RuntimeException("Invalid SettingView type " + i);
                    }
                }
            }
            setLayoutParams(new ViewGroup.LayoutParams(-1, C1357a0.m37544i(55.0f)));
            return;
        }
        setLayoutParams(new ViewGroup.LayoutParams(-1, C1357a0.m37544i(76.0f)));
    }

    public void setIcon(Bitmap bitmap) {
        this.f29455p0 = 0;
        setIconInternal(C1362c.m37491a(getContext(), bitmap));
    }

    public void setName(int i) {
        setName(C4403w.m27871i1(i));
    }

    public void setData(CharSequence charSequence) {
        CharSequence charSequence2 = this.f29435S;
        if (charSequence2 == null || charSequence == null || !charSequence2.equals(charSequence)) {
            boolean z = this.f29435S != null;
            if (charSequence == null || charSequence.length() == 0) {
                charSequence = null;
            }
            this.f29435S = charSequence;
            if (z) {
                m10222F1();
                invalidate();
            }
        }
    }

    public void setData(int i) {
        setData(C4403w.m27871i1(i));
    }
}
