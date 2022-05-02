package p148k5;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3487a;
import com.google.android.gms.common.api.internal.BasePendingResult;
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
import p118i5.C5217a;
import p118i5.C5220d;
import p133j5.AbstractC5867f;
import p133j5.AbstractC5876k;
import p133j5.C5850a;
import p134j6.AbstractC5891f;
import p134j6.C5886a;
import p163l5.AbstractC6353j0;
import p163l5.C6336e;
import p163l5.C6357k0;
import p163l5.C6378r;
import p232q5.C8244d;

public final class C6156q0 extends AbstractC5867f implements AbstractC6128j1 {
    public final Lock f19498b;
    public final C6357k0 f19499c;
    public final int f19501e;
    public final Context f19502f;
    public final Looper f19503g;
    public volatile boolean f19505i;
    public long f19506j;
    public long f19507k;
    public final HandlerC6148o0 f19508l;
    public final C5220d f19509m;
    public C6124i1 f19510n;
    public final Map<C5850a.C5853c<?>, C5850a.AbstractC5859f> f19511o;
    public Set<Scope> f19512p;
    public final C6336e f19513q;
    public final Map<C5850a<?>, Boolean> f19514r;
    public final C5850a.AbstractC5851a<? extends AbstractC5891f, C5886a> f19515s;
    public final C6126j f19516t;
    public final ArrayList<C6195z2> f19517u;
    public Integer f19518v;
    public Set<C6119h2> f19519w;
    public final C6129j2 f19520x;
    public final AbstractC6353j0 f19521y;
    public AbstractC6132k1 f19500d = null;
    public final Queue<AbstractC3487a<?, ?>> f19504h = new LinkedList();

    public C6156q0(Context context, Lock lock, Looper looper, C6336e eVar, C5220d dVar, C5850a.AbstractC5851a<? extends AbstractC5891f, C5886a> aVar, Map<C5850a<?>, Boolean> map, List<AbstractC5867f.AbstractC5869b> list, List<AbstractC5867f.AbstractC5870c> list2, Map<C5850a.C5853c<?>, C5850a.AbstractC5859f> map2, int i, int i2, ArrayList<C6195z2> arrayList) {
        this.f19506j = true != C8244d.m13053a() ? 120000L : 10000L;
        this.f19507k = 5000L;
        this.f19512p = new HashSet();
        this.f19516t = new C6126j();
        this.f19518v = null;
        this.f19519w = null;
        C6144n0 n0Var = new C6144n0(this);
        this.f19521y = n0Var;
        this.f19502f = context;
        this.f19498b = lock;
        this.f19499c = new C6357k0(looper, n0Var);
        this.f19503g = looper;
        this.f19508l = new HandlerC6148o0(this, looper);
        this.f19509m = dVar;
        this.f19501e = i;
        if (i >= 0) {
            this.f19518v = Integer.valueOf(i2);
        }
        this.f19514r = map;
        this.f19511o = map2;
        this.f19517u = arrayList;
        this.f19520x = new C6129j2();
        for (AbstractC5867f.AbstractC5869b bVar : list) {
            this.f19499c.m20558f(bVar);
        }
        for (AbstractC5867f.AbstractC5870c cVar : list2) {
            this.f19499c.m20557g(cVar);
        }
        this.f19513q = eVar;
        this.f19515s = aVar;
    }

    public static int m21165s(Iterable<C5850a.AbstractC5859f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C5850a.AbstractC5859f fVar : iterable) {
            z2 |= fVar.mo20626t();
            z3 |= fVar.mo21249b();
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    public static String m21164t(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public static void m21163u(C6156q0 q0Var) {
        q0Var.f19498b.lock();
        try {
            if (q0Var.f19505i) {
                q0Var.m21160x();
            }
        } finally {
            q0Var.f19498b.unlock();
        }
    }

    public static void m21162v(C6156q0 q0Var) {
        q0Var.f19498b.lock();
        try {
            if (q0Var.m21167q()) {
                q0Var.m21160x();
            }
        } finally {
            q0Var.f19498b.unlock();
        }
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21178a(C5217a aVar) {
        if (!this.f19509m.m23583k(this.f19502f, aVar.m23615b())) {
            m21167q();
        }
        if (!this.f19505i) {
            this.f19499c.m20559e(aVar);
            this.f19499c.m20563a();
        }
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21177b(Bundle bundle) {
        while (!this.f19504h.isEmpty()) {
            mo21174g(this.f19504h.remove());
        }
        this.f19499c.m20561c(bundle);
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21176c(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.f19505i) {
                this.f19505i = true;
                if (this.f19510n == null && !C8244d.m13053a()) {
                    try {
                        this.f19510n = this.f19509m.m23597w(this.f19502f.getApplicationContext(), new C6152p0(this));
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC6148o0 o0Var = this.f19508l;
                o0Var.sendMessageDelayed(o0Var.obtainMessage(1), this.f19506j);
                HandlerC6148o0 o0Var2 = this.f19508l;
                o0Var2.sendMessageDelayed(o0Var2.obtainMessage(2), this.f19507k);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f19520x.f19425a.toArray(new BasePendingResult[0])) {
            basePendingResult.m30389f(C6129j2.f19424c);
        }
        this.f19499c.m20560d(i);
        this.f19499c.m20563a();
        if (i == 2) {
            m21160x();
        }
    }

    @Override
    public final void mo21089d() {
        this.f19498b.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.f19501e >= 0) {
                C6378r.m20503n(this.f19518v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f19518v;
                if (num == null) {
                    this.f19518v = Integer.valueOf(m21165s(this.f19511o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) C6378r.m20506k(this.f19518v)).intValue();
            this.f19498b.lock();
            if (intValue == 3 || intValue == 1) {
                i = intValue;
            } else if (intValue != 2) {
                i = intValue;
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i);
                C6378r.m20515b(z, sb2.toString());
                m21161w(i);
                m21160x();
                this.f19498b.unlock();
            }
            z = true;
            StringBuilder sb22 = new StringBuilder(33);
            sb22.append("Illegal sign-in mode: ");
            sb22.append(i);
            C6378r.m20515b(z, sb22.toString());
            m21161w(i);
            m21160x();
            this.f19498b.unlock();
        } finally {
            this.f19498b.unlock();
        }
    }

    @Override
    public final void mo21088e() {
        Lock lock;
        this.f19498b.lock();
        try {
            this.f19520x.m21251b();
            AbstractC6132k1 k1Var = this.f19500d;
            if (k1Var != null) {
                k1Var.mo21116c();
            }
            this.f19516t.m21253c();
            for (AbstractC3487a<?, ?> aVar : this.f19504h) {
                aVar.m30379p(null);
                aVar.m30390d();
            }
            this.f19504h.clear();
            if (this.f19500d == null) {
                lock = this.f19498b;
            } else {
                m21167q();
                this.f19499c.m20563a();
                lock = this.f19498b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f19498b.unlock();
            throw th;
        }
    }

    @Override
    public final <A extends C5850a.AbstractC5852b, R extends AbstractC5876k, T extends AbstractC3487a<R, A>> T mo21175f(T t) {
        Lock lock;
        C5850a<?> r = t.m30375r();
        boolean containsKey = this.f19511o.containsKey(t.m30374s());
        String d = r != null ? r.m21934d() : "the API";
        StringBuilder sb2 = new StringBuilder(String.valueOf(d).length() + 65);
        sb2.append("GoogleApiClient is not configured to use ");
        sb2.append(d);
        sb2.append(" required for this call.");
        C6378r.m20515b(containsKey, sb2.toString());
        this.f19498b.lock();
        try {
            AbstractC6132k1 k1Var = this.f19500d;
            if (k1Var == null) {
                this.f19504h.add(t);
                lock = this.f19498b;
            } else {
                t = (T) k1Var.mo21114e(t);
                lock = this.f19498b;
            }
            lock.unlock();
            return t;
        } catch (Throwable th) {
            this.f19498b.unlock();
            throw th;
        }
    }

    @Override
    public final <A extends C5850a.AbstractC5852b, T extends AbstractC3487a<? extends AbstractC5876k, A>> T mo21174g(T t) {
        Lock lock;
        C5850a<?> r = t.m30375r();
        boolean containsKey = this.f19511o.containsKey(t.m30374s());
        String d = r != null ? r.m21934d() : "the API";
        StringBuilder sb2 = new StringBuilder(String.valueOf(d).length() + 65);
        sb2.append("GoogleApiClient is not configured to use ");
        sb2.append(d);
        sb2.append(" required for this call.");
        C6378r.m20515b(containsKey, sb2.toString());
        this.f19498b.lock();
        try {
            AbstractC6132k1 k1Var = this.f19500d;
            if (k1Var != null) {
                if (this.f19505i) {
                    this.f19504h.add(t);
                    while (!this.f19504h.isEmpty()) {
                        AbstractC3487a<?, ?> remove = this.f19504h.remove();
                        this.f19520x.m21252a(remove);
                        remove.m30370w(Status.f11571Q);
                    }
                    lock = this.f19498b;
                } else {
                    t = (T) k1Var.mo21117b(t);
                    lock = this.f19498b;
                }
                lock.unlock();
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f19498b.unlock();
            throw th;
        }
    }

    @Override
    public final <C extends C5850a.AbstractC5859f> C mo21173h(C5850a.C5853c<C> cVar) {
        C c = (C) this.f19511o.get(cVar);
        C6378r.m20505l(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override
    public final Context mo21172i() {
        return this.f19502f;
    }

    @Override
    public final Looper mo21171j() {
        return this.f19503g;
    }

    @Override
    public final void mo21087k(AbstractC5867f.AbstractC5870c cVar) {
        this.f19499c.m20557g(cVar);
    }

    @Override
    public final void mo21086l(AbstractC5867f.AbstractC5870c cVar) {
        this.f19499c.m20556h(cVar);
    }

    @Override
    public final void mo21170m(p148k5.C6119h2 r3) {
        throw new UnsupportedOperationException("Method not decompiled: p148k5.C6156q0.mo21170m(k5.h2):void");
    }

    public final void m21169o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f19502f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f19505i);
        printWriter.append(" mWorkQueue.size()=").print(this.f19504h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f19520x.f19425a.size());
        AbstractC6132k1 k1Var = this.f19500d;
        if (k1Var != null) {
            k1Var.mo21115d(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean m21168p() {
        AbstractC6132k1 k1Var = this.f19500d;
        return k1Var != null && k1Var.mo21112g();
    }

    @GuardedBy("mLock")
    public final boolean m21167q() {
        if (!this.f19505i) {
            return false;
        }
        this.f19505i = false;
        this.f19508l.removeMessages(2);
        this.f19508l.removeMessages(1);
        C6124i1 i1Var = this.f19510n;
        if (i1Var != null) {
            i1Var.m21256b();
            this.f19510n = null;
        }
        return true;
    }

    public final String m21166r() {
        StringWriter stringWriter = new StringWriter();
        m21169o("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public final void m21161w(int i) {
        Integer num = this.f19518v;
        if (num == null) {
            this.f19518v = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String t = m21164t(i);
            String t2 = m21164t(this.f19518v.intValue());
            StringBuilder sb2 = new StringBuilder(t.length() + 51 + t2.length());
            sb2.append("Cannot use sign-in mode: ");
            sb2.append(t);
            sb2.append(". Mode was already set to ");
            sb2.append(t2);
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f19500d == null) {
            boolean z = false;
            boolean z2 = false;
            for (C5850a.AbstractC5859f fVar : this.f19511o.values()) {
                z |= fVar.mo20626t();
                z2 |= fVar.mo21249b();
            }
            int intValue = this.f19518v.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z) {
                    this.f19500d = C6105e3.m21327m(this.f19502f, this, this.f19498b, this.f19503g, this.f19509m, this.f19511o, this.f19513q, this.f19514r, this.f19515s, this.f19517u);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.f19500d = new C6173u0(this.f19502f, this, this.f19498b, this.f19503g, this.f19509m, this.f19511o, this.f19513q, this.f19514r, this.f19515s, this.f19517u, this);
        }
    }

    @GuardedBy("mLock")
    public final void m21160x() {
        this.f19499c.m20562b();
        ((AbstractC6132k1) C6378r.m20506k(this.f19500d)).mo21118a();
    }
}
