package g2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.LiveData;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import f2.d;
import f2.j;
import f2.l;
import f2.m;
import f2.p;
import f2.s;
import f2.t;
import f2.u;
import h2.b;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import p2.f;

public class i extends t {
    public static final String f12044j = j.f("WorkManagerImpl");
    public static i f12045k = null;
    public static i f12046l = null;
    public static final Object f12047m = new Object();
    public Context f12048a;
    public a f12049b;
    public WorkDatabase f12050c;
    public r2.a f12051d;
    public List<e> f12052e;
    public d f12053f;
    public f f12054g;
    public boolean f12055h;
    public BroadcastReceiver.PendingResult f12056i;

    public i(Context context, a aVar, r2.a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(p.a_res_0x7f030008));
    }

    public static void i(android.content.Context r4, androidx.work.a r5) {
        throw new UnsupportedOperationException("Method not decompiled: g2.i.i(android.content.Context, androidx.work.a):void");
    }

    @Deprecated
    public static i n() {
        synchronized (f12047m) {
            i iVar = f12045k;
            if (iVar != null) {
                return iVar;
            }
            return f12046l;
        }
    }

    public static i o(Context context) {
        i n10;
        synchronized (f12047m) {
            n10 = n();
            if (n10 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof a.c) {
                    i(applicationContext, ((a.c) applicationContext).a());
                    n10 = o(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return n10;
    }

    public void A(String str) {
        this.f12051d.b(new p2.j(this, str, true));
    }

    public void B(String str) {
        this.f12051d.b(new p2.j(this, str, false));
    }

    @Override
    public m a(String str) {
        p2.a d10 = p2.a.d(str, this);
        this.f12051d.b(d10);
        return d10.e();
    }

    @Override
    public m b(String str) {
        p2.a c10 = p2.a.c(str, this, true);
        this.f12051d.b(c10);
        return c10.e();
    }

    @Override
    public m d(List<? extends u> list) {
        if (!list.isEmpty()) {
            return new g(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override
    public m f(String str, d dVar, List<l> list) {
        return new g(this, str, dVar, list).a();
    }

    @Override
    public LiveData<List<s>> h(String str) {
        return p2.d.a(this.f12050c.D().i(str), o2.p.f18589t, this.f12051d);
    }

    public m j(UUID uuid) {
        p2.a b10 = p2.a.b(uuid, this);
        this.f12051d.b(b10);
        return b10.e();
    }

    public List<e> k(Context context, a aVar, r2.a aVar2) {
        return Arrays.asList(f.a(context, this), new b(context, aVar, aVar2, this));
    }

    public Context l() {
        return this.f12048a;
    }

    public a m() {
        return this.f12049b;
    }

    public f p() {
        return this.f12054g;
    }

    public d q() {
        return this.f12053f;
    }

    public List<e> r() {
        return this.f12052e;
    }

    public WorkDatabase s() {
        return this.f12050c;
    }

    public r2.a t() {
        return this.f12051d;
    }

    public final void u(Context context, a aVar, r2.a aVar2, WorkDatabase workDatabase, List<e> list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f12048a = applicationContext;
        this.f12049b = aVar;
        this.f12051d = aVar2;
        this.f12050c = workDatabase;
        this.f12052e = list;
        this.f12053f = dVar;
        this.f12054g = new f(workDatabase);
        this.f12055h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext.isDeviceProtectedStorage()) {
            this.f12051d.b(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public void v() {
        synchronized (f12047m) {
            this.f12055h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f12056i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f12056i = null;
            }
        }
    }

    public void w() {
        if (Build.VERSION.SDK_INT >= 23) {
            j2.b.b(l());
        }
        s().D().v();
        f.b(m(), s(), r());
    }

    public void x(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f12047m) {
            this.f12056i = pendingResult;
            if (this.f12055h) {
                pendingResult.finish();
                this.f12056i = null;
            }
        }
    }

    public void y(String str) {
        z(str, null);
    }

    public void z(String str, WorkerParameters.a aVar) {
        this.f12051d.b(new p2.i(this, str, aVar));
    }

    public i(Context context, a aVar, r2.a aVar2, boolean z10) {
        this(context, aVar, aVar2, WorkDatabase.u(context.getApplicationContext(), aVar2.c(), z10));
    }

    public i(Context context, a aVar, r2.a aVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        j.e(new j.a(aVar.j()));
        List<e> k10 = k(applicationContext, aVar, aVar2);
        u(context, aVar, aVar2, workDatabase, k10, new d(context, aVar, aVar2, workDatabase, k10));
    }
}
