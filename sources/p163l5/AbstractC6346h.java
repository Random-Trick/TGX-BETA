package p163l5;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import p118i5.C5220d;
import p133j5.AbstractC5867f;
import p133j5.C5850a;
import p148k5.AbstractC6101e;
import p148k5.AbstractC6134l;

public abstract class AbstractC6346h<T extends IInterface> extends AbstractC6325c<T> implements C5850a.AbstractC5859f, AbstractC6353j0 {
    public final C6336e f19949o0;
    public final Set<Scope> f19950p0;
    public final Account f19951q0;

    @Deprecated
    public AbstractC6346h(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i, @RecentlyNonNull C6336e eVar, @RecentlyNonNull AbstractC5867f.AbstractC5869b bVar, @RecentlyNonNull AbstractC5867f.AbstractC5870c cVar) {
        this(context, looper, i, eVar, (AbstractC6101e) bVar, (AbstractC6134l) cVar);
    }

    @Override
    @RecentlyNonNull
    public final Set<Scope> mo20584F() {
        return this.f19950p0;
    }

    @Override
    public Set<Scope> mo20583d() {
        return mo20627t() ? this.f19950p0 : Collections.emptySet();
    }

    public Set<Scope> m20582l0(@RecentlyNonNull Set<Scope> set) {
        return set;
    }

    public final Set<Scope> m20581m0(Set<Scope> set) {
        Set<Scope> l0 = m20582l0(set);
        for (Scope scope : l0) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return l0;
    }

    @Override
    @RecentlyNullable
    public final Account mo20580y() {
        return this.f19951q0;
    }

    public AbstractC6346h(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i, @RecentlyNonNull C6336e eVar, @RecentlyNonNull AbstractC6101e eVar2, @RecentlyNonNull AbstractC6134l lVar) {
        this(context, looper, AbstractC6349i.m20576b(context), C5220d.m23605p(), i, eVar, (AbstractC6101e) C6378r.m20507k(eVar2), (AbstractC6134l) C6378r.m20507k(lVar));
    }

    public AbstractC6346h(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull AbstractC6349i iVar, @RecentlyNonNull C5220d dVar, int i, @RecentlyNonNull C6336e eVar, AbstractC6101e eVar2, AbstractC6134l lVar) {
        super(context, looper, iVar, dVar, i, eVar2 == null ? null : new C6347h0(eVar2), lVar == null ? null : new C6350i0(lVar), eVar.m20603g());
        this.f19949o0 = eVar;
        this.f19951q0 = eVar.m20609a();
        this.f19950p0 = m20581m0(eVar.m20607c());
    }
}
