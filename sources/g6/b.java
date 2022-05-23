package g6;

import a6.c0;
import a6.t;
import a6.v;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.location.LocationRequest;
import k5.a;
import k5.e;
import l5.i;
import l5.j;
import l5.n;
import l5.o;
import l5.r;
import l5.s;
import n6.l;
import n6.m;

public class b extends e<a.d.c> {
    public b(@RecentlyNonNull Context context) {
        super(context, f.f12106a, a.d.f15661a, new l5.a());
    }

    @RecentlyNonNull
    public l<Location> t() {
        return e(r.a().b(new o(this) {
            public final b f12152a;

            {
                this.f12152a = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                this.f12152a.x((t) obj, (m) obj2);
            }
        }).e(2414).a());
    }

    @RecentlyNonNull
    public l<Void> u(@RecentlyNonNull d dVar) {
        return s.c(g(j.b(dVar, d.class.getSimpleName())));
    }

    @RecentlyNonNull
    public l<Void> v(@RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull d dVar, @RecentlyNonNull Looper looper) {
        return y(v.b(null, locationRequest), dVar, looper, null, 2436);
    }

    public final void w(final s sVar, final d dVar, final q qVar, v vVar, i iVar, t tVar, m mVar) {
        p pVar = new p(mVar, new q(this, sVar, dVar, qVar) {
            public final b f12153a;
            public final s f12154b;
            public final d f12155c;
            public final q f12156d;

            {
                this.f12153a = this;
                this.f12154b = sVar;
                this.f12155c = dVar;
                this.f12156d = qVar;
            }

            @Override
            public final void zza() {
                b bVar = this.f12153a;
                s sVar2 = this.f12154b;
                d dVar2 = this.f12155c;
                q qVar2 = this.f12156d;
                sVar2.c(false);
                bVar.u(dVar2);
                if (qVar2 != null) {
                    qVar2.zza();
                }
            }
        });
        vVar.c(l());
        tVar.o0(vVar, iVar, pVar);
    }

    public final void x(t tVar, m mVar) {
        mVar.c(tVar.t0(l()));
    }

    public final l<Void> y(final v vVar, final d dVar, Looper looper, final q qVar, int i10) {
        final i a10 = j.a(dVar, c0.a(looper), d.class.getSimpleName());
        final n nVar = new n(this, a10);
        return f(n.a().b(new o(this, nVar, dVar, qVar, vVar, a10) {
            public final b f12126a;
            public final s f12127b;
            public final d f12128c;
            public final q f12129d;
            public final v f12130e;
            public final i f12131f;

            {
                this.f12126a = this;
                this.f12127b = nVar;
                this.f12128c = dVar;
                this.f12129d = qVar;
                this.f12130e = vVar;
                this.f12131f = a10;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                this.f12126a.w(this.f12127b, this.f12128c, this.f12129d, this.f12130e, this.f12131f, (t) obj, (n6.m) obj2);
            }
        }).d(nVar).e(a10).c(i10).a());
    }
}
