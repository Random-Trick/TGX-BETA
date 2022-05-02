package p075f6;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import p133j5.AbstractC5867f;
import p133j5.C5850a;
import p163l5.C6378r;
import p357z5.C11286b0;
import p357z5.C11289d;
import p357z5.C11312o0;
import p357z5.C11317t;

public class C4282f {
    @RecentlyNonNull
    public static final C5850a<C5850a.AbstractC5854d.C5857c> f14330a;
    @RecentlyNonNull
    @Deprecated
    public static final AbstractC4272a f14331b = new C11312o0();
    @RecentlyNonNull
    @Deprecated
    public static final AbstractC4276c f14332c = new C11289d();
    @RecentlyNonNull
    @Deprecated
    public static final AbstractC4293k f14333d = new C11286b0();
    public static final C5850a.C5860g<C11317t> f14334e;
    public static final C5850a.AbstractC5851a<C11317t, C5850a.AbstractC5854d.C5857c> f14335f;

    static {
        C5850a.C5860g<C11317t> gVar = new C5850a.C5860g<>();
        f14334e = gVar;
        C4283f0 f0Var = new C4283f0();
        f14335f = f0Var;
        f14330a = new C5850a<>("LocationServices.API", f0Var, gVar);
    }

    @RecentlyNonNull
    public static C4274b m28304a(@RecentlyNonNull Context context) {
        return new C4274b(context);
    }

    @RecentlyNonNull
    public static C4295l m28303b(@RecentlyNonNull Context context) {
        return new C4295l(context);
    }

    public static C11317t m28302c(AbstractC5867f fVar) {
        boolean z = true;
        C6378r.m20516b(fVar != null, "GoogleApiClient parameter is required.");
        C11317t tVar = (C11317t) fVar.mo21174h(f14334e);
        if (tVar == null) {
            z = false;
        }
        C6378r.m20504n(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return tVar;
    }
}
