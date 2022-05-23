package ne;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.c0;
import ce.y;
import db.b;
import db.g;
import de.nb;
import eb.k;
import gb.c;
import gd.w;
import hd.a;
import hd.t2;
import ib.d;
import ib.i;
import java.util.Arrays;
import kb.c;
import ld.p;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.o6;

public class s1 extends View implements c, k.b, c.a {
    public static long f18370e0 = 120;
    public static long f18371f0 = 28;
    public static long f18372g0 = 120;
    public float N;
    public CharSequence O;
    public CharSequence P;
    public StaticLayout Q;
    public StaticLayout R;
    public int S;
    public final gb.c T;
    public long[] U;
    public a[] V;
    public String W;
    public final o6 f18373a;
    public float f18376b0;
    public boolean f18378c0;
    public nb f18379d0;
    public boolean f18374a0 = true;
    public final k f18375b = new k(0, this, b.f7287b, f18370e0);
    public Drawable M = ce.c.g(getResources(), R.drawable.baseline_forum_96);
    public final p[] f18377c = new p[5];

    public s1(Context context, o6 o6Var) {
        super(context);
        this.f18373a = o6Var;
        gb.c cVar = new gb.c(this);
        this.T = cVar;
        cVar.h(true);
        long[] M = o6Var.E4().M();
        int I = o6Var.E4().I();
        if (M != null) {
            j(M, I, false);
        }
        this.O = c0.Z(w.i1(R.string.NoChatsText), 0);
        o6Var.E4().t(this);
    }

    public static long b(long[] jArr, boolean z10) {
        return (z10 ? f18370e0 : 0L) + ((jArr.length - 1) * f18371f0) + f18372g0;
    }

    private void setCounter(String str) {
        this.W = str;
        this.f18376b0 = v0.T1(str, y.F0(17.0f, false, true));
    }

    private void setJoinedTextImpl(int i10) {
        this.R = this.P != null ? new StaticLayout(this.P, y.h0(), i10, Layout.Alignment.ALIGN_CENTER, 1.0f, a0.i(2.0f), false) : null;
    }

    @Override
    public boolean B(float f10, float f11) {
        return gb.b.d(this, f10, f11);
    }

    @Override
    public void C(View view, float f10, float f11) {
        a0.i(18.0f);
        if (!(this.V == null || this.N == 0.0f)) {
            int i10 = a0.i(18.0f);
            int i11 = a0.i(6.0f);
            int length = this.V.length;
            int i12 = i10 * 2;
            int i13 = (a0.i(92.0f) / 2) + a0.i(16.0f);
            int measuredWidth = ((getMeasuredWidth() / 2) - (((i12 * length) + ((length - 1) * i11)) / 2)) + i10;
            int i14 = length - (this.W != null ? 1 : 0);
            for (int i15 = 0; i15 < i14; i15++) {
                a[] aVarArr = this.V;
                if (aVarArr[i15] != null) {
                    long j10 = aVarArr[i15].f12686b;
                    if (f10 < measuredWidth - i10 || f10 > measuredWidth + i10 || f11 < i13 - i10 || f11 > i13 + i10) {
                        measuredWidth += i12 + i11;
                    } else {
                        this.f18373a.hd().u7(v4.q9(this), j10, null);
                        g.c(this);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public boolean E4() {
        return gb.b.a(this);
    }

    @Override
    public void G(View view, float f10, float f11) {
        gb.b.h(this, view, f10, f11);
    }

    @Override
    public void Q2() {
        if (this.M != null) {
            this.M = null;
        }
        p[] pVarArr = this.f18377c;
        if (pVarArr != null) {
            int length = pVarArr.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length && pVarArr[i11] != null; i11++) {
                this.f18377c[i10].b0();
                i10++;
            }
        }
        this.f18373a.E4().h0(this);
    }

    @Override
    public void U2(View view, float f10, float f11) {
        gb.b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        gb.b.f(this, view, f10, f11);
    }

    @Override
    public boolean X6(float f10, float f11) {
        return gb.b.c(this, f10, f11);
    }

    public void a() {
        p[] pVarArr;
        this.f18374a0 = true;
        for (p pVar : this.f18377c) {
            if (pVar != null) {
                pVar.e();
            } else {
                return;
            }
        }
    }

    public final int c() {
        int i10 = a0.i(92.0f);
        int i11 = a0.i(84.0f);
        StaticLayout staticLayout = this.Q;
        int i12 = 0;
        int height = staticLayout != null ? staticLayout.getHeight() + a0.i(26.0f) : 0;
        StaticLayout staticLayout2 = this.R;
        if (staticLayout2 != null) {
            i12 = staticLayout2.getHeight() + a0.i(36.0f);
        }
        return i10 + Math.max(i11, Math.max(height, i12));
    }

    public void d() {
        p[] pVarArr;
        this.f18374a0 = false;
        for (p pVar : this.f18377c) {
            if (pVar != null) {
                pVar.b();
            } else {
                return;
            }
        }
    }

    public final void e(Canvas canvas, a aVar, int i10, int i11, float f10) {
        float f11 = i10;
        canvas.drawCircle(f11, i11, a0.i(18.0f), y.g(d.a(f10, j.L(aVar.f12688d))));
        TextPaint F0 = y.F0(15.0f, aVar.f12689e.f15364b, false);
        F0.setAlpha((int) (f10 * 255.0f));
        canvas.drawText(aVar.f12689e.f15363a, f11 - (aVar.f12690f / 2.0f), i11 + a0.i(5.5f), F0);
        F0.setAlpha(255);
    }

    public final void f() {
        long[] jArr = this.U;
        if (jArr != null) {
            int length = jArr.length - (this.W != null ? 1 : 0);
            for (int i10 = 0; i10 < length; i10++) {
                a aVar = this.V[i10];
                p[] pVarArr = this.f18377c;
                p pVar = pVarArr[i10];
                if (aVar != null && aVar.f12687c != null) {
                    if (pVar == null) {
                        pVar = h();
                        pVarArr[i10] = pVar;
                    }
                    pVar.G(aVar.f12687c);
                } else if (pVar != null) {
                    pVar.G(null);
                }
            }
        }
    }

    public final void g(int i10) {
        StaticLayout staticLayout = null;
        if (i10 > 0) {
            if (this.O != null) {
                staticLayout = new StaticLayout(this.O, y.h0(), i10, Layout.Alignment.ALIGN_CENTER, 1.0f, a0.i(2.0f), false);
            }
            this.Q = staticLayout;
            setJoinedTextImpl(i10);
            return;
        }
        this.R = null;
        this.Q = null;
    }

    @Override
    public long getLongPressDuration() {
        return gb.b.b(this);
    }

    public final p h() {
        p pVar = new p(this, a0.i(18.0f));
        if (!this.f18374a0) {
            pVar.b();
        }
        return pVar;
    }

    public void i(long[] jArr, int i10, boolean z10) {
        nb nbVar;
        j(jArr, i10, z10 && getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (nbVar = this.f18379d0) != null && nbVar.Ta());
    }

    public final void j(long[] jArr, int i10, boolean z10) {
        String str = i10 > 5 ? "+" + ((i10 - jArr.length) + 1) : null;
        if (jArr != null && jArr.length == 0) {
            jArr = null;
        }
        if (this.f18378c0 != (jArr != null) || !Arrays.equals(this.U, jArr)) {
            if (jArr == null) {
                this.f18378c0 = false;
                this.f18375b.y(b(this.U, true));
                if (z10) {
                    this.f18375b.i(0.0f);
                    return;
                }
                this.f18375b.l(0.0f);
                this.N = 0.0f;
                invalidate();
                return;
            }
            long b10 = b(jArr, true);
            this.U = jArr;
            a[] aVarArr = this.V;
            if (aVarArr == null || aVarArr.length != jArr.length) {
                this.V = new a[jArr.length];
            }
            int i11 = 0;
            for (long j10 : jArr) {
                this.V[i11] = new a(this.f18373a, j10);
                i11++;
            }
            setCounter(str);
            f();
            this.f18378c0 = true;
            this.f18375b.y(b10);
            if (z10) {
                if (this.N != 0.0f) {
                    float f10 = (float) (f18370e0 / b10);
                    this.f18375b.l(f10);
                    this.N = f10;
                    invalidate();
                }
                this.f18375b.i(1.0f);
                return;
            }
            this.f18375b.l(1.0f);
            this.N = 1.0f;
            invalidate();
        } else if (!i.c(this.W, str)) {
            setCounter(str);
            invalidate();
        }
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return this.V != null && this.N > 0.0f;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            this.N = f10;
            invalidate();
        }
    }

    @Override
    public void o(View view, float f10, float f11) {
        gb.b.i(this, view, f10, f11);
    }

    @Override
    public void o2(View view, float f10, float f11) {
        gb.b.g(this, view, f10, f11);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        p[] pVarArr;
        if (i10 == 0 && f10 == 0.0f) {
            for (p pVar : this.f18377c) {
                if (pVar != null) {
                    pVar.G(null);
                }
            }
            this.U = null;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        p pVar;
        p pVar2;
        Drawable drawable;
        Drawable drawable2;
        if (this.M != null) {
            int measuredWidth = getMeasuredWidth();
            int i15 = measuredWidth / 2;
            int i16 = a0.i(92.0f) / 2;
            int i17 = a0.i(16.0f);
            float f10 = 1.0f;
            if (this.N < 0.5f) {
                if (this.Q != null) {
                    canvas.save();
                    canvas.translate(a0.i(12.0f), i10 + a0.i(14.0f));
                    y.i0(d.a(1.0f - (this.N / 0.5f), j.Q0()));
                    this.Q.draw(canvas);
                    canvas.restore();
                }
            } else if (this.R != null) {
                canvas.save();
                canvas.translate(a0.i(12.0f), i10 + a0.i(20.0f));
                y.i0(d.a((this.N - 0.5f) / 0.5f, j.Q0()));
                this.R.draw(canvas);
                canvas.restore();
            }
            if (this.N == 0.0f) {
                ce.c.b(canvas, this.M, i15 - (drawable2.getMinimumWidth() / 2), i16 - (this.M.getMinimumHeight() / 2), y.i());
                return;
            }
            long n10 = this.N * ((float) this.f18375b.n());
            long j10 = f18370e0;
            float f11 = 0.4f;
            boolean z10 = true;
            boolean z11 = false;
            if (n10 < j10) {
                float f12 = 1.0f - (((float) n10) / ((float) j10));
                Paint i18 = y.i();
                if (f12 == 1.0f) {
                    z10 = false;
                }
                if (z10) {
                    i18.setAlpha((int) (255.0f * f12));
                    canvas.save();
                    float f13 = (f12 * 0.4f) + 0.6f;
                    canvas.scale(f13, f13, i15, i17 + i16);
                }
                ce.c.b(canvas, this.M, i15 - (drawable.getMinimumWidth() / 2), i16 - (this.M.getMinimumHeight() / 2), i18);
                if (z10) {
                    canvas.restore();
                    i18.setAlpha(255);
                }
            } else if (this.V != null) {
                int i19 = i16 + i17;
                int i20 = a0.i(18.0f);
                int i21 = a0.i(6.0f);
                a[] aVarArr = this.V;
                int length = aVarArr.length;
                int i22 = i20 * 2;
                int i23 = (i15 - (((i22 * length) + ((length - 1) * i21)) / 2)) + i20;
                int length2 = aVarArr.length;
                int i24 = 0;
                int i25 = 0;
                while (i24 < length2) {
                    a aVar = aVarArr[i24];
                    long j11 = f18370e0 + (f18371f0 * i25);
                    if (n10 >= j11) {
                        long j12 = f18372g0;
                        length2 = length2;
                        aVarArr = aVarArr;
                        float f14 = n10 < j11 + j12 ? ((float) (n10 - j11)) / ((float) j12) : 1.0f;
                        float f15 = (f14 * f11) + 0.6f;
                        int i26 = (f14 > f10 ? 1 : (f14 == f10 ? 0 : -1));
                        if (i26 < 0) {
                            canvas.save();
                            canvas.scale(f15, f15, i23, i19);
                        }
                        if (i25 == 4 && this.W != null) {
                            float f16 = i23;
                            float f17 = i19;
                            canvas.drawCircle(f16, f17, i20, y.g(d.a(f14, j.L(R.id.theme_color_avatarSavedMessages))));
                            TextPaint F0 = y.F0(17.0f, z11, z11);
                            F0.setAlpha((int) (f14 * 255.0f));
                            int i27 = a0.i(3.0f);
                            float f18 = this.f18376b0;
                            float f19 = i22 - i27;
                            float f20 = f18 > f19 ? f19 / f18 : 1.0f;
                            int i28 = (f20 > f10 ? 1 : (f20 == f10 ? 0 : -1));
                            if (i28 != 0) {
                                canvas.save();
                                canvas.scale(f20, f20, f16, f17);
                            }
                            canvas.drawText(this.W, f16 - (this.f18376b0 / 2.0f), a0.i(7.0f) + i19, F0);
                            if (i28 != 0) {
                                canvas.restore();
                            }
                            F0.setAlpha(255);
                            i13 = i24;
                            i11 = i23;
                            i14 = i20;
                            i12 = i19;
                        } else if (aVar.f12687c == null) {
                            i13 = i24;
                            int i29 = i23;
                            i14 = i20;
                            i12 = i19;
                            e(canvas, aVar, i29, i19, f14);
                            i11 = i29;
                        } else {
                            i13 = i24;
                            int i30 = i23;
                            i14 = i20;
                            i12 = i19;
                            p pVar3 = this.f18377c[i25];
                            pVar3.K0(i30 - i14, i12 - i14, i30 + i14, i12 + i14);
                            if (!pVar3.e0()) {
                                i11 = i30;
                                pVar = pVar3;
                            } else if (aVar.f12689e == null || t2.T2(aVar.f12687c.k())) {
                                i11 = i30;
                                pVar = pVar3;
                                Paint U = y.U();
                                int alpha = U.getAlpha();
                                if (i26 < 0) {
                                    U.setAlpha((int) (alpha * f14));
                                }
                                canvas.drawCircle(i11, i12, i14, U);
                                if (i26 < 0) {
                                    U.setAlpha(alpha);
                                }
                            } else {
                                i11 = i30;
                                pVar = pVar3;
                                e(canvas, aVar, i30, i12, f14);
                            }
                            if (i26 < 0) {
                                pVar2 = pVar;
                                pVar2.V(pVar.getAlpha() * f14);
                            } else {
                                pVar2 = pVar;
                            }
                            pVar2.draw(canvas);
                            if (i26 < 0) {
                                pVar2.Q();
                            }
                        }
                        if (i26 < 0) {
                            canvas.restore();
                        }
                        i23 = i11 + i22 + i21;
                        i25++;
                        i24 = i13 + 1;
                        i20 = i14;
                        i19 = i12;
                        f10 = 1.0f;
                        f11 = 0.4f;
                        z11 = false;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int max = Math.max(0, View.MeasureSpec.getSize(i10) - (a0.i(12.0f) * 2));
        if (this.S != max) {
            this.S = max;
            g(max);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(c(), Log.TAG_TDLIB_OPTIONS));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.N > 0.0f && this.T.e(this, motionEvent);
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        return gb.b.k(this, view, f10, f11);
    }

    public void setJoinedText(CharSequence charSequence) {
        CharSequence charSequence2 = this.P;
        if ((charSequence2 == null && charSequence != null) || charSequence2 == null || charSequence2.equals(charSequence)) {
            this.P = charSequence;
            int i10 = this.S;
            if (i10 > 0) {
                setJoinedTextImpl(i10);
                if (getMeasuredHeight() != c()) {
                    requestLayout();
                }
                invalidate();
            }
        }
    }

    public void setParent(nb nbVar) {
        this.f18379d0 = nbVar;
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        gb.b.j(this, view, motionEvent, f10, f11, f12, f13);
    }
}
