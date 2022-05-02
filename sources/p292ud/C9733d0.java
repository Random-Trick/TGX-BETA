package p292ud;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import be.C1357a0;
import be.C1410y;
import nc.C7389v0;
import p037cb.C2057b;
import p108hb.C5064d;
import p364zd.C11524j;

public class C9733d0 extends View {
    public static int f31655R;
    public static int f31656S;
    public static int f31657T;
    public static int f31658U;
    public static float f31659V;
    public long f31660M;
    public long f31661N;
    public AbstractC9735b f31662O;
    public C9734a[] f31663P;
    public float[] f31664Q;
    public int f31665a = 255;
    public float f31666b = 1.0f;
    public ValueAnimator f31667c;

    public interface AbstractC9735b {
        void mo7204a();
    }

    public C9733d0(Context context) {
        super(context);
        if (f31655R == 0) {
            m7329g();
        }
        setAlpha(0.0f);
        m7331e();
        setLayoutParams(new ViewGroup.LayoutParams(m7321o(), C1357a0.m37544i(49.0f)));
    }

    public static void m7329g() {
        f31655R = C1357a0.m37544i(5.0f) - 1;
        f31656S = C1357a0.m37544i(66.0f);
        f31657T = C1357a0.m37544i(5.0f);
        f31658U = C1357a0.m37544i(5.0f);
        f31659V = C1357a0.m37544i(17.0f);
    }

    public void m7328h(TimeAnimator timeAnimator, long j, long j2) {
        long j3 = this.f31660M + j2;
        this.f31660M = j3;
        if (j3 >= 15) {
            this.f31660M = 0L;
            if (m7326j(j)) {
                invalidate();
                AbstractC9735b bVar = this.f31662O;
                if (bVar != null) {
                    bVar.mo7204a();
                }
            }
        }
    }

    public void m7327i(ValueAnimator valueAnimator) {
        long uptimeMillis = SystemClock.uptimeMillis() - this.f31661N;
        long j = this.f31660M;
        if (j == 0 || uptimeMillis - j >= 15) {
            this.f31660M = uptimeMillis;
            if (m7326j(uptimeMillis)) {
                invalidate();
                AbstractC9735b bVar = this.f31662O;
                if (bVar != null) {
                    bVar.mo7204a();
                }
            }
        }
    }

    public static void m7324l() {
        if (f31655R != 0) {
            m7329g();
        }
    }

    public static int m7321o() {
        if (f31655R == 0) {
            m7329g();
        }
        int i = f31656S;
        int i2 = f31655R;
        return i + i2 + i2;
    }

    public final void m7331e() {
        TextPaint b0 = C1410y.m37051b0(15.0f);
        if (this.f31664Q == null) {
            this.f31664Q = new float[10];
            int i = 0;
            while (true) {
                float[] fArr = this.f31664Q;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = C7389v0.m16680T1(String.valueOf(i), b0);
                i++;
            }
        }
        C9734a[] aVarArr = new C9734a[7];
        this.f31663P = aVarArr;
        aVarArr[0] = new C9734a(0);
        C9734a[] aVarArr2 = this.f31663P;
        aVarArr2[0].f31672e = true;
        aVarArr2[1] = new C9734a(0);
        this.f31663P[2] = new C9734a(":");
        this.f31663P[3] = new C9734a(0);
        this.f31663P[4] = new C9734a(0);
        this.f31663P[5] = new C9734a(",");
        this.f31663P[6] = new C9734a(0);
    }

    public void m7330f(Canvas canvas, float f) {
        C9734a[] aVarArr;
        canvas.drawCircle(f31656S, f, f31655R, C1410y.m37042g(C5064d.m24132a((this.f31665a / 255.0f) * this.f31666b, -50378)));
        float f2 = f31657T;
        float f3 = f + f31658U;
        for (C9734a aVar : this.f31663P) {
            aVar.m7320a(canvas, f2, f3, this.f31665a);
            f2 += aVar.f31673f;
        }
    }

    public final boolean m7326j(long j) {
        boolean c = this.f31663P[6].m7318c(((int) (j % 1000)) / 100);
        int i = (int) (j % 10000);
        float f = (i % 1000) / 1000.0f;
        float interpolation = f >= 0.125f ? 1.0f : C2057b.f7280b.getInterpolation(f / 0.125f);
        int i2 = i / 1000;
        if (this.f31663P[4].m7317d(i2, i2 == 9 ? 0 : i2 + 1, interpolation)) {
            c = true;
        }
        int i3 = (int) (j / 1000);
        int i4 = i3 + 1;
        if (this.f31663P[3].m7317d((i3 % 60) / 10, (i4 % 60) / 10, interpolation)) {
            c = true;
        }
        int i5 = i3 / 60;
        int i6 = i4 / 60;
        if (this.f31663P[1].m7317d(i5 % 10, i6 % 10, interpolation)) {
            c = true;
        }
        if (this.f31663P[0].m7317d(i5 / 10, i6 / 10, interpolation)) {
            c = true;
        }
        float interpolation2 = f <= 0.5f ? 1.0f - C2057b.f7280b.getInterpolation(f / 0.5f) : C2057b.f7280b.getInterpolation((f - 0.5f) / 0.5f);
        float f2 = this.f31666b;
        if (!(f2 == interpolation2 || ((int) (f2 * 255.0f)) == ((int) (255.0f * interpolation2)))) {
            this.f31666b = interpolation2;
            c = true;
        }
        return c;
    }

    public void m7325k() {
        this.f31666b = 1.0f;
        this.f31663P[0].m7319b(0);
        this.f31663P[1].m7319b(0);
        this.f31663P[3].m7319b(0);
        this.f31663P[4].m7319b(0);
        this.f31663P[6].m7319b(0);
        invalidate();
    }

    public void m7323m(long j) {
        if (this.f31667c == null) {
            if (Build.VERSION.SDK_INT >= 16) {
                TimeAnimator timeAnimator = new TimeAnimator();
                timeAnimator.setTimeListener(new TimeAnimator.TimeListener() {
                    @Override
                    public final void onTimeUpdate(TimeAnimator timeAnimator2, long j2, long j3) {
                        C9733d0.this.m7328h(timeAnimator2, j2, j3);
                    }
                });
                this.f31667c = timeAnimator;
            } else {
                ValueAnimator b = C2057b.m35737b();
                this.f31667c = b;
                b.setDuration(1000L);
                this.f31667c.setInterpolator(C2057b.f7283e);
                this.f31667c.setRepeatCount(-1);
                this.f31667c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C9733d0.this.m7327i(valueAnimator);
                    }
                });
            }
        }
        this.f31660M = 0L;
        this.f31661N = j;
        this.f31667c.start();
    }

    public void m7322n() {
        ValueAnimator valueAnimator = this.f31667c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f31660M = 0L;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        m7330f(canvas, getMeasuredHeight() / 2);
    }

    public void setTimerCallback(AbstractC9735b bVar) {
        this.f31662O = bVar;
    }

    public class C9734a {
        public int f31668a;
        public int f31669b;
        public String f31670c;
        public String f31671d;
        public boolean f31672e;
        public float f31673f;
        public float f31674g;

        public C9734a(int i) {
            this.f31668a = -1;
            this.f31669b = -1;
            m7319b(i);
        }

        public void m7320a(Canvas canvas, float f, float f2, int i) {
            TextPaint c0 = C1410y.m37049c0(15.0f, C5064d.m24131b(i, C11524j.m217S0()));
            if (this.f31674g != 0.0f && this.f31669b != this.f31668a) {
                float f3 = C9733d0.f31659V;
                float f4 = this.f31674g;
                float f5 = f3 * f4;
                if (f4 != 1.0f && (this.f31669b != 0 || !this.f31672e)) {
                    c0.setAlpha((int) (i * (1.0f - f4)));
                    canvas.drawText(this.f31671d, f, f2 + f5, c0);
                }
                if (this.f31670c != null) {
                    c0.setAlpha((int) (i * this.f31674g));
                    canvas.drawText(this.f31670c, f, (f2 - C9733d0.f31659V) + f5, c0);
                }
            } else if (this.f31669b != 0 || !this.f31672e) {
                canvas.drawText(this.f31671d, f, f2, c0);
            }
        }

        public void m7319b(int i) {
            this.f31669b = i;
            this.f31671d = String.valueOf(i);
            this.f31673f = C9733d0.this.f31664Q[i];
            this.f31674g = 0.0f;
            this.f31668a = -1;
            this.f31670c = null;
        }

        public boolean m7318c(int i) {
            if (this.f31669b == i) {
                return false;
            }
            this.f31669b = i;
            this.f31671d = String.valueOf(i);
            this.f31673f = C9733d0.this.f31664Q[i];
            return true;
        }

        public boolean m7317d(int i, int i2, float f) {
            boolean z;
            if (this.f31669b != i) {
                this.f31669b = i;
                this.f31671d = String.valueOf(i);
                z = true;
            } else {
                z = false;
            }
            if (this.f31668a != i2) {
                this.f31668a = i2;
                this.f31670c = String.valueOf(i2);
                z = true;
            }
            if (this.f31674g != f) {
                this.f31674g = f;
                z = true;
            }
            return z;
        }

        public C9734a(String str) {
            this.f31668a = -1;
            this.f31669b = -1;
            this.f31669b = -1;
            this.f31671d = str;
            this.f31673f = C7389v0.m16680T1(str, C1410y.m37051b0(15.0f));
        }
    }
}
