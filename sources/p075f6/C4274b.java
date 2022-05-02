package p075f6;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.location.LocationRequest;
import p133j5.AbstractC5864e;
import p133j5.C5850a;
import p148k5.AbstractC6147o;
import p148k5.AbstractC6159r;
import p148k5.C6080a;
import p148k5.C6120i;
import p148k5.C6126j;
import p148k5.C6142n;
import p148k5.C6164s;
import p177m6.AbstractC6775l;
import p177m6.C6777m;
import p357z5.C11288c0;
import p357z5.C11317t;
import p357z5.C11319v;

public class C4274b extends AbstractC5864e<C5850a.AbstractC5854d.C5857c> {
    public C4274b(@RecentlyNonNull Context context) {
        super(context, C4282f.f14330a, C5850a.AbstractC5854d.f18724a, new C6080a());
    }

    @RecentlyNonNull
    public AbstractC6775l<Location> m28310t() {
        return m21924e(AbstractC6159r.m21160a().m21154b(new AbstractC6147o(this) {
            public final C4274b f14383a;

            {
                this.f14383a = this;
            }

            @Override
            public final void mo17211a(Object obj, Object obj2) {
                this.f14383a.m28306x((C11317t) obj, (C6777m) obj2);
            }
        }).m21151e(2414).m21155a());
    }

    @RecentlyNonNull
    public AbstractC6775l<Void> m28309u(@RecentlyNonNull AbstractC4278d dVar) {
        return C6164s.m21135c(m21922g(C6126j.m21255b(dVar, AbstractC4278d.class.getSimpleName())));
    }

    @RecentlyNonNull
    public AbstractC6775l<Void> m28308v(@RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull AbstractC4278d dVar, @RecentlyNonNull Looper looper) {
        return m28305y(C11319v.m897b(null, locationRequest), dVar, looper, null, 2436);
    }

    public final void m28307w(final AbstractC4309s sVar, final AbstractC4278d dVar, final AbstractC4305q qVar, C11319v vVar, C6120i iVar, C11317t tVar, C6777m mVar) {
        BinderC4303p pVar = new BinderC4303p(mVar, new AbstractC4305q(this, sVar, dVar, qVar) {
            public final C4274b f14384a;
            public final AbstractC4309s f14385b;
            public final AbstractC4278d f14386c;
            public final AbstractC4305q f14387d;

            {
                this.f14384a = this;
                this.f14385b = sVar;
                this.f14386c = dVar;
                this.f14387d = qVar;
            }

            @Override
            public final void zza() {
                C4274b bVar = this.f14384a;
                AbstractC4309s sVar2 = this.f14385b;
                AbstractC4278d dVar2 = this.f14386c;
                AbstractC4305q qVar2 = this.f14387d;
                sVar2.m28288c(false);
                bVar.m28309u(dVar2);
                if (qVar2 != null) {
                    qVar2.zza();
                }
            }
        });
        vVar.m896c(m21917l());
        tVar.m904o0(vVar, iVar, pVar);
    }

    public final void m28306x(C11317t tVar, C6777m mVar) {
        mVar.m19085c(tVar.m899t0(m21917l()));
    }

    public final AbstractC6775l<Void> m28305y(final C11319v vVar, final AbstractC4278d dVar, Looper looper, final AbstractC4305q qVar, int i) {
        final C6120i a = C6126j.m21256a(dVar, C11288c0.m950a(looper), AbstractC4278d.class.getSimpleName());
        final C4299n nVar = new C4299n(this, a);
        return m21923f(C6142n.m21197a().m21195b(new AbstractC6147o(this, nVar, dVar, qVar, vVar, a) {
            public final C4274b f14354a;
            public final AbstractC4309s f14355b;
            public final AbstractC4278d f14356c;
            public final AbstractC4305q f14357d;
            public final C11319v f14358e;
            public final C6120i f14359f;

            {
                this.f14354a = this;
                this.f14355b = nVar;
                this.f14356c = dVar;
                this.f14357d = qVar;
                this.f14358e = vVar;
                this.f14359f = a;
            }

            @Override
            public final void mo17211a(Object obj, Object obj2) {
                this.f14354a.m28307w(this.f14355b, this.f14356c, this.f14357d, this.f14358e, this.f14359f, (C11317t) obj, (C6777m) obj2);
            }
        }).m21193d(nVar).m21192e(a).m21194c(i).m21196a());
    }
}
