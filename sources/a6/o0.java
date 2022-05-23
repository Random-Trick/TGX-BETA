package a6;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import g6.a;
import g6.e;
import java.lang.reflect.InvocationTargetException;
import k5.f;
import k5.g;
import m5.r;

public final class o0 implements a {
    @Override
    public final Location a(f fVar) {
        String str;
        t c10 = g6.f.c(fVar);
        Context i10 = fVar.i();
        try {
            if (Build.VERSION.SDK_INT >= 30 && i10 != null) {
                try {
                    str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(i10, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
                return c10.t0(str);
            }
            return c10.t0(str);
        } catch (Exception unused2) {
            return null;
        }
        str = null;
    }

    @Override
    public final g<Status> b(f fVar, e eVar) {
        return fVar.g(new l0(this, fVar, eVar));
    }

    @Override
    public final g<Status> c(f fVar, LocationRequest locationRequest, e eVar) {
        r.l(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return fVar.g(new k0(this, fVar, locationRequest, eVar));
    }
}
