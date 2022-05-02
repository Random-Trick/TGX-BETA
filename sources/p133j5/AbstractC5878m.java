package p133j5;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import p133j5.AbstractC5876k;

public abstract class AbstractC5878m<R extends AbstractC5876k> implements AbstractC5877l<R> {
    @Override
    public final void mo11472a(@RecentlyNonNull R r) {
        Status a = r.mo952a();
        if (a.m30393f()) {
            m21896c(r);
            return;
        }
        m21897b(a);
        if (r instanceof AbstractC5873h) {
            try {
                ((AbstractC5873h) r).m21899a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(r);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 18);
                sb2.append("Unable to release ");
                sb2.append(valueOf);
                Log.w("ResultCallbacks", sb2.toString(), e);
            }
        }
    }

    public abstract void m21897b(@RecentlyNonNull Status status);

    public abstract void m21896c(@RecentlyNonNull R r);
}
