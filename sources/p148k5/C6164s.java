package p148k5;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import p133j5.C5861b;
import p177m6.AbstractC6775l;
import p177m6.C6777m;

public class C6164s {
    public static <TResult> void m21136a(@RecentlyNonNull Status status, TResult tresult, @RecentlyNonNull C6777m<TResult> mVar) {
        if (status.m30393f()) {
            mVar.m19084c(tresult);
        } else {
            mVar.m19085b(new C5861b(status));
        }
    }

    public static void m21135b(@RecentlyNonNull Status status, @RecentlyNonNull C6777m<Void> mVar) {
        m21136a(status, null, mVar);
    }

    @RecentlyNonNull
    @Deprecated
    public static AbstractC6775l<Void> m21134c(@RecentlyNonNull AbstractC6775l<Boolean> lVar) {
        return lVar.mo19072i(new C6104e2());
    }
}
