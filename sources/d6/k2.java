package d6;

import h7.c;
import h7.d;
import h7.h;

public final class k2 implements h {
    public boolean f6620a = false;
    public boolean f6621b = false;
    public d f6622c;
    public final g2 f6623d;

    public k2(g2 g2Var) {
        this.f6623d = g2Var;
    }

    public final void a(d dVar, boolean z10) {
        this.f6620a = false;
        this.f6622c = dVar;
        this.f6621b = z10;
    }

    public final void b() {
        if (!this.f6620a) {
            this.f6620a = true;
            return;
        }
        throw new c("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override
    public final h d(String str) {
        b();
        this.f6623d.f(this.f6622c, str, this.f6621b);
        return this;
    }

    @Override
    public final h e(boolean z10) {
        b();
        this.f6623d.g(this.f6622c, z10 ? 1 : 0, this.f6621b);
        return this;
    }
}
