package b6;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import u5.b;

public final class d extends a implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override
    public final b B0(Bitmap bitmap) {
        Parcel r10 = r();
        c.d(r10, bitmap);
        Parcel q10 = q(6, r10);
        b r11 = b.a.r(q10.readStrongBinder());
        q10.recycle();
        return r11;
    }
}
