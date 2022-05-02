package p299v5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class C9841a implements IInterface {
    public final IBinder f32120a;
    public final String f32121b;

    public C9841a(IBinder iBinder, String str) {
        this.f32120a = iBinder;
        this.f32121b = str;
    }

    public final void m6762E0(int i, Parcel parcel) {
        try {
            this.f32120a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f32120a;
    }

    public final Parcel m6761q() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32121b);
        return obtain;
    }

    public final Parcel m6760s(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f32120a.transact(2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final void m6759t(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f32120a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
