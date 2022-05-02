package p127j;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p028c1.AbstractC1451e0;
import p028c1.C1446d0;
import p028c1.C1454f0;

public class C5824h {
    public Interpolator f18596c;
    public AbstractC1451e0 f18597d;
    public boolean f18598e;
    public long f18595b = -1;
    public final C1454f0 f18599f = new C5825a();
    public final ArrayList<C1446d0> f18594a = new ArrayList<>();

    public class C5825a extends C1454f0 {
        public boolean f18600a = false;
        public int f18601b = 0;

        public C5825a() {
        }

        @Override
        public void mo11618b(View view) {
            int i = this.f18601b + 1;
            this.f18601b = i;
            if (i == C5824h.this.f18594a.size()) {
                AbstractC1451e0 e0Var = C5824h.this.f18597d;
                if (e0Var != null) {
                    e0Var.mo11618b(null);
                }
                m22063d();
            }
        }

        @Override
        public void mo11617c(View view) {
            if (!this.f18600a) {
                this.f18600a = true;
                AbstractC1451e0 e0Var = C5824h.this.f18597d;
                if (e0Var != null) {
                    e0Var.mo11617c(null);
                }
            }
        }

        public void m22063d() {
            this.f18601b = 0;
            this.f18600a = false;
            C5824h.this.m22070b();
        }
    }

    public void m22071a() {
        if (this.f18598e) {
            Iterator<C1446d0> it = this.f18594a.iterator();
            while (it.hasNext()) {
                it.next().m36901b();
            }
            this.f18598e = false;
        }
    }

    public void m22070b() {
        this.f18598e = false;
    }

    public C5824h m22069c(C1446d0 d0Var) {
        if (!this.f18598e) {
            this.f18594a.add(d0Var);
        }
        return this;
    }

    public C5824h m22068d(C1446d0 d0Var, C1446d0 d0Var2) {
        this.f18594a.add(d0Var);
        d0Var2.m36895h(d0Var.m36900c());
        this.f18594a.add(d0Var2);
        return this;
    }

    public C5824h m22067e(long j) {
        if (!this.f18598e) {
            this.f18595b = j;
        }
        return this;
    }

    public C5824h m22066f(Interpolator interpolator) {
        if (!this.f18598e) {
            this.f18596c = interpolator;
        }
        return this;
    }

    public C5824h m22065g(AbstractC1451e0 e0Var) {
        if (!this.f18598e) {
            this.f18597d = e0Var;
        }
        return this;
    }

    public void m22064h() {
        if (!this.f18598e) {
            Iterator<C1446d0> it = this.f18594a.iterator();
            while (it.hasNext()) {
                C1446d0 next = it.next();
                long j = this.f18595b;
                if (j >= 0) {
                    next.m36899d(j);
                }
                Interpolator interpolator = this.f18596c;
                if (interpolator != null) {
                    next.m36898e(interpolator);
                }
                if (this.f18597d != null) {
                    next.m36897f(this.f18599f);
                }
                next.m36893j();
            }
            this.f18598e = true;
        }
    }
}
