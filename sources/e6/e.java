package e6;

import h7.c;
import h7.d;
import h7.h;

public final class e implements h {
    public boolean f10700a = false;
    public boolean f10701b = false;
    public d f10702c;
    public final k8 f10703d;

    public e(k8 k8Var) {
        this.f10703d = k8Var;
    }

    public final void a(d dVar, boolean z10) {
        this.f10700a = false;
        this.f10702c = dVar;
        this.f10701b = z10;
    }

    public final void b() {
        if (!this.f10700a) {
            this.f10700a = true;
            return;
        }
        throw new c("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override
    public final h d(String str) {
        b();
        this.f10703d.f(this.f10702c, str, this.f10701b);
        return this;
    }

    @Override
    public final h e(boolean z10) {
        b();
        this.f10703d.g(this.f10702c, z10 ? 1 : 0, this.f10701b);
        return this;
    }
}
