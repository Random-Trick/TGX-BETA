package l5;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j5.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import k5.a;
import k5.a.d;
import k5.e;
import k5.f;
import k5.p;
import l5.i;
import m5.l0;
import m5.q;
import m5.r;
import n6.m;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import r5.b;

public final class c1<O extends a.d> implements f.b, f.c, a3 {
    @NotOnlyInitialized
    public final a.f f16042b;
    public final b<O> f16043c;
    public final int f16047g;
    public final b2 f16048h;
    public boolean f16049i;
    public final f f16053m;
    public final Queue<p2> f16041a = new LinkedList();
    public final Set<s2> f16045e = new HashSet();
    public final Map<i.a<?>, s1> f16046f = new HashMap();
    public final List<d1> f16050j = new ArrayList();
    public j5.a f16051k = null;
    public int f16052l = 0;
    public final u f16044d = new u();

    public c1(f fVar, e<O> eVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f16053m = fVar;
        handler = fVar.X;
        a.f n10 = eVar.n(handler.getLooper(), this);
        this.f16042b = n10;
        this.f16043c = eVar.j();
        this.f16047g = eVar.o();
        if (n10.u()) {
            context = fVar.P;
            handler2 = fVar.X;
            this.f16048h = eVar.p(context, handler2);
            return;
        }
        this.f16048h = null;
    }

    public static boolean J(c1 c1Var, boolean z10) {
        return c1Var.l(false);
    }

    public static void K(c1 c1Var, d1 d1Var) {
        if (!c1Var.f16050j.contains(d1Var) || c1Var.f16049i) {
            return;
        }
        if (!c1Var.f16042b.a()) {
            c1Var.C();
        } else {
            c1Var.e();
        }
    }

    public static void L(c1 c1Var, d1 d1Var) {
        Handler handler;
        Handler handler2;
        c cVar;
        c[] f10;
        if (c1Var.f16050j.remove(d1Var)) {
            handler = c1Var.f16053m.X;
            handler.removeMessages(15, d1Var);
            handler2 = c1Var.f16053m.X;
            handler2.removeMessages(16, d1Var);
            cVar = d1Var.f16058b;
            ArrayList arrayList = new ArrayList(c1Var.f16041a.size());
            for (p2 p2Var : c1Var.f16041a) {
                if ((p2Var instanceof p1) && (f10 = ((p1) p2Var).f(c1Var)) != null && b.b(f10, cVar)) {
                    arrayList.add(p2Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                p2 p2Var2 = (p2) arrayList.get(i10);
                c1Var.f16041a.remove(p2Var2);
                p2Var2.b(new p(cVar));
            }
        }
    }

    public static void M(c1 c1Var, Status status) {
        c1Var.i(status);
    }

    public static b N(c1 c1Var) {
        return c1Var.f16043c;
    }

    public final void A() {
        Handler handler;
        j5.d dVar;
        Context context;
        Status status;
        handler = this.f16053m.X;
        r.d(handler);
        if (this.f16049i) {
            j();
            dVar = this.f16053m.Q;
            context = this.f16053m.P;
            if (dVar.i(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            i(status);
            this.f16042b.f("Timing out connection while resuming.");
        }
    }

    public final boolean B() {
        return l(true);
    }

    public final void C() {
        Handler handler;
        l0 l0Var;
        Context context;
        handler = this.f16053m.X;
        r.d(handler);
        if (!this.f16042b.a() && !this.f16042b.h()) {
            try {
                l0Var = this.f16053m.R;
                context = this.f16053m.P;
                int a10 = l0Var.a(context, this.f16042b);
                if (a10 != 0) {
                    j5.a aVar = new j5.a(a10, null);
                    String name = this.f16042b.getClass().getName();
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb2 = new StringBuilder(name.length() + 35 + valueOf.length());
                    sb2.append("The service for ");
                    sb2.append(name);
                    sb2.append(" is not available: ");
                    sb2.append(valueOf);
                    Log.w("GoogleApiManager", sb2.toString());
                    p(aVar, null);
                    return;
                }
                f1 f1Var = new f1(this.f16053m, this.f16042b, this.f16043c);
                if (this.f16042b.u()) {
                    ((b2) r.k(this.f16048h)).F1(f1Var);
                }
                try {
                    this.f16042b.r(f1Var);
                } catch (SecurityException e10) {
                    p(new j5.a(10), e10);
                }
            } catch (IllegalStateException e11) {
                p(new j5.a(10), e11);
            }
        }
    }

    public final void D(s2 s2Var) {
        Handler handler;
        handler = this.f16053m.X;
        r.d(handler);
        this.f16045e.add(s2Var);
    }

    public final boolean E() {
        return this.f16042b.a();
    }

    public final boolean F() {
        return this.f16042b.u();
    }

    public final int G() {
        return this.f16047g;
    }

    public final int H() {
        return this.f16052l;
    }

    public final void I() {
        this.f16052l++;
    }

    public final void b() {
        x();
        m(j5.a.N);
        j();
        Iterator<s1> it = this.f16046f.values().iterator();
        while (it.hasNext()) {
            s1 next = it.next();
            if (n(next.f16225a.c()) != null) {
                it.remove();
            } else {
                try {
                    next.f16225a.d(this.f16042b, new m<>());
                } catch (DeadObjectException unused) {
                    q(3);
                    this.f16042b.f("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        e();
        k();
    }

    public final void c(int i10) {
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        l0 l0Var;
        x();
        this.f16049i = true;
        this.f16044d.e(i10, this.f16042b.s());
        handler = this.f16053m.X;
        handler2 = this.f16053m.X;
        Message obtain = Message.obtain(handler2, 9, this.f16043c);
        j10 = this.f16053m.f16081a;
        handler.sendMessageDelayed(obtain, j10);
        handler3 = this.f16053m.X;
        handler4 = this.f16053m.X;
        Message obtain2 = Message.obtain(handler4, 11, this.f16043c);
        j11 = this.f16053m.f16082b;
        handler3.sendMessageDelayed(obtain2, j11);
        l0Var = this.f16053m.R;
        l0Var.c();
        for (s1 s1Var : this.f16046f.values()) {
            s1Var.f16227c.run();
        }
    }

    public final boolean d(j5.a aVar) {
        Object obj;
        obj = f.f16079b0;
        synchronized (obj) {
            Objects.requireNonNull(this.f16053m);
        }
        return false;
    }

    public final void e() {
        ArrayList arrayList = new ArrayList(this.f16041a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            p2 p2Var = (p2) arrayList.get(i10);
            if (this.f16042b.a()) {
                if (f(p2Var)) {
                    this.f16041a.remove(p2Var);
                }
            } else {
                return;
            }
        }
    }

    public final boolean f(p2 p2Var) {
        boolean z10;
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j12;
        if (!(p2Var instanceof p1)) {
            g(p2Var);
            return true;
        }
        p1 p1Var = (p1) p2Var;
        c n10 = n(p1Var.f(this));
        if (n10 == null) {
            g(p2Var);
            return true;
        }
        String name = this.f16042b.getClass().getName();
        String b10 = n10.b();
        long c10 = n10.c();
        StringBuilder sb2 = new StringBuilder(name.length() + 77 + String.valueOf(b10).length());
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(b10);
        sb2.append(", ");
        sb2.append(c10);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        z10 = this.f16053m.Y;
        if (!z10 || !p1Var.g(this)) {
            p1Var.b(new p(n10));
            return true;
        }
        d1 d1Var = new d1(this.f16043c, n10, null);
        int indexOf = this.f16050j.indexOf(d1Var);
        if (indexOf >= 0) {
            d1 d1Var2 = this.f16050j.get(indexOf);
            handler5 = this.f16053m.X;
            handler5.removeMessages(15, d1Var2);
            handler6 = this.f16053m.X;
            handler7 = this.f16053m.X;
            Message obtain = Message.obtain(handler7, 15, d1Var2);
            j12 = this.f16053m.f16081a;
            handler6.sendMessageDelayed(obtain, j12);
            return false;
        }
        this.f16050j.add(d1Var);
        handler = this.f16053m.X;
        handler2 = this.f16053m.X;
        Message obtain2 = Message.obtain(handler2, 15, d1Var);
        j10 = this.f16053m.f16081a;
        handler.sendMessageDelayed(obtain2, j10);
        handler3 = this.f16053m.X;
        handler4 = this.f16053m.X;
        Message obtain3 = Message.obtain(handler4, 16, d1Var);
        j11 = this.f16053m.f16082b;
        handler3.sendMessageDelayed(obtain3, j11);
        j5.a aVar = new j5.a(2, null);
        if (d(aVar)) {
            return false;
        }
        this.f16053m.w(aVar, this.f16047g);
        return false;
    }

    public final void g(p2 p2Var) {
        p2Var.c(this.f16044d, F());
        try {
            p2Var.d(this);
        } catch (DeadObjectException unused) {
            q(1);
            this.f16042b.f("DeadObjectException thrown while running ApiCallRunner.");
        } catch (Throwable th) {
            throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", this.f16042b.getClass().getName()), th);
        }
    }

    public final void h(Status status, Exception exc, boolean z10) {
        Handler handler;
        handler = this.f16053m.X;
        r.d(handler);
        boolean z11 = false;
        boolean z12 = status == null;
        if (exc == null) {
            z11 = true;
        }
        if (z12 != z11) {
            Iterator<p2> it = this.f16041a.iterator();
            while (it.hasNext()) {
                p2 next = it.next();
                if (!z10 || next.f16184a == 2) {
                    if (status != null) {
                        next.a(status);
                    } else {
                        next.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void i(Status status) {
        Handler handler;
        handler = this.f16053m.X;
        r.d(handler);
        h(status, null, false);
    }

    public final void j() {
        Handler handler;
        Handler handler2;
        if (this.f16049i) {
            handler = this.f16053m.X;
            handler.removeMessages(11, this.f16043c);
            handler2 = this.f16053m.X;
            handler2.removeMessages(9, this.f16043c);
            this.f16049i = false;
        }
    }

    public final void k() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j10;
        handler = this.f16053m.X;
        handler.removeMessages(12, this.f16043c);
        handler2 = this.f16053m.X;
        handler3 = this.f16053m.X;
        Message obtainMessage = handler3.obtainMessage(12, this.f16043c);
        j10 = this.f16053m.f16083c;
        handler2.sendMessageDelayed(obtainMessage, j10);
    }

    public final boolean l(boolean z10) {
        Handler handler;
        handler = this.f16053m.X;
        r.d(handler);
        if (!this.f16042b.a() || this.f16046f.size() != 0) {
            return false;
        }
        if (this.f16044d.c()) {
            if (z10) {
                k();
            }
            return false;
        }
        this.f16042b.f("Timing out service connection.");
        return true;
    }

    public final void m(j5.a aVar) {
        for (s2 s2Var : this.f16045e) {
            s2Var.b(this.f16043c, aVar, q.a(aVar, j5.a.N) ? this.f16042b.i() : null);
        }
        this.f16045e.clear();
    }

    public final c n(c[] cVarArr) {
        if (!(cVarArr == null || cVarArr.length == 0)) {
            c[] q10 = this.f16042b.q();
            if (q10 == null) {
                q10 = new c[0];
            }
            k0.a aVar = new k0.a(q10.length);
            for (c cVar : q10) {
                aVar.put(cVar.b(), Long.valueOf(cVar.c()));
            }
            for (c cVar2 : cVarArr) {
                Long l10 = (Long) aVar.get(cVar2.b());
                if (l10 == null || l10.longValue() < cVar2.c()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    public final void o(j5.a aVar) {
        Handler handler;
        handler = this.f16053m.X;
        r.d(handler);
        a.f fVar = this.f16042b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(valueOf);
        fVar.f(sb2.toString());
        p(aVar, null);
    }

    public final void p(j5.a aVar, Exception exc) {
        Handler handler;
        l0 l0Var;
        boolean z10;
        Status j10;
        Status j11;
        Status j12;
        Handler handler2;
        Handler handler3;
        long j13;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f16053m.X;
        r.d(handler);
        b2 b2Var = this.f16048h;
        if (b2Var != null) {
            b2Var.G1();
        }
        x();
        l0Var = this.f16053m.R;
        l0Var.c();
        m(aVar);
        if ((this.f16042b instanceof o5.e) && aVar.b() != 24) {
            this.f16053m.M = true;
            handler5 = this.f16053m.X;
            handler6 = this.f16053m.X;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (aVar.b() == 4) {
            status = f.f16078a0;
            i(status);
        } else if (this.f16041a.isEmpty()) {
            this.f16051k = aVar;
        } else if (exc != null) {
            handler4 = this.f16053m.X;
            r.d(handler4);
            h(null, exc, false);
        } else {
            z10 = this.f16053m.Y;
            if (z10) {
                j11 = f.j(this.f16043c, aVar);
                h(j11, null, true);
                if (!this.f16041a.isEmpty() && !d(aVar) && !this.f16053m.w(aVar, this.f16047g)) {
                    if (aVar.b() == 18) {
                        this.f16049i = true;
                    }
                    if (this.f16049i) {
                        handler2 = this.f16053m.X;
                        handler3 = this.f16053m.X;
                        Message obtain = Message.obtain(handler3, 9, this.f16043c);
                        j13 = this.f16053m.f16081a;
                        handler2.sendMessageDelayed(obtain, j13);
                        return;
                    }
                    j12 = f.j(this.f16043c, aVar);
                    i(j12);
                    return;
                }
                return;
            }
            j10 = f.j(this.f16043c, aVar);
            i(j10);
        }
    }

    @Override
    public final void q(int i10) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f16053m.X;
        if (myLooper == handler.getLooper()) {
            c(i10);
            return;
        }
        handler2 = this.f16053m.X;
        handler2.post(new z0(this, i10));
    }

    @Override
    public final void r(j5.a aVar) {
        p(aVar, null);
    }

    public final void s(p2 p2Var) {
        Handler handler;
        handler = this.f16053m.X;
        r.d(handler);
        if (!this.f16042b.a()) {
            this.f16041a.add(p2Var);
            j5.a aVar = this.f16051k;
            if (aVar == null || !aVar.e()) {
                C();
            } else {
                p(this.f16051k, null);
            }
        } else if (f(p2Var)) {
            k();
        } else {
            this.f16041a.add(p2Var);
        }
    }

    @Override
    public final void t(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f16053m.X;
        if (myLooper == handler.getLooper()) {
            b();
            return;
        }
        handler2 = this.f16053m.X;
        handler2.post(new y0(this));
    }

    public final void u() {
        Handler handler;
        handler = this.f16053m.X;
        r.d(handler);
        i(f.Z);
        this.f16044d.d();
        for (i.a aVar : (i.a[]) this.f16046f.keySet().toArray(new i.a[0])) {
            s(new o2(aVar, new m()));
        }
        m(new j5.a(4));
        if (this.f16042b.a()) {
            this.f16042b.o(new b1(this));
        }
    }

    public final a.f v() {
        return this.f16042b;
    }

    public final Map<i.a<?>, s1> w() {
        return this.f16046f;
    }

    public final void x() {
        Handler handler;
        handler = this.f16053m.X;
        r.d(handler);
        this.f16051k = null;
    }

    @Override
    public final void x0(j5.a aVar, a<?> aVar2, boolean z10) {
        throw null;
    }

    public final j5.a y() {
        Handler handler;
        handler = this.f16053m.X;
        r.d(handler);
        return this.f16051k;
    }

    public final void z() {
        Handler handler;
        handler = this.f16053m.X;
        r.d(handler);
        if (this.f16049i) {
            C();
        }
    }
}
