package ie;

import android.graphics.Canvas;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import be.C1357a0;
import be.C1359b;
import be.C1363c0;
import be.C1379j0;
import be.C1410y;
import ie.RunnableC5390g;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3941g;
import p051db.C3944i;
import p051db.C3950k;
import p051db.C3953l;
import p108hb.C5063c;
import p108hb.C5064d;
import p108hb.C5069h;
import p111he.AbstractC5143t;
import p350yd.C10930q6;
import p364zd.C11524j;

public final class C5375a implements C3950k.AbstractC3952b, C3944i.AbstractC3946b<RunnableC5390g>, AbstractC5408k {
    public final C3940f f17675M;
    public final AbstractC5378c f17676N;
    public final int f17677O;
    public final float f17678P;
    public final int f17679Q;
    public final float f17680R;
    public final float f17681S;
    public final int f17682T;
    public final int f17683U;
    public final int f17684V;
    public final int f17685W;
    public final int f17686X;
    public final AbstractC5408k f17687Y;
    public float f17688Z;
    public final C3944i<RunnableC5390g> f17689a;
    public final C3941g f17690b;
    public final C3940f f17691c;

    public class C5376a implements AbstractC5378c {
        public final View f17692a;

        public C5376a(View view) {
            this.f17692a = view;
        }

        @Override
        public boolean mo8363d(C5375a aVar) {
            return this.f17692a.getParent() != null;
        }

        @Override
        public void mo8362j(C5375a aVar, boolean z) {
            this.f17692a.invalidate();
        }
    }

    public static class C5377b {
        public AbstractC5378c f17695c;
        public int f17696d;
        public float f17697e;
        public float f17698f;
        public int f17703k;
        public AbstractC5408k f17704l;
        public float f17693a = 13.0f;
        public int f17694b = 3;
        public int f17699g = 0;
        public int f17700h = R.id.theme_color_badgeText;
        public int f17701i = R.id.theme_color_badgeMutedText;
        public int f17702j = R.id.theme_color_badgeFailedText;

        public C5377b m23022a(boolean z) {
            this.f17694b = C5063c.m24138h(this.f17694b, 1, z);
            return this;
        }

        public C5375a m23021b() {
            return new C5375a(this.f17693a, this.f17695c, this.f17694b, this.f17700h, this.f17701i, this.f17702j, this.f17703k, this.f17696d, this.f17697e, this.f17698f, this.f17699g, this.f17704l);
        }

        public C5377b m23020c(View view) {
            return m23019d(view != null ? C5375a.m23029q(view) : null);
        }

        public C5377b m23019d(AbstractC5378c cVar) {
            this.f17695c = cVar;
            return this;
        }

        public C5377b m23018e(AbstractC5408k kVar) {
            this.f17704l = kVar;
            return this;
        }

        public C5377b m23017f(int i, float f, float f2, int i2) {
            this.f17696d = i;
            this.f17697e = f;
            this.f17698f = f2;
            this.f17699g = i2;
            return this;
        }

        public C5377b m23016g() {
            this.f17694b = C5063c.m24138h(this.f17694b, 2, false);
            return this;
        }

        public C5377b m23015h(int i) {
            this.f17703k = i;
            return this;
        }

        public C5377b m23014i(int i) {
            this.f17700h = i;
            return this;
        }

        public C5377b m23013j(float f) {
            this.f17693a = f;
            return this;
        }
    }

    public interface AbstractC5378c {
        boolean mo8363d(C5375a aVar);

        void mo8362j(C5375a aVar, boolean z);
    }

    public C5375a(float f, AbstractC5378c cVar, int i, int i2, int i3, int i4, int i5, int i6, float f2, float f3, int i7, AbstractC5408k kVar) {
        this.f17689a = new C3944i<>(this);
        this.f17690b = new C3941g(this);
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f17691c = new C3940f(1, this, decelerateInterpolator, 120L);
        this.f17675M = new C3940f(2, this, decelerateInterpolator, 120L);
        this.f17678P = f;
        this.f17676N = cVar;
        this.f17677O = i;
        this.f17683U = i2;
        this.f17684V = i3;
        this.f17685W = i4;
        this.f17686X = i5;
        this.f17679Q = i6;
        this.f17680R = f2;
        this.f17681S = f3;
        this.f17682T = i7;
        this.f17687Y = kVar;
    }

    public static AbstractC5378c m23029q(View view) {
        return new C5376a(view);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        m23031o(i == 0);
    }

    @Override
    public int mo7858Q() {
        return C5406j.m22807d(this);
    }

    @Override
    public long mo7857X0(boolean z) {
        return C5406j.m22808c(this, z);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        C3953l.m29526a(this, i, f, kVar);
    }

    @Override
    public void mo23040b(C3944i<?> iVar) {
        float m = m23033m();
        boolean z = this.f17688Z != m;
        this.f17688Z = m;
        m23031o(z);
    }

    @Override
    public int mo7856b1() {
        return C5406j.m22805f(this);
    }

    @Override
    public int mo7855c() {
        AbstractC5408k kVar = this.f17687Y;
        return kVar != null ? kVar.mo7855c() : m23037h(m23036i(), this.f17683U, this.f17684V, this.f17685W);
    }

    public void m23039d(Canvas canvas, float f, float f2, int i, float f3) {
        m23038f(canvas, f, f2, i, f3, null, 0);
    }

    @Override
    public int mo7854e(boolean z) {
        return 0;
    }

    public void m23038f(Canvas canvas, float f, float f2, int i, float f3, AbstractC5143t tVar, int i2) {
        if (m23034l() * f3 > 0.0f) {
            int i3 = this.f17679Q;
            C1359b.m37511h(canvas, f, f2, i, this.f17689a, this.f17678P, C5063c.m24144b(this.f17677O, 2), this, i3 != 0 ? tVar.mo14042X(i3, i2) : null, this.f17682T, i2, C1357a0.m37541i(this.f17681S), f3 * m23034l(), this.f17690b.m29572a());
        }
    }

    @Override
    public int mo7853g(boolean z) {
        return 0;
    }

    public final int m23037h(float f, int i, int i2, int i3) {
        return C5064d.m24128d(C5064d.m24128d(C11524j.m228N(i), C11524j.m228N(i2), f), C11524j.m228N(i3), this.f17675M.m29584g());
    }

    public float m23036i() {
        return this.f17691c.m29584g();
    }

    public float m23035j(int i) {
        return (m23033m() + i) * m23034l();
    }

    public float m23034l() {
        return C5069h.m24089d(this.f17690b.m29572a());
    }

    public final float m23033m() {
        return C1359b.m37521C(this.f17678P, C5063c.m24144b(this.f17677O, 2), this.f17689a, this.f17679Q != 0 ? C1357a0.m37541i(this.f17680R) + C1357a0.m37541i(this.f17681S) : 0);
    }

    public void m23032n(boolean z) {
        m23026u(0, m23030p(), z);
    }

    public void m23031o(boolean z) {
        AbstractC5378c cVar = this.f17676N;
        if (cVar != null) {
            cVar.mo8362j(this, z);
        }
    }

    @Override
    public int mo7852o0(boolean z) {
        return C5406j.m22806e(this, z);
    }

    public boolean m23030p() {
        return this.f17691c.m29583h();
    }

    @Override
    public int mo7851p0(boolean z) {
        AbstractC5408k kVar = this.f17687Y;
        return kVar != null ? kVar.mo7851p0(z) : m23037h(m23036i(), R.id.theme_color_badge, R.id.theme_color_badgeMuted, R.id.theme_color_badgeFailed);
    }

    @Override
    public int mo7850r0(boolean z) {
        int i = this.f17686X;
        if (i != 0) {
            return C11524j.m228N(i);
        }
        return 0;
    }

    public RunnableC5390g mo23041a(String str) {
        return new RunnableC5390g.C5392b(str, Integer.MAX_VALUE, C1410y.m37083A0(this.f17678P), this).m22871s().m22887c(C5063c.m24144b(this.f17677O, 1)).m22884f();
    }

    public void m23027t(int i, boolean z) {
        m23026u(i, m23030p(), z);
    }

    public void m23026u(int i, boolean z, boolean z2) {
        AbstractC5378c cVar;
        boolean z3 = false;
        if (z2 && ((cVar = this.f17676N) == null || !cVar.mo8363d(this))) {
            z2 = false;
        }
        if (!z2 || C1379j0.m37357K()) {
            boolean z4 = z2 && m23034l() > 0.0f;
            this.f17691c.m29575p(z, z4);
            this.f17675M.m29575p(i == C10930q6.f34957B2, z4);
            if (i > 0 || i == C10930q6.f34956A2 || i == C10930q6.f34957B2) {
                z3 = true;
            }
            if (i == C10930q6.f34957B2 && this.f17679Q == 0) {
                this.f17689a.m29566s(i, "!", z4);
            } else if (i > 0) {
                long j = i;
                this.f17689a.m29566s(j, C1363c0.m37437f(j), z4);
            } else {
                this.f17689a.m29568m(z4);
            }
            this.f17690b.m29571b(z3, z2);
            return;
        }
        throw new AssertionError();
    }

    public void m23025v(boolean z, boolean z2) {
        this.f17691c.m29575p(z, z2);
    }

    public void m23024x(boolean z) {
        m23026u(C10930q6.f34956A2, m23030p(), z);
    }

    public void m23023y(boolean z, boolean z2) {
        if (z) {
            m23024x(z2);
        } else {
            m23032n(z2);
        }
    }
}
