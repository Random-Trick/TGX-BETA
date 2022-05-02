package p148k5;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3487a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p118i5.C5217a;
import p118i5.C5220d;
import p126j$.util.concurrent.ConcurrentHashMap;
import p133j5.AbstractC5864e;
import p133j5.AbstractC5876k;
import p133j5.C5850a;
import p143k0.C6031b;
import p148k5.C6120i;
import p163l5.AbstractC6395x;
import p163l5.C6360l0;
import p163l5.C6371p;
import p163l5.C6381s;
import p163l5.C6384t;
import p163l5.C6390v;
import p163l5.C6393w;
import p177m6.AbstractC6775l;
import p177m6.C6777m;
import p232q5.C8248h;
import p299v5.HandlerC9849i;

public class C6106f implements Handler.Callback {
    @RecentlyNonNull
    public static final Status f19366a0 = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status f19367b0 = new Status(4, "The user must be signed in to make this API call.");
    public static final Object f19368c0 = new Object();
    @GuardedBy("lock")
    public static C6106f f19369d0;
    public C6390v f19371N;
    public AbstractC6395x f19372O;
    public final Context f19373P;
    public final C5220d f19374Q;
    public final C6360l0 f19375R;
    @GuardedBy("lock")
    public C6176v f19379V;
    @NotOnlyInitialized
    public final Handler f19382Y;
    public volatile boolean f19383Z;
    public long f19384a = 5000;
    public long f19385b = 120000;
    public long f19386c = 10000;
    public boolean f19370M = false;
    public final AtomicInteger f19376S = new AtomicInteger(1);
    public final AtomicInteger f19377T = new AtomicInteger(0);
    public final Map<C6085b<?>, C6093c1<?>> f19378U = new ConcurrentHashMap(5, 0.75f, 1);
    @GuardedBy("lock")
    public final Set<C6085b<?>> f19380W = new C6031b();
    public final Set<C6085b<?>> f19381X = new C6031b();

    public C6106f(Context context, Looper looper, C5220d dVar) {
        this.f19383Z = true;
        this.f19373P = context;
        HandlerC9849i iVar = new HandlerC9849i(looper, this);
        this.f19382Y = iVar;
        this.f19374Q = dVar;
        this.f19375R = new C6360l0(dVar);
        if (C8248h.m13050a(context)) {
            this.f19383Z = false;
        }
        iVar.sendMessage(iVar.obtainMessage(6));
    }

    public static Status m21299j(C6085b<?> bVar, C5217a aVar) {
        String b = bVar.m21386b();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 63 + valueOf.length());
        sb2.append("API: ");
        sb2.append(b);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(valueOf);
        return new Status(aVar, sb2.toString());
    }

    @RecentlyNonNull
    public static C6106f m21296m(@RecentlyNonNull Context context) {
        C6106f fVar;
        synchronized (f19368c0) {
            if (f19369d0 == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f19369d0 = new C6106f(context.getApplicationContext(), handlerThread.getLooper(), C5220d.m23604p());
            }
            fVar = f19369d0;
        }
        return fVar;
    }

    public final C6093c1<?> m21301h(AbstractC5864e<?> eVar) {
        C6085b<?> j = eVar.m21918j();
        C6093c1<?> c1Var = this.f19378U.get(j);
        if (c1Var == null) {
            c1Var = new C6093c1<>(this, eVar);
            this.f19378U.put(j, c1Var);
        }
        if (c1Var.m21369F()) {
            this.f19381X.add(j);
        }
        c1Var.m21372C();
        return c1Var;
    }

    @Override
    public final boolean handleMessage(@RecentlyNonNull Message message) {
        int i = message.what;
        long j = 300000;
        C6093c1<?> c1Var = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f19386c = j;
                this.f19382Y.removeMessages(12);
                for (C6085b<?> bVar : this.f19378U.keySet()) {
                    Handler handler = this.f19382Y;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f19386c);
                }
                break;
            case 2:
                C6167s2 s2Var = (C6167s2) message.obj;
                Iterator<C6085b<?>> it = s2Var.m21132a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C6085b<?> next = it.next();
                        C6093c1<?> c1Var2 = this.f19378U.get(next);
                        if (c1Var2 == null) {
                            s2Var.m21131b(next, new C5217a(13), null);
                            break;
                        } else if (c1Var2.m21370E()) {
                            s2Var.m21131b(next, C5217a.f17353N, c1Var2.m21340v().mo21245h());
                        } else {
                            C5217a y = c1Var2.m21337y();
                            if (y != null) {
                                s2Var.m21131b(next, y, null);
                            } else {
                                c1Var2.m21371D(s2Var);
                                c1Var2.m21372C();
                            }
                        }
                    }
                }
            case 3:
                for (C6093c1<?> c1Var3 : this.f19378U.values()) {
                    c1Var3.m21338x();
                    c1Var3.m21372C();
                }
                break;
            case 4:
            case 8:
            case 13:
                C6162r1 r1Var = (C6162r1) message.obj;
                C6093c1<?> c1Var4 = this.f19378U.get(r1Var.f19536c.m21918j());
                if (c1Var4 == null) {
                    c1Var4 = m21301h(r1Var.f19536c);
                }
                if (!c1Var4.m21369F() || this.f19377T.get() == r1Var.f19535b) {
                    c1Var4.m21342r(r1Var.f19534a);
                    break;
                } else {
                    r1Var.f19534a.mo21184a(f19366a0);
                    c1Var4.m21341u();
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                C5217a aVar = (C5217a) message.obj;
                Iterator<C6093c1<?>> it2 = this.f19378U.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C6093c1<?> next2 = it2.next();
                        if (next2.m21368G() == i2) {
                            c1Var = next2;
                        }
                    }
                }
                if (c1Var != null) {
                    if (aVar.m23615b() == 13) {
                        String g = this.f19374Q.mo23587g(aVar.m23615b());
                        String c = aVar.m23614c();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(g).length() + 69 + String.valueOf(c).length());
                        sb2.append("Error resolution was canceled by the user, original error message: ");
                        sb2.append(g);
                        sb2.append(": ");
                        sb2.append(c);
                        C6093c1.m21362M(c1Var, new Status(17, sb2.toString()));
                        break;
                    } else {
                        C6093c1.m21362M(c1Var, m21299j(C6093c1.m21361N(c1Var), aVar));
                        break;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i2);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f19373P.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C6090c.m21379c((Application) this.f19373P.getApplicationContext());
                    ComponentCallbacks2C6090c.m21380b().m21381a(new C6185x0(this));
                    if (!ComponentCallbacks2C6090c.m21380b().m21377e(true)) {
                        this.f19386c = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                m21301h((AbstractC5864e) message.obj);
                break;
            case 9:
                if (this.f19378U.containsKey(message.obj)) {
                    this.f19378U.get(message.obj).m21336z();
                    break;
                }
                break;
            case 10:
                for (C6085b<?> bVar2 : this.f19381X) {
                    C6093c1<?> remove = this.f19378U.remove(bVar2);
                    if (remove != null) {
                        remove.m21341u();
                    }
                }
                this.f19381X.clear();
                break;
            case 11:
                if (this.f19378U.containsKey(message.obj)) {
                    this.f19378U.get(message.obj).m21374A();
                    break;
                }
                break;
            case 12:
                if (this.f19378U.containsKey(message.obj)) {
                    this.f19378U.get(message.obj).m21373B();
                    break;
                }
                break;
            case 14:
                C6180w wVar = (C6180w) message.obj;
                C6085b<?> a = wVar.m21101a();
                if (!this.f19378U.containsKey(a)) {
                    wVar.m21100b().m19084c(Boolean.FALSE);
                    break;
                } else {
                    wVar.m21100b().m19084c(Boolean.valueOf(C6093c1.m21365J(this.f19378U.get(a), false)));
                    break;
                }
            case 15:
                C6098d1 d1Var = (C6098d1) message.obj;
                if (this.f19378U.containsKey(C6098d1.m21334a(d1Var))) {
                    C6093c1.m21364K(this.f19378U.get(C6098d1.m21334a(d1Var)), d1Var);
                    break;
                }
                break;
            case 16:
                C6098d1 d1Var2 = (C6098d1) message.obj;
                if (this.f19378U.containsKey(C6098d1.m21334a(d1Var2))) {
                    C6093c1.m21363L(this.f19378U.get(C6098d1.m21334a(d1Var2)), d1Var2);
                    break;
                }
                break;
            case 17:
                m21298k();
                break;
            case 18:
                C6145n1 n1Var = (C6145n1) message.obj;
                if (n1Var.f19487c == 0) {
                    m21297l().mo17209a(new C6390v(n1Var.f19486b, Arrays.asList(n1Var.f19485a)));
                    break;
                } else {
                    C6390v vVar = this.f19371N;
                    if (vVar != null) {
                        List<C6371p> c2 = vVar.m20483c();
                        if (this.f19371N.m20484b() != n1Var.f19486b || (c2 != null && c2.size() >= n1Var.f19488d)) {
                            this.f19382Y.removeMessages(17);
                            m21298k();
                        } else {
                            this.f19371N.m20482d(n1Var.f19485a);
                        }
                    }
                    if (this.f19371N == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(n1Var.f19485a);
                        this.f19371N = new C6390v(n1Var.f19486b, arrayList);
                        Handler handler2 = this.f19382Y;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), n1Var.f19487c);
                        break;
                    }
                }
                break;
            case 19:
                this.f19370M = false;
                break;
            default:
                StringBuilder sb4 = new StringBuilder(31);
                sb4.append("Unknown message id: ");
                sb4.append(i);
                Log.w("GoogleApiManager", sb4.toString());
                return false;
        }
        return true;
    }

    public final <T> void m21300i(C6777m<T> mVar, int i, AbstractC5864e eVar) {
        C6140m1 b;
        if (i != 0 && (b = C6140m1.m21198b(this, i, eVar.m21918j())) != null) {
            AbstractC6775l<T> a = mVar.m19086a();
            Handler handler = this.f19382Y;
            handler.getClass();
            a.mo19079b(ExecutorC6181w0.m21099a(handler), b);
        }
    }

    public final void m21298k() {
        C6390v vVar = this.f19371N;
        if (vVar != null) {
            if (vVar.m20484b() > 0 || m21289t()) {
                m21297l().mo17209a(vVar);
            }
            this.f19371N = null;
        }
    }

    public final AbstractC6395x m21297l() {
        if (this.f19372O == null) {
            this.f19372O = C6393w.m20475a(this.f19373P);
        }
        return this.f19372O;
    }

    public final int m21295n() {
        return this.f19376S.getAndIncrement();
    }

    public final void m21294o(@RecentlyNonNull AbstractC5864e<?> eVar) {
        Handler handler = this.f19382Y;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final C6093c1 m21293p(C6085b<?> bVar) {
        return this.f19378U.get(bVar);
    }

    public final void m21292q() {
        Handler handler = this.f19382Y;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final <O extends C5850a.AbstractC5854d> void m21291r(@RecentlyNonNull AbstractC5864e<O> eVar, int i, @RecentlyNonNull AbstractC3487a<? extends AbstractC5876k, C5850a.AbstractC5852b> aVar) {
        C6137l2 l2Var = new C6137l2(i, aVar);
        Handler handler = this.f19382Y;
        handler.sendMessage(handler.obtainMessage(4, new C6162r1(l2Var, this.f19377T.get(), eVar)));
    }

    public final <O extends C5850a.AbstractC5854d, ResultT> void m21290s(@RecentlyNonNull AbstractC5864e<O> eVar, int i, @RecentlyNonNull AbstractC6159r<C5850a.AbstractC5852b, ResultT> rVar, @RecentlyNonNull C6777m<ResultT> mVar, @RecentlyNonNull AbstractC6155q qVar) {
        m21300i(mVar, rVar.m21155e(), eVar);
        C6146n2 n2Var = new C6146n2(i, rVar, mVar, qVar);
        Handler handler = this.f19382Y;
        handler.sendMessage(handler.obtainMessage(4, new C6162r1(n2Var, this.f19377T.get(), eVar)));
    }

    public final boolean m21289t() {
        if (this.f19370M) {
            return false;
        }
        C6384t a = C6381s.m20497b().m20498a();
        if (a != null && !a.m20489d()) {
            return false;
        }
        int b = this.f19375R.m20553b(this.f19373P, 203390000);
        return b == -1 || b == 0;
    }

    @RecentlyNonNull
    public final <O extends C5850a.AbstractC5854d> AbstractC6775l<Void> m21288u(@RecentlyNonNull AbstractC5864e<O> eVar, @RecentlyNonNull AbstractC6138m<C5850a.AbstractC5852b, ?> mVar, @RecentlyNonNull AbstractC6168t<C5850a.AbstractC5852b, ?> tVar, @RecentlyNonNull Runnable runnable) {
        C6777m mVar2 = new C6777m();
        m21300i(mVar2, mVar.m21199f(), eVar);
        C6141m2 m2Var = new C6141m2(new C6166s1(mVar, tVar, runnable), mVar2);
        Handler handler = this.f19382Y;
        handler.sendMessage(handler.obtainMessage(8, new C6162r1(m2Var, this.f19377T.get(), eVar)));
        return mVar2.m19086a();
    }

    @RecentlyNonNull
    public final <O extends C5850a.AbstractC5854d> AbstractC6775l<Boolean> m21287v(@RecentlyNonNull AbstractC5864e<O> eVar, @RecentlyNonNull C6120i.C6121a aVar, int i) {
        C6777m mVar = new C6777m();
        m21300i(mVar, i, eVar);
        C6150o2 o2Var = new C6150o2(aVar, mVar);
        Handler handler = this.f19382Y;
        handler.sendMessage(handler.obtainMessage(13, new C6162r1(o2Var, this.f19377T.get(), eVar)));
        return mVar.m19086a();
    }

    public final boolean m21286w(C5217a aVar, int i) {
        return this.f19374Q.m23599u(this.f19373P, aVar, i);
    }

    public final void m21285x(@RecentlyNonNull C5217a aVar, int i) {
        if (!m21286w(aVar, i)) {
            Handler handler = this.f19382Y;
            handler.sendMessage(handler.obtainMessage(5, i, 0, aVar));
        }
    }

    public final void m21284y(C6371p pVar, int i, long j, int i2) {
        Handler handler = this.f19382Y;
        handler.sendMessage(handler.obtainMessage(18, new C6145n1(pVar, i, j, i2)));
    }
}
