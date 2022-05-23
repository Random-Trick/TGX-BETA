package j6;

import android.graphics.Bitmap;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import b6.f;
import m5.r;

public final class b {
    public static f f15097a;

    @RecentlyNonNull
    public static a a(@RecentlyNonNull Bitmap bitmap) {
        r.l(bitmap, "image must not be null");
        try {
            return new a(c().B0(bitmap));
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public static void b(f fVar) {
        if (f15097a == null) {
            f15097a = (f) r.l(fVar, "delegate must not be null");
        }
    }

    public static f c() {
        return (f) r.l(f15097a, "IBitmapDescriptorFactory is not initialized");
    }
}
