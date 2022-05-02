package p174m3;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1216l0;
import p358z6.AbstractC11396q;

public final class BinderC6598g extends Binder {
    public static final int f20563a;

    static {
        f20563a = C1216l0.f4526a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : Log.TAG_COMPRESS;
    }

    public static AbstractC11396q<Bundle> m19904a(IBinder iBinder) {
        int readInt;
        AbstractC11396q.C11397a x = AbstractC11396q.m760x();
        int i = 1;
        int i2 = 0;
        while (i != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i2);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            x.m757d((Bundle) C1186a.m38188e(obtain2.readBundle()));
                            i2++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return x.m756e();
    }
}
