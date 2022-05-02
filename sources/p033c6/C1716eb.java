package p033c6;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p163l5.AbstractC6395x;
import p163l5.C6371p;
import p163l5.C6390v;
import p163l5.C6393w;
import p163l5.C6397y;
import p177m6.AbstractC6765g;

public final class C1716eb {
    public final AbstractC6395x f6259a;
    public final AtomicLong f6260b = new AtomicLong(-1);

    public C1716eb(Context context, String str) {
        this.f6259a = C6393w.m20474b(context, C6397y.m20472c().m20469b("mlkit:vision").m20470a());
    }

    public static C1716eb m36063a(Context context) {
        return new C1716eb(context, "mlkit:vision");
    }

    public final void m36062b(long j, Exception exc) {
        this.f6260b.set(j);
    }

    public final synchronized void m36061c(int i, int i2, long j, long j2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f6260b.get() != -1 && elapsedRealtime - this.f6260b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f6259a.mo17209a(new C6390v(0, Arrays.asList(new C6371p(i, i2, 0, j, j2, null, null, 0)))).mo19076e(new AbstractC6765g() {
            @Override
            public final void mo4157c(Exception exc) {
                C1716eb.this.m36062b(elapsedRealtime, exc);
            }
        });
    }
}
