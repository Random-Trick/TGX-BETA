package me;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import be.C1357a0;
import be.C1379j0;
import be.C1410y;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p037cb.C2057b;
import p051db.C3950k;
import p080fb.AbstractC4345j;
import p080fb.C4341g;
import p108hb.C5064d;
import p108hb.C5069h;
import p111he.C5150w0;
import p139jb.AbstractC5911c;
import p364zd.C11524j;

public class RunnableC6969m2 implements Runnable, C3950k.AbstractC3952b, AbstractC5911c, AbstractView$OnTouchListenerC7889a.AbstractC7902m {
    public static boolean f22044k0 = true;
    public static final float f22045l0 = 8.0f;
    public static final Interpolator f22046m0 = new DecelerateInterpolator(0.72f);
    public int f22048N;
    public int f22051Q;
    public boolean f22052R;
    public final C4341g f22054T;
    public AbstractC4345j f22055U;
    public long f22056V;
    public boolean f22057W;
    public boolean f22058X;
    public float f22059Y;
    public final AbstractView$OnTouchListenerC7889a f22060Z;
    public boolean f22067d0;
    public boolean f22068e0;
    public boolean f22069f0;
    public float f22070g0;
    public C3950k f22071h0;
    public boolean f22072i0;
    public C5150w0 f22073j0;
    public long f22061a = 1600;
    public long f22063b = 200;
    public long f22065c = 32000;
    public long f22047M = 600;
    public float f22053S = 1.0f;
    public boolean f22062a0 = true;
    public long f22064b0 = -1;
    public long f22066c0 = -1;
    public final Rect f22049O = new Rect();
    public final RectF f22050P = new RectF();

    public RunnableC6969m2(AbstractView$OnTouchListenerC7889a aVar, int i) {
        this.f22048N = i;
        C4341g gVar = new C4341g();
        this.f22054T = gVar;
        this.f22055U = gVar;
        this.f22060Z = aVar;
    }

    public static RunnableC6969m2 m18290F(View view, float f, int i, int i2, int i3, int i4) {
        RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37310r(view.getContext()), C1357a0.m37544i(f));
        m2Var.m18294B();
        m2Var.m18265y();
        m2Var.m18286d(-1);
        m2Var.m18275o(0.0f);
        m2Var.m18274p(i, i2, i3 + i, i4 + i2);
        m2Var.m18289a(view);
        return m2Var;
    }

    public static long m18283g() {
        return Math.max(8L, ValueAnimator.getFrameDelay());
    }

    public final void m18295A(boolean z) {
        if (this.f22062a0 != z) {
            boolean k = m18279k();
            this.f22062a0 = z;
            m18276n(false, k);
        }
    }

    public void m18294B() {
        m18293C(C1357a0.m37544i(2.0f));
    }

    public void m18293C(float f) {
        this.f22058X = true;
        this.f22059Y = f;
    }

    public void m18292D() {
        this.f22068e0 = true;
    }

    public void m18291E(AbstractC4345j jVar) {
        if (jVar == null) {
            jVar = this.f22054T;
        }
        this.f22055U = jVar;
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            m18269u(f);
        }
    }

    @Override
    public void mo14403U(AbstractView$OnTouchListenerC7889a aVar, int i, int i2) {
        m18295A(i == 0);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public void m18289a(View view) {
        boolean k = m18279k();
        this.f22054T.m28243j(view);
        m18276n(false, k);
    }

    @Override
    public void mo4501a3() {
        this.f22060Z.m14407z2(this);
        m18295A(false);
    }

    public void m18288b(View view) {
        this.f22054T.m28241l(view);
    }

    public void m18287c(Canvas canvas) {
        long j;
        float f;
        float f2;
        float f3;
        float f4 = 0.0f;
        if (this.f22053S > 0.0f) {
            boolean z = this.f22057W;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z) {
                uptimeMillis -= this.f22056V;
            }
            if (this.f22072i0) {
                long j2 = this.f22063b;
                j = this.f22047M + j2 + j2;
            } else {
                j = 0;
            }
            long j3 = uptimeMillis + j;
            boolean l = m18278l();
            if (l) {
                f2 = m18281i() * 360.0f;
                f = 270.0f - f2;
            } else {
                float f5 = 10.0f;
                if (this.f22067d0) {
                    long j4 = this.f22065c;
                    f = ((((float) (j3 % j4)) / ((float) j4)) * 360.0f) % 360.0f;
                    f2 = (this.f22070g0 * 350.0f) + 10.0f;
                } else {
                    long j5 = j3 % this.f22061a;
                    long j6 = this.f22063b;
                    long j7 = this.f22047M;
                    long j8 = j7 + j6 + j6;
                    if (j5 >= j6) {
                        f4 = j5 > j6 + j7 ? 1.0f : C2057b.f7280b.getInterpolation(((float) (j5 - j6)) / ((float) j7));
                    }
                    if (j5 < j8) {
                        f3 = 0.0f;
                    } else {
                        long j9 = this.f22047M;
                        f3 = j5 > j8 + j9 ? 1.0f : C2057b.f7280b.getInterpolation(((float) (j5 - j8)) / ((float) j9));
                    }
                    float f6 = (f3 * 270.0f) + ((((float) j5) / ((float) this.f22061a)) * 450.0f);
                    long j10 = this.f22065c;
                    f = (f6 + ((((float) (j3 % j10)) / ((float) j10)) * 360.0f)) % 360.0f;
                    if (this.f22048N >= C1357a0.m37544i(18.0f)) {
                        f5 = f22045l0;
                    } else if (this.f22048N < C1357a0.m37544i(10.0f)) {
                        f5 = 25.0f;
                    }
                    f2 = (f4 * 270.0f * (1.0f - f3)) + f5;
                }
            }
            int a = C5064d.m24132a(this.f22053S, this.f22052R ? this.f22051Q : C11524j.m239H0());
            canvas.drawArc(this.f22050P, f, f2, false, this.f22058X ? C1410y.m37056Y(a, this.f22059Y) : C1410y.m37057X(a));
            if (l) {
                double radians = Math.toRadians(C5069h.m24083k(f, 360.0f));
                canvas.drawCircle((float) (this.f22050P.centerX() + ((this.f22050P.width() / 2.0f) * Math.cos(radians))), (float) (this.f22050P.centerY() + ((this.f22050P.height() / 2.0f) * Math.sin(radians))), this.f22059Y / 2.0f, C1410y.m37042g(a));
                if (this.f22073j0 == null) {
                    this.f22073j0 = new C5150w0();
                }
                this.f22073j0.m23802a(canvas, a, this.f22059Y, this.f22050P, 360.0f - f2, this.f22053S);
            }
            if (!this.f22069f0 && m18279k()) {
                m18276n(true, true);
            }
        }
    }

    public void m18286d(int i) {
        if (this.f22051Q != i) {
            boolean k = m18279k();
            this.f22051Q = i;
            this.f22052R = true;
            m18276n(false, k);
        }
    }

    public float m18285e() {
        return this.f22053S;
    }

    public final int m18284f() {
        return C5064d.m24132a(this.f22053S, this.f22052R ? this.f22051Q : C11524j.m239H0());
    }

    public long m18282h() {
        return ((float) (this.f22066c0 - this.f22064b0)) * m18281i();
    }

    public final float m18281i() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.f22064b0;
        if (uptimeMillis <= j) {
            return 1.0f;
        }
        long j2 = this.f22066c0;
        if (uptimeMillis >= j2) {
            return 0.0f;
        }
        return 1.0f - (((float) (uptimeMillis - j)) / ((float) (j2 - j)));
    }

    public final void m18280j() {
        if (this.f22068e0) {
            this.f22055U.invalidate();
        } else {
            this.f22055U.mo28232b(this.f22049O);
        }
    }

    public final boolean m18279k() {
        return this.f22055U.mo28227g() && (Color.alpha(this.f22051Q) > 0 || !this.f22052R) && this.f22062a0;
    }

    public final boolean m18278l() {
        return (this.f22064b0 == -1 || this.f22066c0 == -1) ? false : true;
    }

    public void m18277m() {
        m18276n(false, true);
    }

    public final void m18276n(boolean z, boolean z2) {
        if (this.f22055U.mo28227g()) {
            if (m18279k() && !z2) {
                this.f22056V = SystemClock.uptimeMillis();
            }
            if (!z) {
                m18280j();
            }
            if (Color.alpha(m18284f()) > 0) {
                if (!z || this.f22069f0) {
                    C1379j0.m37377A().removeCallbacks(this);
                }
                this.f22069f0 = true;
                C1379j0.m37377A().postDelayed(this, this.f22057W ? 3L : m18283g());
            }
        }
    }

    public void m18275o(float f) {
        if (this.f22053S != f) {
            boolean k = m18279k();
            this.f22053S = f;
            m18276n(false, k);
        }
    }

    public void m18274p(int i, int i2, int i3, int i4) {
        this.f22049O.set(i, i2, i3, i4);
        int centerX = this.f22049O.centerX();
        int centerY = this.f22049O.centerY();
        RectF rectF = this.f22050P;
        int i5 = this.f22048N;
        rectF.set(centerX - i5, centerY - i5, centerX + i5, centerY + i5);
    }

    public void m18273q(long j, long j2) {
        this.f22061a = j;
        this.f22047M = j2;
        this.f22063b = (j - (j2 * 2)) / 2;
        m18266x(j * 10);
    }

    public void m18272r() {
        this.f22067d0 = true;
        this.f22065c = 1800L;
    }

    @Override
    public void run() {
        this.f22069f0 = false;
        m18280j();
    }

    public void m18271s(boolean z) {
        this.f22057W = z;
    }

    public void m18270t(boolean z) {
        this.f22072i0 = z;
    }

    public final void m18269u(float f) {
        if (this.f22070g0 != f) {
            this.f22070g0 = f;
        }
    }

    public void m18268v(float f, boolean z) {
        float min = Math.min(1.0f, Math.max(0.0f, f));
        if (z && m18279k()) {
            float f2 = this.f22070g0;
            if (!(f2 == min && this.f22071h0 == null)) {
                if (this.f22071h0 == null) {
                    this.f22071h0 = new C3950k(0, this, f22046m0, 180L, f2);
                }
                this.f22071h0.m29546i(min);
                return;
            }
        }
        C3950k kVar = this.f22071h0;
        if (kVar != null) {
            kVar.m29544k();
            this.f22071h0.m29543l(min);
        }
        this.f22070g0 = min;
        m18280j();
    }

    public void m18267w(int i) {
        if (this.f22048N != i) {
            this.f22048N = i;
            Rect rect = this.f22049O;
            m18274p(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void m18266x(long j) {
        this.f22065c = j;
    }

    public void m18265y() {
        m18273q(1700L, 600L);
    }

    public void m18264z(long j, long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = j2 - currentTimeMillis;
        long j4 = j - currentTimeMillis;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f22064b0 = j4 + uptimeMillis;
        this.f22066c0 = uptimeMillis + j3;
    }
}
