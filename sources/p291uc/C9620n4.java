package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import be.C1357a0;
import be.C1359b;
import be.C1379j0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p108hb.C5064d;
import p139jb.AbstractC5911c;
import p156kd.C6240c;
import p156kd.C6246h;
import p242r1.C8348b;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p364zd.AbstractC11508a;
import p364zd.AbstractC11526l;
import p364zd.AbstractC11531p;
import p364zd.C11510b;
import p364zd.C11520h;
import p364zd.C11524j;
import p364zd.C11541z;

public class C9620n4 extends View implements AbstractC11526l, AbstractC11508a, C3950k.AbstractC3952b, C11059v7.AbstractC11064e, AbstractC5911c {
    public C6240c f31179M;
    public C11520h f31180N;
    public C11520h f31181O;
    public boolean f31182P;
    public boolean f31183Q;
    public boolean f31184R;
    public C11520h f31185S;
    public boolean f31186T;
    public float f31187U;
    public C3950k f31188V;
    public final C9678w2 f31190a;
    public final C10930q6 f31191b;
    public final C1359b.C1360a f31189W = new C1359b.C1360a();
    public C6240c f31192c = new C6240c(this, 0);

    public C9620n4(Context context, C9678w2 w2Var, C10930q6 q6Var) {
        super(context);
        this.f31190a = w2Var;
        this.f31191b = q6Var;
    }

    public static void m8008d(C11520h hVar, Canvas canvas, C1359b.C1360a aVar, AbstractC11531p pVar, C6240c cVar, float f) {
        int h = m8004h(pVar);
        if (hVar == null || hVar.m319R()) {
            canvas.drawColor(C5064d.m24132a(f, h));
        } else if (hVar.m315V()) {
            canvas.drawColor(C5064d.m24132a(f, hVar.m292j(h)));
        } else if (hVar.m316U()) {
            C1359b.m37510l(canvas, aVar, cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom(), hVar.m326K(), hVar.m286m(), hVar.m329H(), f);
        } else if (hVar.m317T()) {
            canvas.drawColor(C5064d.m24132a(f, hVar.m292j(h)));
            C1359b.m37506p(canvas, aVar, cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom(), hVar.m276r(), f);
        } else if (hVar.m313X()) {
            if (hVar.m311Z()) {
                C1359b.m37510l(canvas, aVar, cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom(), hVar.m326K(), hVar.m286m(), hVar.m329H(), f);
            } else if (hVar.m312Y()) {
                canvas.drawColor(C5064d.m24132a(f, hVar.m292j(h)));
                C1359b.m37506p(canvas, aVar, cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom(), hVar.m276r(), f);
            } else {
                canvas.drawColor(C5064d.m24132a(f, hVar.m292j(h)));
            }
            cVar.m20980h().setColorFilter(hVar.m335B());
            float F = hVar.m331F() * f;
            int i = (F > 1.0f ? 1 : (F == 1.0f ? 0 : -1));
            if (i != 0) {
                cVar.mo20251U(F);
            }
            cVar.m20980h().draw(canvas);
            if (i != 0) {
                cVar.mo20254P();
            }
        } else {
            if (cVar.mo20247c0()) {
                canvas.drawColor(C5064d.m24132a(f, h));
            }
            cVar.mo20261D();
            int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i2 != 0) {
                cVar.mo20251U(f);
            }
            cVar.draw(canvas);
            if (i2 != 0) {
                cVar.mo20254P();
            }
        }
    }

    public static int m8007e(C11520h hVar, C6246h hVar2, int i, boolean z) {
        if (z) {
            return i;
        }
        int s = C11520h.m274s(hVar.m270u(), 0);
        if (s != 0) {
            return s;
        }
        if (hVar.m313X()) {
            return C5064d.m24131b((int) (((hVar.m331F() * 0.3f) + 0.7f) * 112.0f), hVar.m335B());
        }
        if (hVar.m318S()) {
            return C5064d.m24131b(112, hVar.m327J());
        }
        C8348b.C8352d u = hVar2 != null ? hVar2.m20896u() : null;
        return u == null ? i : z ? C5064d.m24131b(255, u.m12701f()) : C5064d.m24131b(112, u.m12702e());
    }

    public static int m8005g(C11520h hVar, C6240c cVar, int i, boolean z) {
        return (hVar == null || hVar.m319R()) ? i : C5064d.m24129d(m8007e(hVar, cVar.m20982e().m20799r(), i, z), m8007e(hVar, cVar.m20983d().m20799r(), i, z), cVar.m20984c());
    }

    public static int m8004h(AbstractC11531p pVar) {
        return C5064d.m24130c(pVar.mo92e(R.id.theme_color_background), pVar.mo92e(R.id.theme_color_bubble_chatBackground));
    }

    public void m8000l(TdApi.User user) {
        C11520h hVar;
        if (user != null && (hVar = this.f31185S) != null) {
            m7997o(hVar, this.f31186T);
        }
    }

    @Override
    public void mo137J4(int i, int i2, float f, boolean z) {
        if (i2 == R.id.theme_property_wallpaperUsageId) {
            m7997o(this.f31191b.m2294pc().m4148I(C11524j.m174j0(i)), true);
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (this.f31187U != f) {
            this.f31187U = f;
            if (this.f31190a.m7645r0().m32530Wk() && this.f31190a.m7615x3() && this.f31190a.m7808E0() != null) {
                this.f31190a.m7808E0().m8110p0();
            }
            invalidate();
        }
    }

    @Override
    public boolean mo136W0() {
        return false;
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (f == 1.0f) {
            this.f31180N = this.f31181O;
            this.f31181O = null;
            C6240c cVar = this.f31192c;
            C6240c cVar2 = this.f31179M;
            this.f31192c = cVar2;
            cVar2.mo20252S0(false);
            this.f31179M = cVar;
            this.f31187U = 0.0f;
            cVar.clear();
            if (this.f31190a.m7615x3() && this.f31190a.m7808E0() != null) {
                this.f31190a.m7808E0().m8110p0();
            }
            invalidate();
        }
    }

    @Override
    public void mo1559a1(String str) {
    }

    @Override
    public void mo4501a3() {
        this.f31192c.mo20250Z();
        C6240c cVar = this.f31179M;
        if (cVar != null) {
            cVar.mo20250Z();
        }
        this.f31191b.m2480e2().m1706O1(this);
        C11541z.m7t().m42S(this);
        C11541z.m7t().m44Q(this);
    }

    @Override
    public void mo135a7(AbstractC11531p pVar, AbstractC11531p pVar2) {
        int k0 = C11524j.m171k0(pVar2);
        if (C11524j.m171k0(pVar) != k0) {
            m7997o(this.f31191b.m2294pc().m4148I(k0), true);
        }
    }

    @Override
    public void mo378b(C10930q6 q6Var, int i) {
        if (this.f31191b == q6Var) {
            m7998n(this.f31192c, this.f31180N);
            this.f31190a.m7645r0().m32731Gr();
        }
    }

    public final void m8009c() {
        C3950k kVar = this.f31188V;
        if (kVar == null) {
            this.f31188V = new C3950k(0, this, C2057b.f7280b, 180L);
        } else if (kVar.m29540o() == 1.0f) {
            C3950k kVar2 = this.f31188V;
            this.f31187U = 0.0f;
            kVar2.m29543l(0.0f);
        }
        this.f31188V.m29546i(1.0f);
    }

    public int m8006f(int i, boolean z) {
        if (!this.f31190a.m7615x3()) {
            return i;
        }
        if (m8001k()) {
            float f = this.f31187U;
            if (f != 0.0f) {
                if (f == 1.0f) {
                    return m8005g(this.f31181O, this.f31179M, i, z);
                }
                return C5064d.m24129d(m8005g(this.f31180N, this.f31192c, i, z), m8005g(this.f31181O, this.f31179M, i, z), this.f31187U);
            }
        }
        return m8005g(this.f31180N, this.f31192c, i, z);
    }

    public float getBackgroundTransparency() {
        if (!this.f31190a.m7615x3()) {
            return 0.0f;
        }
        C3950k kVar = this.f31188V;
        if (kVar == null || !kVar.m29533v()) {
            return this.f31180N != null ? 0.0f : 1.0f;
        }
        if (this.f31181O == null) {
            return this.f31187U;
        }
        if (this.f31180N == null) {
            return 1.0f - this.f31187U;
        }
        return 0.0f;
    }

    public void m8003i(C11520h hVar) {
        this.f31182P = true;
        this.f31179M = new C6240c(this, 0);
        m7997o(hVar, false);
    }

    public void m8002j(boolean z) {
        this.f31182P = z;
        this.f31179M = new C6240c(this, 0);
        m7997o(this.f31191b.m2294pc().m4148I(C11524j.m177i0()), false);
        C11541z.m7t().m23f(this);
        C11541z.m7t().m26d(this);
        this.f31191b.m2480e2().m1728J(this);
    }

    public final boolean m8001k() {
        C3950k kVar = this.f31188V;
        return kVar != null && kVar.m29533v();
    }

    @Override
    public void mo1558l2(final TdApi.User user) {
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                C9620n4.this.m8000l(user);
            }
        });
    }

    public final void m7999m() {
        int measuredWidth = getMeasuredWidth();
        int max = Math.max(C1357a0.m37548e(), getMeasuredHeight());
        this.f31192c.mo20257K0(0, 0, measuredWidth, max);
        C6240c cVar = this.f31179M;
        if (cVar != null) {
            cVar.mo20257K0(0, 0, measuredWidth, max);
        }
    }

    @Override
    public void mo134m7(boolean z, C11510b bVar) {
        m7998n(this.f31192c, this.f31180N);
    }

    public final void m7998n(C6240c cVar, C11520h hVar) {
        if (hVar != null) {
            hVar.m289k0(cVar, !hVar.m313X());
        } else {
            cVar.m20978j(null, null);
        }
    }

    public final void m7997o(C11520h hVar, boolean z) {
        if (hVar != null && hVar.m319R()) {
            hVar = null;
        }
        boolean z2 = z && this.f31190a.m7645r0().m9339Ta();
        if (this.f31191b.m2519ba() == 0) {
            this.f31185S = hVar;
            this.f31186T = z2;
            return;
        }
        C11520h hVar2 = this.f31180N;
        if (hVar2 == hVar) {
            return;
        }
        if (!z2) {
            this.f31180N = hVar;
            m7998n(this.f31192c, hVar);
            if (this.f31190a.m7615x3() && this.f31190a.m7808E0() != null) {
                this.f31190a.m7808E0().m8110p0();
            }
        } else if (!C11520h.m296h(hVar2, hVar, false)) {
            this.f31181O = hVar;
            this.f31179M.mo20252S0(this.f31182P);
            m7998n(this.f31179M, hVar);
            m8009c();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f31190a.m7615x3()) {
            m7999m();
            if (!m8001k()) {
                m8008d(this.f31180N, canvas, this.f31189W, C11541z.m7t().m20i(), this.f31192c, 1.0f);
                return;
            }
            float f = this.f31187U;
            if (f == 0.0f) {
                m8008d(this.f31180N, canvas, this.f31189W, C11541z.m7t().m46P(), this.f31192c, 1.0f);
            } else if (f == 1.0f) {
                m8008d(this.f31181O, canvas, this.f31189W, C11541z.m7t().m22g(), this.f31179M, 1.0f);
            } else {
                m8008d(this.f31180N, canvas, this.f31189W, C11541z.m7t().m46P(), this.f31192c, 1.0f);
                m8008d(this.f31181O, canvas, this.f31189W, C11541z.m7t().m22g(), this.f31179M, this.f31187U);
            }
        } else {
            canvas.drawColor(C11524j.m228N(R.id.theme_color_chatBackground));
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m7999m();
    }

    @Override
    public void mo377q(C10930q6 q6Var, C11520h hVar, int i) {
        if (this.f31191b == q6Var && i == C11524j.m177i0()) {
            if (this.f31183Q) {
                hVar = C11520h.m299f0(q6Var, hVar, this.f31184R);
            }
            m7997o(hVar, true);
        }
    }

    @Override
    public void mo133q0(int i) {
    }

    public void setSelfBlur(boolean z) {
        this.f31183Q = true;
        this.f31184R = z;
        C11541z.m7t().m26d(this);
    }
}
