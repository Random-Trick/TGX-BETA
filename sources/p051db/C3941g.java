package p051db;

import p037cb.C2057b;
import p051db.C3950k;
import p080fb.AbstractC4345j;

public final class C3941g {
    public final C3940f f13272a;

    public class C3942a implements C3950k.AbstractC3952b {
        public final AbstractC4345j f13273a;

        public C3942a(AbstractC4345j jVar) {
            this.f13273a = jVar;
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            this.f13273a.invalidate();
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            this.f13273a.invalidate();
        }
    }

    public C3941g(AbstractC4345j jVar) {
        this.f13272a = new C3940f(0, new C3942a(jVar), C2057b.f7284f, 210L);
    }

    public float m29574a() {
        return this.f13272a.m29586g();
    }

    public void m29573b(boolean z, boolean z2) {
        if (z2) {
            if (!z || this.f13272a.m29586g() != 0.0f) {
                this.f13272a.m29579n(C2057b.f7280b);
                this.f13272a.m29581l(100L);
            } else {
                this.f13272a.m29579n(C2057b.f7284f);
                this.f13272a.m29581l(210L);
            }
        }
        this.f13272a.m29577p(z, z2);
    }

    public C3941g(C3950k.AbstractC3952b bVar) {
        this.f13272a = new C3940f(0, bVar, C2057b.f7284f, 210L);
    }
}
