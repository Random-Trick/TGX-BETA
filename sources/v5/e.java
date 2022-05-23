package v5;

import android.os.IBinder;
import android.os.Parcel;
import u5.b;
import y5.a;
import y5.c;

public final class e extends a {
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final b t(b bVar, String str, int i10, b bVar2) {
        Parcel r10 = r();
        c.c(r10, bVar);
        r10.writeString(str);
        r10.writeInt(i10);
        c.c(r10, bVar2);
        Parcel q10 = q(2, r10);
        b r11 = b.a.r(q10.readStrongBinder());
        q10.recycle();
        return r11;
    }

    public final b x0(b bVar, String str, int i10, b bVar2) {
        Parcel r10 = r();
        c.c(r10, bVar);
        r10.writeString(str);
        r10.writeInt(i10);
        c.c(r10, bVar2);
        Parcel q10 = q(3, r10);
        b r11 = b.a.r(q10.readStrongBinder());
        q10.recycle();
        return r11;
    }
}
