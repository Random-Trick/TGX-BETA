package p202o6;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class BinderC7737p extends BinderC7717l {
    public final C7757t f24783c;

    public BinderC7737p(C7757t tVar, C9865p pVar) {
        super(tVar, pVar);
        this.f24783c = tVar;
    }

    @Override
    public final void mo11758h1(Bundle bundle, Bundle bundle2) {
        AtomicBoolean atomicBoolean;
        C8646a aVar;
        super.mo11758h1(bundle, bundle2);
        atomicBoolean = this.f24783c.f24850f;
        if (!atomicBoolean.compareAndSet(true, false)) {
            aVar = C7757t.f24843g;
            aVar.m11813e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f24783c.mo15131k();
        }
    }

    @Override
    public final void mo11753p0(Bundle bundle) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24783c.f24849e;
        mVar.m11775s(this.f24744a);
        int i = bundle.getInt("error_code");
        aVar = C7757t.f24843g;
        aVar.m11816b("onError(%d)", Integer.valueOf(i));
        this.f24744a.m6732d(new C7657a(i));
    }
}
