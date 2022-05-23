package l5;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import j5.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import k5.a;
import k5.k;
import k6.f;
import m5.r;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class u0 implements k1, a3 {
    public final Lock f16239a;
    public final Condition f16240b;
    public final Context f16241c;
    public final e f16242d;
    public final t0 f16243e;
    public final Map<a.c<?>, a.f> f16244f;
    public final m5.e f16246h;
    public final Map<a<?>, Boolean> f16247i;
    public final a.AbstractC0141a<? extends f, k6.a> f16248j;
    @NotOnlyInitialized
    public volatile r0 f16249k;
    public int f16251m;
    public final q0 f16252n;
    public final j1 f16253o;
    public final Map<a.c<?>, j5.a> f16245g = new HashMap();
    public j5.a f16250l = null;

    public u0(Context context, q0 q0Var, Lock lock, Looper looper, e eVar, Map<a.c<?>, a.f> map, m5.e eVar2, Map<a<?>, Boolean> map2, a.AbstractC0141a<? extends f, k6.a> aVar, ArrayList<z2> arrayList, j1 j1Var) {
        this.f16241c = context;
        this.f16239a = lock;
        this.f16242d = eVar;
        this.f16244f = map;
        this.f16246h = eVar2;
        this.f16247i = map2;
        this.f16248j = aVar;
        this.f16252n = q0Var;
        this.f16253o = j1Var;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(this);
        }
        this.f16243e = new t0(this, looper);
        this.f16240b = lock.newCondition();
        this.f16249k = new m0(this);
    }

    @Override
    @GuardedBy("mLock")
    public final void a() {
        this.f16249k.a();
    }

    @Override
    @GuardedBy("mLock")
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k, A>> T b(T t10) {
        t10.m();
        return (T) this.f16249k.b(t10);
    }

    @Override
    @GuardedBy("mLock")
    public final void c() {
        if (this.f16249k.c()) {
            this.f16245g.clear();
        }
    }

    @Override
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f16249k);
        for (a<?> aVar : this.f16247i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) aVar.d()).println(":");
            ((a.f) r.k(this.f16244f.get(aVar.c()))).m(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    @GuardedBy("mLock")
    public final <A extends a.b, R extends k, T extends com.google.android.gms.common.api.internal.a<R, A>> T e(T t10) {
        t10.m();
        this.f16249k.e(t10);
        return t10;
    }

    @Override
    @GuardedBy("mLock")
    public final void f() {
        if (this.f16249k instanceof a0) {
            ((a0) this.f16249k).i();
        }
    }

    @Override
    public final boolean g() {
        return this.f16249k instanceof a0;
    }

    public final void h() {
        this.f16239a.lock();
        try {
            this.f16249k = new l0(this, this.f16246h, this.f16247i, this.f16242d, this.f16248j, this.f16239a, this.f16241c);
            this.f16249k.d();
            this.f16240b.signalAll();
        } finally {
            this.f16239a.unlock();
        }
    }

    public final void i() {
        this.f16239a.lock();
        try {
            this.f16252n.q();
            this.f16249k = new a0(this);
            this.f16249k.d();
            this.f16240b.signalAll();
        } finally {
            this.f16239a.unlock();
        }
    }

    public final void j(j5.a aVar) {
        this.f16239a.lock();
        try {
            this.f16250l = aVar;
            this.f16249k = new m0(this);
            this.f16249k.d();
            this.f16240b.signalAll();
        } finally {
            this.f16239a.unlock();
        }
    }

    public final void k(s0 s0Var) {
        this.f16243e.sendMessage(this.f16243e.obtainMessage(1, s0Var));
    }

    public final void l(RuntimeException runtimeException) {
        this.f16243e.sendMessage(this.f16243e.obtainMessage(2, runtimeException));
    }

    @Override
    public final void q(int i10) {
        this.f16239a.lock();
        try {
            this.f16249k.h(i10);
        } finally {
            this.f16239a.unlock();
        }
    }

    @Override
    public final void t(Bundle bundle) {
        this.f16239a.lock();
        try {
            this.f16249k.f(bundle);
        } finally {
            this.f16239a.unlock();
        }
    }

    @Override
    public final void x0(j5.a aVar, a<?> aVar2, boolean z10) {
        this.f16239a.lock();
        try {
            this.f16249k.g(aVar, aVar2, z10);
        } finally {
            this.f16239a.unlock();
        }
    }
}
