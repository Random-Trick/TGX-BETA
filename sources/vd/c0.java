package vd;

import ae.j;
import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import ce.a0;
import ce.y;
import ib.d;
import oc.v0;

public class c0 extends View {
    public static int R;
    public static int S;
    public static int T;
    public static int U;
    public static float V;
    public long M;
    public long N;
    public b O;
    public a[] P;
    public float[] Q;
    public int f25429a = 255;
    public float f25430b = 1.0f;
    public ValueAnimator f25431c;

    public interface b {
        void a();
    }

    public c0(Context context) {
        super(context);
        if (R == 0) {
            f();
        }
        setAlpha(0.0f);
        d();
        setLayoutParams(new ViewGroup.LayoutParams(m(), a0.i(49.0f)));
    }

    public static void f() {
        R = a0.i(5.0f) - 1;
        S = a0.i(66.0f);
        T = a0.i(5.0f);
        U = a0.i(5.0f);
        V = a0.i(17.0f);
    }

    public void g(TimeAnimator timeAnimator, long j10, long j11) {
        long j12 = this.M + j11;
        this.M = j12;
        if (j12 >= 15) {
            this.M = 0L;
            if (h(j10)) {
                invalidate();
                b bVar = this.O;
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public static void j() {
        if (R != 0) {
            f();
        }
    }

    public static int m() {
        if (R == 0) {
            f();
        }
        int i10 = S;
        int i11 = R;
        return i10 + i11 + i11;
    }

    public final void d() {
        TextPaint b02 = y.b0(15.0f);
        if (this.Q == null) {
            this.Q = new float[10];
            int i10 = 0;
            while (true) {
                float[] fArr = this.Q;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = v0.T1(String.valueOf(i10), b02);
                i10++;
            }
        }
        a[] aVarArr = new a[7];
        this.P = aVarArr;
        aVarArr[0] = new a(0);
        a[] aVarArr2 = this.P;
        aVarArr2[0].f25436e = true;
        aVarArr2[1] = new a(0);
        this.P[2] = new a(":");
        this.P[3] = new a(0);
        this.P[4] = new a(0);
        this.P[5] = new a(",");
        this.P[6] = new a(0);
    }

    public void e(Canvas canvas, float f10) {
        a[] aVarArr;
        canvas.drawCircle(S, f10, R, y.g(d.a((this.f25429a / 255.0f) * this.f25430b, -50378)));
        float f11 = T;
        float f12 = f10 + U;
        for (a aVar : this.P) {
            aVar.a(canvas, f11, f12, this.f25429a);
            f11 += aVar.f25437f;
        }
    }

    public final boolean h(long j10) {
        boolean c10 = this.P[6].c(((int) (j10 % 1000)) / 100);
        int i10 = (int) (j10 % 10000);
        float f10 = (i10 % 1000) / 1000.0f;
        float interpolation = f10 >= 0.125f ? 1.0f : db.b.f7287b.getInterpolation(f10 / 0.125f);
        int i11 = i10 / 1000;
        if (this.P[4].d(i11, i11 == 9 ? 0 : i11 + 1, interpolation)) {
            c10 = true;
        }
        int i12 = (int) (j10 / 1000);
        int i13 = i12 + 1;
        if (this.P[3].d((i12 % 60) / 10, (i13 % 60) / 10, interpolation)) {
            c10 = true;
        }
        int i14 = i12 / 60;
        int i15 = i13 / 60;
        if (this.P[1].d(i14 % 10, i15 % 10, interpolation)) {
            c10 = true;
        }
        if (this.P[0].d(i14 / 10, i15 / 10, interpolation)) {
            c10 = true;
        }
        float interpolation2 = f10 <= 0.5f ? 1.0f - db.b.f7287b.getInterpolation(f10 / 0.5f) : db.b.f7287b.getInterpolation((f10 - 0.5f) / 0.5f);
        float f11 = this.f25430b;
        if (!(f11 == interpolation2 || ((int) (f11 * 255.0f)) == ((int) (255.0f * interpolation2)))) {
            this.f25430b = interpolation2;
            c10 = true;
        }
        return c10;
    }

    public void i() {
        this.f25430b = 1.0f;
        this.P[0].b(0);
        this.P[1].b(0);
        this.P[3].b(0);
        this.P[4].b(0);
        this.P[6].b(0);
        invalidate();
    }

    public void k(long j10) {
        if (this.f25431c == null) {
            TimeAnimator timeAnimator = new TimeAnimator();
            timeAnimator.setTimeListener(new TimeAnimator.TimeListener() {
                @Override
                public final void onTimeUpdate(TimeAnimator timeAnimator2, long j11, long j12) {
                    c0.this.g(timeAnimator2, j11, j12);
                }
            });
            this.f25431c = timeAnimator;
        }
        this.M = 0L;
        this.N = j10;
        this.f25431c.start();
    }

    public void l() {
        ValueAnimator valueAnimator = this.f25431c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.M = 0L;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        e(canvas, getMeasuredHeight() / 2);
    }

    public void setTimerCallback(b bVar) {
        this.O = bVar;
    }

    public class a {
        public int f25432a = -1;
        public int f25433b = -1;
        public String f25434c;
        public String f25435d;
        public boolean f25436e;
        public float f25437f;
        public float f25438g;

        public a(int i10) {
            b(i10);
        }

        public void a(Canvas canvas, float f10, float f11, int i10) {
            TextPaint c02 = y.c0(15.0f, d.b(i10, j.P0()));
            if (this.f25438g != 0.0f && this.f25433b != this.f25432a) {
                float f12 = c0.V;
                float f13 = this.f25438g;
                float f14 = f12 * f13;
                if (f13 != 1.0f && (this.f25433b != 0 || !this.f25436e)) {
                    c02.setAlpha((int) (i10 * (1.0f - f13)));
                    canvas.drawText(this.f25435d, f10, f11 + f14, c02);
                }
                if (this.f25434c != null) {
                    c02.setAlpha((int) (i10 * this.f25438g));
                    canvas.drawText(this.f25434c, f10, (f11 - c0.V) + f14, c02);
                }
            } else if (this.f25433b != 0 || !this.f25436e) {
                canvas.drawText(this.f25435d, f10, f11, c02);
            }
        }

        public void b(int i10) {
            this.f25433b = i10;
            this.f25435d = String.valueOf(i10);
            this.f25437f = c0.this.Q[i10];
            this.f25438g = 0.0f;
            this.f25432a = -1;
            this.f25434c = null;
        }

        public boolean c(int i10) {
            if (this.f25433b == i10) {
                return false;
            }
            this.f25433b = i10;
            this.f25435d = String.valueOf(i10);
            this.f25437f = c0.this.Q[i10];
            return true;
        }

        public boolean d(int i10, int i11, float f10) {
            boolean z10;
            if (this.f25433b != i10) {
                this.f25433b = i10;
                this.f25435d = String.valueOf(i10);
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f25432a != i11) {
                this.f25432a = i11;
                this.f25434c = String.valueOf(i11);
                z10 = true;
            }
            if (this.f25438g != f10) {
                this.f25438g = f10;
                z10 = true;
            }
            return z10;
        }

        public a(String str) {
            this.f25435d = str;
            this.f25437f = v0.T1(str, y.b0(15.0f));
        }
    }
}
