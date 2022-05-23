package l5;

import android.os.Bundle;
import java.util.Collections;
import k5.a;
import k5.k;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class m0 implements r0 {
    @NotOnlyInitialized
    public final u0 f16155a;

    public m0(u0 u0Var) {
        this.f16155a = u0Var;
    }

    @Override
    public final void a() {
        this.f16155a.h();
    }

    @Override
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k, A>> T b(T t10) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final void d() {
        for (a.f fVar : this.f16155a.f16244f.values()) {
            fVar.k();
        }
        this.f16155a.f16252n.f16199p = Collections.emptySet();
    }

    @Override
    public final <A extends a.b, R extends k, T extends com.google.android.gms.common.api.internal.a<R, A>> T e(T t10) {
        this.f16155a.f16252n.f16191h.add(t10);
        return t10;
    }

    @Override
    public final void f(Bundle bundle) {
    }

    @Override
    public final void g(j5.a aVar, a<?> aVar2, boolean z10) {
    }

    @Override
    public final void h(int i10) {
    }
}
