package g6;

import a6.b0;
import a6.d;
import a6.o0;
import a6.t;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import k5.a;
import m5.r;

public class f {
    @RecentlyNonNull
    public static final a<a.d.c> f12106a;
    @RecentlyNonNull
    @Deprecated
    public static final a f12107b = new o0();
    @RecentlyNonNull
    @Deprecated
    public static final c f12108c = new d();
    @RecentlyNonNull
    @Deprecated
    public static final k f12109d = new b0();
    public static final a.g<t> f12110e;
    public static final a.AbstractC0141a<t, a.d.c> f12111f;

    static {
        a.g<t> gVar = new a.g<>();
        f12110e = gVar;
        f0 f0Var = new f0();
        f12111f = f0Var;
        f12106a = new a<>("LocationServices.API", f0Var, gVar);
    }

    @RecentlyNonNull
    public static b a(@RecentlyNonNull Context context) {
        return new b(context);
    }

    @RecentlyNonNull
    public static l b(@RecentlyNonNull Context context) {
        return new l(context);
    }

    public static t c(k5.f fVar) {
        boolean z10 = true;
        r.b(fVar != null, "GoogleApiClient parameter is required.");
        t tVar = (t) fVar.h(f12110e);
        if (tVar == null) {
            z10 = false;
        }
        r.n(z10, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return tVar;
    }
}
