package p215p2;

import androidx.work.impl.WorkDatabase;
import p071f2.AbstractC4234j;
import p071f2.C4250s;
import p087g2.C4452d;
import p087g2.C4458i;
import p198o2.AbstractC7558q;

public class RunnableC8006j implements Runnable {
    public static final String f26062M = AbstractC4234j.m28360f("StopWorkRunnable");
    public final C4458i f26063a;
    public final String f26064b;
    public final boolean f26065c;

    public RunnableC8006j(C4458i iVar, String str, boolean z) {
        this.f26063a = iVar;
        this.f26064b = str;
        this.f26065c = z;
    }

    @Override
    public void run() {
        boolean z;
        WorkDatabase s = this.f26063a.m27587s();
        C4452d q = this.f26063a.m27589q();
        AbstractC7558q D = s.mo38454D();
        s.m8731c();
        try {
            boolean h = q.m27633h(this.f26064b);
            if (this.f26065c) {
                z = this.f26063a.m27589q().m27627n(this.f26064b);
            } else {
                if (!h && D.mo15681n(this.f26064b) == C4250s.EnumC4251a.RUNNING) {
                    D.mo15685j(C4250s.EnumC4251a.ENQUEUED, this.f26064b);
                }
                z = this.f26063a.m27589q().m27626o(this.f26064b);
            }
            AbstractC4234j.m28362c().mo28359a(f26062M, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f26064b, Boolean.valueOf(z)), new Throwable[0]);
            s.m8714t();
        } finally {
            s.m8727g();
        }
    }
}
