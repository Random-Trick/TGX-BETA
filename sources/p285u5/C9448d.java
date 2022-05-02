package p285u5;

import android.os.IBinder;
import android.os.Parcel;
import p272t5.AbstractC8983b;
import p327x5.C10097a;
import p327x5.C10099c;

public final class C9448d extends C10097a {
    public C9448d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int m8628E0(AbstractC8983b bVar, String str, boolean z) {
        Parcel s = m6025s();
        C10099c.m6021c(s, bVar);
        s.writeString(str);
        C10099c.m6023a(s, z);
        Parcel q = m6026q(3, s);
        int readInt = q.readInt();
        q.recycle();
        return readInt;
    }

    public final AbstractC8983b m8627G1(AbstractC8983b bVar, String str, int i) {
        Parcel s = m6025s();
        C10099c.m6021c(s, bVar);
        s.writeString(str);
        s.writeInt(i);
        Parcel q = m6026q(4, s);
        AbstractC8983b s2 = AbstractC8983b.AbstractBinderC8984a.m10768s(q.readStrongBinder());
        q.recycle();
        return s2;
    }

    public final int m8626H1(AbstractC8983b bVar, String str, boolean z) {
        Parcel s = m6025s();
        C10099c.m6021c(s, bVar);
        s.writeString(str);
        C10099c.m6023a(s, z);
        Parcel q = m6026q(5, s);
        int readInt = q.readInt();
        q.recycle();
        return readInt;
    }

    public final int m8625I1() {
        Parcel q = m6026q(6, m6025s());
        int readInt = q.readInt();
        q.recycle();
        return readInt;
    }

    public final AbstractC8983b m8624J1(AbstractC8983b bVar, String str, boolean z, long j) {
        Parcel s = m6025s();
        C10099c.m6021c(s, bVar);
        s.writeString(str);
        C10099c.m6023a(s, z);
        s.writeLong(j);
        Parcel q = m6026q(7, s);
        AbstractC8983b s2 = AbstractC8983b.AbstractBinderC8984a.m10768s(q.readStrongBinder());
        q.recycle();
        return s2;
    }

    public final AbstractC8983b m8623K1(AbstractC8983b bVar, String str, int i, AbstractC8983b bVar2) {
        Parcel s = m6025s();
        C10099c.m6021c(s, bVar);
        s.writeString(str);
        s.writeInt(i);
        C10099c.m6021c(s, bVar2);
        Parcel q = m6026q(8, s);
        AbstractC8983b s2 = AbstractC8983b.AbstractBinderC8984a.m10768s(q.readStrongBinder());
        q.recycle();
        return s2;
    }

    public final AbstractC8983b m8622t(AbstractC8983b bVar, String str, int i) {
        Parcel s = m6025s();
        C10099c.m6021c(s, bVar);
        s.writeString(str);
        s.writeInt(i);
        Parcel q = m6026q(2, s);
        AbstractC8983b s2 = AbstractC8983b.AbstractBinderC8984a.m10768s(q.readStrongBinder());
        q.recycle();
        return s2;
    }
}
