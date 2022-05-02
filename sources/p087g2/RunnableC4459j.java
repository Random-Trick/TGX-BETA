package p087g2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C1066a;
import androidx.work.C1070b;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p022b7.AbstractFutureC1291a;
import p071f2.AbstractC4231h;
import p071f2.AbstractC4234j;
import p071f2.C4250s;
import p185n2.AbstractC7098a;
import p198o2.AbstractC7532b;
import p198o2.AbstractC7558q;
import p198o2.AbstractC7571t;
import p198o2.C7554p;
import p215p2.C8000e;
import p215p2.C8011m;
import p215p2.C8013n;
import p215p2.RunnableC8008l;
import p229q2.C8154c;
import p243r2.AbstractC8354a;

public class RunnableC4459j implements Runnable {
    public static final String f14759c0 = AbstractC4234j.m28362f("WorkerWrapper");
    public WorkerParameters.C1065a f14760M;
    public C7554p f14761N;
    public ListenableWorker f14762O;
    public AbstractC8354a f14763P;
    public C1066a f14765R;
    public AbstractC7098a f14766S;
    public WorkDatabase f14767T;
    public AbstractC7558q f14768U;
    public AbstractC7532b f14769V;
    public AbstractC7571t f14770W;
    public List<String> f14771X;
    public String f14772Y;
    public Context f14774a;
    public String f14776b;
    public volatile boolean f14777b0;
    public List<AbstractC4454e> f14778c;
    public ListenableWorker.AbstractC1060a f14764Q = ListenableWorker.AbstractC1060a.m38510a();
    public C8154c<Boolean> f14773Z = C8154c.m13345t();
    public AbstractFutureC1291a<ListenableWorker.AbstractC1060a> f14775a0 = null;

    public class RunnableC4460a implements Runnable {
        public final AbstractFutureC1291a f14779a;
        public final C8154c f14780b;

        public RunnableC4460a(AbstractFutureC1291a aVar, C8154c cVar) {
            this.f14779a = aVar;
            this.f14780b = cVar;
        }

        @Override
        public void run() {
            try {
                this.f14779a.get();
                AbstractC4234j.m28364c().mo28361a(RunnableC4459j.f14759c0, String.format("Starting work for %s", RunnableC4459j.this.f14761N.f24145c), new Throwable[0]);
                RunnableC4459j jVar = RunnableC4459j.this;
                jVar.f14775a0 = jVar.f14762O.mo38381o();
                this.f14780b.mo13346r(RunnableC4459j.this.f14775a0);
            } catch (Throwable th) {
                this.f14780b.mo13347q(th);
            }
        }
    }

    public class RunnableC4461b implements Runnable {
        public final C8154c f14782a;
        public final String f14783b;

        public RunnableC4461b(C8154c cVar, String str) {
            this.f14782a = cVar;
            this.f14783b = str;
        }

        @Override
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            Throwable e;
            try {
                try {
                    ListenableWorker.AbstractC1060a aVar = (ListenableWorker.AbstractC1060a) this.f14782a.get();
                    if (aVar == null) {
                        AbstractC4234j.m28364c().mo28360b(RunnableC4459j.f14759c0, String.format("%s returned a null result. Treating it as a failure.", RunnableC4459j.this.f14761N.f24145c), new Throwable[0]);
                    } else {
                        AbstractC4234j.m28364c().mo28361a(RunnableC4459j.f14759c0, String.format("%s returned a %s result.", RunnableC4459j.this.f14761N.f24145c, aVar), new Throwable[0]);
                        RunnableC4459j.this.f14764Q = aVar;
                    }
                } catch (InterruptedException e2) {
                    e = e2;
                    AbstractC4234j.m28364c().mo28360b(RunnableC4459j.f14759c0, String.format("%s failed because it threw an exception/error", this.f14783b), e);
                } catch (CancellationException e3) {
                    AbstractC4234j.m28364c().mo28359d(RunnableC4459j.f14759c0, String.format("%s was cancelled", this.f14783b), e3);
                } catch (ExecutionException e4) {
                    e = e4;
                    AbstractC4234j.m28364c().mo28360b(RunnableC4459j.f14759c0, String.format("%s failed because it threw an exception/error", this.f14783b), e);
                }
            } finally {
                RunnableC4459j.this.m27576f();
            }
        }
    }

    public static class C4462c {
        public Context f14785a;
        public ListenableWorker f14786b;
        public AbstractC7098a f14787c;
        public AbstractC8354a f14788d;
        public C1066a f14789e;
        public WorkDatabase f14790f;
        public String f14791g;
        public List<AbstractC4454e> f14792h;
        public WorkerParameters.C1065a f14793i = new WorkerParameters.C1065a();

        public C4462c(Context context, C1066a aVar, AbstractC8354a aVar2, AbstractC7098a aVar3, WorkDatabase workDatabase, String str) {
            this.f14785a = context.getApplicationContext();
            this.f14788d = aVar2;
            this.f14787c = aVar3;
            this.f14789e = aVar;
            this.f14790f = workDatabase;
            this.f14791g = str;
        }

        public RunnableC4459j m27566a() {
            return new RunnableC4459j(this);
        }

        public C4462c m27565b(WorkerParameters.C1065a aVar) {
            if (aVar != null) {
                this.f14793i = aVar;
            }
            return this;
        }

        public C4462c m27564c(List<AbstractC4454e> list) {
            this.f14792h = list;
            return this;
        }
    }

    public RunnableC4459j(C4462c cVar) {
        this.f14774a = cVar.f14785a;
        this.f14763P = cVar.f14788d;
        this.f14766S = cVar.f14787c;
        this.f14776b = cVar.f14791g;
        this.f14778c = cVar.f14792h;
        this.f14760M = cVar.f14793i;
        this.f14762O = cVar.f14786b;
        this.f14765R = cVar.f14789e;
        WorkDatabase workDatabase = cVar.f14790f;
        this.f14767T = workDatabase;
        this.f14768U = workDatabase.mo38457D();
        this.f14769V = this.f14767T.mo38444v();
        this.f14770W = this.f14767T.mo38456E();
    }

    public final String m27581a(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f14776b);
        sb2.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    public AbstractFutureC1291a<Boolean> m27580b() {
        return this.f14773Z;
    }

    public final void m27579c(ListenableWorker.AbstractC1060a aVar) {
        if (aVar instanceof ListenableWorker.AbstractC1060a.C1063c) {
            AbstractC4234j.m28364c().mo28359d(f14759c0, String.format("Worker result SUCCESS for %s", this.f14772Y), new Throwable[0]);
            if (this.f14761N.m15699d()) {
                m27574h();
            } else {
                m27569m();
            }
        } else if (aVar instanceof ListenableWorker.AbstractC1060a.C1062b) {
            AbstractC4234j.m28364c().mo28359d(f14759c0, String.format("Worker result RETRY for %s", this.f14772Y), new Throwable[0]);
            m27575g();
        } else {
            AbstractC4234j.m28364c().mo28359d(f14759c0, String.format("Worker result FAILURE for %s", this.f14772Y), new Throwable[0]);
            if (this.f14761N.m15699d()) {
                m27574h();
            } else {
                m27570l();
            }
        }
    }

    public void m27578d() {
        boolean z;
        this.f14777b0 = true;
        m27568n();
        AbstractFutureC1291a<ListenableWorker.AbstractC1060a> aVar = this.f14775a0;
        if (aVar != null) {
            z = aVar.isDone();
            this.f14775a0.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = this.f14762O;
        if (listenableWorker == null || z) {
            AbstractC4234j.m28364c().mo28361a(f14759c0, String.format("WorkSpec %s is already done. Not interrupting.", this.f14761N), new Throwable[0]);
        } else {
            listenableWorker.m38511p();
        }
    }

    public final void m27577e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f14768U.mo15681n(str2) != C4250s.EnumC4251a.CANCELLED) {
                this.f14768U.mo15685j(C4250s.EnumC4251a.FAILED, str2);
            }
            linkedList.addAll(this.f14769V.mo15721a(str2));
        }
    }

    public void m27576f() {
        if (!m27568n()) {
            this.f14767T.m8731c();
            try {
                C4250s.EnumC4251a n = this.f14768U.mo15681n(this.f14776b);
                this.f14767T.mo38458C().mo15705a(this.f14776b);
                if (n == null) {
                    m27573i(false);
                } else if (n == C4250s.EnumC4251a.RUNNING) {
                    m27579c(this.f14764Q);
                } else if (!n.m28351a()) {
                    m27575g();
                }
                this.f14767T.m8714t();
            } finally {
                this.f14767T.m8727g();
            }
        }
        List<AbstractC4454e> list = this.f14778c;
        if (list != null) {
            for (AbstractC4454e eVar : list) {
                eVar.mo21952e(this.f14776b);
            }
            C4455f.m27626b(this.f14765R, this.f14767T, this.f14778c);
        }
    }

    public final void m27575g() {
        this.f14767T.m8731c();
        try {
            this.f14768U.mo15685j(C4250s.EnumC4251a.ENQUEUED, this.f14776b);
            this.f14768U.mo15675t(this.f14776b, System.currentTimeMillis());
            this.f14768U.mo15693b(this.f14776b, -1L);
            this.f14767T.m8714t();
        } finally {
            this.f14767T.m8727g();
            m27573i(true);
        }
    }

    public final void m27574h() {
        this.f14767T.m8731c();
        try {
            this.f14768U.mo15675t(this.f14776b, System.currentTimeMillis());
            this.f14768U.mo15685j(C4250s.EnumC4251a.ENQUEUED, this.f14776b);
            this.f14768U.mo15679p(this.f14776b);
            this.f14768U.mo15693b(this.f14776b, -1L);
            this.f14767T.m8714t();
        } finally {
            this.f14767T.m8727g();
            m27573i(false);
        }
    }

    public final void m27573i(boolean z) {
        ListenableWorker listenableWorker;
        this.f14767T.m8731c();
        try {
            if (!this.f14767T.mo38457D().mo15683l()) {
                C8000e.m13803a(this.f14774a, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f14768U.mo15685j(C4250s.EnumC4251a.ENQUEUED, this.f14776b);
                this.f14768U.mo15693b(this.f14776b, -1L);
            }
            if (!(this.f14761N == null || (listenableWorker = this.f14762O) == null || !listenableWorker.mo38383i())) {
                this.f14766S.mo17737b(this.f14776b);
            }
            this.f14767T.m8714t();
            this.f14767T.m8727g();
            this.f14773Z.mo13348p(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f14767T.m8727g();
            throw th;
        }
    }

    public final void m27572j() {
        C4250s.EnumC4251a n = this.f14768U.mo15681n(this.f14776b);
        if (n == C4250s.EnumC4251a.RUNNING) {
            AbstractC4234j.m28364c().mo28361a(f14759c0, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f14776b), new Throwable[0]);
            m27573i(true);
            return;
        }
        AbstractC4234j.m28364c().mo28361a(f14759c0, String.format("Status for %s is %s; not doing any work", this.f14776b, n), new Throwable[0]);
        m27573i(false);
    }

    public final void m27571k() {
        C1070b b;
        if (!m27568n()) {
            this.f14767T.m8731c();
            try {
                C7554p o = this.f14768U.mo15680o(this.f14776b);
                this.f14761N = o;
                if (o == null) {
                    AbstractC4234j.m28364c().mo28360b(f14759c0, String.format("Didn't find WorkSpec for id %s", this.f14776b), new Throwable[0]);
                    m27573i(false);
                    this.f14767T.m8714t();
                } else if (o.f24144b != C4250s.EnumC4251a.ENQUEUED) {
                    m27572j();
                    this.f14767T.m8714t();
                    AbstractC4234j.m28364c().mo28361a(f14759c0, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f14761N.f24145c), new Throwable[0]);
                } else {
                    if (o.m15699d() || this.f14761N.m15700c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C7554p pVar = this.f14761N;
                        if (!(pVar.f24156n == 0) && currentTimeMillis < pVar.m15702a()) {
                            AbstractC4234j.m28364c().mo28361a(f14759c0, String.format("Delaying execution for %s because it is being executed before schedule.", this.f14761N.f24145c), new Throwable[0]);
                            m27573i(true);
                            this.f14767T.m8714t();
                            return;
                        }
                    }
                    this.f14767T.m8714t();
                    this.f14767T.m8727g();
                    if (this.f14761N.m15699d()) {
                        b = this.f14761N.f24147e;
                    } else {
                        AbstractC4231h b2 = this.f14765R.m38493f().m28367b(this.f14761N.f24146d);
                        if (b2 == null) {
                            AbstractC4234j.m28364c().mo28360b(f14759c0, String.format("Could not create Input Merger %s", this.f14761N.f24146d), new Throwable[0]);
                            m27570l();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f14761N.f24147e);
                        arrayList.addAll(this.f14768U.mo15677r(this.f14776b));
                        b = b2.mo28368b(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f14776b), b, this.f14771X, this.f14760M, this.f14761N.f24153k, this.f14765R.m38494e(), this.f14763P, this.f14765R.m38486m(), new C8013n(this.f14767T, this.f14763P), new C8011m(this.f14767T, this.f14766S, this.f14763P));
                    if (this.f14762O == null) {
                        this.f14762O = this.f14765R.m38486m().m28336b(this.f14774a, this.f14761N.f24145c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f14762O;
                    if (listenableWorker == null) {
                        AbstractC4234j.m28364c().mo28360b(f14759c0, String.format("Could not create Worker %s", this.f14761N.f24145c), new Throwable[0]);
                        m27570l();
                    } else if (listenableWorker.m38514k()) {
                        AbstractC4234j.m28364c().mo28360b(f14759c0, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f14761N.f24145c), new Throwable[0]);
                        m27570l();
                    } else {
                        this.f14762O.m38512n();
                        if (!m27567o()) {
                            m27572j();
                        } else if (!m27568n()) {
                            C8154c t = C8154c.m13345t();
                            RunnableC8008l lVar = new RunnableC8008l(this.f14774a, this.f14761N, this.f14762O, workerParameters.m38502b(), this.f14763P);
                            this.f14763P.mo12682a().execute(lVar);
                            AbstractFutureC1291a<Void> a = lVar.m13793a();
                            a.mo13371a(new RunnableC4460a(a, t), this.f14763P.mo12682a());
                            t.mo13371a(new RunnableC4461b(t, this.f14772Y), this.f14763P.mo12680c());
                        }
                    }
                }
            } finally {
                this.f14767T.m8727g();
            }
        }
    }

    public void m27570l() {
        this.f14767T.m8731c();
        try {
            m27577e(this.f14776b);
            this.f14768U.mo15688g(this.f14776b, ((ListenableWorker.AbstractC1060a.C1061a) this.f14764Q).m38506e());
            this.f14767T.m8714t();
        } finally {
            this.f14767T.m8727g();
            m27573i(false);
        }
    }

    public final void m27569m() {
        this.f14767T.m8731c();
        try {
            this.f14768U.mo15685j(C4250s.EnumC4251a.SUCCEEDED, this.f14776b);
            this.f14768U.mo15688g(this.f14776b, ((ListenableWorker.AbstractC1060a.C1063c) this.f14764Q).m38505e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f14769V.mo15721a(this.f14776b)) {
                if (this.f14768U.mo15681n(str) == C4250s.EnumC4251a.BLOCKED && this.f14769V.mo15720b(str)) {
                    AbstractC4234j.m28364c().mo28359d(f14759c0, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f14768U.mo15685j(C4250s.EnumC4251a.ENQUEUED, str);
                    this.f14768U.mo15675t(str, currentTimeMillis);
                }
            }
            this.f14767T.m8714t();
        } finally {
            this.f14767T.m8727g();
            m27573i(false);
        }
    }

    public final boolean m27568n() {
        if (!this.f14777b0) {
            return false;
        }
        AbstractC4234j.m28364c().mo28361a(f14759c0, String.format("Work interrupted for %s", this.f14772Y), new Throwable[0]);
        C4250s.EnumC4251a n = this.f14768U.mo15681n(this.f14776b);
        if (n == null) {
            m27573i(false);
        } else {
            m27573i(!n.m28351a());
        }
        return true;
    }

    public final boolean m27567o() {
        this.f14767T.m8731c();
        try {
            boolean z = true;
            if (this.f14768U.mo15681n(this.f14776b) == C4250s.EnumC4251a.ENQUEUED) {
                this.f14768U.mo15685j(C4250s.EnumC4251a.RUNNING, this.f14776b);
                this.f14768U.mo15676s(this.f14776b);
            } else {
                z = false;
            }
            this.f14767T.m8714t();
            return z;
        } finally {
            this.f14767T.m8727g();
        }
    }

    @Override
    public void run() {
        List<String> a = this.f14770W.mo15666a(this.f14776b);
        this.f14771X = a;
        this.f14772Y = m27581a(a);
        m27571k();
    }
}
