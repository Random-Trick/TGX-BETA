package p6;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import t6.a;
import t6.m;

public final class p extends l {
    public final t f20737c;

    public p(t tVar, w6.p pVar) {
        super(tVar, pVar);
        this.f20737c = tVar;
    }

    @Override
    public final void h1(Bundle bundle, Bundle bundle2) {
        AtomicBoolean atomicBoolean;
        a aVar;
        super.h1(bundle, bundle2);
        atomicBoolean = this.f20737c.f20802f;
        if (!atomicBoolean.compareAndSet(true, false)) {
            aVar = t.f20795g;
            aVar.e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f20737c.k();
        }
    }

    @Override
    public final void r0(Bundle bundle) {
        m mVar;
        a aVar;
        mVar = this.f20737c.f20801e;
        mVar.s(this.f20698a);
        int i10 = bundle.getInt("error_code");
        aVar = t.f20795g;
        aVar.b("onError(%d)", Integer.valueOf(i10));
        this.f20698a.d(new a(i10));
    }
}
