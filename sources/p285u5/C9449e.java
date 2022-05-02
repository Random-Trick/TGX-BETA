package p285u5;

import android.os.IBinder;
import android.os.Parcel;
import p272t5.AbstractC8983b;
import p327x5.C10097a;
import p327x5.C10099c;

public final class C9449e extends C10097a {
    public C9449e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final AbstractC8983b m8621E0(AbstractC8983b bVar, String str, int i, AbstractC8983b bVar2) {
        Parcel s = m6025s();
        C10099c.m6021c(s, bVar);
        s.writeString(str);
        s.writeInt(i);
        C10099c.m6021c(s, bVar2);
        Parcel q = m6026q(3, s);
        AbstractC8983b s2 = AbstractC8983b.AbstractBinderC8984a.m10768s(q.readStrongBinder());
        q.recycle();
        return s2;
    }

    public final AbstractC8983b m8620t(AbstractC8983b bVar, String str, int i, AbstractC8983b bVar2) {
        Parcel s = m6025s();
        C10099c.m6021c(s, bVar);
        s.writeString(str);
        s.writeInt(i);
        C10099c.m6021c(s, bVar2);
        Parcel q = m6026q(2, s);
        AbstractC8983b s2 = AbstractC8983b.AbstractBinderC8984a.m10768s(q.readStrongBinder());
        q.recycle();
        return s2;
    }
}
