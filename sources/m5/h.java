package m5;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import j5.d;
import java.util.Collections;
import java.util.Set;
import k5.a;
import k5.f;
import l5.e;
import l5.l;

public abstract class h<T extends IInterface> extends c<T> implements a.f, j0 {
    public final e f17206o0;
    public final Set<Scope> f17207p0;
    public final Account f17208q0;

    @Deprecated
    public h(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i10, @RecentlyNonNull e eVar, @RecentlyNonNull f.b bVar, @RecentlyNonNull f.c cVar) {
        this(context, looper, i10, eVar, (e) bVar, (l) cVar);
    }

    @Override
    @RecentlyNonNull
    public final Set<Scope> F() {
        return this.f17207p0;
    }

    @Override
    public Set<Scope> d() {
        return u() ? this.f17207p0 : Collections.emptySet();
    }

    public Set<Scope> l0(@RecentlyNonNull Set<Scope> set) {
        return set;
    }

    public final Set<Scope> m0(Set<Scope> set) {
        Set<Scope> l02 = l0(set);
        for (Scope scope : l02) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return l02;
    }

    @Override
    @RecentlyNullable
    public final Account y() {
        return this.f17208q0;
    }

    public h(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i10, @RecentlyNonNull e eVar, @RecentlyNonNull e eVar2, @RecentlyNonNull l lVar) {
        this(context, looper, i.b(context), d.p(), i10, eVar, (e) r.k(eVar2), (l) r.k(lVar));
    }

    public h(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull i iVar, @RecentlyNonNull d dVar, int i10, @RecentlyNonNull e eVar, e eVar2, l lVar) {
        super(context, looper, iVar, dVar, i10, eVar2 == null ? null : new h0(eVar2), lVar == null ? null : new i0(lVar), eVar.g());
        this.f17206o0 = eVar;
        this.f17208q0 = eVar.a();
        this.f17207p0 = m0(eVar.c());
    }
}
