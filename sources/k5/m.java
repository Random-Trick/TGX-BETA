package k5;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import k5.k;

public abstract class m<R extends k> implements l<R> {
    @Override
    public final void a(@RecentlyNonNull R r10) {
        Status a10 = r10.a();
        if (a10.f()) {
            c(r10);
            return;
        }
        b(a10);
        if (r10 instanceof h) {
            try {
                ((h) r10).a();
            } catch (RuntimeException e10) {
                String valueOf = String.valueOf(r10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 18);
                sb2.append("Unable to release ");
                sb2.append(valueOf);
                Log.w("ResultCallbacks", sb2.toString(), e10);
            }
        }
    }

    public abstract void b(@RecentlyNonNull Status status);

    public abstract void c(@RecentlyNonNull R r10);
}
