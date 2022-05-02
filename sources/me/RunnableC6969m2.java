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
    public static boolean f22041k0 = true;
    public static final float f22042l0 = 8.0f;
    public static final Interpolator f22043m0 = new DecelerateInterpolator(0.72f);
    public int f22045N;
    public int f22048Q;
    public boolean f22049R;
    public final C4341g f22051T;
    public AbstractC4345j f22052U;
    public long f22053V;
    public boolean f22054W;
    public boolean f22055X;
    public float f22056Y;
    public final AbstractView$OnTouchListenerC7889a f22057Z;
    public boolean f22064d0;
    public boolean f22065e0;
    public boolean f22066f0;
    public float f22067g0;
    public C3950k f22068h0;
    public boolean f22069i0;
    public C5150w0 f22070j0;
    public long f22058a = 1600;
    public long f22060b = 200;
    public long f22062c = 32000;
    public long f22044M = 600;
    public float f22050S = 1.0f;
    public boolean f22059a0 = true;
    public long f22061b0 = -1;
    public long f22063c0 = -1;
    public final Rect f22046O = new Rect();
    public final RectF f22047P = new RectF();

    public RunnableC6969m2(AbstractView$OnTouchListenerC7889a aVar, int i) {
        this.f22045N = i;
        C4341g gVar = new C4341g();
        this.f22051T = gVar;
        this.f22052U = gVar;
        this.f22057Z = aVar;
    }

    public static RunnableC6969m2 m18290F(View view, float f, int i, int i2, int i3, int i4) {
        RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37307r(view.getContext()), C1357a0.m37541i(f));
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
        if (this.f22059a0 != z) {
            boolean k = m18279k();
            this.f22059a0 = z;
            m18276n(false, k);
        }
    }

    public void m18294B() {
        m18293C(C1357a0.m37541i(2.0f));
    }

    public void m18293C(float f) {
        this.f22055X = true;
        this.f22056Y = f;
    }

    public void m18292D() {
        this.f22065e0 = true;
    }

    public void m18291E(AbstractC4345j jVar) {
        if (jVar == null) {
            jVar = this.f22051T;
        }
        this.f22052U = jVar;
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            m18269u(f);
        }
    }

    @Override
    public void mo14404U(AbstractView$OnTouchListenerC7889a aVar, int i, int i2) {
        m18295A(i == 0);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public void m18289a(View view) {
        boolean k = m18279k();
        this.f22051T.m28241j(view);
        m18276n(false, k);
    }

    @Override
    public void mo4501a3() {
        this.f22057Z.m14408z2(this);
        m18295A(false);
    }

    public void m18288b(View view) {
        this.f22051T.m28239l(view);
    }

    public void m18287c(Canvas canvas) {
        long j;
        float f;
        float f2;
        float f3;
        float f4 = 0.0f;
        if (this.f22050S > 0.0f) {
            boolean z = this.f22054W;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z) {
                uptimeMillis -= this.f22053V;
            }
            if (this.f22069i0) {
                long j2 = this.f22060b;
                j = this.f22044M + j2 + j2;
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
                if (this.f22064d0) {
                    long j4 = this.f22062c;
                    f = ((((float) (j3 % j4)) / ((float) j4)) * 360.0f) % 360.0f;
                    f2 = (this.f22067g0 * 350.0f) + 10.0f;
                } else {
                    long j5 = j3 % this.f22058a;
                    long j6 = this.f22060b;
                    long j7 = this.f22044M;
                    long j8 = j7 + j6 + j6;
                    if (j5 >= j6) {
                        f4 = j5 > j6 + j7 ? 1.0f : C2057b.f7280b.getInterpolation(((float) (j5 - j6)) / ((float) j7));
                    }
                    if (j5 < j8) {
                        f3 = 0.0f;
                    } else {
                        long j9 = this.f22044M;
                        f3 = j5 > j8 + j9 ? 1.0f : C2057b.f7280b.getInterpolation(((float) (j5 - j8)) / ((float) j9));
                    }
                    float f6 = (f3 * 270.0f) + ((((float) j5) / ((float) this.f22058a)) * 450.0f);
                    long j10 = this.f22062c;
                    f = (f6 + ((((float) (j3 % j10)) / ((float) j10)) * 360.0f)) % 360.0f;
                    if (this.f22045N >= C1357a0.m37541i(18.0f)) {
                        f5 = f22042l0;
                    } else if (this.f22045N < C1357a0.m37541i(10.0f)) {
                        f5 = 25.0f;
                    }
                    f2 = (f4 * 270.0f * (1.0f - f3)) + f5;
                }
            }
            int a = C5064d.m24131a(this.f22050S, this.f22049R ? this.f22048Q : C11524j.m239H0());
            canvas.drawArc(this.f22047P, f, f2, false, this.f22055X ? C1410y.m37053Y(a, this.f22056Y) : C1410y.m37054X(a));
            if (l) {
                double radians = Math.toRadians(C5069h.m24082k(f, 360.0f));
                canvas.drawCircle((float) (this.f22047P.centerX() + ((this.f22047P.width() / 2.0f) * Math.cos(radians))), (float) (this.f22047P.centerY() + ((this.f22047P.height() / 2.0f) * Math.sin(radians))), this.f22056Y / 2.0f, C1410y.m37039g(a));
                if (this.f22070j0 == null) {
                    this.f22070j0 = new C5150w0();
                }
                this.f22070j0.m23801a(canvas, a, this.f22056Y, this.f22047P, 360.0f - f2, this.f22050S);
            }
            if (!this.f22066f0 && m18279k()) {
                m18276n(true, true);
            }
        }
    }

    public void m18286d(int i) {
        if (this.f22048Q != i) {
            boolean k = m18279k();
            this.f22048Q = i;
            this.f22049R = true;
            m18276n(false, k);
        }
    }

    public float m18285e() {
        return this.f22050S;
    }

    public final int m18284f() {
        return C5064d.m24131a(this.f22050S, this.f22049R ? this.f22048Q : C11524j.m239H0());
    }

    public long m18282h() {
        return ((float) (this.f22063c0 - this.f22061b0)) * m18281i();
    }

    public final float m18281i() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.f22061b0;
        if (uptimeMillis <= j) {
            return 1.0f;
        }
        long j2 = this.f22063c0;
        if (uptimeMillis >= j2) {
            return 0.0f;
        }
        return 1.0f - (((float) (uptimeMillis - j)) / ((float) (j2 - j)));
    }

    public final void m18280j() {
        if (this.f22065e0) {
            this.f22052U.invalidate();
        } else {
            this.f22052U.mo28230b(this.f22046O);
        }
    }

    public final boolean m18279k() {
        return this.f22052U.mo28225g() && (Color.alpha(this.f22048Q) > 0 || !this.f22049R) && this.f22059a0;
    }

    public final boolean m18278l() {
        return (this.f22061b0 == -1 || this.f22063c0 == -1) ? false : true;
    }

    public void m18277m() {
        m18276n(false, true);
    }

    public final void m18276n(boolean z, boolean z2) {
        if (this.f22052U.mo28225g()) {
            if (m18279k() && !z2) {
                this.f22053V = SystemClock.uptimeMillis();
            }
            if (!z) {
                m18280j();
            }
            if (Color.alpha(m18284f()) > 0) {
                if (!z || this.f22066f0) {
                    C1379j0.m37374A().removeCallbacks(this);
                }
                this.f22066f0 = true;
                C1379j0.m37374A().postDelayed(this, this.f22054W ? 3L : m18283g());
            }
        }
    }

    public void m18275o(float f) {
        if (this.f22050S != f) {
            boolean k = m18279k();
            this.f22050S = f;
            m18276n(false, k);
        }
    }

    public void m18274p(int i, int i2, int i3, int i4) {
        this.f22046O.set(i, i2, i3, i4);
        int centerX = this.f22046O.centerX();
        int centerY = this.f22046O.centerY();
        RectF rectF = this.f22047P;
        int i5 = this.f22045N;
        rectF.set(centerX - i5, centerY - i5, centerX + i5, centerY + i5);
    }

    public void m18273q(long j, long j2) {
        this.f22058a = j;
        this.f22044M = j2;
        this.f22060b = (j - (j2 * 2)) / 2;
        m18266x(j * 10);
    }

    public void m18272r() {
        this.f22064d0 = true;
        this.f22062c = 1800L;
    }

    @Override
    public void run() {
        this.f22066f0 = false;
        m18280j();
    }

    public void m18271s(boolean z) {
        this.f22054W = z;
    }

    public void m18270t(boolean z) {
        this.f22069i0 = z;
    }

    public final void m18269u(float f) {
        if (this.f22067g0 != f) {
            this.f22067g0 = f;
        }
    }

    public void m18268v(float f, boolean z) {
        float min = Math.min(1.0f, Math.max(0.0f, f));
        if (z && m18279k()) {
            float f2 = this.f22067g0;
            if (!(f2 == min && this.f22068h0 == null)) {
                if (this.f22068h0 == null) {
                    this.f22068h0 = new C3950k(0, this, f22043m0, 180L, f2);
                }
                this.f22068h0.m29544i(min);
                return;
            }
        }
        C3950k kVar = this.f22068h0;
        if (kVar != null) {
            kVar.m29542k();
            this.f22068h0.m29541l(min);
        }
        this.f22067g0 = min;
        m18280j();
    }

    public void m18267w(int i) {
        if (this.f22045N != i) {
            this.f22045N = i;
            Rect rect = this.f22046O;
            m18274p(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void m18266x(long j) {
        this.f22062c = j;
    }

    public void m18265y() {
        m18273q(1700L, 600L);
    }

    public void m18264z(long j, long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = j2 - currentTimeMillis;
        long j4 = j - currentTimeMillis;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f22061b0 = j4 + uptimeMillis;
        this.f22063c0 = uptimeMillis + j3;
    }
}
