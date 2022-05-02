package p148k5;

import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p148k5.C6120i;
import p163l5.C6378r;

public class C6126j {
    public final Set<C6120i<?>> f19422a = Collections.newSetFromMap(new WeakHashMap());

    @RecentlyNonNull
    public static <L> C6120i<L> m21255a(@RecentlyNonNull L l, @RecentlyNonNull Looper looper, @RecentlyNonNull String str) {
        C6378r.m20505l(l, "Listener must not be null");
        C6378r.m20505l(looper, "Looper must not be null");
        C6378r.m20505l(str, "Listener type must not be null");
        return new C6120i<>(looper, l, str);
    }

    @RecentlyNonNull
    public static <L> C6120i.C6121a<L> m21254b(@RecentlyNonNull L l, @RecentlyNonNull String str) {
        C6378r.m20505l(l, "Listener must not be null");
        C6378r.m20505l(str, "Listener type must not be null");
        C6378r.m20509h(str, "Listener type must not be empty");
        return new C6120i.C6121a<>(l, str);
    }

    public final void m21253c() {
        for (C6120i<?> iVar : this.f19422a) {
            iVar.m21261a();
        }
        this.f19422a.clear();
    }
}
