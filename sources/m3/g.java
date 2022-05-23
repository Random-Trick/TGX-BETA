package m3;

import a7.q;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c5.a;
import c5.l0;
import org.thunderdog.challegram.Log;

public final class g extends Binder {
    public static final int f16650a;

    static {
        f16650a = l0.f4841a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : Log.TAG_COMPRESS;
    }

    public static q<Bundle> a(IBinder iBinder) {
        int readInt;
        q.a x10 = q.x();
        int i10 = 1;
        int i11 = 0;
        while (i10 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i11);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            x10.a((Bundle) a.e(obtain2.readBundle()));
                            i11++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i10 = readInt;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return x10.h();
    }
}
