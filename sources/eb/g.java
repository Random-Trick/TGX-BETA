package eb;

import db.b;
import eb.k;
import gb.j;

public final class g {
    public final f f11440a;

    public class a implements k.b {
        public final j f11441a;

        public a(j jVar) {
            this.f11441a = jVar;
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            this.f11441a.invalidate();
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            this.f11441a.invalidate();
        }
    }

    public g(j jVar) {
        this.f11440a = new f(0, new a(jVar), b.f7291f, 210L);
    }

    public float a() {
        return this.f11440a.g();
    }

    public void b(boolean z10, boolean z11) {
        if (z11) {
            if (!z10 || this.f11440a.g() != 0.0f) {
                this.f11440a.n(b.f7287b);
                this.f11440a.l(100L);
            } else {
                this.f11440a.n(b.f7291f);
                this.f11440a.l(210L);
            }
        }
        this.f11440a.p(z10, z11);
    }

    public g(k.b bVar) {
        this.f11440a = new f(0, bVar, b.f7291f, 210L);
    }
}
