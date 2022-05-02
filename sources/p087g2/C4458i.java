package p087g2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.LiveData;
import androidx.work.C1066a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import p071f2.AbstractC4234j;
import p071f2.AbstractC4239m;
import p071f2.AbstractC4252t;
import p071f2.AbstractC4253u;
import p071f2.C4237l;
import p071f2.C4247p;
import p071f2.C4250s;
import p071f2.EnumC4227d;
import p099h2.C4925b;
import p130j2.C5841b;
import p198o2.C7554p;
import p215p2.AbstractRunnableC7991a;
import p215p2.C7997d;
import p215p2.C8001f;
import p215p2.RunnableC8005i;
import p215p2.RunnableC8006j;
import p243r2.AbstractC8354a;

public class C4458i extends AbstractC4252t {
    public static final String f14746j = AbstractC4234j.m28362f("WorkManagerImpl");
    public static C4458i f14747k = null;
    public static C4458i f14748l = null;
    public static final Object f14749m = new Object();
    public Context f14750a;
    public C1066a f14751b;
    public WorkDatabase f14752c;
    public AbstractC8354a f14753d;
    public List<AbstractC4454e> f14754e;
    public C4452d f14755f;
    public C8001f f14756g;
    public boolean f14757h;
    public BroadcastReceiver.PendingResult f14758i;

    public C4458i(Context context, C1066a aVar, AbstractC8354a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(C4247p.a_res_0x7f030008));
    }

    public static void m27599i(android.content.Context r4, androidx.work.C1066a r5) {
        throw new UnsupportedOperationException("Method not decompiled: p087g2.C4458i.m27599i(android.content.Context, androidx.work.a):void");
    }

    @Deprecated
    public static C4458i m27594n() {
        synchronized (f14749m) {
            C4458i iVar = f14747k;
            if (iVar != null) {
                return iVar;
            }
            return f14748l;
        }
    }

    public static C4458i m27593o(Context context) {
        C4458i n;
        synchronized (f14749m) {
            n = m27594n();
            if (n == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof C1066a.AbstractC1069c) {
                    m27599i(applicationContext, ((C1066a.AbstractC1069c) applicationContext).mo14755a());
                    n = m27593o(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return n;
    }

    public void m27606A(String str) {
        this.f14753d.mo12681b(new RunnableC8006j(this, str, true));
    }

    public void m27605B(String str) {
        this.f14753d.mo12681b(new RunnableC8006j(this, str, false));
    }

    @Override
    public AbstractC4239m mo27604a(String str) {
        AbstractRunnableC7991a d = AbstractRunnableC7991a.m13822d(str, this);
        this.f14753d.mo12681b(d);
        return d.m13821e();
    }

    @Override
    public AbstractC4239m mo27603b(String str) {
        AbstractRunnableC7991a c = AbstractRunnableC7991a.m13823c(str, this, true);
        this.f14753d.mo12681b(c);
        return c.m13821e();
    }

    @Override
    public AbstractC4239m mo27602d(List<? extends AbstractC4253u> list) {
        if (!list.isEmpty()) {
            return new C4456g(this, list).m27624a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override
    public AbstractC4239m mo27601f(String str, EnumC4227d dVar, List<C4237l> list) {
        return new C4456g(this, str, dVar, list).m27624a();
    }

    @Override
    public LiveData<List<C4250s>> mo27600h(String str) {
        return C7997d.m13804a(this.f14752c.mo38457D().mo15686i(str), C7554p.f24142t, this.f14753d);
    }

    public AbstractC4239m m27598j(UUID uuid) {
        AbstractRunnableC7991a b = AbstractRunnableC7991a.m13824b(uuid, this);
        this.f14753d.mo12681b(b);
        return b.m13821e();
    }

    public List<AbstractC4454e> m27597k(Context context, C1066a aVar, AbstractC8354a aVar2) {
        return Arrays.asList(C4455f.m27627a(context, this), new C4925b(context, aVar, aVar2, this));
    }

    public Context m27596l() {
        return this.f14750a;
    }

    public C1066a m27595m() {
        return this.f14751b;
    }

    public C8001f m27592p() {
        return this.f14756g;
    }

    public C4452d m27591q() {
        return this.f14755f;
    }

    public List<AbstractC4454e> m27590r() {
        return this.f14754e;
    }

    public WorkDatabase m27589s() {
        return this.f14752c;
    }

    public AbstractC8354a m27588t() {
        return this.f14753d;
    }

    public final void m27587u(Context context, C1066a aVar, AbstractC8354a aVar2, WorkDatabase workDatabase, List<AbstractC4454e> list, C4452d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f14750a = applicationContext;
        this.f14751b = aVar;
        this.f14753d = aVar2;
        this.f14752c = workDatabase;
        this.f14754e = list;
        this.f14755f = dVar;
        this.f14756g = new C8001f(workDatabase);
        this.f14757h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext.isDeviceProtectedStorage()) {
            this.f14753d.mo12681b(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public void m27586v() {
        synchronized (f14749m) {
            this.f14757h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f14758i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f14758i = null;
            }
        }
    }

    public void m27585w() {
        if (Build.VERSION.SDK_INT >= 23) {
            C5841b.m21955b(m27596l());
        }
        m27589s().mo38457D().mo15673v();
        C4455f.m27626b(m27595m(), m27589s(), m27590r());
    }

    public void m27584x(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f14749m) {
            this.f14758i = pendingResult;
            if (this.f14757h) {
                pendingResult.finish();
                this.f14758i = null;
            }
        }
    }

    public void m27583y(String str) {
        m27582z(str, null);
    }

    public void m27582z(String str, WorkerParameters.C1065a aVar) {
        this.f14753d.mo12681b(new RunnableC8005i(this, str, aVar));
    }

    public C4458i(Context context, C1066a aVar, AbstractC8354a aVar2, boolean z) {
        this(context, aVar, aVar2, WorkDatabase.m38464u(context.getApplicationContext(), aVar2.mo12680c(), z));
    }

    public C4458i(Context context, C1066a aVar, AbstractC8354a aVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        AbstractC4234j.m28363e(new AbstractC4234j.C4235a(aVar.m38489j()));
        List<AbstractC4454e> k = m27597k(applicationContext, aVar, aVar2);
        m27587u(context, aVar, aVar2, workDatabase, k, new C4452d(context, aVar, aVar2, workDatabase, k));
    }
}
