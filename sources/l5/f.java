package l5;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import j5.a;
import j5.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import k0.b;
import k5.a;
import k5.e;
import k5.k;
import l5.i;
import m5.l0;
import m5.p;
import m5.s;
import m5.t;
import m5.v;
import m5.w;
import m5.x;
import n6.l;
import n6.m;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import r5.h;
import w5.i;

public class f implements Handler.Callback {
    @RecentlyNonNull
    public static final Status Z = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status f16078a0 = new Status(4, "The user must be signed in to make this API call.");
    public static final Object f16079b0 = new Object();
    @GuardedBy("lock")
    public static f f16080c0;
    public v N;
    public x O;
    public final Context P;
    public final d Q;
    public final l0 R;
    @NotOnlyInitialized
    public final Handler X;
    public volatile boolean Y;
    public long f16081a = 5000;
    public long f16082b = 120000;
    public long f16083c = 10000;
    public boolean M = false;
    public final AtomicInteger S = new AtomicInteger(1);
    public final AtomicInteger T = new AtomicInteger(0);
    public final Map<b<?>, c1<?>> U = new ConcurrentHashMap(5, 0.75f, 1);
    @GuardedBy("lock")
    public final Set<b<?>> V = new b();
    public final Set<b<?>> W = new b();

    public f(Context context, Looper looper, d dVar) {
        this.Y = true;
        this.P = context;
        i iVar = new i(looper, this);
        this.X = iVar;
        this.Q = dVar;
        this.R = new l0(dVar);
        if (h.a(context)) {
            this.Y = false;
        }
        iVar.sendMessage(iVar.obtainMessage(6));
    }

    public static Status j(b<?> bVar, a aVar) {
        String b10 = bVar.b();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 63 + valueOf.length());
        sb2.append("API: ");
        sb2.append(b10);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(valueOf);
        return new Status(aVar, sb2.toString());
    }

    @RecentlyNonNull
    public static f m(@RecentlyNonNull Context context) {
        f fVar;
        synchronized (f16079b0) {
            if (f16080c0 == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f16080c0 = new f(context.getApplicationContext(), handlerThread.getLooper(), d.p());
            }
            fVar = f16080c0;
        }
        return fVar;
    }

    public final c1<?> h(e<?> eVar) {
        b<?> j10 = eVar.j();
        c1<?> c1Var = this.U.get(j10);
        if (c1Var == null) {
            c1Var = new c1<>(this, eVar);
            this.U.put(j10, c1Var);
        }
        if (c1Var.F()) {
            this.W.add(j10);
        }
        c1Var.C();
        return c1Var;
    }

    @Override
    public final boolean handleMessage(@RecentlyNonNull Message message) {
        int i10 = message.what;
        long j10 = 300000;
        c1<?> c1Var = null;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f16083c = j10;
                this.X.removeMessages(12);
                for (b<?> bVar : this.U.keySet()) {
                    Handler handler = this.X;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f16083c);
                }
                break;
            case 2:
                s2 s2Var = (s2) message.obj;
                Iterator<b<?>> it = s2Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        b<?> next = it.next();
                        c1<?> c1Var2 = this.U.get(next);
                        if (c1Var2 == null) {
                            s2Var.b(next, new a(13), null);
                            break;
                        } else if (c1Var2.E()) {
                            s2Var.b(next, a.N, c1Var2.v().i());
                        } else {
                            a y10 = c1Var2.y();
                            if (y10 != null) {
                                s2Var.b(next, y10, null);
                            } else {
                                c1Var2.D(s2Var);
                                c1Var2.C();
                            }
                        }
                    }
                }
            case 3:
                for (c1<?> c1Var3 : this.U.values()) {
                    c1Var3.x();
                    c1Var3.C();
                }
                break;
            case 4:
            case 8:
            case 13:
                r1 r1Var = (r1) message.obj;
                c1<?> c1Var4 = this.U.get(r1Var.f16223c.j());
                if (c1Var4 == null) {
                    c1Var4 = h(r1Var.f16223c);
                }
                if (!c1Var4.F() || this.T.get() == r1Var.f16222b) {
                    c1Var4.s(r1Var.f16221a);
                    break;
                } else {
                    r1Var.f16221a.a(Z);
                    c1Var4.u();
                    break;
                }
                break;
            case 5:
                int i11 = message.arg1;
                a aVar = (a) message.obj;
                Iterator<c1<?>> it2 = this.U.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        c1<?> next2 = it2.next();
                        if (next2.G() == i11) {
                            c1Var = next2;
                        }
                    }
                }
                if (c1Var != null) {
                    if (aVar.b() == 13) {
                        String g10 = this.Q.g(aVar.b());
                        String c10 = aVar.c();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(g10).length() + 69 + String.valueOf(c10).length());
                        sb2.append("Error resolution was canceled by the user, original error message: ");
                        sb2.append(g10);
                        sb2.append(": ");
                        sb2.append(c10);
                        c1.M(c1Var, new Status(17, sb2.toString()));
                        break;
                    } else {
                        c1.M(c1Var, j(c1.N(c1Var), aVar));
                        break;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i11);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.P.getApplicationContext() instanceof Application) {
                    c.c((Application) this.P.getApplicationContext());
                    c.b().a(new x0(this));
                    if (!c.b().e(true)) {
                        this.f16083c = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                h((e) message.obj);
                break;
            case 9:
                if (this.U.containsKey(message.obj)) {
                    this.U.get(message.obj).z();
                    break;
                }
                break;
            case 10:
                for (b<?> bVar2 : this.W) {
                    c1<?> remove = this.U.remove(bVar2);
                    if (remove != null) {
                        remove.u();
                    }
                }
                this.W.clear();
                break;
            case 11:
                if (this.U.containsKey(message.obj)) {
                    this.U.get(message.obj).A();
                    break;
                }
                break;
            case 12:
                if (this.U.containsKey(message.obj)) {
                    this.U.get(message.obj).B();
                    break;
                }
                break;
            case 14:
                w wVar = (w) message.obj;
                b<?> a10 = wVar.a();
                if (!this.U.containsKey(a10)) {
                    wVar.b().c(Boolean.FALSE);
                    break;
                } else {
                    wVar.b().c(Boolean.valueOf(c1.J(this.U.get(a10), false)));
                    break;
                }
            case 15:
                d1 d1Var = (d1) message.obj;
                if (this.U.containsKey(d1.a(d1Var))) {
                    c1.K(this.U.get(d1.a(d1Var)), d1Var);
                    break;
                }
                break;
            case 16:
                d1 d1Var2 = (d1) message.obj;
                if (this.U.containsKey(d1.a(d1Var2))) {
                    c1.L(this.U.get(d1.a(d1Var2)), d1Var2);
                    break;
                }
                break;
            case 17:
                k();
                break;
            case 18:
                n1 n1Var = (n1) message.obj;
                if (n1Var.f16174c == 0) {
                    l().a(new v(n1Var.f16173b, Arrays.asList(n1Var.f16172a)));
                    break;
                } else {
                    v vVar = this.N;
                    if (vVar != null) {
                        List<p> c11 = vVar.c();
                        if (this.N.b() != n1Var.f16173b || (c11 != null && c11.size() >= n1Var.f16175d)) {
                            this.X.removeMessages(17);
                            k();
                        } else {
                            this.N.d(n1Var.f16172a);
                        }
                    }
                    if (this.N == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(n1Var.f16172a);
                        this.N = new v(n1Var.f16173b, arrayList);
                        Handler handler2 = this.X;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), n1Var.f16174c);
                        break;
                    }
                }
                break;
            case 19:
                this.M = false;
                break;
            default:
                StringBuilder sb4 = new StringBuilder(31);
                sb4.append("Unknown message id: ");
                sb4.append(i10);
                Log.w("GoogleApiManager", sb4.toString());
                return false;
        }
        return true;
    }

    public final <T> void i(m<T> mVar, int i10, e eVar) {
        m1 b10;
        if (i10 != 0 && (b10 = m1.b(this, i10, eVar.j())) != null) {
            l<T> a10 = mVar.a();
            Handler handler = this.X;
            handler.getClass();
            a10.b(w0.a(handler), b10);
        }
    }

    public final void k() {
        v vVar = this.N;
        if (vVar != null) {
            if (vVar.b() > 0 || t()) {
                l().a(vVar);
            }
            this.N = null;
        }
    }

    public final x l() {
        if (this.O == null) {
            this.O = w.a(this.P);
        }
        return this.O;
    }

    public final int n() {
        return this.S.getAndIncrement();
    }

    public final void o(@RecentlyNonNull e<?> eVar) {
        Handler handler = this.X;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final c1 p(b<?> bVar) {
        return this.U.get(bVar);
    }

    public final void q() {
        Handler handler = this.X;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final <O extends a.d> void r(@RecentlyNonNull e<O> eVar, int i10, @RecentlyNonNull com.google.android.gms.common.api.internal.a<? extends k, a.b> aVar) {
        l2 l2Var = new l2(i10, aVar);
        Handler handler = this.X;
        handler.sendMessage(handler.obtainMessage(4, new r1(l2Var, this.T.get(), eVar)));
    }

    public final <O extends a.d, ResultT> void s(@RecentlyNonNull e<O> eVar, int i10, @RecentlyNonNull r<a.b, ResultT> rVar, @RecentlyNonNull m<ResultT> mVar, @RecentlyNonNull q qVar) {
        i(mVar, rVar.e(), eVar);
        n2 n2Var = new n2(i10, rVar, mVar, qVar);
        Handler handler = this.X;
        handler.sendMessage(handler.obtainMessage(4, new r1(n2Var, this.T.get(), eVar)));
    }

    public final boolean t() {
        if (this.M) {
            return false;
        }
        t a10 = s.b().a();
        if (a10 != null && !a10.d()) {
            return false;
        }
        int b10 = this.R.b(this.P, 203390000);
        return b10 == -1 || b10 == 0;
    }

    @RecentlyNonNull
    public final <O extends a.d> l<Void> u(@RecentlyNonNull e<O> eVar, @RecentlyNonNull m<a.b, ?> mVar, @RecentlyNonNull t<a.b, ?> tVar, @RecentlyNonNull Runnable runnable) {
        m mVar2 = new m();
        i(mVar2, mVar.f(), eVar);
        m2 m2Var = new m2(new s1(mVar, tVar, runnable), mVar2);
        Handler handler = this.X;
        handler.sendMessage(handler.obtainMessage(8, new r1(m2Var, this.T.get(), eVar)));
        return mVar2.a();
    }

    @RecentlyNonNull
    public final <O extends a.d> l<Boolean> v(@RecentlyNonNull e<O> eVar, @RecentlyNonNull i.a aVar, int i10) {
        m mVar = new m();
        i(mVar, i10, eVar);
        o2 o2Var = new o2(aVar, mVar);
        Handler handler = this.X;
        handler.sendMessage(handler.obtainMessage(13, new r1(o2Var, this.T.get(), eVar)));
        return mVar.a();
    }

    public final boolean w(j5.a aVar, int i10) {
        return this.Q.u(this.P, aVar, i10);
    }

    public final void x(@RecentlyNonNull j5.a aVar, int i10) {
        if (!w(aVar, i10)) {
            Handler handler = this.X;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, aVar));
        }
    }

    public final void y(p pVar, int i10, long j10, int i11) {
        Handler handler = this.X;
        handler.sendMessage(handler.obtainMessage(18, new n1(pVar, i10, j10, i11)));
    }
}
