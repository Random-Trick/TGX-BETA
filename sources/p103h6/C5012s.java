package p103h6;

import android.os.IBinder;
import android.os.Parcel;
import p007a6.C0188a;
import p007a6.C0190c;

public final class C5012s extends C0188a implements AbstractC4997f {
    public C5012s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override
    public final void mo24323J(boolean z) {
        Parcel s = m42129s();
        C0190c.m42126b(s, z);
        m42128t(3, s);
    }

    @Override
    public final void mo24322M(boolean z) {
        Parcel s = m42129s();
        C0190c.m42126b(s, z);
        m42128t(2, s);
    }

    @Override
    public final void mo24321v0(boolean z) {
        Parcel s = m42129s();
        C0190c.m42126b(s, z);
        m42128t(1, s);
    }
}
