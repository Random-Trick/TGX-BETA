package zd;

import ae.j;
import ce.j0;
import ib.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.h;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;

public class qj {
    public final o6 f28304a;
    public final h<List<b>> f28305b = new h<>();
    public final h<List<ae.h>> f28306c = new h<>();

    public class a implements Runnable {
        public final AtomicBoolean f28307a;
        public final Runnable f28308b;

        public a(AtomicBoolean atomicBoolean, Runnable runnable) {
            this.f28307a = atomicBoolean;
            this.f28308b = runnable;
        }

        @Override
        public void run() {
            if (!this.f28307a.getAndSet(true)) {
                this.f28308b.run();
                j0.f0(this);
            }
        }
    }

    public interface b {
        void a(List<ae.h> list);
    }

    public qj(o6 o6Var) {
        this.f28304a = o6Var;
    }

    public static String h(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(63);
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    public void m(boolean z10, int i10, ae.h hVar) {
        this.f28304a.tc().s0(hVar, z10 && (this.f28304a.tc().K() == i10 || this.f28304a.tc().L() == i10), j.h0(i10));
    }

    public void n(final boolean z10, final int i10, TdApi.Object object) {
        if (object.getConstructor() == -429971172) {
            final ae.h hVar = new ae.h(this.f28304a, (TdApi.Background) object);
            this.f28304a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    qj.this.m(z10, i10, hVar);
                }
            });
        }
    }

    public void o(boolean z10, TdApi.Object object) {
        List<b> list;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == 724728704) {
            TdApi.Background[] backgroundArr = ((TdApi.Backgrounds) object).backgrounds;
            ArrayList arrayList = new ArrayList(backgroundArr.length);
            int i10 = 0;
            for (TdApi.Background background : backgroundArr) {
                arrayList.add(new ae.h(this.f28304a, background));
            }
            synchronized (this.f28306c) {
                this.f28306c.j(z10 ? 1 : 0, arrayList);
                h<List<b>> hVar = this.f28305b;
                if (z10) {
                    i10 = 1;
                }
                list = (List) ib.b.B(hVar, i10);
            }
            if (list != null) {
                for (b bVar : list) {
                    if (bVar != null) {
                        bVar.a(arrayList);
                    }
                }
            }
        }
    }

    public void p(Runnable runnable, TdApi.Object object) {
        this.f28304a.hd().post(runnable);
    }

    public void q(final Runnable runnable, TdApi.Object object) {
        if (object.getConstructor() == -429971172) {
            TdApi.Background background = (TdApi.Background) object;
            if (background.document != null) {
                this.f28304a.v4().o(new TdApi.DownloadFile(background.document.document.f19913id, 32, 0, 0, true), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object2) {
                        qj.this.p(runnable, object2);
                    }
                });
                return;
            }
        }
        this.f28304a.hd().post(runnable);
    }

    public void f(ae.h hVar, boolean z10) {
        List<ae.h> e10 = this.f28306c.e(z10 ? 1 : 0);
        if (e10 != null) {
            e10.add(0, hVar);
        }
    }

    public void g() {
        i(this.f28304a.tc().K(), false);
        i(this.f28304a.tc().L(), false);
    }

    public final void i(final int i10, final boolean z10) {
        if (z10 || s(i10)) {
            String T = j.T(i10);
            if (i.i(T)) {
                this.f28304a.tc().s0(ae.h.g0(this.f28304a), z10, j.h0(i10));
            } else {
                this.f28304a.v4().o(new TdApi.SearchBackground(T), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        qj.this.n(z10, i10, object);
                    }
                });
            }
        }
    }

    public final void j(final boolean z10) {
        this.f28304a.v4().o(new TdApi.GetBackgrounds(z10), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                qj.this.o(z10, object);
            }
        });
    }

    public void k(b bVar, boolean z10) {
        List<ae.h> e10;
        synchronized (this.f28306c) {
            int i10 = 1;
            e10 = this.f28306c.e(z10 ? 1 : 0);
            if (e10 == null) {
                List<b> e11 = this.f28305b.e(z10 ? 1 : 0);
                if (e11 == null) {
                    e11 = new ArrayList<>();
                    h<List<b>> hVar = this.f28305b;
                    if (!z10) {
                        i10 = 0;
                    }
                    hVar.j(i10, e11);
                    j(z10);
                }
                e11.add(bVar);
            }
        }
        if (e10 != null && bVar != null) {
            bVar.a(e10);
        }
    }

    public boolean l(int i10) {
        return i10 == 0 || ae.h.l(i10) != null;
    }

    public void r(String str, long j10, final Runnable runnable) {
        if (i.i(str)) {
            runnable.run();
            return;
        }
        if (j10 > 0) {
            a aVar = new a(new AtomicBoolean(false), runnable);
            j0.e0(aVar, j10);
            runnable = aVar;
        }
        this.f28304a.v4().o(new TdApi.SearchBackground(str), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                qj.this.q(runnable, object);
            }
        });
    }

    public final boolean s(int i10) {
        return j.T(i10) != null && this.f28304a.tc().J(j.h0(i10), true) == null;
    }

    public void t(int i10) {
        i(i10, true);
    }

    public void u(int i10, int i11) {
        int h02 = j.h0(i10);
        int h03 = j.h0(i11);
        if (h02 == h03) {
            String T = j.T(i10);
            if (!i.c(T, j.T(i11))) {
                ae.h J = this.f28304a.tc().J(h03, true);
                if (i.i(T) && (J == null || J.R())) {
                    i(i11, true);
                } else if (!i.i(T) && J != null && T.equals(h(J.w()))) {
                    i(i11, true);
                }
            }
        } else {
            i(i11, false);
        }
    }
}
