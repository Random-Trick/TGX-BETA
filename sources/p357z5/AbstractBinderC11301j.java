package p357z5;

import android.os.Parcel;
import p075f6.C4289i;

public abstract class AbstractBinderC11301j extends BinderC11318u implements AbstractC11303k {
    public AbstractBinderC11301j() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override
    public final boolean mo898q(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo907i0((C4289i) C11290d0.m947b(parcel, C4289i.CREATOR));
        return true;
    }
}
