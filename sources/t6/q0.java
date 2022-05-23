package t6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class q0 extends e0 implements r0 {
    public q0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        s0 s0Var = null;
        if (i10 == 2) {
            Bundle bundle = (Bundle) f0.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                s0Var = queryLocalInterface instanceof s0 ? (s0) queryLocalInterface : new s0(readStrongBinder);
            }
            d1(bundle, s0Var);
            return true;
        } else if (i10 != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) f0.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                s0Var = queryLocalInterface2 instanceof s0 ? (s0) queryLocalInterface2 : new s0(readStrongBinder2);
            }
            u1(bundle2, s0Var);
            return true;
        }
    }
}
