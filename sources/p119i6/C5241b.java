package p119i6;

import android.graphics.Bitmap;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import p007a6.AbstractC0193f;
import p163l5.C6378r;

public final class C5241b {
    public static AbstractC0193f f17394a;

    @RecentlyNonNull
    public static C5240a m23556a(@RecentlyNonNull Bitmap bitmap) {
        C6378r.m20505l(bitmap, "image must not be null");
        try {
            return new C5240a(m23554c().mo42118y0(bitmap));
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public static void m23555b(AbstractC0193f fVar) {
        if (f17394a == null) {
            f17394a = (AbstractC0193f) C6378r.m20505l(fVar, "delegate must not be null");
        }
    }

    public static AbstractC0193f m23554c() {
        return (AbstractC0193f) C6378r.m20505l(f17394a, "IBitmapDescriptorFactory is not initialized");
    }
}
