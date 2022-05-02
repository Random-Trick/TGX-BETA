package p357z5;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.InvocationTargetException;
import p075f6.AbstractC4272a;
import p075f6.AbstractC4280e;
import p075f6.C4282f;
import p133j5.AbstractC5867f;
import p133j5.AbstractC5871g;
import p163l5.C6378r;

public final class C11312o0 implements AbstractC4272a {
    @Override
    public final AbstractC5871g<Status> mo923a(AbstractC5867f fVar, LocationRequest locationRequest, AbstractC4280e eVar) {
        C6378r.m20505l(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return fVar.mo21174g(new C11304k0(this, fVar, locationRequest, eVar));
    }

    @Override
    public final Location mo922b(AbstractC5867f fVar) {
        String str;
        C11317t c = C4282f.m28300c(fVar);
        Context i = fVar.mo21172i();
        try {
            if (Build.VERSION.SDK_INT >= 30 && i != null) {
                try {
                    str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(i, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
                return c.m899t0(str);
            }
            return c.m899t0(str);
        } catch (Exception unused2) {
            return null;
        }
        str = null;
    }

    @Override
    public final AbstractC5871g<Status> mo921c(AbstractC5867f fVar, AbstractC4280e eVar) {
        return fVar.mo21174g(new C11306l0(this, fVar, eVar));
    }
}
