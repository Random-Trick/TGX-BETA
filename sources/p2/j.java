package p2;

import androidx.work.impl.WorkDatabase;
import f2.s;
import g2.d;
import g2.i;
import o2.q;

public class j implements Runnable {
    public static final String M = f2.j.f("StopWorkRunnable");
    public final i f20429a;
    public final String f20430b;
    public final boolean f20431c;

    public j(i iVar, String str, boolean z10) {
        this.f20429a = iVar;
        this.f20430b = str;
        this.f20431c = z10;
    }

    @Override
    public void run() {
        boolean z10;
        WorkDatabase s10 = this.f20429a.s();
        d q10 = this.f20429a.q();
        q D = s10.D();
        s10.c();
        try {
            boolean h10 = q10.h(this.f20430b);
            if (this.f20431c) {
                z10 = this.f20429a.q().n(this.f20430b);
            } else {
                if (!h10 && D.n(this.f20430b) == s.a.RUNNING) {
                    D.j(s.a.ENQUEUED, this.f20430b);
                }
                z10 = this.f20429a.q().o(this.f20430b);
            }
            f2.j.c().a(M, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f20430b, Boolean.valueOf(z10)), new Throwable[0]);
            s10.t();
        } finally {
            s10.g();
        }
    }
}
