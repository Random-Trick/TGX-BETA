package p163l5;

import android.os.IBinder;
import android.os.Parcel;
import p272t5.AbstractC8983b;
import p299v5.C9841a;
import p299v5.C9843c;

public final class C6363m0 extends C9841a {
    public C6363m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final AbstractC8983b m20545G1(AbstractC8983b bVar, C6382s0 s0Var) {
        Parcel q = m6761q();
        C9843c.m6754d(q, bVar);
        C9843c.m6755c(q, s0Var);
        Parcel s = m6760s(2, q);
        AbstractC8983b s2 = AbstractC8983b.AbstractBinderC8984a.m10768s(s.readStrongBinder());
        s.recycle();
        return s2;
    }
}
