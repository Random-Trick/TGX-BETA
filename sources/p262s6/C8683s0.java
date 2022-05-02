package p262s6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class C8683s0 extends C8653d0 {
    public C8683s0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void m11742n(Bundle bundle) {
        Parcel q = m11806q();
        C8657f0.m11803b(q, bundle);
        m11805s(4, q);
    }

    public final void m11741p0(Bundle bundle) {
        Parcel q = m11806q();
        C8657f0.m11803b(q, bundle);
        m11805s(3, q);
    }

    public final void m11740z(Bundle bundle, Bundle bundle2) {
        Parcel q = m11806q();
        C8657f0.m11803b(q, bundle);
        C8657f0.m11803b(q, bundle2);
        m11805s(2, q);
    }
}
