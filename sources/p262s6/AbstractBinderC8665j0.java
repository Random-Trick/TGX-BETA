package p262s6;

import android.os.Bundle;
import android.os.Parcel;

public abstract class AbstractBinderC8665j0 extends BinderC8655e0 implements AbstractC8667k0 {
    public AbstractBinderC8665j0() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override
    public final boolean mo11748q(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            mo11794n((Bundle) C8657f0.m11803a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            mo11795P0((Bundle) C8657f0.m11803a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
