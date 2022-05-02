package p217p4;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import p020b5.C1186a;
import p020b5.C1190c;
import p358z6.AbstractC11396q;

public final class C8035c {
    public AbstractC11396q<C8032b> m13737a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return C1190c.m38118b(C8032b.f26159b0, (ArrayList) C1186a.m38188e(readBundle.getParcelableArrayList("c")));
    }
}
