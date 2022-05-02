package p262s6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class AbstractBinderC8679q0 extends BinderC8655e0 implements AbstractC8681r0 {
    public AbstractBinderC8679q0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override
    public final boolean mo11749q(int i, Parcel parcel, Parcel parcel2, int i2) {
        C8683s0 s0Var = null;
        if (i == 2) {
            Bundle bundle = (Bundle) C8657f0.m11804a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                s0Var = queryLocalInterface instanceof C8683s0 ? (C8683s0) queryLocalInterface : new C8683s0(readStrongBinder);
            }
            mo11746B(bundle, s0Var);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) C8657f0.m11804a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                s0Var = queryLocalInterface2 instanceof C8683s0 ? (C8683s0) queryLocalInterface2 : new C8683s0(readStrongBinder2);
            }
            mo11745S(bundle2, s0Var);
            return true;
        }
    }
}
