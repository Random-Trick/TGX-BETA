package l5;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import k5.b;
import n6.l;
import n6.m;

public class s {
    public static <TResult> void a(@RecentlyNonNull Status status, TResult tresult, @RecentlyNonNull m<TResult> mVar) {
        if (status.f()) {
            mVar.c(tresult);
        } else {
            mVar.b(new b(status));
        }
    }

    public static void b(@RecentlyNonNull Status status, @RecentlyNonNull m<Void> mVar) {
        a(status, null, mVar);
    }

    @RecentlyNonNull
    @Deprecated
    public static l<Void> c(@RecentlyNonNull l<Boolean> lVar) {
        return lVar.i(new e2());
    }
}
