package g2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import f2.h;
import f2.s;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import o2.p;
import o2.q;
import o2.t;
import p2.e;
import p2.l;
import p2.m;
import p2.n;

public class j implements Runnable {
    public static final String f12057c0 = f2.j.f("WorkerWrapper");
    public WorkerParameters.a M;
    public p N;
    public ListenableWorker O;
    public r2.a P;
    public androidx.work.a R;
    public n2.a S;
    public WorkDatabase T;
    public q U;
    public o2.b V;
    public t W;
    public List<String> X;
    public String Y;
    public Context f12058a;
    public String f12060b;
    public volatile boolean f12061b0;
    public List<e> f12062c;
    public ListenableWorker.a Q = ListenableWorker.a.a();
    public q2.c<Boolean> Z = q2.c.t();
    public c7.a<ListenableWorker.a> f12059a0 = null;

    public class a implements Runnable {
        public final c7.a f12063a;
        public final q2.c f12064b;

        public a(c7.a aVar, q2.c cVar) {
            this.f12063a = aVar;
            this.f12064b = cVar;
        }

        @Override
        public void run() {
            try {
                this.f12063a.get();
                f2.j.c().a(j.f12057c0, String.format("Starting work for %s", j.this.N.f18592c), new Throwable[0]);
                j jVar = j.this;
                jVar.f12059a0 = jVar.O.o();
                this.f12064b.r(j.this.f12059a0);
            } catch (Throwable th) {
                this.f12064b.q(th);
            }
        }
    }

    public class b implements Runnable {
        public final q2.c f12066a;
        public final String f12067b;

        public b(q2.c cVar, String str) {
            this.f12066a = cVar;
            this.f12067b = str;
        }

        @Override
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            Throwable e10;
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f12066a.get();
                    if (aVar == null) {
                        f2.j.c().b(j.f12057c0, String.format("%s returned a null result. Treating it as a failure.", j.this.N.f18592c), new Throwable[0]);
                    } else {
                        f2.j.c().a(j.f12057c0, String.format("%s returned a %s result.", j.this.N.f18592c, aVar), new Throwable[0]);
                        j.this.Q = aVar;
                    }
                } catch (InterruptedException e11) {
                    e10 = e11;
                    f2.j.c().b(j.f12057c0, String.format("%s failed because it threw an exception/error", this.f12067b), e10);
                } catch (CancellationException e12) {
                    f2.j.c().d(j.f12057c0, String.format("%s was cancelled", this.f12067b), e12);
                } catch (ExecutionException e13) {
                    e10 = e13;
                    f2.j.c().b(j.f12057c0, String.format("%s failed because it threw an exception/error", this.f12067b), e10);
                }
            } finally {
                j.this.f();
            }
        }
    }

    public static class c {
        public Context f12069a;
        public ListenableWorker f12070b;
        public n2.a f12071c;
        public r2.a f12072d;
        public androidx.work.a f12073e;
        public WorkDatabase f12074f;
        public String f12075g;
        public List<e> f12076h;
        public WorkerParameters.a f12077i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, r2.a aVar2, n2.a aVar3, WorkDatabase workDatabase, String str) {
            this.f12069a = context.getApplicationContext();
            this.f12072d = aVar2;
            this.f12071c = aVar3;
            this.f12073e = aVar;
            this.f12074f = workDatabase;
            this.f12075g = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f12077i = aVar;
            }
            return this;
        }

        public c c(List<e> list) {
            this.f12076h = list;
            return this;
        }
    }

    public j(c cVar) {
        this.f12058a = cVar.f12069a;
        this.P = cVar.f12072d;
        this.S = cVar.f12071c;
        this.f12060b = cVar.f12075g;
        this.f12062c = cVar.f12076h;
        this.M = cVar.f12077i;
        this.O = cVar.f12070b;
        this.R = cVar.f12073e;
        WorkDatabase workDatabase = cVar.f12074f;
        this.T = workDatabase;
        this.U = workDatabase.D();
        this.V = this.T.v();
        this.W = this.T.E();
    }

    public final String a(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f12060b);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    public c7.a<Boolean> b() {
        return this.Z;
    }

    public final void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            f2.j.c().d(f12057c0, String.format("Worker result SUCCESS for %s", this.Y), new Throwable[0]);
            if (this.N.d()) {
                h();
            } else {
                m();
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            f2.j.c().d(f12057c0, String.format("Worker result RETRY for %s", this.Y), new Throwable[0]);
            g();
        } else {
            f2.j.c().d(f12057c0, String.format("Worker result FAILURE for %s", this.Y), new Throwable[0]);
            if (this.N.d()) {
                h();
            } else {
                l();
            }
        }
    }

    public void d() {
        boolean z10;
        this.f12061b0 = true;
        n();
        c7.a<ListenableWorker.a> aVar = this.f12059a0;
        if (aVar != null) {
            z10 = aVar.isDone();
            this.f12059a0.cancel(true);
        } else {
            z10 = false;
        }
        ListenableWorker listenableWorker = this.O;
        if (listenableWorker == null || z10) {
            f2.j.c().a(f12057c0, String.format("WorkSpec %s is already done. Not interrupting.", this.N), new Throwable[0]);
        } else {
            listenableWorker.p();
        }
    }

    public final void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.U.n(str2) != s.a.CANCELLED) {
                this.U.j(s.a.FAILED, str2);
            }
            linkedList.addAll(this.V.a(str2));
        }
    }

    public void f() {
        if (!n()) {
            this.T.c();
            try {
                s.a n10 = this.U.n(this.f12060b);
                this.T.C().a(this.f12060b);
                if (n10 == null) {
                    i(false);
                } else if (n10 == s.a.RUNNING) {
                    c(this.Q);
                } else if (!n10.a()) {
                    g();
                }
                this.T.t();
            } finally {
                this.T.g();
            }
        }
        List<e> list = this.f12062c;
        if (list != null) {
            for (e eVar : list) {
                eVar.e(this.f12060b);
            }
            f.b(this.R, this.T, this.f12062c);
        }
    }

    public final void g() {
        this.T.c();
        try {
            this.U.j(s.a.ENQUEUED, this.f12060b);
            this.U.t(this.f12060b, System.currentTimeMillis());
            this.U.b(this.f12060b, -1L);
            this.T.t();
        } finally {
            this.T.g();
            i(true);
        }
    }

    public final void h() {
        this.T.c();
        try {
            this.U.t(this.f12060b, System.currentTimeMillis());
            this.U.j(s.a.ENQUEUED, this.f12060b);
            this.U.p(this.f12060b);
            this.U.b(this.f12060b, -1L);
            this.T.t();
        } finally {
            this.T.g();
            i(false);
        }
    }

    public final void i(boolean z10) {
        ListenableWorker listenableWorker;
        this.T.c();
        try {
            if (!this.T.D().l()) {
                e.a(this.f12058a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.U.j(s.a.ENQUEUED, this.f12060b);
                this.U.b(this.f12060b, -1L);
            }
            if (!(this.N == null || (listenableWorker = this.O) == null || !listenableWorker.i())) {
                this.S.b(this.f12060b);
            }
            this.T.t();
            this.T.g();
            this.Z.p(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.T.g();
            throw th;
        }
    }

    public final void j() {
        s.a n10 = this.U.n(this.f12060b);
        if (n10 == s.a.RUNNING) {
            f2.j.c().a(f12057c0, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f12060b), new Throwable[0]);
            i(true);
            return;
        }
        f2.j.c().a(f12057c0, String.format("Status for %s is %s; not doing any work", this.f12060b, n10), new Throwable[0]);
        i(false);
    }

    public final void k() {
        androidx.work.b b10;
        if (!n()) {
            this.T.c();
            try {
                p o10 = this.U.o(this.f12060b);
                this.N = o10;
                if (o10 == null) {
                    f2.j.c().b(f12057c0, String.format("Didn't find WorkSpec for id %s", this.f12060b), new Throwable[0]);
                    i(false);
                    this.T.t();
                } else if (o10.f18591b != s.a.ENQUEUED) {
                    j();
                    this.T.t();
                    f2.j.c().a(f12057c0, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.N.f18592c), new Throwable[0]);
                } else {
                    if (o10.d() || this.N.c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        p pVar = this.N;
                        if (!(pVar.f18603n == 0) && currentTimeMillis < pVar.a()) {
                            f2.j.c().a(f12057c0, String.format("Delaying execution for %s because it is being executed before schedule.", this.N.f18592c), new Throwable[0]);
                            i(true);
                            this.T.t();
                            return;
                        }
                    }
                    this.T.t();
                    this.T.g();
                    if (this.N.d()) {
                        b10 = this.N.f18594e;
                    } else {
                        h b11 = this.R.f().b(this.N.f18593d);
                        if (b11 == null) {
                            f2.j.c().b(f12057c0, String.format("Could not create Input Merger %s", this.N.f18593d), new Throwable[0]);
                            l();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.N.f18594e);
                        arrayList.addAll(this.U.r(this.f12060b));
                        b10 = b11.b(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f12060b), b10, this.X, this.M, this.N.f18600k, this.R.e(), this.P, this.R.m(), new n(this.T, this.P), new m(this.T, this.S, this.P));
                    if (this.O == null) {
                        this.O = this.R.m().b(this.f12058a, this.N.f18592c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.O;
                    if (listenableWorker == null) {
                        f2.j.c().b(f12057c0, String.format("Could not create Worker %s", this.N.f18592c), new Throwable[0]);
                        l();
                    } else if (listenableWorker.k()) {
                        f2.j.c().b(f12057c0, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.N.f18592c), new Throwable[0]);
                        l();
                    } else {
                        this.O.n();
                        if (!o()) {
                            j();
                        } else if (!n()) {
                            q2.c t10 = q2.c.t();
                            l lVar = new l(this.f12058a, this.N, this.O, workerParameters.b(), this.P);
                            this.P.a().execute(lVar);
                            c7.a<Void> a10 = lVar.a();
                            a10.a(new a(a10, t10), this.P.a());
                            t10.a(new b(t10, this.Y), this.P.c());
                        }
                    }
                }
            } finally {
                this.T.g();
            }
        }
    }

    public void l() {
        this.T.c();
        try {
            e(this.f12060b);
            this.U.g(this.f12060b, ((ListenableWorker.a.C0046a) this.Q).e());
            this.T.t();
        } finally {
            this.T.g();
            i(false);
        }
    }

    public final void m() {
        this.T.c();
        try {
            this.U.j(s.a.SUCCEEDED, this.f12060b);
            this.U.g(this.f12060b, ((ListenableWorker.a.c) this.Q).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.V.a(this.f12060b)) {
                if (this.U.n(str) == s.a.BLOCKED && this.V.b(str)) {
                    f2.j.c().d(f12057c0, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.U.j(s.a.ENQUEUED, str);
                    this.U.t(str, currentTimeMillis);
                }
            }
            this.T.t();
        } finally {
            this.T.g();
            i(false);
        }
    }

    public final boolean n() {
        if (!this.f12061b0) {
            return false;
        }
        f2.j.c().a(f12057c0, String.format("Work interrupted for %s", this.Y), new Throwable[0]);
        s.a n10 = this.U.n(this.f12060b);
        if (n10 == null) {
            i(false);
        } else {
            i(!n10.a());
        }
        return true;
    }

    public final boolean o() {
        this.T.c();
        try {
            boolean z10 = true;
            if (this.U.n(this.f12060b) == s.a.ENQUEUED) {
                this.U.j(s.a.RUNNING, this.f12060b);
                this.U.s(this.f12060b);
            } else {
                z10 = false;
            }
            this.T.t();
            return z10;
        } finally {
            this.T.g();
        }
    }

    @Override
    public void run() {
        List<String> a10 = this.W.a(this.f12060b);
        this.X = a10;
        this.Y = a(a10);
        k();
    }
}
