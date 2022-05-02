package p163l5;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

public final class C6381s {
    public static C6381s f20018b;
    public static final C6384t f20019c = new C6384t(0, false, false, 0, 0);
    public C6384t f20020a;

    @RecentlyNonNull
    public static synchronized C6381s m20498b() {
        C6381s sVar;
        synchronized (C6381s.class) {
            if (f20018b == null) {
                f20018b = new C6381s();
            }
            sVar = f20018b;
        }
        return sVar;
    }

    @RecentlyNullable
    public C6384t m20499a() {
        return this.f20020a;
    }

    public final synchronized void m20497c(C6384t tVar) {
        if (tVar == null) {
            this.f20020a = f20019c;
            return;
        }
        C6384t tVar2 = this.f20020a;
        if (tVar2 == null || tVar2.m20488f() < tVar.m20488f()) {
            this.f20020a = tVar;
        }
    }
}
