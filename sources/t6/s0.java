package t6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class s0 extends d0 {
    public s0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void n(Bundle bundle) {
        Parcel q10 = q();
        f0.b(q10, bundle);
        r(4, q10);
    }

    public final void r0(Bundle bundle) {
        Parcel q10 = q();
        f0.b(q10, bundle);
        r(3, q10);
    }

    public final void y(Bundle bundle, Bundle bundle2) {
        Parcel q10 = q();
        f0.b(q10, bundle);
        f0.b(q10, bundle2);
        r(2, q10);
    }
}
