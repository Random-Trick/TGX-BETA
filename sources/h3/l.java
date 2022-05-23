package h3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import b3.m;
import c3.e;
import c3.f;
import c3.g;
import i3.c;
import i3.i;
import j3.b;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import k3.a;

public class l {
    public final Context f12494a;
    public final e f12495b;
    public final c f12496c;
    public final r f12497d;
    public final Executor f12498e;
    public final b f12499f;
    public final a f12500g;

    public l(Context context, e eVar, c cVar, r rVar, Executor executor, b bVar, a aVar) {
        this.f12494a = context;
        this.f12495b = eVar;
        this.f12496c = cVar;
        this.f12497d = rVar;
        this.f12498e = executor;
        this.f12499f = bVar;
        this.f12500g = aVar;
    }

    public Iterable f(m mVar) {
        return this.f12496c.m0(mVar);
    }

    public Object g(g gVar, Iterable iterable, m mVar, int i10) {
        if (gVar.c() == g.a.TRANSIENT_ERROR) {
            this.f12496c.r0(iterable);
            this.f12497d.a(mVar, i10 + 1);
            return null;
        }
        this.f12496c.k(iterable);
        if (gVar.c() == g.a.OK) {
            this.f12496c.G(mVar, this.f12500g.a() + gVar.b());
        }
        if (!this.f12496c.o0(mVar)) {
            return null;
        }
        this.f12497d.b(mVar, 1, true);
        return null;
    }

    public Object h(m mVar, int i10) {
        this.f12497d.a(mVar, i10 + 1);
        return null;
    }

    public void i(final m mVar, final int i10, Runnable runnable) {
        try {
            try {
                b bVar = this.f12499f;
                final c cVar = this.f12496c;
                Objects.requireNonNull(cVar);
                bVar.m(new b.a() {
                    @Override
                    public final Object a() {
                        return Integer.valueOf(c.this.f());
                    }
                });
                if (!e()) {
                    this.f12499f.m(new b.a() {
                        @Override
                        public final Object a() {
                            Object h10;
                            h10 = l.this.h(mVar, i10);
                            return h10;
                        }
                    });
                } else {
                    j(mVar, i10);
                }
            } catch (j3.a unused) {
                this.f12497d.a(mVar, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public boolean e() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f12494a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void j(final m mVar, final int i10) {
        g a10;
        c3.m a11 = this.f12495b.a(mVar.b());
        final Iterable<i> iterable = (Iterable) this.f12499f.m(new b.a() {
            @Override
            public final Object a() {
                Iterable f10;
                f10 = l.this.f(mVar);
                return f10;
            }
        });
        if (iterable.iterator().hasNext()) {
            if (a11 == null) {
                e3.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", mVar);
                a10 = g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (i iVar : iterable) {
                    arrayList.add(iVar.b());
                }
                a10 = a11.a(f.a().b(arrayList).c(mVar.c()).a());
            }
            final g gVar = a10;
            this.f12499f.m(new b.a() {
                @Override
                public final Object a() {
                    Object g10;
                    g10 = l.this.g(gVar, iterable, mVar, i10);
                    return g10;
                }
            });
        }
    }

    public void k(final m mVar, final int i10, final Runnable runnable) {
        this.f12498e.execute(new Runnable() {
            @Override
            public final void run() {
                l.this.i(mVar, i10, runnable);
            }
        });
    }
}
