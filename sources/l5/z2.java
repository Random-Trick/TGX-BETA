package l5;

import android.os.Bundle;
import k5.a;
import k5.f;
import m5.r;

public final class z2 implements f.b, f.c {
    public final a<?> f16279a;
    public final boolean f16280b;
    public a3 f16281c;

    public z2(a<?> aVar, boolean z10) {
        this.f16279a = aVar;
        this.f16280b = z10;
    }

    public final void a(a3 a3Var) {
        this.f16281c = a3Var;
    }

    public final a3 b() {
        r.l(this.f16281c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f16281c;
    }

    @Override
    public final void q(int i10) {
        b().q(i10);
    }

    @Override
    public final void r(j5.a aVar) {
        b().x0(aVar, this.f16279a, this.f16280b);
    }

    @Override
    public final void t(Bundle bundle) {
        b().t(bundle);
    }
}
