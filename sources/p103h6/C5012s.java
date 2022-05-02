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
    public final void mo24322J(boolean z) {
        Parcel s = m42126s();
        C0190c.m42123b(s, z);
        m42125t(3, s);
    }

    @Override
    public final void mo24321M(boolean z) {
        Parcel s = m42126s();
        C0190c.m42123b(s, z);
        m42125t(2, s);
    }

    @Override
    public final void mo24320v0(boolean z) {
        Parcel s = m42126s();
        C0190c.m42123b(s, z);
        m42125t(1, s);
    }
}
