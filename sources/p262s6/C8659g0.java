package p262s6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class C8659g0 extends C8653d0 implements AbstractC8663i0 {
    public C8659g0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    @Override
    public final void mo11799U(String str, Bundle bundle, AbstractC8667k0 k0Var) {
        Parcel q = m11806q();
        q.writeString(str);
        C8657f0.m11803b(q, bundle);
        C8657f0.m11802c(q, k0Var);
        m11805s(2, q);
    }

    @Override
    public final void mo11798c1(String str, Bundle bundle, AbstractC8667k0 k0Var) {
        Parcel q = m11806q();
        q.writeString(str);
        C8657f0.m11803b(q, bundle);
        C8657f0.m11802c(q, k0Var);
        m11805s(3, q);
    }
}
