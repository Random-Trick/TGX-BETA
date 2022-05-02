package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1363c0;
import be.C1410y;
import gd.C4574a;
import gd.C4779t2;
import java.util.Arrays;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p037cb.C2065g;
import p038ce.C2760nb;
import p051db.C3950k;
import p080fb.C4335b;
import p080fb.C4336c;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p156kd.C6257p;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C7023s1 extends View implements AbstractC5911c, C3950k.AbstractC3952b, C4336c.AbstractC4337a {
    public static long f22268e0 = 120;
    public static long f22269f0 = 28;
    public static long f22270g0 = 120;
    public float f22272N;
    public CharSequence f22273O;
    public CharSequence f22274P;
    public StaticLayout f22275Q;
    public StaticLayout f22276R;
    public int f22277S;
    public final C4336c f22278T;
    public long[] f22279U;
    public C4574a[] f22280V;
    public String f22281W;
    public final C10930q6 f22282a;
    public float f22285b0;
    public boolean f22287c0;
    public C2760nb f22288d0;
    public boolean f22283a0 = true;
    public final C3950k f22284b = new C3950k(0, this, C2057b.f7280b, f22268e0);
    public Drawable f22271M = C1362c.m37482g(getResources(), R.drawable.baseline_forum_96);
    public final C6257p[] f22286c = new C6257p[5];

    public C7023s1(Context context, C10930q6 q6Var) {
        super(context);
        this.f22282a = q6Var;
        C4336c cVar = new C4336c(this);
        this.f22278T = cVar;
        cVar.m28243h(true);
        long[] M = q6Var.m2946A4().m1425M();
        int I = q6Var.m2946A4().m1429I();
        if (M != null) {
            m18074j(M, I, false);
        }
        this.f22273O = C1363c0.m37448Z(C4403w.m27869i1(R.string.NoChatsText), 0);
        q6Var.m2946A4().m1373t(this);
    }

    public static long m18082b(long[] jArr, boolean z) {
        return (z ? f22268e0 : 0L) + ((jArr.length - 1) * f22269f0) + f22270g0;
    }

    private void setCounter(String str) {
        this.f22281W = str;
        this.f22285b0 = C7389v0.m16680T1(str, C1410y.m37071G0(17.0f, false, true));
    }

    private void setJoinedTextImpl(int i) {
        this.f22276R = this.f22274P != null ? new StaticLayout(this.f22274P, C1410y.m37036h0(), i, Layout.Alignment.ALIGN_CENTER, 1.0f, C1357a0.m37541i(2.0f), false) : null;
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return C4335b.m28258d(this, f, f2);
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        C1357a0.m37541i(18.0f);
        if (!(this.f22280V == null || this.f22272N == 0.0f)) {
            int i = C1357a0.m37541i(18.0f);
            int i2 = C1357a0.m37541i(6.0f);
            int length = this.f22280V.length;
            int i3 = i * 2;
            int i4 = (C1357a0.m37541i(92.0f) / 2) + C1357a0.m37541i(16.0f);
            int measuredWidth = ((getMeasuredWidth() / 2) - (((i3 * length) + ((length - 1) * i2)) / 2)) + i;
            int i5 = length - (this.f22281W != null ? 1 : 0);
            for (int i6 = 0; i6 < i5; i6++) {
                C4574a[] aVarArr = this.f22280V;
                if (aVarArr[i6] != null) {
                    long j = aVarArr[i6].f15020b;
                    if (f < measuredWidth - i || f > measuredWidth + i || f2 < i4 - i || f2 > i4 + i) {
                        measuredWidth += i3 + i2;
                    } else {
                        this.f22282a.m2485dd().m3439u7(AbstractC9323v4.m9183q9(this), j, null);
                        C2065g.m35719c(this);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28254h(this, view, f, f2);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28261a(this);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            this.f22272N = f;
            invalidate();
        }
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28259c(this, f, f2);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        C6257p[] pVarArr;
        if (i == 0 && f == 0.0f) {
            for (C6257p pVar : this.f22286c) {
                if (pVar != null) {
                    pVar.m20819G(null);
                }
            }
            this.f22279U = null;
        }
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28256f(this, view, f, f2);
    }

    public void m18083a() {
        C6257p[] pVarArr;
        this.f22283a0 = true;
        for (C6257p pVar : this.f22286c) {
            if (pVar != null) {
                pVar.mo20245f();
            } else {
                return;
            }
        }
    }

    @Override
    public void mo4501a3() {
        if (this.f22271M != null) {
            this.f22271M = null;
        }
        C6257p[] pVarArr = this.f22286c;
        if (pVarArr != null) {
            int length = pVarArr.length;
            int i = 0;
            for (int i2 = 0; i2 < length && pVarArr[i2] != null; i2++) {
                this.f22286c[i].mo20249Z();
                i++;
            }
        }
        this.f22282a.m2946A4().m1396h0(this);
    }

    public final int m18081c() {
        int i = C1357a0.m37541i(92.0f);
        int i2 = C1357a0.m37541i(84.0f);
        StaticLayout staticLayout = this.f22275Q;
        int i3 = 0;
        int height = staticLayout != null ? staticLayout.getHeight() + C1357a0.m37541i(26.0f) : 0;
        StaticLayout staticLayout2 = this.f22276R;
        if (staticLayout2 != null) {
            i3 = staticLayout2.getHeight() + C1357a0.m37541i(36.0f);
        }
        return i + Math.max(i2, Math.max(height, i3));
    }

    public void m18080d() {
        C6257p[] pVarArr;
        this.f22283a0 = false;
        for (C6257p pVar : this.f22286c) {
            if (pVar != null) {
                pVar.mo20247b();
            } else {
                return;
            }
        }
    }

    public final void m18079e(Canvas canvas, C4574a aVar, int i, int i2, float f) {
        float f2 = i;
        canvas.drawCircle(f2, i2, C1357a0.m37541i(18.0f), C1410y.m37039g(C5064d.m24131a(f, C11524j.m228N(aVar.f15022d))));
        TextPaint G0 = C1410y.m37071G0(15.0f, aVar.f15023e.f17712b, false);
        G0.setAlpha((int) (f * 255.0f));
        canvas.drawText(aVar.f15023e.f17711a, f2 - (aVar.f15024f / 2.0f), i2 + C1357a0.m37541i(5.5f), G0);
        G0.setAlpha(255);
    }

    public final void m18078f() {
        long[] jArr = this.f22279U;
        if (jArr != null) {
            int length = jArr.length - (this.f22281W != null ? 1 : 0);
            for (int i = 0; i < length; i++) {
                C4574a aVar = this.f22280V[i];
                C6257p[] pVarArr = this.f22286c;
                C6257p pVar = pVarArr[i];
                if (aVar != null && aVar.f15021c != null) {
                    if (pVar == null) {
                        pVar = m18076h();
                        pVarArr[i] = pVar;
                    }
                    pVar.m20819G(aVar.f15021c);
                } else if (pVar != null) {
                    pVar.m20819G(null);
                }
            }
        }
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28257e(this, view, f, f2);
    }

    public final void m18077g(int i) {
        StaticLayout staticLayout = null;
        if (i > 0) {
            if (this.f22273O != null) {
                staticLayout = new StaticLayout(this.f22273O, C1410y.m37036h0(), i, Layout.Alignment.ALIGN_CENTER, 1.0f, C1357a0.m37541i(2.0f), false);
            }
            this.f22275Q = staticLayout;
            setJoinedTextImpl(i);
            return;
        }
        this.f22276R = null;
        this.f22275Q = null;
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28260b(this);
    }

    public final C6257p m18076h() {
        C6257p pVar = new C6257p(this, C1357a0.m37541i(18.0f));
        if (!this.f22283a0) {
            pVar.mo20247b();
        }
        return pVar;
    }

    public void m18075i(long[] jArr, int i, boolean z) {
        C2760nb nbVar;
        m18074j(jArr, i, z && getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (nbVar = this.f22288d0) != null && nbVar.m9339Ta());
    }

    public final void m18074j(long[] jArr, int i, boolean z) {
        String str = i > 5 ? "+" + ((i - jArr.length) + 1) : null;
        if (jArr != null && jArr.length == 0) {
            jArr = null;
        }
        if (this.f22287c0 != (jArr != null) || !Arrays.equals(this.f22279U, jArr)) {
            if (jArr == null) {
                this.f22287c0 = false;
                this.f22284b.m29528y(m18082b(this.f22279U, true));
                if (z) {
                    this.f22284b.m29544i(0.0f);
                    return;
                }
                this.f22284b.m29541l(0.0f);
                this.f22272N = 0.0f;
                invalidate();
                return;
            }
            long b = m18082b(jArr, true);
            this.f22279U = jArr;
            C4574a[] aVarArr = this.f22280V;
            if (aVarArr == null || aVarArr.length != jArr.length) {
                this.f22280V = new C4574a[jArr.length];
            }
            int i2 = 0;
            for (long j : jArr) {
                this.f22280V[i2] = new C4574a(this.f22282a, j);
                i2++;
            }
            setCounter(str);
            m18078f();
            this.f22287c0 = true;
            this.f22284b.m29528y(b);
            if (z) {
                if (this.f22272N != 0.0f) {
                    float f = (float) (f22268e0 / b);
                    this.f22284b.m29541l(f);
                    this.f22272N = f;
                    invalidate();
                }
                this.f22284b.m29544i(1.0f);
                return;
            }
            this.f22284b.m29541l(1.0f);
            this.f22272N = 1.0f;
            invalidate();
        } else if (!C5070i.m24067c(this.f22281W, str)) {
            setCounter(str);
            invalidate();
        }
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return this.f22280V != null && this.f22272N > 0.0f;
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28255g(this, view, f, f2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C6257p pVar;
        C6257p pVar2;
        Drawable drawable;
        Drawable drawable2;
        if (this.f22271M != null) {
            int measuredWidth = getMeasuredWidth();
            int i7 = measuredWidth / 2;
            int i8 = C1357a0.m37541i(92.0f) / 2;
            int i9 = C1357a0.m37541i(16.0f);
            float f = 1.0f;
            if (this.f22272N < 0.5f) {
                if (this.f22275Q != null) {
                    canvas.save();
                    canvas.translate(C1357a0.m37541i(12.0f), i + C1357a0.m37541i(14.0f));
                    C1410y.m37034i0(C5064d.m24131a(1.0f - (this.f22272N / 0.5f), C11524j.m215T0()));
                    this.f22275Q.draw(canvas);
                    canvas.restore();
                }
            } else if (this.f22276R != null) {
                canvas.save();
                canvas.translate(C1357a0.m37541i(12.0f), i + C1357a0.m37541i(20.0f));
                C1410y.m37034i0(C5064d.m24131a((this.f22272N - 0.5f) / 0.5f, C11524j.m215T0()));
                this.f22276R.draw(canvas);
                canvas.restore();
            }
            if (this.f22272N == 0.0f) {
                C1362c.m37487b(canvas, this.f22271M, i7 - (drawable2.getMinimumWidth() / 2), i8 - (this.f22271M.getMinimumHeight() / 2), C1410y.m37035i());
                return;
            }
            long n = this.f22272N * ((float) this.f22284b.m29539n());
            long j = f22268e0;
            float f2 = 0.4f;
            boolean z = true;
            boolean z2 = false;
            if (n < j) {
                float f3 = 1.0f - (((float) n) / ((float) j));
                Paint i10 = C1410y.m37035i();
                if (f3 == 1.0f) {
                    z = false;
                }
                if (z) {
                    i10.setAlpha((int) (255.0f * f3));
                    canvas.save();
                    float f4 = (f3 * 0.4f) + 0.6f;
                    canvas.scale(f4, f4, i7, i9 + i8);
                }
                C1362c.m37487b(canvas, this.f22271M, i7 - (drawable.getMinimumWidth() / 2), i8 - (this.f22271M.getMinimumHeight() / 2), i10);
                if (z) {
                    canvas.restore();
                    i10.setAlpha(255);
                }
            } else if (this.f22280V != null) {
                int i11 = i8 + i9;
                int i12 = C1357a0.m37541i(18.0f);
                int i13 = C1357a0.m37541i(6.0f);
                C4574a[] aVarArr = this.f22280V;
                int length = aVarArr.length;
                int i14 = i12 * 2;
                int i15 = (i7 - (((i14 * length) + ((length - 1) * i13)) / 2)) + i12;
                int length2 = aVarArr.length;
                int i16 = 0;
                int i17 = 0;
                while (i16 < length2) {
                    C4574a aVar = aVarArr[i16];
                    long j2 = f22268e0 + (f22269f0 * i17);
                    if (n >= j2) {
                        long j3 = f22270g0;
                        int i18 = length2;
                        aVarArr = aVarArr;
                        float f5 = n < j2 + j3 ? ((float) (n - j2)) / ((float) j3) : 1.0f;
                        float f6 = (f5 * f2) + 0.6f;
                        int i19 = (f5 > f ? 1 : (f5 == f ? 0 : -1));
                        if (i19 < 0) {
                            canvas.save();
                            canvas.scale(f6, f6, i15, i11);
                        }
                        if (i17 == 4 && this.f22281W != null) {
                            float f7 = i15;
                            float f8 = i11;
                            canvas.drawCircle(f7, f8, i12, C1410y.m37039g(C5064d.m24131a(f5, C11524j.m228N(R.id.theme_color_avatarSavedMessages))));
                            TextPaint G0 = C1410y.m37071G0(17.0f, z2, z2);
                            G0.setAlpha((int) (f5 * 255.0f));
                            int i20 = C1357a0.m37541i(3.0f);
                            float f9 = this.f22285b0;
                            float f10 = i14 - i20;
                            float f11 = f9 > f10 ? f10 / f9 : 1.0f;
                            int i21 = (f11 > f ? 1 : (f11 == f ? 0 : -1));
                            if (i21 != 0) {
                                canvas.save();
                                canvas.scale(f11, f11, f7, f8);
                            }
                            canvas.drawText(this.f22281W, f7 - (this.f22285b0 / 2.0f), C1357a0.m37541i(7.0f) + i11, G0);
                            if (i21 != 0) {
                                canvas.restore();
                            }
                            G0.setAlpha(255);
                            i5 = i16;
                            i3 = i15;
                            i6 = i12;
                            i4 = i11;
                            i2 = i18;
                        } else if (aVar.f15021c == null) {
                            i5 = i16;
                            int i22 = i15;
                            i2 = i18;
                            i6 = i12;
                            i4 = i11;
                            m18079e(canvas, aVar, i22, i11, f5);
                            i3 = i22;
                        } else {
                            i5 = i16;
                            i6 = i12;
                            i4 = i11;
                            i2 = i18;
                            int i23 = i15;
                            C6257p pVar3 = this.f22286c[i17];
                            pVar3.mo20256K0(i23 - i6, i4 - i6, i23 + i6, i4 + i6);
                            if (!pVar3.mo20246c0()) {
                                i3 = i23;
                                pVar = pVar3;
                            } else if (aVar.f15023e == null || C4779t2.m25598T2(aVar.f15021c.m20910k())) {
                                i3 = i23;
                                pVar = pVar3;
                                Paint U = C1410y.m37057U();
                                int alpha = U.getAlpha();
                                if (i19 < 0) {
                                    U.setAlpha((int) (alpha * f5));
                                }
                                canvas.drawCircle(i3, i4, i6, U);
                                if (i19 < 0) {
                                    U.setAlpha(alpha);
                                }
                            } else {
                                i3 = i23;
                                pVar = pVar3;
                                m18079e(canvas, aVar, i23, i4, f5);
                            }
                            if (i19 < 0) {
                                pVar2 = pVar;
                                pVar2.mo20250U(pVar.getAlpha() * f5);
                            } else {
                                pVar2 = pVar;
                            }
                            pVar2.draw(canvas);
                            if (i19 < 0) {
                                pVar2.mo20253P();
                            }
                        }
                        if (i19 < 0) {
                            canvas.restore();
                        }
                        i15 = i3 + i14 + i13;
                        i17++;
                        i16 = i5 + 1;
                        i12 = i6;
                        i11 = i4;
                        length2 = i2;
                        f = 1.0f;
                        f2 = 0.4f;
                        z2 = false;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int max = Math.max(0, View.MeasureSpec.getSize(i) - (C1357a0.m37541i(12.0f) * 2));
        if (this.f22277S != max) {
            this.f22277S = max;
            m18077g(max);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(m18081c(), Log.TAG_TDLIB_OPTIONS));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f22272N > 0.0f && this.f22278T.m28246e(this, motionEvent);
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28253i(this, view, f, f2);
    }

    public void setJoinedText(CharSequence charSequence) {
        CharSequence charSequence2 = this.f22274P;
        if ((charSequence2 == null && charSequence != null) || charSequence2 == null || charSequence2.equals(charSequence)) {
            this.f22274P = charSequence;
            int i = this.f22277S;
            if (i > 0) {
                setJoinedTextImpl(i);
                if (getMeasuredHeight() != m18081c()) {
                    requestLayout();
                }
                invalidate();
            }
        }
    }

    public void setParent(C2760nb nbVar) {
        this.f22288d0 = nbVar;
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        return C4335b.m28251k(this, view, f, f2);
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28252j(this, view, motionEvent, f, f2, f3, f4);
    }
}
