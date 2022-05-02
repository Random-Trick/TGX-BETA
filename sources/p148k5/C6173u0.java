package p148k5;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC3487a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p118i5.C5217a;
import p118i5.C5221e;
import p133j5.AbstractC5876k;
import p133j5.C5850a;
import p134j6.AbstractC5891f;
import p134j6.C5886a;
import p163l5.C6336e;
import p163l5.C6378r;

public final class C6173u0 implements AbstractC6132k1, AbstractC6084a3 {
    public final Lock f19553a;
    public final Condition f19554b;
    public final Context f19555c;
    public final C5221e f19556d;
    public final HandlerC6169t0 f19557e;
    public final Map<C5850a.C5853c<?>, C5850a.AbstractC5859f> f19558f;
    public final C6336e f19560h;
    public final Map<C5850a<?>, Boolean> f19561i;
    public final C5850a.AbstractC5851a<? extends AbstractC5891f, C5886a> f19562j;
    @NotOnlyInitialized
    public volatile AbstractC6161r0 f19563k;
    public int f19565m;
    public final C6156q0 f19566n;
    public final AbstractC6128j1 f19567o;
    public final Map<C5850a.C5853c<?>, C5217a> f19559g = new HashMap();
    public C5217a f19564l = null;

    public C6173u0(Context context, C6156q0 q0Var, Lock lock, Looper looper, C5221e eVar, Map<C5850a.C5853c<?>, C5850a.AbstractC5859f> map, C6336e eVar2, Map<C5850a<?>, Boolean> map2, C5850a.AbstractC5851a<? extends AbstractC5891f, C5886a> aVar, ArrayList<C6195z2> arrayList, AbstractC6128j1 j1Var) {
        this.f19555c = context;
        this.f19553a = lock;
        this.f19556d = eVar;
        this.f19558f = map;
        this.f19560h = eVar2;
        this.f19561i = map2;
        this.f19562j = aVar;
        this.f19566n = q0Var;
        this.f19567o = j1Var;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).m21083a(this);
        }
        this.f19557e = new HandlerC6169t0(this, looper);
        this.f19554b = lock.newCondition();
        this.f19563k = new C6139m0(this);
    }

    @Override
    public final void mo21120E0(C5217a aVar, C5850a<?> aVar2, boolean z) {
        this.f19553a.lock();
        try {
            this.f19563k.mo21142h(aVar, aVar2, z);
        } finally {
            this.f19553a.unlock();
        }
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21119a() {
        this.f19563k.mo21149a();
    }

    @Override
    @GuardedBy("mLock")
    public final <A extends C5850a.AbstractC5852b, T extends AbstractC3487a<? extends AbstractC5876k, A>> T mo21118b(T t) {
        t.m30384m();
        return (T) this.f19563k.mo21148b(t);
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21117c() {
        if (this.f19563k.mo21147c()) {
            this.f19559g.clear();
        }
    }

    @Override
    public final void mo21116d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f19563k);
        for (C5850a<?> aVar : this.f19561i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) aVar.m21935d()).println(":");
            ((C5850a.AbstractC5859f) C6378r.m20507k(this.f19558f.get(aVar.m21936c()))).mo21244m(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    @GuardedBy("mLock")
    public final <A extends C5850a.AbstractC5852b, R extends AbstractC5876k, T extends AbstractC3487a<R, A>> T mo21115e(T t) {
        t.m30384m();
        this.f19563k.mo21145e(t);
        return t;
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21114f() {
        if (this.f19563k instanceof C6081a0) {
            ((C6081a0) this.f19563k).m21390i();
        }
    }

    @Override
    public final boolean mo21113g() {
        return this.f19563k instanceof C6081a0;
    }

    public final void m21112h() {
        this.f19553a.lock();
        try {
            this.f19563k = new C6135l0(this, this.f19560h, this.f19561i, this.f19556d, this.f19562j, this.f19553a, this.f19555c);
            this.f19563k.mo21146d();
            this.f19554b.signalAll();
        } finally {
            this.f19553a.unlock();
        }
    }

    public final void m21111i() {
        this.f19553a.lock();
        try {
            this.f19566n.m21168q();
            this.f19563k = new C6081a0(this);
            this.f19563k.mo21146d();
            this.f19554b.signalAll();
        } finally {
            this.f19553a.unlock();
        }
    }

    public final void m21110j(C5217a aVar) {
        this.f19553a.lock();
        try {
            this.f19564l = aVar;
            this.f19563k = new C6139m0(this);
            this.f19563k.mo21146d();
            this.f19554b.signalAll();
        } finally {
            this.f19553a.unlock();
        }
    }

    public final void m21109k(AbstractC6165s0 s0Var) {
        this.f19557e.sendMessage(this.f19557e.obtainMessage(1, s0Var));
    }

    public final void m21108l(RuntimeException runtimeException) {
        this.f19557e.sendMessage(this.f19557e.obtainMessage(2, runtimeException));
    }

    @Override
    public final void mo21081q(int i) {
        this.f19553a.lock();
        try {
            this.f19563k.mo21143g(i);
        } finally {
            this.f19553a.unlock();
        }
    }

    @Override
    public final void mo21080t(Bundle bundle) {
        this.f19553a.lock();
        try {
            this.f19563k.mo21144f(bundle);
        } finally {
            this.f19553a.unlock();
        }
    }
}
