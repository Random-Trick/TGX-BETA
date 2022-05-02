package p149k6;

import android.os.IBinder;
import android.os.Parcel;
import p163l5.AbstractC6355k;
import p299v5.C9841a;
import p299v5.C9843c;

public final class C6202g extends C9841a {
    public C6202g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void m21072G1(int i) {
        Parcel q = m6761q();
        q.writeInt(i);
        m6759t(7, q);
    }

    public final void m21071H1(AbstractC6355k kVar, int i, boolean z) {
        Parcel q = m6761q();
        C9843c.m6754d(q, kVar);
        q.writeInt(i);
        C9843c.m6757a(q, z);
        m6759t(9, q);
    }

    public final void m21070I1(C6205j jVar, AbstractC6201f fVar) {
        Parcel q = m6761q();
        C9843c.m6755c(q, jVar);
        C9843c.m6754d(q, fVar);
        m6759t(12, q);
    }
}
