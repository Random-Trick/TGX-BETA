package p350yd;

import be.C1379j0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p108hb.C5062b;
import p108hb.C5070i;
import p143k0.C6038h;
import p364zd.C11520h;
import p364zd.C11524j;

public class C11004sj {
    public final C10930q6 f35338a;
    public final C6038h<List<AbstractC11006b>> f35339b = new C6038h<>();
    public final C6038h<List<C11520h>> f35340c = new C6038h<>();

    public class RunnableC11005a implements Runnable {
        public final AtomicBoolean f35341a;
        public final Runnable f35342b;

        public RunnableC11005a(AtomicBoolean atomicBoolean, Runnable runnable) {
            this.f35341a = atomicBoolean;
            this.f35342b = runnable;
        }

        @Override
        public void run() {
            if (!this.f35341a.getAndSet(true)) {
                this.f35342b.run();
                C1379j0.m37330f0(this);
            }
        }
    }

    public interface AbstractC11006b {
        void mo2002a(List<C11520h> list);
    }

    public C11004sj(C10930q6 q6Var) {
        this.f35338a = q6Var;
    }

    public static String m2016h(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(63);
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    public void m2011m(boolean z, int i, C11520h hVar) {
        this.f35338a.m2294pc().m4096s0(hVar, z && (this.f35338a.m2294pc().m4146K() == i || this.f35338a.m2294pc().m4145L() == i), C11524j.m174j0(i));
    }

    public void m2010n(final boolean z, final int i, TdApi.Object object) {
        if (object.getConstructor() == -429971172) {
            final C11520h hVar = new C11520h(this.f35338a, (TdApi.Background) object);
            this.f35338a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C11004sj.this.m2011m(z, i, hVar);
                }
            });
        }
    }

    public void m2009o(boolean z, TdApi.Object object) {
        List<AbstractC11006b> list;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == 724728704) {
            TdApi.Background[] backgroundArr = ((TdApi.Backgrounds) object).backgrounds;
            ArrayList arrayList = new ArrayList(backgroundArr.length);
            int i = 0;
            for (TdApi.Background background : backgroundArr) {
                arrayList.add(new C11520h(this.f35338a, background));
            }
            synchronized (this.f35340c) {
                this.f35340c.m21466j(z ? 1 : 0, arrayList);
                C6038h<List<AbstractC11006b>> hVar = this.f35339b;
                if (z) {
                    i = 1;
                }
                list = (List) C5062b.m24180B(hVar, i);
            }
            if (list != null) {
                for (AbstractC11006b bVar : list) {
                    if (bVar != null) {
                        bVar.mo2002a(arrayList);
                    }
                }
            }
        }
    }

    public void m2008p(Runnable runnable, TdApi.Object object) {
        this.f35338a.m2485dd().post(runnable);
    }

    public void m2007q(final Runnable runnable, TdApi.Object object) {
        if (object.getConstructor() == -429971172) {
            TdApi.Background background = (TdApi.Background) object;
            if (background.document != null) {
                this.f35338a.m2270r4().m14783o(new TdApi.DownloadFile(background.document.document.f25373id, 32, 0, 0, true), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object2) {
                        C11004sj.this.m2008p(runnable, object2);
                    }
                });
                return;
            }
        }
        this.f35338a.m2485dd().post(runnable);
    }

    public void m2018f(C11520h hVar, boolean z) {
        List<C11520h> e = this.f35340c.m21471e(z ? 1 : 0);
        if (e != null) {
            e.add(0, hVar);
        }
    }

    public void m2017g() {
        m2015i(this.f35338a.m2294pc().m4146K(), false);
        m2015i(this.f35338a.m2294pc().m4145L(), false);
    }

    public final void m2015i(final int i, final boolean z) {
        if (z || m2005s(i)) {
            String V = C11524j.m212V(i);
            if (C5070i.m24061i(V)) {
                this.f35338a.m2294pc().m4096s0(C11520h.m297g0(this.f35338a), z, C11524j.m174j0(i));
            } else {
                this.f35338a.m2270r4().m14783o(new TdApi.SearchBackground(V), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C11004sj.this.m2010n(z, i, object);
                    }
                });
            }
        }
    }

    public final void m2014j(final boolean z) {
        this.f35338a.m2270r4().m14783o(new TdApi.GetBackgrounds(z), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C11004sj.this.m2009o(z, object);
            }
        });
    }

    public void m2013k(AbstractC11006b bVar, boolean z) {
        List<C11520h> e;
        synchronized (this.f35340c) {
            int i = 1;
            e = this.f35340c.m21471e(z ? 1 : 0);
            if (e == null) {
                List<AbstractC11006b> e2 = this.f35339b.m21471e(z ? 1 : 0);
                if (e2 == null) {
                    e2 = new ArrayList<>();
                    C6038h<List<AbstractC11006b>> hVar = this.f35339b;
                    if (!z) {
                        i = 0;
                    }
                    hVar.m21466j(i, e2);
                    m2014j(z);
                }
                e2.add(bVar);
            }
        }
        if (e != null && bVar != null) {
            bVar.mo2002a(e);
        }
    }

    public boolean m2012l(int i) {
        return i == 0 || C11520h.m288l(i) != null;
    }

    public void m2006r(String str, long j, final Runnable runnable) {
        if (C5070i.m24061i(str)) {
            runnable.run();
            return;
        }
        if (j > 0) {
            RunnableC11005a aVar = new RunnableC11005a(new AtomicBoolean(false), runnable);
            C1379j0.m37332e0(aVar, j);
            runnable = aVar;
        }
        this.f35338a.m2270r4().m14783o(new TdApi.SearchBackground(str), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C11004sj.this.m2007q(runnable, object);
            }
        });
    }

    public final boolean m2005s(int i) {
        return C11524j.m212V(i) != null && this.f35338a.m2294pc().m4147J(C11524j.m174j0(i), true) == null;
    }

    public void m2004t(int i) {
        m2015i(i, true);
    }

    public void m2003u(int i, int i2) {
        int j0 = C11524j.m174j0(i);
        int j02 = C11524j.m174j0(i2);
        if (j0 == j02) {
            String V = C11524j.m212V(i);
            if (!C5070i.m24067c(V, C11524j.m212V(i2))) {
                C11520h J = this.f35338a.m2294pc().m4147J(j02, true);
                if (C5070i.m24061i(V) && (J == null || J.m319R())) {
                    m2015i(i2, true);
                } else if (!C5070i.m24061i(V) && J != null && V.equals(m2016h(J.m268w()))) {
                    m2015i(i2, true);
                }
            }
        } else {
            m2015i(i2, false);
        }
    }
}
