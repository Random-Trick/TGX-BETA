package v5;

import android.os.IBinder;
import android.os.Parcel;
import u5.b;
import y5.a;
import y5.c;

public final class d extends a {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final b E1(b bVar, String str, int i10) {
        Parcel r10 = r();
        c.c(r10, bVar);
        r10.writeString(str);
        r10.writeInt(i10);
        Parcel q10 = q(4, r10);
        b r11 = b.a.r(q10.readStrongBinder());
        q10.recycle();
        return r11;
    }

    public final int F1(b bVar, String str, boolean z10) {
        Parcel r10 = r();
        c.c(r10, bVar);
        r10.writeString(str);
        c.a(r10, z10);
        Parcel q10 = q(5, r10);
        int readInt = q10.readInt();
        q10.recycle();
        return readInt;
    }

    public final int G1() {
        Parcel q10 = q(6, r());
        int readInt = q10.readInt();
        q10.recycle();
        return readInt;
    }

    public final b H1(b bVar, String str, boolean z10, long j10) {
        Parcel r10 = r();
        c.c(r10, bVar);
        r10.writeString(str);
        c.a(r10, z10);
        r10.writeLong(j10);
        Parcel q10 = q(7, r10);
        b r11 = b.a.r(q10.readStrongBinder());
        q10.recycle();
        return r11;
    }

    public final b I1(b bVar, String str, int i10, b bVar2) {
        Parcel r10 = r();
        c.c(r10, bVar);
        r10.writeString(str);
        r10.writeInt(i10);
        c.c(r10, bVar2);
        Parcel q10 = q(8, r10);
        b r11 = b.a.r(q10.readStrongBinder());
        q10.recycle();
        return r11;
    }

    public final b t(b bVar, String str, int i10) {
        Parcel r10 = r();
        c.c(r10, bVar);
        r10.writeString(str);
        r10.writeInt(i10);
        Parcel q10 = q(2, r10);
        b r11 = b.a.r(q10.readStrongBinder());
        q10.recycle();
        return r11;
    }

    public final int x0(b bVar, String str, boolean z10) {
        Parcel r10 = r();
        c.c(r10, bVar);
        r10.writeString(str);
        c.a(r10, z10);
        Parcel q10 = q(3, r10);
        int readInt = q10.readInt();
        q10.recycle();
        return readInt;
    }
}
