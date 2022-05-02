package p215p2;

import androidx.work.impl.WorkDatabase;
import p071f2.AbstractC4234j;
import p071f2.C4250s;
import p087g2.C4452d;
import p087g2.C4458i;
import p198o2.AbstractC7558q;

public class RunnableC8006j implements Runnable {
    public static final String f26065M = AbstractC4234j.m28362f("StopWorkRunnable");
    public final C4458i f26066a;
    public final String f26067b;
    public final boolean f26068c;

    public RunnableC8006j(C4458i iVar, String str, boolean z) {
        this.f26066a = iVar;
        this.f26067b = str;
        this.f26068c = z;
    }

    @Override
    public void run() {
        boolean z;
        WorkDatabase s = this.f26066a.m27589s();
        C4452d q = this.f26066a.m27591q();
        AbstractC7558q D = s.mo38457D();
        s.m8731c();
        try {
            boolean h = q.m27635h(this.f26067b);
            if (this.f26068c) {
                z = this.f26066a.m27591q().m27629n(this.f26067b);
            } else {
                if (!h && D.mo15681n(this.f26067b) == C4250s.EnumC4251a.RUNNING) {
                    D.mo15685j(C4250s.EnumC4251a.ENQUEUED, this.f26067b);
                }
                z = this.f26066a.m27591q().m27628o(this.f26067b);
            }
            AbstractC4234j.m28364c().mo28361a(f26065M, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f26067b, Boolean.valueOf(z)), new Throwable[0]);
            s.m8714t();
        } finally {
            s.m8727g();
        }
    }
}
