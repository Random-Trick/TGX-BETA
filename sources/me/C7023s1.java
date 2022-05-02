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
    public static long f22271e0 = 120;
    public static long f22272f0 = 28;
    public static long f22273g0 = 120;
    public float f22275N;
    public CharSequence f22276O;
    public CharSequence f22277P;
    public StaticLayout f22278Q;
    public StaticLayout f22279R;
    public int f22280S;
    public final C4336c f22281T;
    public long[] f22282U;
    public C4574a[] f22283V;
    public String f22284W;
    public final C10930q6 f22285a;
    public float f22288b0;
    public boolean f22290c0;
    public C2760nb f22291d0;
    public boolean f22286a0 = true;
    public final C3950k f22287b = new C3950k(0, this, C2057b.f7280b, f22271e0);
    public Drawable f22274M = C1362c.m37485g(getResources(), R.drawable.baseline_forum_96);
    public final C6257p[] f22289c = new C6257p[5];

    public C7023s1(Context context, C10930q6 q6Var) {
        super(context);
        this.f22285a = q6Var;
        C4336c cVar = new C4336c(this);
        this.f22281T = cVar;
        cVar.m28245h(true);
        long[] M = q6Var.m2946A4().m1425M();
        int I = q6Var.m2946A4().m1429I();
        if (M != null) {
            m18074j(M, I, false);
        }
        this.f22276O = C1363c0.m37451Z(C4403w.m27871i1(R.string.NoChatsText), 0);
        q6Var.m2946A4().m1373t(this);
    }

    public static long m18082b(long[] jArr, boolean z) {
        return (z ? f22271e0 : 0L) + ((jArr.length - 1) * f22272f0) + f22273g0;
    }

    private void setCounter(String str) {
        this.f22284W = str;
        this.f22288b0 = C7389v0.m16680T1(str, C1410y.m37074G0(17.0f, false, true));
    }

    private void setJoinedTextImpl(int i) {
        this.f22279R = this.f22277P != null ? new StaticLayout(this.f22277P, C1410y.m37039h0(), i, Layout.Alignment.ALIGN_CENTER, 1.0f, C1357a0.m37544i(2.0f), false) : null;
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return C4335b.m28260d(this, f, f2);
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        C1357a0.m37544i(18.0f);
        if (!(this.f22283V == null || this.f22275N == 0.0f)) {
            int i = C1357a0.m37544i(18.0f);
            int i2 = C1357a0.m37544i(6.0f);
            int length = this.f22283V.length;
            int i3 = i * 2;
            int i4 = (C1357a0.m37544i(92.0f) / 2) + C1357a0.m37544i(16.0f);
            int measuredWidth = ((getMeasuredWidth() / 2) - (((i3 * length) + ((length - 1) * i2)) / 2)) + i;
            int i5 = length - (this.f22284W != null ? 1 : 0);
            for (int i6 = 0; i6 < i5; i6++) {
                C4574a[] aVarArr = this.f22283V;
                if (aVarArr[i6] != null) {
                    long j = aVarArr[i6].f15020b;
                    if (f < measuredWidth - i || f > measuredWidth + i || f2 < i4 - i || f2 > i4 + i) {
                        measuredWidth += i3 + i2;
                    } else {
                        this.f22285a.m2485dd().m3439u7(AbstractC9323v4.m9183q9(this), j, null);
                        C2065g.m35722c(this);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28256h(this, view, f, f2);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28263a(this);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            this.f22275N = f;
            invalidate();
        }
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28261c(this, f, f2);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        C6257p[] pVarArr;
        if (i == 0 && f == 0.0f) {
            for (C6257p pVar : this.f22289c) {
                if (pVar != null) {
                    pVar.m20820G(null);
                }
            }
            this.f22282U = null;
        }
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28258f(this, view, f, f2);
    }

    public void m18083a() {
        C6257p[] pVarArr;
        this.f22286a0 = true;
        for (C6257p pVar : this.f22289c) {
            if (pVar != null) {
                pVar.mo20246f();
            } else {
                return;
            }
        }
    }

    @Override
    public void mo4501a3() {
        if (this.f22274M != null) {
            this.f22274M = null;
        }
        C6257p[] pVarArr = this.f22289c;
        if (pVarArr != null) {
            int length = pVarArr.length;
            int i = 0;
            for (int i2 = 0; i2 < length && pVarArr[i2] != null; i2++) {
                this.f22289c[i].mo20250Z();
                i++;
            }
        }
        this.f22285a.m2946A4().m1396h0(this);
    }

    public final int m18081c() {
        int i = C1357a0.m37544i(92.0f);
        int i2 = C1357a0.m37544i(84.0f);
        StaticLayout staticLayout = this.f22278Q;
        int i3 = 0;
        int height = staticLayout != null ? staticLayout.getHeight() + C1357a0.m37544i(26.0f) : 0;
        StaticLayout staticLayout2 = this.f22279R;
        if (staticLayout2 != null) {
            i3 = staticLayout2.getHeight() + C1357a0.m37544i(36.0f);
        }
        return i + Math.max(i2, Math.max(height, i3));
    }

    public void m18080d() {
        C6257p[] pVarArr;
        this.f22286a0 = false;
        for (C6257p pVar : this.f22289c) {
            if (pVar != null) {
                pVar.mo20248b();
            } else {
                return;
            }
        }
    }

    public final void m18079e(Canvas canvas, C4574a aVar, int i, int i2, float f) {
        float f2 = i;
        canvas.drawCircle(f2, i2, C1357a0.m37544i(18.0f), C1410y.m37042g(C5064d.m24132a(f, C11524j.m228N(aVar.f15022d))));
        TextPaint G0 = C1410y.m37074G0(15.0f, aVar.f15023e.f17712b, false);
        G0.setAlpha((int) (f * 255.0f));
        canvas.drawText(aVar.f15023e.f17711a, f2 - (aVar.f15024f / 2.0f), i2 + C1357a0.m37544i(5.5f), G0);
        G0.setAlpha(255);
    }

    public final void m18078f() {
        long[] jArr = this.f22282U;
        if (jArr != null) {
            int length = jArr.length - (this.f22284W != null ? 1 : 0);
            for (int i = 0; i < length; i++) {
                C4574a aVar = this.f22283V[i];
                C6257p[] pVarArr = this.f22289c;
                C6257p pVar = pVarArr[i];
                if (aVar != null && aVar.f15021c != null) {
                    if (pVar == null) {
                        pVar = m18076h();
                        pVarArr[i] = pVar;
                    }
                    pVar.m20820G(aVar.f15021c);
                } else if (pVar != null) {
                    pVar.m20820G(null);
                }
            }
        }
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28259e(this, view, f, f2);
    }

    public final void m18077g(int i) {
        StaticLayout staticLayout = null;
        if (i > 0) {
            if (this.f22276O != null) {
                staticLayout = new StaticLayout(this.f22276O, C1410y.m37039h0(), i, Layout.Alignment.ALIGN_CENTER, 1.0f, C1357a0.m37544i(2.0f), false);
            }
            this.f22278Q = staticLayout;
            setJoinedTextImpl(i);
            return;
        }
        this.f22279R = null;
        this.f22278Q = null;
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28262b(this);
    }

    public final C6257p m18076h() {
        C6257p pVar = new C6257p(this, C1357a0.m37544i(18.0f));
        if (!this.f22286a0) {
            pVar.mo20248b();
        }
        return pVar;
    }

    public void m18075i(long[] jArr, int i, boolean z) {
        C2760nb nbVar;
        m18074j(jArr, i, z && getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (nbVar = this.f22291d0) != null && nbVar.m9339Ta());
    }

    public final void m18074j(long[] jArr, int i, boolean z) {
        String str = i > 5 ? "+" + ((i - jArr.length) + 1) : null;
        if (jArr != null && jArr.length == 0) {
            jArr = null;
        }
        if (this.f22290c0 != (jArr != null) || !Arrays.equals(this.f22282U, jArr)) {
            if (jArr == null) {
                this.f22290c0 = false;
                this.f22287b.m29530y(m18082b(this.f22282U, true));
                if (z) {
                    this.f22287b.m29546i(0.0f);
                    return;
                }
                this.f22287b.m29543l(0.0f);
                this.f22275N = 0.0f;
                invalidate();
                return;
            }
            long b = m18082b(jArr, true);
            this.f22282U = jArr;
            C4574a[] aVarArr = this.f22283V;
            if (aVarArr == null || aVarArr.length != jArr.length) {
                this.f22283V = new C4574a[jArr.length];
            }
            int i2 = 0;
            for (long j : jArr) {
                this.f22283V[i2] = new C4574a(this.f22285a, j);
                i2++;
            }
            setCounter(str);
            m18078f();
            this.f22290c0 = true;
            this.f22287b.m29530y(b);
            if (z) {
                if (this.f22275N != 0.0f) {
                    float f = (float) (f22271e0 / b);
                    this.f22287b.m29543l(f);
                    this.f22275N = f;
                    invalidate();
                }
                this.f22287b.m29546i(1.0f);
                return;
            }
            this.f22287b.m29543l(1.0f);
            this.f22275N = 1.0f;
            invalidate();
        } else if (!C5070i.m24068c(this.f22284W, str)) {
            setCounter(str);
            invalidate();
        }
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return this.f22283V != null && this.f22275N > 0.0f;
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28257g(this, view, f, f2);
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
        if (this.f22274M != null) {
            int measuredWidth = getMeasuredWidth();
            int i7 = measuredWidth / 2;
            int i8 = C1357a0.m37544i(92.0f) / 2;
            int i9 = C1357a0.m37544i(16.0f);
            float f = 1.0f;
            if (this.f22275N < 0.5f) {
                if (this.f22278Q != null) {
                    canvas.save();
                    canvas.translate(C1357a0.m37544i(12.0f), i + C1357a0.m37544i(14.0f));
                    C1410y.m37037i0(C5064d.m24132a(1.0f - (this.f22275N / 0.5f), C11524j.m215T0()));
                    this.f22278Q.draw(canvas);
                    canvas.restore();
                }
            } else if (this.f22279R != null) {
                canvas.save();
                canvas.translate(C1357a0.m37544i(12.0f), i + C1357a0.m37544i(20.0f));
                C1410y.m37037i0(C5064d.m24132a((this.f22275N - 0.5f) / 0.5f, C11524j.m215T0()));
                this.f22279R.draw(canvas);
                canvas.restore();
            }
            if (this.f22275N == 0.0f) {
                C1362c.m37490b(canvas, this.f22274M, i7 - (drawable2.getMinimumWidth() / 2), i8 - (this.f22274M.getMinimumHeight() / 2), C1410y.m37038i());
                return;
            }
            long n = this.f22275N * ((float) this.f22287b.m29541n());
            long j = f22271e0;
            float f2 = 0.4f;
            boolean z = true;
            boolean z2 = false;
            if (n < j) {
                float f3 = 1.0f - (((float) n) / ((float) j));
                Paint i10 = C1410y.m37038i();
                if (f3 == 1.0f) {
                    z = false;
                }
                if (z) {
                    i10.setAlpha((int) (255.0f * f3));
                    canvas.save();
                    float f4 = (f3 * 0.4f) + 0.6f;
                    canvas.scale(f4, f4, i7, i9 + i8);
                }
                C1362c.m37490b(canvas, this.f22274M, i7 - (drawable.getMinimumWidth() / 2), i8 - (this.f22274M.getMinimumHeight() / 2), i10);
                if (z) {
                    canvas.restore();
                    i10.setAlpha(255);
                }
            } else if (this.f22283V != null) {
                int i11 = i8 + i9;
                int i12 = C1357a0.m37544i(18.0f);
                int i13 = C1357a0.m37544i(6.0f);
                C4574a[] aVarArr = this.f22283V;
                int length = aVarArr.length;
                int i14 = i12 * 2;
                int i15 = (i7 - (((i14 * length) + ((length - 1) * i13)) / 2)) + i12;
                int length2 = aVarArr.length;
                int i16 = 0;
                int i17 = 0;
                while (i16 < length2) {
                    C4574a aVar = aVarArr[i16];
                    long j2 = f22271e0 + (f22272f0 * i17);
                    if (n >= j2) {
                        long j3 = f22273g0;
                        int i18 = length2;
                        aVarArr = aVarArr;
                        float f5 = n < j2 + j3 ? ((float) (n - j2)) / ((float) j3) : 1.0f;
                        float f6 = (f5 * f2) + 0.6f;
                        int i19 = (f5 > f ? 1 : (f5 == f ? 0 : -1));
                        if (i19 < 0) {
                            canvas.save();
                            canvas.scale(f6, f6, i15, i11);
                        }
                        if (i17 == 4 && this.f22284W != null) {
                            float f7 = i15;
                            float f8 = i11;
                            canvas.drawCircle(f7, f8, i12, C1410y.m37042g(C5064d.m24132a(f5, C11524j.m228N(R.id.theme_color_avatarSavedMessages))));
                            TextPaint G0 = C1410y.m37074G0(17.0f, z2, z2);
                            G0.setAlpha((int) (f5 * 255.0f));
                            int i20 = C1357a0.m37544i(3.0f);
                            float f9 = this.f22288b0;
                            float f10 = i14 - i20;
                            float f11 = f9 > f10 ? f10 / f9 : 1.0f;
                            int i21 = (f11 > f ? 1 : (f11 == f ? 0 : -1));
                            if (i21 != 0) {
                                canvas.save();
                                canvas.scale(f11, f11, f7, f8);
                            }
                            canvas.drawText(this.f22284W, f7 - (this.f22288b0 / 2.0f), C1357a0.m37544i(7.0f) + i11, G0);
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
                            C6257p pVar3 = this.f22289c[i17];
                            pVar3.mo20257K0(i23 - i6, i4 - i6, i23 + i6, i4 + i6);
                            if (!pVar3.mo20247c0()) {
                                i3 = i23;
                                pVar = pVar3;
                            } else if (aVar.f15023e == null || C4779t2.m25599T2(aVar.f15021c.m20911k())) {
                                i3 = i23;
                                pVar = pVar3;
                                Paint U = C1410y.m37060U();
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
                                pVar2.mo20251U(pVar.getAlpha() * f5);
                            } else {
                                pVar2 = pVar;
                            }
                            pVar2.draw(canvas);
                            if (i19 < 0) {
                                pVar2.mo20254P();
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
        int max = Math.max(0, View.MeasureSpec.getSize(i) - (C1357a0.m37544i(12.0f) * 2));
        if (this.f22280S != max) {
            this.f22280S = max;
            m18077g(max);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(m18081c(), Log.TAG_TDLIB_OPTIONS));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f22275N > 0.0f && this.f22281T.m28248e(this, motionEvent);
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28255i(this, view, f, f2);
    }

    public void setJoinedText(CharSequence charSequence) {
        CharSequence charSequence2 = this.f22277P;
        if ((charSequence2 == null && charSequence != null) || charSequence2 == null || charSequence2.equals(charSequence)) {
            this.f22277P = charSequence;
            int i = this.f22280S;
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
        this.f22291d0 = nbVar;
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        return C4335b.m28253k(this, view, f, f2);
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28254j(this, view, motionEvent, f, f2, f3, f4);
    }
}
