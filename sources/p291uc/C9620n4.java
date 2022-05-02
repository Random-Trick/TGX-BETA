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
    public C6240c f31176M;
    public C11520h f31177N;
    public C11520h f31178O;
    public boolean f31179P;
    public boolean f31180Q;
    public boolean f31181R;
    public C11520h f31182S;
    public boolean f31183T;
    public float f31184U;
    public C3950k f31185V;
    public final C9678w2 f31187a;
    public final C10930q6 f31188b;
    public final C1359b.C1360a f31186W = new C1359b.C1360a();
    public C6240c f31189c = new C6240c(this, 0);

    public C9620n4(Context context, C9678w2 w2Var, C10930q6 q6Var) {
        super(context);
        this.f31187a = w2Var;
        this.f31188b = q6Var;
    }

    public static void m8008d(C11520h hVar, Canvas canvas, C1359b.C1360a aVar, AbstractC11531p pVar, C6240c cVar, float f) {
        int h = m8004h(pVar);
        if (hVar == null || hVar.m319R()) {
            canvas.drawColor(C5064d.m24131a(f, h));
        } else if (hVar.m315V()) {
            canvas.drawColor(C5064d.m24131a(f, hVar.m292j(h)));
        } else if (hVar.m316U()) {
            C1359b.m37507l(canvas, aVar, cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom(), hVar.m326K(), hVar.m286m(), hVar.m329H(), f);
        } else if (hVar.m317T()) {
            canvas.drawColor(C5064d.m24131a(f, hVar.m292j(h)));
            C1359b.m37503p(canvas, aVar, cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom(), hVar.m276r(), f);
        } else if (hVar.m313X()) {
            if (hVar.m311Z()) {
                C1359b.m37507l(canvas, aVar, cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom(), hVar.m326K(), hVar.m286m(), hVar.m329H(), f);
            } else if (hVar.m312Y()) {
                canvas.drawColor(C5064d.m24131a(f, hVar.m292j(h)));
                C1359b.m37503p(canvas, aVar, cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom(), hVar.m276r(), f);
            } else {
                canvas.drawColor(C5064d.m24131a(f, hVar.m292j(h)));
            }
            cVar.m20979h().setColorFilter(hVar.m335B());
            float F = hVar.m331F() * f;
            int i = (F > 1.0f ? 1 : (F == 1.0f ? 0 : -1));
            if (i != 0) {
                cVar.mo20250U(F);
            }
            cVar.m20979h().draw(canvas);
            if (i != 0) {
                cVar.mo20253P();
            }
        } else {
            if (cVar.mo20246c0()) {
                canvas.drawColor(C5064d.m24131a(f, h));
            }
            cVar.mo20260D();
            int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i2 != 0) {
                cVar.mo20250U(f);
            }
            cVar.draw(canvas);
            if (i2 != 0) {
                cVar.mo20253P();
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
            return C5064d.m24130b((int) (((hVar.m331F() * 0.3f) + 0.7f) * 112.0f), hVar.m335B());
        }
        if (hVar.m318S()) {
            return C5064d.m24130b(112, hVar.m327J());
        }
        C8348b.C8352d u = hVar2 != null ? hVar2.m20895u() : null;
        return u == null ? i : z ? C5064d.m24130b(255, u.m12702f()) : C5064d.m24130b(112, u.m12703e());
    }

    public static int m8005g(C11520h hVar, C6240c cVar, int i, boolean z) {
        return (hVar == null || hVar.m319R()) ? i : C5064d.m24128d(m8007e(hVar, cVar.m20981e().m20798r(), i, z), m8007e(hVar, cVar.m20982d().m20798r(), i, z), cVar.m20983c());
    }

    public static int m8004h(AbstractC11531p pVar) {
        return C5064d.m24129c(pVar.mo92e(R.id.theme_color_background), pVar.mo92e(R.id.theme_color_bubble_chatBackground));
    }

    public void m8000l(TdApi.User user) {
        C11520h hVar;
        if (user != null && (hVar = this.f31182S) != null) {
            m7997o(hVar, this.f31183T);
        }
    }

    @Override
    public void mo137J4(int i, int i2, float f, boolean z) {
        if (i2 == R.id.theme_property_wallpaperUsageId) {
            m7997o(this.f31188b.m2294pc().m4148I(C11524j.m174j0(i)), true);
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (this.f31184U != f) {
            this.f31184U = f;
            if (this.f31187a.m7645r0().m32527Wk() && this.f31187a.m7615x3() && this.f31187a.m7808E0() != null) {
                this.f31187a.m7808E0().m8110p0();
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
            this.f31177N = this.f31178O;
            this.f31178O = null;
            C6240c cVar = this.f31189c;
            C6240c cVar2 = this.f31176M;
            this.f31189c = cVar2;
            cVar2.mo20251S0(false);
            this.f31176M = cVar;
            this.f31184U = 0.0f;
            cVar.clear();
            if (this.f31187a.m7615x3() && this.f31187a.m7808E0() != null) {
                this.f31187a.m7808E0().m8110p0();
            }
            invalidate();
        }
    }

    @Override
    public void mo1559a1(String str) {
    }

    @Override
    public void mo4501a3() {
        this.f31189c.mo20249Z();
        C6240c cVar = this.f31176M;
        if (cVar != null) {
            cVar.mo20249Z();
        }
        this.f31188b.m2480e2().m1706O1(this);
        C11541z.m7t().m42S(this);
        C11541z.m7t().m44Q(this);
    }

    @Override
    public void mo135a7(AbstractC11531p pVar, AbstractC11531p pVar2) {
        int k0 = C11524j.m171k0(pVar2);
        if (C11524j.m171k0(pVar) != k0) {
            m7997o(this.f31188b.m2294pc().m4148I(k0), true);
        }
    }

    @Override
    public void mo378b(C10930q6 q6Var, int i) {
        if (this.f31188b == q6Var) {
            m7998n(this.f31189c, this.f31177N);
            this.f31187a.m7645r0().m32728Gr();
        }
    }

    public final void m8009c() {
        C3950k kVar = this.f31185V;
        if (kVar == null) {
            this.f31185V = new C3950k(0, this, C2057b.f7280b, 180L);
        } else if (kVar.m29538o() == 1.0f) {
            C3950k kVar2 = this.f31185V;
            this.f31184U = 0.0f;
            kVar2.m29541l(0.0f);
        }
        this.f31185V.m29544i(1.0f);
    }

    public int m8006f(int i, boolean z) {
        if (!this.f31187a.m7615x3()) {
            return i;
        }
        if (m8001k()) {
            float f = this.f31184U;
            if (f != 0.0f) {
                if (f == 1.0f) {
                    return m8005g(this.f31178O, this.f31176M, i, z);
                }
                return C5064d.m24128d(m8005g(this.f31177N, this.f31189c, i, z), m8005g(this.f31178O, this.f31176M, i, z), this.f31184U);
            }
        }
        return m8005g(this.f31177N, this.f31189c, i, z);
    }

    public float getBackgroundTransparency() {
        if (!this.f31187a.m7615x3()) {
            return 0.0f;
        }
        C3950k kVar = this.f31185V;
        if (kVar == null || !kVar.m29531v()) {
            return this.f31177N != null ? 0.0f : 1.0f;
        }
        if (this.f31178O == null) {
            return this.f31184U;
        }
        if (this.f31177N == null) {
            return 1.0f - this.f31184U;
        }
        return 0.0f;
    }

    public void m8003i(C11520h hVar) {
        this.f31179P = true;
        this.f31176M = new C6240c(this, 0);
        m7997o(hVar, false);
    }

    public void m8002j(boolean z) {
        this.f31179P = z;
        this.f31176M = new C6240c(this, 0);
        m7997o(this.f31188b.m2294pc().m4148I(C11524j.m177i0()), false);
        C11541z.m7t().m23f(this);
        C11541z.m7t().m26d(this);
        this.f31188b.m2480e2().m1728J(this);
    }

    public final boolean m8001k() {
        C3950k kVar = this.f31185V;
        return kVar != null && kVar.m29531v();
    }

    @Override
    public void mo1558l2(final TdApi.User user) {
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                C9620n4.this.m8000l(user);
            }
        });
    }

    public final void m7999m() {
        int measuredWidth = getMeasuredWidth();
        int max = Math.max(C1357a0.m37545e(), getMeasuredHeight());
        this.f31189c.mo20256K0(0, 0, measuredWidth, max);
        C6240c cVar = this.f31176M;
        if (cVar != null) {
            cVar.mo20256K0(0, 0, measuredWidth, max);
        }
    }

    @Override
    public void mo134m7(boolean z, C11510b bVar) {
        m7998n(this.f31189c, this.f31177N);
    }

    public final void m7998n(C6240c cVar, C11520h hVar) {
        if (hVar != null) {
            hVar.m289k0(cVar, !hVar.m313X());
        } else {
            cVar.m20977j(null, null);
        }
    }

    public final void m7997o(C11520h hVar, boolean z) {
        if (hVar != null && hVar.m319R()) {
            hVar = null;
        }
        boolean z2 = z && this.f31187a.m7645r0().m9339Ta();
        if (this.f31188b.m2519ba() == 0) {
            this.f31182S = hVar;
            this.f31183T = z2;
            return;
        }
        C11520h hVar2 = this.f31177N;
        if (hVar2 == hVar) {
            return;
        }
        if (!z2) {
            this.f31177N = hVar;
            m7998n(this.f31189c, hVar);
            if (this.f31187a.m7615x3() && this.f31187a.m7808E0() != null) {
                this.f31187a.m7808E0().m8110p0();
            }
        } else if (!C11520h.m296h(hVar2, hVar, false)) {
            this.f31178O = hVar;
            this.f31176M.mo20251S0(this.f31179P);
            m7998n(this.f31176M, hVar);
            m8009c();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f31187a.m7615x3()) {
            m7999m();
            if (!m8001k()) {
                m8008d(this.f31177N, canvas, this.f31186W, C11541z.m7t().m20i(), this.f31189c, 1.0f);
                return;
            }
            float f = this.f31184U;
            if (f == 0.0f) {
                m8008d(this.f31177N, canvas, this.f31186W, C11541z.m7t().m46P(), this.f31189c, 1.0f);
            } else if (f == 1.0f) {
                m8008d(this.f31178O, canvas, this.f31186W, C11541z.m7t().m22g(), this.f31176M, 1.0f);
            } else {
                m8008d(this.f31177N, canvas, this.f31186W, C11541z.m7t().m46P(), this.f31189c, 1.0f);
                m8008d(this.f31178O, canvas, this.f31186W, C11541z.m7t().m22g(), this.f31176M, this.f31184U);
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
        if (this.f31188b == q6Var && i == C11524j.m177i0()) {
            if (this.f31180Q) {
                hVar = C11520h.m299f0(q6Var, hVar, this.f31181R);
            }
            m7997o(hVar, true);
        }
    }

    @Override
    public void mo133q0(int i) {
    }

    public void setSelfBlur(boolean z) {
        this.f31180Q = true;
        this.f31181R = z;
        C11541z.m7t().m26d(this);
    }
}
