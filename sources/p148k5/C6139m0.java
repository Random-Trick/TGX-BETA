package p148k5;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.AbstractC3487a;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p118i5.C5217a;
import p133j5.AbstractC5876k;
import p133j5.C5850a;

public final class C6139m0 implements AbstractC6161r0 {
    @NotOnlyInitialized
    public final C6173u0 f19468a;

    public C6139m0(C6173u0 u0Var) {
        this.f19468a = u0Var;
    }

    @Override
    public final void mo21149a() {
        this.f19468a.m21112h();
    }

    @Override
    public final <A extends C5850a.AbstractC5852b, T extends AbstractC3487a<? extends AbstractC5876k, A>> T mo21148b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public final boolean mo21147c() {
        return true;
    }

    @Override
    public final void mo21146d() {
        for (C5850a.AbstractC5859f fVar : this.f19468a.f19558f.values()) {
            fVar.mo905j();
        }
        this.f19468a.f19566n.f19512p = Collections.emptySet();
    }

    @Override
    public final <A extends C5850a.AbstractC5852b, R extends AbstractC5876k, T extends AbstractC3487a<R, A>> T mo21145e(T t) {
        this.f19468a.f19566n.f19504h.add(t);
        return t;
    }

    @Override
    public final void mo21144f(Bundle bundle) {
    }

    @Override
    public final void mo21143g(int i) {
    }

    @Override
    public final void mo21142h(C5217a aVar, C5850a<?> aVar2, boolean z) {
    }
}
