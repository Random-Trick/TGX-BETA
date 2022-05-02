package p262s6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class C8683s0 extends C8653d0 {
    public C8683s0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void m11741n(Bundle bundle) {
        Parcel q = m11805q();
        C8657f0.m11802b(q, bundle);
        m11804s(4, q);
    }

    public final void m11740p0(Bundle bundle) {
        Parcel q = m11805q();
        C8657f0.m11802b(q, bundle);
        m11804s(3, q);
    }

    public final void m11739z(Bundle bundle, Bundle bundle2) {
        Parcel q = m11805q();
        C8657f0.m11802b(q, bundle);
        C8657f0.m11802b(q, bundle2);
        m11804s(2, q);
    }
}
