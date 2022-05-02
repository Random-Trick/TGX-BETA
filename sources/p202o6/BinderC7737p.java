package p202o6;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public final class BinderC7737p extends BinderC7717l {
    public final C7757t f24780c;

    public BinderC7737p(C7757t tVar, C9865p pVar) {
        super(tVar, pVar);
        this.f24780c = tVar;
    }

    @Override
    public final void mo11759h1(Bundle bundle, Bundle bundle2) {
        AtomicBoolean atomicBoolean;
        C8646a aVar;
        super.mo11759h1(bundle, bundle2);
        atomicBoolean = this.f24780c.f24847f;
        if (!atomicBoolean.compareAndSet(true, false)) {
            aVar = C7757t.f24840g;
            aVar.m11814e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f24780c.mo15131k();
        }
    }

    @Override
    public final void mo11754p0(Bundle bundle) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24780c.f24846e;
        mVar.m11776s(this.f24741a);
        int i = bundle.getInt("error_code");
        aVar = C7757t.f24840g;
        aVar.m11817b("onError(%d)", Integer.valueOf(i));
        this.f24741a.m6732d(new C7657a(i));
    }
}
