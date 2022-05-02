package p217p4;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import p020b5.C1186a;
import p020b5.C1190c;
import p358z6.AbstractC11396q;

public final class C8035c {
    public AbstractC11396q<C8032b> m13738a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return C1190c.m38115b(C8032b.f26156b0, (ArrayList) C1186a.m38185e(readBundle.getParcelableArrayList("c")));
    }
}
