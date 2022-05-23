package q4;

import a7.q;
import android.os.Bundle;
import android.os.Parcel;
import c5.a;
import java.util.ArrayList;

public final class c {
    public q<b> a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return c5.c.b(b.f21378b0, (ArrayList) a.e(readBundle.getParcelableArrayList("c")));
    }
}
