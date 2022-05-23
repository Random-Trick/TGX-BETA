package l5;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j5.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import k5.a;
import k5.f;
import k5.k;
import m5.e;
import m5.j0;
import m5.k0;
import m5.r;

public final class q0 extends f implements j1 {
    public final Lock f16185b;
    public final k0 f16186c;
    public final int f16188e;
    public final Context f16189f;
    public final Looper f16190g;
    public volatile boolean f16192i;
    public long f16193j;
    public long f16194k;
    public final o0 f16195l;
    public final d f16196m;
    public i1 f16197n;
    public final Map<a.c<?>, a.f> f16198o;
    public Set<Scope> f16199p;
    public final e f16200q;
    public final Map<a<?>, Boolean> f16201r;
    public final a.AbstractC0141a<? extends k6.f, k6.a> f16202s;
    public final j f16203t;
    public final ArrayList<z2> f16204u;
    public Integer f16205v;
    public Set<h2> f16206w;
    public final j2 f16207x;
    public final j0 f16208y;
    public k1 f16187d = null;
    public final Queue<com.google.android.gms.common.api.internal.a<?, ?>> f16191h = new LinkedList();

    public q0(Context context, Lock lock, Looper looper, e eVar, d dVar, a.AbstractC0141a<? extends k6.f, k6.a> aVar, Map<a<?>, Boolean> map, List<f.b> list, List<f.c> list2, Map<a.c<?>, a.f> map2, int i10, int i11, ArrayList<z2> arrayList) {
        this.f16193j = true != r5.d.a() ? 120000L : 10000L;
        this.f16194k = 5000L;
        this.f16199p = new HashSet();
        this.f16203t = new j();
        this.f16205v = null;
        this.f16206w = null;
        n0 n0Var = new n0(this);
        this.f16208y = n0Var;
        this.f16189f = context;
        this.f16185b = lock;
        this.f16186c = new k0(looper, n0Var);
        this.f16190g = looper;
        this.f16195l = new o0(this, looper);
        this.f16196m = dVar;
        this.f16188e = i10;
        if (i10 >= 0) {
            this.f16205v = Integer.valueOf(i11);
        }
        this.f16201r = map;
        this.f16198o = map2;
        this.f16204u = arrayList;
        this.f16207x = new j2();
        for (f.b bVar : list) {
            this.f16186c.f(bVar);
        }
        for (f.c cVar : list2) {
            this.f16186c.g(cVar);
        }
        this.f16200q = eVar;
        this.f16202s = aVar;
    }

    public static int s(Iterable<a.f> iterable, boolean z10) {
        boolean z11 = false;
        boolean z12 = false;
        for (a.f fVar : iterable) {
            z11 |= fVar.u();
            z12 |= fVar.b();
        }
        if (z11) {
            return (!z12 || !z10) ? 1 : 2;
        }
        return 3;
    }

    public static String t(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public static void u(q0 q0Var) {
        q0Var.f16185b.lock();
        try {
            if (q0Var.f16192i) {
                q0Var.x();
            }
        } finally {
            q0Var.f16185b.unlock();
        }
    }

    public static void v(q0 q0Var) {
        q0Var.f16185b.lock();
        try {
            if (q0Var.q()) {
                q0Var.x();
            }
        } finally {
            q0Var.f16185b.unlock();
        }
    }

    @Override
    @GuardedBy("mLock")
    public final void a(j5.a aVar) {
        if (!this.f16196m.k(this.f16189f, aVar.b())) {
            q();
        }
        if (!this.f16192i) {
            this.f16186c.e(aVar);
            this.f16186c.a();
        }
    }

    @Override
    @GuardedBy("mLock")
    public final void b(Bundle bundle) {
        while (!this.f16191h.isEmpty()) {
            g(this.f16191h.remove());
        }
        this.f16186c.c(bundle);
    }

    @Override
    @GuardedBy("mLock")
    public final void c(int i10, boolean z10) {
        if (i10 == 1) {
            if (!z10 && !this.f16192i) {
                this.f16192i = true;
                if (this.f16197n == null && !r5.d.a()) {
                    try {
                        this.f16197n = this.f16196m.w(this.f16189f.getApplicationContext(), new p0(this));
                    } catch (SecurityException unused) {
                    }
                }
                o0 o0Var = this.f16195l;
                o0Var.sendMessageDelayed(o0Var.obtainMessage(1), this.f16193j);
                o0 o0Var2 = this.f16195l;
                o0Var2.sendMessageDelayed(o0Var2.obtainMessage(2), this.f16194k);
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f16207x.f16121a.toArray(new BasePendingResult[0])) {
            basePendingResult.f(j2.f16120c);
        }
        this.f16186c.d(i10);
        this.f16186c.a();
        if (i10 == 2) {
            x();
        }
    }

    @Override
    public final void d() {
        this.f16185b.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.f16188e >= 0) {
                r.n(this.f16205v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f16205v;
                if (num == null) {
                    this.f16205v = Integer.valueOf(s(this.f16198o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) r.k(this.f16205v)).intValue();
            this.f16185b.lock();
            if (intValue == 3 || intValue == 1) {
                i10 = intValue;
            } else if (intValue != 2) {
                i10 = intValue;
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i10);
                r.b(z10, sb2.toString());
                w(i10);
                x();
                this.f16185b.unlock();
            }
            z10 = true;
            StringBuilder sb22 = new StringBuilder(33);
            sb22.append("Illegal sign-in mode: ");
            sb22.append(i10);
            r.b(z10, sb22.toString());
            w(i10);
            x();
            this.f16185b.unlock();
        } finally {
            this.f16185b.unlock();
        }
    }

    @Override
    public final void e() {
        Lock lock;
        this.f16185b.lock();
        try {
            this.f16207x.b();
            k1 k1Var = this.f16187d;
            if (k1Var != null) {
                k1Var.c();
            }
            this.f16203t.c();
            for (com.google.android.gms.common.api.internal.a<?, ?> aVar : this.f16191h) {
                aVar.p(null);
                aVar.d();
            }
            this.f16191h.clear();
            if (this.f16187d == null) {
                lock = this.f16185b;
            } else {
                q();
                this.f16186c.a();
                lock = this.f16185b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f16185b.unlock();
            throw th;
        }
    }

    @Override
    public final <A extends a.b, R extends k, T extends com.google.android.gms.common.api.internal.a<R, A>> T f(T t10) {
        Lock lock;
        a<?> r10 = t10.r();
        boolean containsKey = this.f16198o.containsKey(t10.s());
        String d10 = r10 != null ? r10.d() : "the API";
        StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 65);
        sb2.append("GoogleApiClient is not configured to use ");
        sb2.append(d10);
        sb2.append(" required for this call.");
        r.b(containsKey, sb2.toString());
        this.f16185b.lock();
        try {
            k1 k1Var = this.f16187d;
            if (k1Var == null) {
                this.f16191h.add(t10);
                lock = this.f16185b;
            } else {
                t10 = (T) k1Var.e(t10);
                lock = this.f16185b;
            }
            lock.unlock();
            return t10;
        } catch (Throwable th) {
            this.f16185b.unlock();
            throw th;
        }
    }

    @Override
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k, A>> T g(T t10) {
        Lock lock;
        a<?> r10 = t10.r();
        boolean containsKey = this.f16198o.containsKey(t10.s());
        String d10 = r10 != null ? r10.d() : "the API";
        StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 65);
        sb2.append("GoogleApiClient is not configured to use ");
        sb2.append(d10);
        sb2.append(" required for this call.");
        r.b(containsKey, sb2.toString());
        this.f16185b.lock();
        try {
            k1 k1Var = this.f16187d;
            if (k1Var != null) {
                if (this.f16192i) {
                    this.f16191h.add(t10);
                    while (!this.f16191h.isEmpty()) {
                        com.google.android.gms.common.api.internal.a<?, ?> remove = this.f16191h.remove();
                        this.f16207x.a(remove);
                        remove.w(Status.Q);
                    }
                    lock = this.f16185b;
                } else {
                    t10 = (T) k1Var.b(t10);
                    lock = this.f16185b;
                }
                lock.unlock();
                return t10;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f16185b.unlock();
            throw th;
        }
    }

    @Override
    public final <C extends a.f> C h(a.c<C> cVar) {
        C c10 = (C) this.f16198o.get(cVar);
        r.l(c10, "Appropriate Api was not requested.");
        return c10;
    }

    @Override
    public final Context i() {
        return this.f16189f;
    }

    @Override
    public final Looper j() {
        return this.f16190g;
    }

    @Override
    public final void k(f.c cVar) {
        this.f16186c.g(cVar);
    }

    @Override
    public final void l(f.c cVar) {
        this.f16186c.h(cVar);
    }

    @Override
    public final void m(l5.h2 r3) {
        throw new UnsupportedOperationException("Method not decompiled: l5.q0.m(l5.h2):void");
    }

    public final void o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f16189f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f16192i);
        printWriter.append(" mWorkQueue.size()=").print(this.f16191h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f16207x.f16121a.size());
        k1 k1Var = this.f16187d;
        if (k1Var != null) {
            k1Var.d(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean p() {
        k1 k1Var = this.f16187d;
        return k1Var != null && k1Var.g();
    }

    @GuardedBy("mLock")
    public final boolean q() {
        if (!this.f16192i) {
            return false;
        }
        this.f16192i = false;
        this.f16195l.removeMessages(2);
        this.f16195l.removeMessages(1);
        i1 i1Var = this.f16197n;
        if (i1Var != null) {
            i1Var.b();
            this.f16197n = null;
        }
        return true;
    }

    public final String r() {
        StringWriter stringWriter = new StringWriter();
        o("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public final void w(int i10) {
        Integer num = this.f16205v;
        if (num == null) {
            this.f16205v = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            String t10 = t(i10);
            String t11 = t(this.f16205v.intValue());
            StringBuilder sb2 = new StringBuilder(t10.length() + 51 + t11.length());
            sb2.append("Cannot use sign-in mode: ");
            sb2.append(t10);
            sb2.append(". Mode was already set to ");
            sb2.append(t11);
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f16187d == null) {
            boolean z10 = false;
            boolean z11 = false;
            for (a.f fVar : this.f16198o.values()) {
                z10 |= fVar.u();
                z11 |= fVar.b();
            }
            int intValue = this.f16205v.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z10) {
                    this.f16187d = e3.m(this.f16189f, this, this.f16185b, this.f16190g, this.f16196m, this.f16198o, this.f16200q, this.f16201r, this.f16202s, this.f16204u);
                    return;
                }
            } else if (!z10) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z11) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.f16187d = new u0(this.f16189f, this, this.f16185b, this.f16190g, this.f16196m, this.f16198o, this.f16200q, this.f16201r, this.f16202s, this.f16204u, this);
        }
    }

    @GuardedBy("mLock")
    public final void x() {
        this.f16186c.b();
        ((k1) r.k(this.f16187d)).a();
    }
}
