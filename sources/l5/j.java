package l5;

import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import l5.i;
import m5.r;

public class j {
    public final Set<i<?>> f16118a = Collections.newSetFromMap(new WeakHashMap());

    @RecentlyNonNull
    public static <L> i<L> a(@RecentlyNonNull L l10, @RecentlyNonNull Looper looper, @RecentlyNonNull String str) {
        r.l(l10, "Listener must not be null");
        r.l(looper, "Looper must not be null");
        r.l(str, "Listener type must not be null");
        return new i<>(looper, l10, str);
    }

    @RecentlyNonNull
    public static <L> i.a<L> b(@RecentlyNonNull L l10, @RecentlyNonNull String str) {
        r.l(l10, "Listener must not be null");
        r.l(str, "Listener type must not be null");
        r.h(str, "Listener type must not be empty");
        return new i.a<>(l10, str);
    }

    public final void c() {
        for (i<?> iVar : this.f16118a) {
            iVar.a();
        }
        this.f16118a.clear();
    }
}
