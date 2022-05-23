package i6;

import android.os.IBinder;
import android.os.Parcel;
import b6.a;
import b6.c;

public final class s extends a implements f {
    public s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override
    public final void J(boolean z10) {
        Parcel r10 = r();
        c.b(r10, z10);
        t(3, r10);
    }

    @Override
    public final void M(boolean z10) {
        Parcel r10 = r();
        c.b(r10, z10);
        t(2, r10);
    }

    @Override
    public final void y0(boolean z10) {
        Parcel r10 = r();
        c.b(r10, z10);
        t(1, r10);
    }
}
